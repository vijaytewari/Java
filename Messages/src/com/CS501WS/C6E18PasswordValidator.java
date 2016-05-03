package com.CS501WS;

public class C6E18PasswordValidator {
	//number of chars :password must be greater than 8 chars
    //must contain letter and digits
    //contains at least 2 numbers
    int pLength;
    int hasCharacter = 0;
    int hasDigits = 0;
    int pLengthOk;
    String pass;

    public C6E18PasswordValidator(String pwd){
        pass = pwd;
        pLength = pwd.length();
    }

    public boolean checkPasswordSecurity(){
        if(pass.isEmpty()){
            System.out.println("Password Field is Empty!");
        }
              
        if(pLength >= 8){
 			pLengthOk++;
 		}
    	else{
 			System.out.println("Password length has to be more then 8");
        }
        
        if(hasCharacter(pass)){
        	hasCharacter++;
        }
        else{
 			System.out.println("Password needs to have Character");
        }
        
        if(containsNumbers(pass)){
        	hasDigits++;
        }
        else{
 			System.out.println("Password needs to have atleast 2 digits");
        }
        if(pLengthOk > 0 && hasCharacter > 0 && hasDigits > 0){
        	return true;
        }
		return false;
  
    }


    public boolean hasCharacter(String str){
        for(int i = 0; i<pLength; i++){
            if(Character.isLetter(str.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public boolean containsNumbers(String str){
    	int x=0;
        for(int i = 0; i<pLength; i++){
            if(Character.isDigit(str.charAt(i))){
            	x++;
            	if (x==2){return true;}
            }
        }
        return false;
    }

}
