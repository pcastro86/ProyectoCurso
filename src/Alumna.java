public class Alumna {
    String nombre;
    String apellido;
    Documento documento;
    NotaFinal notaFinal;

    public String imprimirNombreCompleto(){
        return " " + nombre + " " + apellido +  " ";
    }

    public void mostrarNotaFinalAlumna(){
        System.out.println("La nota final de" + imprimirNombreCompleto() + "es: " + notaFinal.calcularNotaFinal()  );
    }

}
