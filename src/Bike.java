/**
 * Created by touit on 01/02/2017.
 */
public class Bike extends Vehicle {

    private Couleur couleur;
    private String marque;
    private Float prix;

    public Bike(String marque, Couleur couleur, Float prix){

        this.couleur = couleur;
        this.marque = marque;
        this.prix = prix;

    }

    @Override
    public float getPriceWithTax() {
        float tax = 1;
        return this.prix + tax;
    }

}
