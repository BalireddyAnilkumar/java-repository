import java.util.Arrays;
public class Assignment4{
public static void main(String[] args){
    int[] arrayNumbers; 
    arrayNumbers = new int [5];
    arrayNumbers [0] = 234;
    arrayNumbers [1] = 236;
    arrayNumbers [2]= 123;
    arrayNumbers [3] = 346;
    arrayNumbers [4] = 367;

    Arrays.sort (arrayNumbers);
    int i;
    for (i=0; i <arrayNumbers.length; i++) { 
        System.out.println("numbers:" + arrayNumbers [i]);
    }
}
}

