package jktvr19game;

import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melnikov
 */
public class App {
    public void run(){
        System.out.println("Провет, поиграем!");
        Random random = new Random();
        int myNumber = random.nextInt(5-0+1)+0;
        System.out.println("Загадано число в диапазоне от 0 до 5, угадай:");
        Scanner scanner = new Scanner(System.in);
        String gamerNumberStr = null;
        int gamerNumber = -1;
        int attempt=0;
        do {            
            try {
                gamerNumberStr = scanner.nextLine();
                gamerNumber = Integer.parseInt(gamerNumberStr);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный ввод числа");
                System.exit(0);
            }
            if(myNumber == gamerNumber){
                System.out.println("Ты выиграл!");
                break;
            }else{
                if(attempt < 2){
                    System.out.println("Неправильно, попробуй еще:");
                }else{
                    System.out.println("Ты проиграл, было задумано число: " + myNumber);
                    break;
                }
                attempt++;
            }
        } while (true);
        System.out.println("--- конец игры ---");
        
    }
}
