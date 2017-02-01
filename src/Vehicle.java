/**
 * Created by touit on 01/02/2017.
 */
    public abstract class Vehicle {

        protected String marque;
        protected Couleur couleur;
        protected float prix;

        public abstract float getPriceWithTax();

        @Override
        public String toString() {
            return "Vehicule{" +
                    "marque='" + marque + '\'' +
                    ", couleur=" + couleur +
                    ", prix=" + getPriceWithTax() +
                    '}';
        }
    }

