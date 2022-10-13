public class VowelsInOrder
{
    public static void main(String[] args) { 
        String arg = args[0];
        String regexp = null;
        // Complete the JPA code here, see README on course website for problem description and instructions.

        regexp = "[qwrtypsdfghjklzxcvbnm]*(a)[qwrtypsdfghjklzxcvbnm]*e[qwrtypsdfghjklzxcvbnm]*i[qwrtypsdfghjklzxcvbnm]*o[qwrtypsdfghjklzxcvbnm]*u[qwrtypsdfghjklzxcvbnm]*";

        if (arg.matches(regexp)) System.out.println("Yes");
        else System.out.println("No");

    }
}
