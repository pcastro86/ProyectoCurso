public class Main {
    public static void main(String[] args) {
        // esto esta en un cajon
        Alumna pilar = new Alumna();
        pilar.nombre = "Pili";
        pilar.apellido = "Castro";

        // esto esta en otro cajon
        Documento docPilar = new Documento();
        docPilar.tipo = "DNI";
        docPilar.numero = 33085669;

        // y esto esta en un cajon
        NotaFinal notaFinalPilar = new NotaFinal();
        notaFinalPilar.nota1 = 5;
        notaFinalPilar.nota2 = 7;
        notaFinalPilar.nota3 = 9;
        notaFinalPilar.nota4 = 3;

        // tengo los 3 en 3 cajoncito pero tengo que decirle que docPilar corresponde a la Alumna Pilar, idem notaFinal
        pilar.documento = docPilar;
        pilar.notaFinal = notaFinalPilar;

        /* lo puedo checkear asi:
        System.out.println(pilar.notaFinal.nota1); // la alumna Pilar tiene una notaFinal compuesto por nota1 y 2.
        System.out.println(pilar.notaFinal.nota2);
        System.out.println(pilar.notaFinal.notaFinal);
        */

        pilar.mostrarNotaFinalAlumna();

    }
}
