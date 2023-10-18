/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22library;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {

    private final Scanner scanner;
    public App(){
        this.scanner = new Scanner(System.in);
    }
    void run() {
        boolean repeat = true;
        do{
            System.out.println("Select task:");
            System.out.println("0. Exit");
            System.out.print("Task number: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                default:
                    System.out.println("Select task from list tasks");
            }
        }while(repeat);
    }
    
}
