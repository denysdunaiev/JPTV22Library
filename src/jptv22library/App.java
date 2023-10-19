/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22library;

import java.util.Scanner;
import managers.BookManager;
import managers.ReaderManager;

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
            System.out.println("1. Add new book");
            System.out.println("2. Add new reader");
            System.out.print("Task number: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    BookManager bookManager;
                    bookManager = new BookManager(scanner);
                    bookManager.addBook();
                    break;
                case 2:
                    ReaderManager readerManager;
                    readerManager = new ReaderManager(scanner);
                    readerManager.addReader();
                    break;
                default:
                    System.out.println("Select task from list tasks");
            }
        }while(repeat);
    }
    
}
