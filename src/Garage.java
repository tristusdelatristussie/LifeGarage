import java.util.ArrayList;

/**
 * Created by touit on 01/02/2017.
 */
public class Garage {

    private String nom;

   /* Car[] liste = new Car[10]; */


    private ArrayList<Car> voitures  = new ArrayList<>();
    private ArrayList<Bike> motos = new ArrayList<>();


    public Garage(String nom){

        this.nom = nom;

    }

    public void addCar(Car voit){

        voitures.add(voit);

    }

    public void addBike(Bike moto){

        motos.add(moto);
    }




    public void addCar(ArrayList<Car> nllesvoitures){

        voitures.addAll(nllesvoitures);

    }

    // La liste "nllesvoitures" est declaree directement dans les () de la methode; mais ce n est pas le cas
    //Pourquoi ?


    public void addBike(ArrayList<Bike> nllesmotos){

        motos.addAll(nllesmotos);

    }


    @Override
    public String toString() {
        return "Garage{" +
                "nom='" + nom + '\'' +
                ", Voitures=" + voitures +
                ", Motos=" + motos +
                '}';
    }





/* J'ai voulu ajouter une voiture dans la liste en tentant d utiliser un constructeur dans la methode addCar.
Est ce possible a realiser ?


    public void addCar(String marque, String couleur, Float prix){

        this.list.add(Car(marque, couleur, prix));

    }
*/



}
