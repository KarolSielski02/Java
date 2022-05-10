public class main {

    public static void main(String[] args){

        Osoba osobaTest = new Osoba();

        osobaTest.setName("Jan");
        osobaTest.setSurname("Kowalski");
        osobaTest.setDateOfBirth("21.03.2000");
        osobaTest.setMan(true);

        System.out.println( osobaTest.toString());

        /* Student */

        Student studentTest = new Student();

        studentTest.setName("Maciek");
        studentTest.setSurname("Podlaski");
        studentTest.setDateOfBirth("09.07.2001");
        studentTest.setMan(true);
        studentTest.setIndex("s25534");

        System.out.println(studentTest.toString());

        /* Wykladowca */

        Wykladowca wykladowcaTest = new Wykladowca();

        wykladowcaTest.setName("George");
        wykladowcaTest.setSurname("Compton");
        wykladowcaTest.setDateOfBirth("21.03.1978");
        wykladowcaTest.setMan(true);
        wykladowcaTest.setDegree("Magister");

        System.out.println(wykladowcaTest.toString());

        /* Stypendysta */

        Stypendysta stypendystaTest = new Stypendysta();

        stypendystaTest.setName("Janina");
        stypendystaTest.setSurname("Kowalska");
        stypendystaTest.setDateOfBirth("21.03.2001");
        stypendystaTest.setMan(false);
        stypendystaTest.setIndex("s25838");
        stypendystaTest.setScholarship(520.0);

        System.out.println(stypendystaTest.toString());
    }
}

