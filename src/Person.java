public class Person {

    public String Name;
    public int age;

    Person(String name, int ageC){
        this.Name = name;
        this.age = ageC;
    }


    public void display(){
        System.out.println("My name is : " + Name);
        System.out.println("Age is : " + age);
    }


}


class Student extends Person{

    public int id;
    public String profil;
    Student(String name, int ageC, int idStud, String profil) {
        super(name, ageC);
        this.id = idStud;
        this.profil = profil;
    }

    public void displayS(){

        System.out.println("My name is : " + Name);
        System.out.println("Age is : " + age);
        System.out.println("ID is : " + id);
        System.out.println("Chosen profile is : " + profil);
        System.out.println("\n");

    }

}

class Profesor extends Person{

    public int ID;
    public String materie;

    Profesor(String name, int ageC, int id, String materie) {
        super(name, ageC);
        this.ID = id;
        this.materie = materie;
    }

    public void displayP(){

        System.out.println("My name is : " + Name);
        System.out.println("Age is : " + age);
        System.out.println("ID is : " + ID);
        System.out.println("He/She teaches : " + materie);
        System.out.println("\n");

    }
}