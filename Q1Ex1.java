/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1;

/**
 *
 * @author TAU
 */
public class Q1Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String subj1 = "Mathematics 4";
        int mtgs1 = 4;
        double hrs1 = 3;
        double unit1 = 1.3;
        
        String subj2 = "Computer Science 4";
        int mtgs2 = 3;
        double hrs2 = 2.25;
        double unit2 = 1;
        
        String subj3 = "Physical Education 5";
        int mtgs3 = 2;
        double hrs3 = 1.5;
        double unit3 = 0.33;
        
        
        
        System.out.println("Subject: " + subj1 + '\n' + "Meetings per Week: " + mtgs1 + '\n' + "Hours per Week: " + hrs1 + '\n' + "Subject Unit: " + unit1
                          "Subject: " + subj2 + '\n' + "Meetings per Week: " + mtgs2 + '\n' + "Hours per Week: " + hrs2 + '\n' + "Subject Unit: " + unit2
                          "Subject: " + subj3 + '\n' + "Meetings per Week: " + mtgs3 + '\n' + "Hours per Week: " + hrs3 + '\n' + "Subject Unit: " + unit3);
        double hrsTotal = hrs1 + hrs2 + hrs3;
        System.out.println("The subjects' combined number of hours: " + hrsTotal);
        
        boolean unitCompare = unit1 > unit3;
        System.out.println("Mathematics have more units than Computer Science: " + unitCompare);
        
        double hrsPerMtg = hrs3 / mtgs3;
        System.out.println("Number of hours spent in a meeting for Physical Education: " + hrsPerMtg);
        // TODO code application logic here
        
    }
    
}
