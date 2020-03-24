/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappllication1;

import java.util.Scanner;

/**
 *
 * @author Ezgi
 */
public class JavaAppllication1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int quiznotu,vizenotu,finalnotu;
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Quiz Notunu Giriniz : ");
        quiznotu = input.nextInt();
            
        System.out.println("Vize Notunu Giriniz : ");
        vizenotu = input.nextInt();
       
        System.out.println("Final Notunu Giriniz : ");
        finalnotu = input.nextInt();
        
        int rastgelepuan = (int)(Math.random()*11);
        System.out.println("10 üzerinden sınıfiçi performansı : "+rastgelepuan);
        
        if(quiznotu>0 && quiznotu<=100){
           System.out.println("QUIZ NOTU : "+quiznotu);
          }
          else{
           System.out.println("Quiz Notu : GEÇERSİZ NOT GİRİLDİ ");
          }
          if(vizenotu>0 && vizenotu<=100){
           System.out.println("VİZE NOTU : "+vizenotu);
          }
          else{
           System.out.println("Vize Notu : GEÇERSİZ NOT GİRİLDİ ");
          }
          if(finalnotu>0 && finalnotu<=100){
           System.out.println("FİNAL NOTU : "+finalnotu);
          }
          else{
           System.out.println("Final Notu : GEÇERSİZ NOT GİRİLDİ ");
          }
        
        quiznotu = (int) (quiznotu*0.15);
        vizenotu = (int) (vizenotu*0.25);
        finalnotu = (int) (finalnotu*0.50);
        double ortalaman = (double) (quiznotu+vizenotu+finalnotu+rastgelepuan);

                
        boolean x;
        char lettergrade;
        
       
          if ((ortalaman>=85) &&(ortalaman<=100)){
            lettergrade = 'A';
        }
           else if ((ortalaman>=70) && (ortalaman<85)){
            lettergrade = 'B';
        }
           else if ((ortalaman>=55) && (ortalaman<70)){
           lettergrade = 'C';
        }
           else if((ortalaman>0) && (ortalaman<55)){
           lettergrade = 'F';
        }
           else{
           lettergrade = ' ';
           System.out.println("AŞAĞIDAKİ ORTALAMA GEÇERSİZDİR. LÜTFEN NOTLARI 0-100 ARALIĞINDA GİRİNİZ");
           }
          
           System.out.println("Genel Ortalama : "+ortalaman);
           System.out.println("Harf Notu : "+lettergrade);
        
        switch(lettergrade){
           case 'A' : x=true;break;
           case 'B' : x=true;break;
           case 'C' : x=true;break;
           default :  x=false;break;
        }
        if(ortalaman>=55 && ortalaman<=100) 
           System.out.println("GEÇTİ");
         else 
           System.out.println("KALDI");
        
       }
    
}
