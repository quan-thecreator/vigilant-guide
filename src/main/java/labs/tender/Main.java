package labs.tender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final String bannerText;

    static {
        try {
            bannerText = new String(Main.class.getClassLoader().getResourceAsStream("banner.txt").readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        println(bannerText);
        println("The " + Strings.GAMEMASTER.key + " asks you to choose, between the "+ConsoleColors.WHITE_BOLD_BRIGHT+"light"+ConsoleColors.RESET+" and "+ConsoleColors.RED_UNDERLINED+"dark"+ConsoleColors.RESET+", " +
                ConsoleColors.BLUE_BOLD_BRIGHT +"blue"+ConsoleColors.RESET + " or "+ ConsoleColors.RED_BOLD_BRIGHT +"red"+ ConsoleColors.RESET +", to protect or to attack.");
        println("1 or 2");
        int choice = Integer.parseInt(bufferedReader.readLine());
        switch (choice){
            case 1:
                println("you walk the light, and the first step to protecting a system is almost always the creation of secure credentials. Make the most secure password you can. Continue by pressing 'Enter.'");
                String idiotPassword = bufferedReader.readLine();
                checkPassword(idiotPassword);
                println("Feel free to try again, " + Strings.SPECIALIST.key + ".");
                break;
            case 2:
                println("Welcome, Child of the Night.");

                break;
        }
    }
        public static void checkPassword(String password) {
            int upperChars = 0, lowerChars = 0, specialChars = 0, digits = 0, length;
            char ch;
            length = password.length();

            if (length < 6) {
                System.out.println("Password must be at least 6 characters long!\n");
                return;
            } else {
                for (int i = 0; i < length; i++) {
                    ch = password.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        upperChars++;
                    } else if (Character.isLowerCase(ch)) {
                        lowerChars++;
                    } else if (Character.isDigit(ch)) {
                        digits++;
                    } else {
                        specialChars++;
                    }
                }
            }

            if (upperChars != 0 && lowerChars != 0 && digits != 0 && specialChars != 0) {
                if (length >= 10) {
                    System.out.println("The strength of password is strong.\n");
                } else {
                    System.out.println("The strength of password is medium.\n");
                }
            } else {
                if (upperChars == 0)
                    System.out.println("Password must contain at least one uppercase character!\n");
                if (lowerChars == 0)
                    System.out.println("Password must contain at least one lowercase character!\n");
                if (specialChars == 0)
                    System.out.println("Password must contain at least one special character!\n");
                if (digits == 0)
                    System.out.println("Password must contain at least one digit!\n");
            }
        }
        private static void println(Object x){
        System.out.println(x);
    }
}