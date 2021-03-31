import java.util.Vector;

public class Materii {

    public Vector<String> materie = new Vector<>(5);

    Materii(){
        this.materie.add("Matematica");
        this.materie.add("Romana");
        this.materie.add("Informatica");
        this.materie.add("Engleza");
    }

}

class Note extends Materii{

    public Vector<Vector<Integer>> Note;

    Note(Vector<Vector<Integer>> note) {
        super();
       this.Note = note;
    }

    public void displayNote(){
        //System.out.print(this.materie + " : ");
        /*
        for (int i = 0; i < Note.size(); i++){
            for (int j = 0; j < Note.size();i++)
            System.out.print(Note.get(i).get(j) + " ");
        }*/
        int i = 0;
        for (Vector<Integer> v : this.Note){
            System.out.print(this.materie.get(i) + " ");
            i++;
            for (int s : v){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public void addNota(int x, int i){
        if (x > 0 && x <= 10){
            this.Note.get(i).add(x);
        }
        else{System.out.println("Va rugam introduceti o nota acceptata de sistemul de invatamant romanesc!");}
    }

    public void stampilareNota(int x, int j){
        int i = 0, ok =1;

        while(i < Note.size() + 1 && ok == 1){

            if (Note.get(j).get(i) == x){
                System.out.println(Note.get(j).get(i));
                Note.get(j).remove(i);
                ok = 0;
            }
            i++;
        }
    }
}

class Absente extends Materii{

    public int absente;

    Absente(int absente) {
        super();
        this.absente = absente;
    }

    public void motivareAbsenta(int x){
        if (x >= this.absente){
            System.out.println("Numarul de absente pe care doriti sa il motivati este mai mare ca numarul de absente ale elevului!");
        }
        else{
            this.absente -= x;
        }
    }

    public void punereAbsenta(int x){
        if (x != 1){
            System.out.println("Nu puteti pune mai mult de o absenta pe ora!");
        }
        else{
            this.absente += x;
        }
    }

    public void afisareAbsente(){
        System.out.println("Numarul dumneavoastra de absente la " + this.materie + " este: " + this.absente);
    }
}