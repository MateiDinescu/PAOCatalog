import java.util.Map;
import java.util.Set;
import java.util.*;
import java.util.Vector;


public class ClassesMain {
    public static void main(String[] args){


    var idStud = 1;
    var idProf = 101;

    //Mape persoane

    Map<Integer,String> mapNume = new HashMap<Integer,String>();

    Map<Integer,String> mapProfil = new HashMap<Integer,String>();

    Map<Integer,Integer> mapVarsta = new HashMap<Integer,Integer>();


    Student s1 = new Student("Matei Dinescu",21,idStud,"Mate-Info");
    mapProfil.put(idStud,s1.profil);
    mapNume.put(idStud,s1.Name);
    mapVarsta.put(idStud,s1.age);
    idStud++;

    Student s2 = new Student("Elena-Bianca Vasile",20,idStud,"Filologie");
    mapProfil.put(idStud,s2.profil);
    mapNume.put(idStud,s2.Name);
    mapVarsta.put(idStud,s2.age);
    idStud++;

    Student s3 = new Student("Alexandru Colesniuc",21,idStud,"Mate-Info");
    mapProfil.put(idStud,s3.profil);
    mapNume.put(idStud,s3.Name);
    mapVarsta.put(idStud,s3.age);
    idStud++;

    Student s4 = new Student("Razvan Banescu",19,idStud,"Mate-Info");
    mapProfil.put(idStud,s4.profil);
    mapNume.put(idStud,s4.Name);
    mapVarsta.put(idStud,s4.age);
    idStud++;

    /*
    for(Map.Entry m:mapNume.entrySet()){
        System.out.println(m.getKey() + " " + m.getValue());

    }
    */

    Set<Integer> keySet = mapProfil.keySet();

    for(int i:keySet){
        System.out.println(mapNume.get(i) + " " + mapVarsta.get(i)+ " " + mapProfil.get(i) );
    }


    Profesor p1 = new Profesor("Vesa Ana-Maria",51,idProf,"Matematica");
    idProf++;

    // Mape materii/note

    Map<Integer,Vector<Vector<Integer>>> mapNote = new HashMap<Integer,Vector<Vector<Integer>>>();

    Map<Integer,Integer> mapAbsente = new HashMap<Integer,Integer>();

    //Vector<String> materii = new Vector<>();

    Vector<Vector<Integer>> notele = new Vector<>(10);
    Vector<Integer> note = new Vector<>();
    //Vector<Integer> romana = new Vector<>(10);
    Vector<Integer> zero = new Vector<>();

    note.add(7);
    note.add(10);
    note.add(8);

    notele.add(note);

    note = zero;
        System.out.println(zero);

    note.add(5);
    note.add(8);
    note.add(6);
    note.add(10);

    notele.add(note);

    note = zero;
    zero.clear();
        System.out.println(zero);
    note.add(7);
    note.add(7);
    note.add(8);

    notele.add(note);

    note = zero;
    zero.clear();

    note.add(10);
    note.add(10);
    note.add(8);

    notele.add(note);

    note = zero;

    Note n1 = new Note(notele);
    mapNote.put(1,n1.Note);

    //n1.addNota(10,0);
    //n1.displayNote();
   //n1.stampilareNota(10,1);
    n1.displayNote();


    //materii.add(n1.materie);


    // IMPORTANT. ((PUBLIC INT NR NOTE PER MATERIE)). MAP<INTEGER,VECTOR<STRING>> - PENTRU MATERII !! MAP<INTEGER, VECTOR<INTEGER>> - PENTRU NOTE
    // MATERIILE SUNT DEJA DATE, VOM INTRODUCE DOAR NOTELE ( POATE VECTOR<VECTOR<INTEGER>> PENTRU NOTE, PRACTIC FIECARE VECTOR MARE REPREZINTA
    // NOTELE LA O MATERIE. PENTRU A ADAUGA NOTE LA O MATERIE, VEDEM CE MATERIE VREA SI INTRAM IN VECTORUL RESPECTIV SI MODIFICAM, LA FEL PENTRU STERGERE
    // MAPA CU CHEI INT PENTRU NOTELE DE LA FIECARE/ MAPA CU CHEIE INT PENTRU ABSENTE LA FIECARE MATERIE.

    }

}
