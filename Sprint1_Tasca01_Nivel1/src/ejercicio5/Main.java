package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Persona hijo = new Persona();
        hijo.presentarse("Antonio");
        hijo.presentarse("Antonio", "Jiménez");
        hijo.presentarse("Antonio", "Jiménez", 23);
        hijo.presentarse("Antonio", "Jiménez", 23, "Zaragoza");
    }
    protected void presentarse (String nombre){
        System.out.println("Me llamo "+nombre+".");
    }
    protected void presentarse (String nombre, String apellido) {
        System.out.println("Me llamo "+nombre+" "+apellido+".");
    }
    protected void presentarse (String nombre, String apellido, int edad){
        System.out.println("Me llamo "+nombre+" "+apellido+" y tengo "+edad+" años.");
    }
}