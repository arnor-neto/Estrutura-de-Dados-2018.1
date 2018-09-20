package eduri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {

        ArrayList<String> entradas = new ArrayList();
        String entrada; 
        int cont = 0;
        Scanner leitor = new Scanner(System.in);

        while (leitor.hasNext()){

            entrada = leitor.nextLine();

            entradas.add(entrada);

        }
        int i = 0;

        System.out.println(entradas.get(i) + " printei");
        }

    }