package junit;

import org.junit.Test;

import java.util.*;

public class Challenges {
@Test
public void testCommonWords(){
    String[] arr1 = {"hello", "adios", "goodbye", "hola", "au revoir", "bonjour"};
    String[] arr2 = {"hello", "welcome","thanks", "goodbye", "please"};
    commonWords(arr1, arr2);
}

private void commonWords(String[] arr1, String[] arr2){
    ArrayList<String> arr3 = new ArrayList<>();

    for (int i=0; i< arr1.length; i++) {
        for (int j=0; j<arr2.length; j++){
            if (arr1[i].equals(arr2[j])){
                arr3.add(arr1[i]);
            }
        }
    }
    for (String str: arr3){
        System.out.println(str);
    }
}

@Test
public void testDivNums(){
    int[] arr2 = {29, 30, 50};
    divNums(arr2);
}

private void divNums(int[] arr2){
    ArrayList<Integer> arr1 = new ArrayList<>();

    for (int num: arr2){
        for (int i=1; i<= (100 - (100 % num))/num; i++){
            arr1.add(num * i);
            System.out.println(num * i);
        }
    }
}

@Test
public void testGuessANum(){
    int max = 100;
    int min = 1;
    Random rand = new Random();
    int value = rand.nextInt((max - min) + 1) + min;
    guessANum(value);
}

private void guessANum(int value){
    int max = 100;
    int min = 1;
    int count = 0;
    System.out.println("Number to guess is " + value);

    Random rand = new Random();

    int guess = rand.nextInt((max - min) + 1) + min;
    System.out.println("Guess is " + guess);
    ++count;

    if(guess == value){
        System.out.println("Congrats! U got it in 1 try!! Guessed Num is " + guess );
    }

    while (guess != value) {

        if (guess > value) {
            System.out.println("Guessed Num is " + guess+ " Too high!" );
            max = guess -1;

            guess = rand.nextInt((max - min) + 1) + min;
            ++count;

            if(guess == value){
                System.out.println("Guessed Num is " + guess + " Congrats! U got it in " + count + " tries!!");
                break;
            }
        }
        else if (guess < value){
            System.out.println("Guessed Num is " + guess + " Too low!" );
            min = guess +1;

            guess = rand.nextInt((max - min) + 1) + min;
            ++count;

            if(guess == value){
                System.out.println("Guessed Num is " + guess + " Congrats! U got it in " + count + " tries!!" );
                break;
            }
        }
    }
}
}
