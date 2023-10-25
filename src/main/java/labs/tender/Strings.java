package labs.tender;

public enum Strings {
    GAMEMASTER(ConsoleColors.GREEN + "GAMEMASTER" + ConsoleColors.RESET),
    SPECIALIST(ConsoleColors.PURPLE + "specialist" + ConsoleColors.RESET)
    ;
    public String key;

    Strings(String x){key=x;}
}
