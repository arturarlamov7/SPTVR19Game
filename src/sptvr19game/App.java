/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {

    private int attempt;
    public void run(){
        System.out.println("Угадай задуманное число.");
        System.out.println("------------------------");
        int min = 0;
        int max = 10;
        Random random = new Random();
        int myNumber = random.nextInt(5-0+1)+0;
        System.out.println("Задумай число от 0 до 5. Угадай!");
        Scanner scanner = new Scanner(System.in);
        do{
            int gamerNumber = scanner.nextInt();
            if (myNumber == gamerNumber) {
                System.out.println("Ты выйграл!");
                break;
            } else {
                if (attempt >= 3){ 
                    System.out.println("Не угадал, попробуй еще: ");
                }else{
                        
                        
                        }
            }
        }while()
        
    
    
}
