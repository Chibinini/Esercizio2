public class Rettangolo extends Forma{
        private double larghezza;
        private double altezza;

        // Costruttore
        public Rettangolo(double larghezza, double altezza) {
            this.larghezza = larghezza;
            this.altezza = altezza;
        }

        // Override
        @Override
        public void calcolaArea() {
            double area = larghezza * altezza;
            System.out.println("L'area del rettangolo è: " + area);
        }
    }
