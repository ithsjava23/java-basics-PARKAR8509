package org.example;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String choice;

        do {

            String menu = """
                    Elpriser
                    ========
                    1. Inmatning
                    2. Min, Max och Medel
                    3. Sortera
                    4. Bästa Laddningstid (4h)
                    e. Avsluta
                    """;

            System.out.print(menu);
            choice = Scanner.nextLine();

        } while (!choice.equalsIgnoreCase("e"));

        // Kod som ska köras när användaren väljer att avsluta
    }
}










        








