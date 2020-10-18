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


        // // 2da parte: CREO OTRO ALUMNO CON OTRO DOC Y OTRA NOTA FINAL
        Alumna gi = new Alumna();
        gi.nombre = "Gime";
        gi.apellido = "Castro";

        // esto esta en otro cajon
        Documento docGimena = new Documento();
        docGimena.tipo = "DNI";
        docGimena.numero = 33085670;

        // y esto esta en un cajon
        NotaFinal notaFinalGimena = new NotaFinal();
        notaFinalGimena.nota1 = 1;
        notaFinalGimena.nota2 = 2;
        notaFinalGimena.nota3 = 8;
        notaFinalGimena.nota4 = 10;

        // tengo los 3 en 3 cajoncito pero tengo que decirle que docPilar corresponde a la Alumna Pilar, idem notaFinal
        gi.documento = docPilar;
        gi.notaFinal = notaFinalGimena;
        gi.mostrarNotaFinalAlumna();


        // esto esta en otro cajon
        Alumna mati = new Alumna();
        mati.nombre = "Matias";
        mati.apellido = "Castro";


        Documento docMati = new Documento();
        docMati.tipo = "DNI";
        docMati.numero = 33085670;

        // y esto esta en un cajon
        NotaFinal notaFinalMatias = new NotaFinal();
        notaFinalMatias.nota1 = 1;
        notaFinalMatias.nota2 = 2;
        notaFinalMatias.nota3 = 8;
        notaFinalMatias.nota4 = 10;

        // tengo los 3 en 3 cajoncito pero tengo que decirle que docPilar corresponde a la Alumna Pilar, idem notaFinal
        mati.documento = docMati;
        mati.notaFinal = notaFinalMatias;
        mati.mostrarNotaFinalAlumna();


        // 2da parte: CREO un array con ALUMNAS
        Alumna[] alumnas = new Alumna[3];
        alumnas[0] = pilar;
        alumnas[1] = gi;
        alumnas[2] = mati;

        imprimirArreglo(alumnas); // llamo a la funcion que tiene el foreach
    }


    // 2da parte: CREO un metdoso que imprima el array alumnos. Lo voy a crear en el main porque no es propio de alumna. No se refiere a UN solo
    // objeto alumnas sino a varios.

    public static void imprimirArreglo(Alumna[] alumnas){ // va a recibir un arreglo de ALUMNAS
        // que voy a recorrer? "alumnas" , de donde? del cajon array alumna.
        // El "alumna" de la derecha son los cajones y el "Alumna alumna" de la izquierda es uno por uno cada cajon.
        for (Alumna alumna: alumnas) {
            System.out.println(alumna.imprimirNombreCompleto() + " : " + alumna.notaFinal.calcularNotaFinal());
            System.out.println(alumna.imprimirNombreCompleto() + " : " + alumna.documento.mostrarDocumento()); // mostrar documento es un metodo de documento, documento es un atributo de alumna
        }
        // en un for normal el alumna.imprimirNombreCompleto(); seria alumna[i].imprimirNombreCompleto();
    }



}
