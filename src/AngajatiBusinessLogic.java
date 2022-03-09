public class AngajatiBusinessLogic {

    public void insert(String nume, String prenume, String tara) {

        if(!tara.equalsIgnoreCase("Rusia")) {

            AngajatiJDBC angajatiJDBC = new AngajatiJDBC();
            angajatiJDBC.insert( nume,  prenume,  tara);

        }
        else
        {
            System.out.println("sanctiuni");
        }

    }
}
