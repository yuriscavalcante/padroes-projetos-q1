public class Incremental 
{
    public static int count = 0;
    public static int numero;
    private static Incremental instance;
    private Incremental(int number){
        for(int i = 0; i< number; i++){
            numero = ++count;
            System.out.println("Incremental "+ numero);
        }
    }
    public static Incremental getIncremental(int number){
        instance = new Incremental(number);
        return instance;
    }
}
