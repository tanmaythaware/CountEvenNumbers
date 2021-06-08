package com.company;

public class Main {

    public static void main(String[] args) {
        int start = 4;
        int end =20;
        int count = 0;
        while(start<=end){
            start++;
            if(!isEvenNumber(start)){
                continue;
            }
            System.out.println("Even Number: " + start);
            count++;
            if(count==5){
                break;
            }
        }
        System.out.println("Total Even Numbers Found: " + count);
    }

    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        } else {
            return false;
        }

    }

}
