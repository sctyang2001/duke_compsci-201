public class Password {
    public static void main(String[] args){
        // Do not change this part

        // password is readin from stdio
        String password = StdIn.readAll();
        boolean safe = isSafePassword(password);
        System.out.println(safe);
    }
    // Implement static method IsSafePassword.
    
    // Complete the JPA code here, see README on course website for problem description and instructions.
    public static boolean eightCharLong(String pwd)
    {
        if (pwd.length()>=8) {return true;}
        else {return false;}
    }

    public static boolean oneDigit(String pwd)
    {
        for (int y = 0; y < pwd.length(); y++){
            if ((pwd.charAt(y) >= '0') && (pwd.charAt(y) <= '9')) {return true;}
        }
        return false;
    }

    public static boolean upperCase(String pwd)
    {
        for (int y = 0; y < pwd.length(); y++){
            if ((pwd.charAt(y) >= 'A') && (pwd.charAt(y) <= 'Z')) {return true;}
        }
        return false;
    }

    public static boolean lowerCase(String pwd)
    {
        for (int y = 0; y < pwd.length(); y++){
            if ((pwd.charAt(y) >= 'a') && (pwd.charAt(y) <= 'z')) {return true;}
        }
        return false;
    }

    public static boolean symbol(String pwd)
    {
        for (int y = 0; y < pwd.length(); y++){
            if (((pwd.charAt(y) < 'A') || (pwd.charAt(y) > 'Z'))
              &&((pwd.charAt(y) < 'a') || (pwd.charAt(y) > 'z'))
              &&((pwd.charAt(y) < '0') || (pwd.charAt(y) > '9'))) 
            return true;
        }
        return false;
    }

    public static boolean isSafePassword(String pwd)
    {
        if (eightCharLong(pwd) && oneDigit(pwd) && upperCase(pwd) && lowerCase(pwd) && symbol(pwd)) {return true;}
        else {return false;}
    }
}