public class Main {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7};
        divisioneArray(array,4);
        divisioneArray(array, 10);
    }

    public static void divisioneArray(int[] array, int numeroArray){
        try{
            int result = array[numeroArray] / 0;
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
