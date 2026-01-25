/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validation;

/**
 *
 * @author admin
 */
public class Validation {
     // check employee code
    public static boolean isValidId(String id) {
      if (id == null || id.trim().isEmpty()){
          return false;
      }
      // no gaps are allowed
      return !id.contains(" ");
    }
    
    public static boolean isValidName(String name){
        if ( name == null){
             return false;
        }
        name = name.trim();
        return name.trim().length()>= 1;
    }
    public static boolean isVaidAge (int age){
         return age >= 18 && age <= 65;
    }
    
    public static boolean isVaidSalary(double salary){
        return salary >=0;
    }
    public static boolean isVaidEmail(String email){
        if(email == null || email.trim().isEmpty()){
            return false;
        }
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
    public static boolean isVaidPhone(String phone){
        if (phone == null ){
            return false;
        }
        return phone.matches("\\d{10}");
    }
    public static boolean isVaidDepartment(String deptId){
        if(deptId == null || deptId.trim().isEmpty()){
            return false;
        }
        return !deptId.contains(" ");
    }
    public static boolean isVaidPosition(String posnId, String posnName){
        if( posnId == null || posnId.trim().isEmpty()){
            return false;
        }posnId = posnId.trim();
        if (posnId.contains(" ")){
            return false;
        } 
        if(posnName == null ||posnName.trim().isEmpty() ){
            return false;
        }
        posnName = posnName.trim();
        if(posnName.length()< 2){
           return false;
        }
        return true;
    }
}
    




