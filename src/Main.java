public class Main {

    public static void main(String[] args) {
	// write your code here

        // citesc nume
        //citesc prenume
        // citesc tara

        // introduc in db

        // afisez lista angjatilor din db

        Main m = new Main();
        m.startprogram();



    }

    private void startprogram() {
        String nume = "popescu";
        String prenume ="andrei";
        String tara = "Rusia";

        AngajatiBusinessLogic abl = new AngajatiBusinessLogic();
        abl.insert( nume,  prenume,  tara);

    }
}
