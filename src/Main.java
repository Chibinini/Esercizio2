//Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.
//Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.

    public class Main {
        public static void main(String[] args) {
            // Creazione di un oggetto Rettangolo e calcolo dell'area

            Forma forma = new Forma();
            forma.calcolaArea();

            Forma rettangolo = new Rettangolo(5, 10 );
            rettangolo.calcolaArea();

        }
    }