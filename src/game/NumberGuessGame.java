package game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        MyGame g=new MyGame();
        System.out.println("Welcome To Number Guessing Game !!");
        System.out.println();
        boolean b=false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }

}


class MyGame{
    public int number;
    public int inputNumber;
    public int NumberOfGuesses=0;


      MyGame(){
        Random ran=new Random();
        this.number= ran.nextInt(100);
    }

    void takeUserInput(){

        System.out.println("Guess the Number");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();

    }

    boolean isCorrectNumber(){
          NumberOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, NumberOfGuesses);
            System.out.println();
            return true;
        }
        else if(inputNumber>number){
            System.out.println("Number is too high");
        }

        else if(inputNumber<number){
            System.out.println("Number is too less");
        }
    return false;

    }

    public int getNumberOfGuesses() {
        return NumberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        NumberOfGuesses = numberOfGuesses;
    }
}

