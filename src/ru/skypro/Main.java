package ru.skypro;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 1 + Задача 2");
        System.out.println();
        int [] array1 = new int[3];

        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        //int [] array1 = {1,2,3};

        //double [] array2 = {1.57,7.654,9.986};
        double[] array2=new double[3];
        array2[0]=1.57;
        array2[1]=7.654;
        array2[2]=9.986;

        int [] array3 = {1,6,8,7,9,45,112,36,56,25,15,78,96,69,32,36};

        // ЗАДАЧА №2

        for (int i = 0; i <2; i++) {
            System.out.print(array1[i] + ", ");
        }
        for (int i = array1.length-1; i <3 ; i++) { // чтобы запятой в конце не было
            System.out.print(array1[i]);
        }
        System.out.println();

        for (int i = 0; i < array2.length-1; i++) {
            System.out.print(array2[i] + ", ");
        }  for (int i = array2.length-1; i < array2.length; i++) {  // чтобы запятой в конце не было
            System.out.print(array2[i]);
        }
        System.out.println();

        for (int i = 0; i < array3.length-1; i++) {
            System.out.print(array3[i] + ", ") ;
        }
        for (int i = array3.length-1; i < array3.length; i++) { // чтобы запятой в конце не было
            System.out.print(array3[i]) ;
        }System.out.println();

        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        for (int i = array1.length-1; i >=0 ; i--) {
            System.out.print(array1[i] + ", "); // не стал добавлять кусок кода, чтобы убрать последнюю запятую
        } System.out.println();
        for (int i = array2.length-1; i >=0 ; i--) {
            System.out.print(array2[i] + ", "); // не стал добавлять кусок кода, чтобы убрать последнюю запятую
        }System.out.println();
        for (int i = array3.length-1; i >=0 ; i--) {
            System.out.print(array3[i] + ", "); // не стал добавлять кусок кода, чтобы убрать последнюю запятую
        }

        //Задача 4
        System.out.println();
        System.out.println();
        System.out.println("Задача 4");

        for (int i = 0; i < 3; i++) {
            if (array1[i] % 2!=0) {
                array1[i]+=1;
                System.out.print(array1[i] + "  ");
            }
        }


    }
}
