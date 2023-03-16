/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.home3;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author afana
 */
public class Home3 {

    private static int z;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Работу выполнила Афанасьева Злата, РИБО-01-21, Вариант №2" + "\n");
        HashMap<String, Telephone> telephonesMap = new HashMap<>();
        telephonesMap.put("X35235ZMD", new Telephone("Panasonic", "X35235ZMD", "white", false));
        telephonesMap.put("XYZ123456789", new Telephone("Samsung S10", "XYZ123456789", "black", true));
        telephonesMap.put("ASIOS77777QWERTY", new Telephone("Iphone X", "ASIOS77777QWERTY", "black", true));
        TreeMap<String, Telephone> sortedTelephoneMap = new TreeMap<>(telephonesMap);
        System.out.println("Список телефонов:" + "\n");
        for (Entry<String, Telephone> entr : sortedTelephoneMap.entrySet()){
            String sernomer = entr.getKey();
            String model = entr.getValue().getmodel();
            String colour = entr.getValue().getcolour();
            boolean tip = entr.getValue().istip();
            System.out.println(model + ", " + colour + ", " + tip + ", " + sernomer);
        }
        while (true){
            System.out.println("\n");
            System.out.println("Выбирайте: Добавить новый телефон, Удалить телефон или Удалить все телефоны");
            System.out.println("1 - Добавить новый телефон" + "\n"
                    + "2 - Удалить телефон" + "\n"
                    + "3 - Удалить все телефоны" + "\n"
                    + "4 - Отобразить список телефонов");
            int i = scan.nextInt();
            System.out.println("\n");
                if (i==1){
                    System.out.println("Модель телефона: ");
                    scan.nextLine();
                    String Model = scan.nextLine();
                    System.out.println("Цвет телефона: ");
                    String Colour = scan.next();
                    System.out.println("Тип телефона (1 - мобильный, 2 - Стационарный): ");
                    int A = scan.nextInt();
                    boolean Tip = A == 1;
                    System.out.println("Серийный номер телефона: ");
                    String Sernomer = scan.next();
                    System.out.println("\n");
                    TreeMap<String, Telephone> sortedNewTelephoneMap = new TreeMap<>(telephonesMap);
                    for (Entry<String, Telephone> entr : sortedNewTelephoneMap.entrySet()){
                        String sernomer = entr.getKey();
                        if (sernomer.equals(Sernomer)){
                            z = 1;
                        }
                    }
                    if (z==1){
                        System.out.println("Телефон с таким серийным номером уже есть в списке!");
                    }
                    else{
                        telephonesMap.put(Sernomer, new Telephone(Model, Sernomer, Colour, Tip));
                        System.out.println("Телефон добавлен в список!");
                    }
                }
                if (i==2){
                    System.out.println("Серийный номер телефона: ");
                    String Seernomer = scan.next();
                    telephonesMap.remove(Seernomer);
                    System.out.println("\n");
                    System.out.println("Телефон удален из списка!");
                }
                if (i==3){
                    telephonesMap.clear();
                    System.out.println("Список телефонов удален!");
                }
                if (i==4){
                    TreeMap<String, Telephone> sortedNewTelephoneMap = new TreeMap<>(telephonesMap);
                    System.out.println("Список телефонов:" + "\n");
                for (Entry<String, Telephone> entr : sortedNewTelephoneMap.entrySet()){
                    String sernomer = entr.getKey();
                    String model = entr.getValue().getmodel();
                    String colour = entr.getValue().getcolour();
                    boolean tip = entr.getValue().istip();
                    System.out.println(model + ", " + colour + ", " + tip + ", " + sernomer);
                }
                }
            }
    }
}