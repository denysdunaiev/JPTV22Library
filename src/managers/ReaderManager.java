/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.util.Scanner;
import entity.Reader;

/**
 *
 * @author pupil
 */
public class ReaderManager {
    private final Scanner scanner;
    public ReaderManager(Scanner scanner){
        this.scanner = scanner;
    }
    public void addReader(){
        System.out.println("----- Add new reader -----");
        Reader reader = new Reader();
        System.out.println("Firstname: ");
        reader.setFirstname(scanner.nextLine());
        System.out.println("Lastname: ");
        reader.setLastname(scanner.nextLine());
        System.out.println("Phone: ");
        reader.setPhone(scanner.nextLine());
        System.out.println("Reader added " + reader.toString());
    }
}
