/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01roldanclare;

/**
 *
 * @author Acer
 */
public class Ex01RoldanClare {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String subj1 = "Mathematics 4";
        int mtgs1 = 4;
        double hrs1 = 3.0;
        double unit1 = 1.3;
        
        String subj2 = "Computer Science 4";
        int mtgs2 = 3;
        double hrs2 = 2.25;
        double unit2 = 1;
        
        String subj3 = "Physical Education 5";
        int mtgs3 = 2;
        double hrs3 = 1.5;
        double unit3 = 0.33;
        
        
        
        System.out.println("Subject: " + subj1 + '\n' + "Meetings per Week: " + mtgs1 + '\n' + "Hours per Week: " + hrs1 + '\n' + "Subject Unit: " + unit1 +
                          '\n' + '\n' + "Subject: " + subj2 + '\n' + "Meetings per Week: " + mtgs2 + '\n' + "Hours per Week: " + hrs2 + '\n' + "Subject Unit: " + unit2 +
                          '\n' + '\n' + "Subject: " + subj3 + '\n' + "Meetings per Week: " + mtgs3 + '\n' + "Hours per Week: " + hrs3 + '\n' + "Subject Unit: " + unit3);
        
        double hrsTotal = hrs1 + hrs2 + hrs3;
        System.out.println('\n' + "The subjects' combined number of hours: " + hrsTotal);
        
        boolean unitCompare = unit1 > unit3;
        System.out.println("Mathematics have more units than Computer Science: " + unitCompare);
        
        double hrsPerMtg = hrs3 / mtgs3;
        System.out.println("Number of hours spent in a meeting for Physical Education: " + hrsPerMtg);
        // TODO code application logic here
        
    }
    
}
