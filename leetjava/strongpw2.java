public class strongpw2 {
  public boolean validPassword(String password) {
    if (password.length() < 8) 
      return false;
  }
  
  	boolean lowerCase = false;
  	boolean upperCase = false;
  	boolean digit = false;
  	boolean special = false;
    
  	String special = "!@#$%^&*()-+";
    char adjacentChar = " ";
    
  
  for (int i = 0; i != password.length(); i++) {
    char current = password.substring(i, i+1);
    
    if (current == adjacentChar)
      return false;
    
    if (current.isLowercase())
      lowerCase = true;
    else if (current.isUppercase())
      upperCase = true;
    else if (current.isDigit())
      digit = true;
    else if (special.indexOf(current) != -1)
      special = true;
    else 
      return false;
  }
  
}