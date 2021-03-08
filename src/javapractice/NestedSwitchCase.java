/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author User
 */
public class NestedSwitchCase {
    public static void main(String[] args) {
        
        char branch = 'C';
        int collegeYear = 4;
        switch(collegeYear){
            case 1:
                System.out.println("English, Maths,Science");
                break;
            case 2:
               switch(branch){
                   case 'C':
               System.out.println("Operating System");
                       break;
                       
                   case 'E':
                       System.out.println("Micro Processors, Logic switch");
                       break;
                       
                   case 'M':
                       System.out.println("Drawing, Manufacturing");
                       break;
               }
            break;
            case 3:
                switch(branch){
                    case 'C':
                        System.out.println("Computer Organizatic");
                        break;
                        
                    case 'E':
                        System.out.println("Fundamentals of Logic Design");
                        break;
                        
                    case 'M':
                        System.out.println("Internal Combustion");
                        break;
                        
                }break;
                
            case 4:
                switch(branch){
                    case 'C':
                        System.out.println("Data Communication & Networks");
                        break;
                        
                    case 'E':
                        System.out.println("Embedded System");break;
                        
                    case 'M':
                        System.out.println("Production Technology");
                        break;
                }
            break;
        }
    }
}
