import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AngajatiJDBC {

    public void insert(String nume, String prenume, String tara) {
        // salvez in db
        int val=-1;
        try {
            // 1. ma conectez la db
            final String URL = "jdbc:postgresql://idc.cluster-custom-cjcsijnttbb2.eu-central-1.rds.amazonaws.com:5432/ionelcondor";
            final String USERNAME = "ftuser";

            final String PASSWORD = System.getenv("PWDDB");

            System.out.println("parola:"+PASSWORD);

            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // 2. creez un prepared ststement si il populez cu date
            PreparedStatement pSt = conn.prepareStatement("INSERT INTO angajati (nume, prenume, tara) VALUES(?,?,?)");
            pSt.setString(1,nume);
            pSt.setString(2,prenume);
            pSt.setString(3,tara);



            // 3. executie
             val = pSt.executeUpdate();
            System.out.println(val);

            pSt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            val=-1;

        }
    }
}
