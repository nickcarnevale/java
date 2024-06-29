public class c140{

    public static void main(String[]args){

        int[] array = {7,9,6,8};
        int counter = 1;
        for(int j = 2; j < array.length; j++){
            System.out.println("/nIteration " + counter);
            counter++;
            int key = array[j];
            int i = j-1;
            
            while(i>0 && array[i] > key){
                array[i + 1] = array[i];
                i = i-1;
            }
            array[i + 1] = key;
            System.out.println("Key = " + key); 
            System.out.println("i = " + i);
            for(int k : array){
                System.out.println(k + " "); 
            }
        }

    }

}
