public class Main {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_YELLOW = "\u001B[33m";


        Converter con = new Converter("uah", "usd", 25);
        Converter con2 = new Converter(con);
        Converter con3 = new Converter();
        con3.uah = "uah";
        con3.currency = "eur";
        con3.amount = 78;

        System.out.println(con.equals(con2));

        CryptoConverter cc = new CryptoConverter("btc", "eth", 15);

        CalcInvest ci = new CalcInvest(10, 12, 150000);
        CalcInvest ci2 = new CalcInvest(ci);
        CalcInvest ci3 = new CalcInvest();

        ci3.time = 24;
        ci3.percent = 12.3;
        ci3.sum = 100000;

        System.out.println(con.convertToUEP() + ANSI_GREEN +" гривень" + ANSI_RESET);
        System.out.println(con2.convertToUEP() + ANSI_GREEN +" гривень" + ANSI_RESET);
        System.out.println(con3.convertToUEP() + ANSI_GREEN + " Гривень" + ANSI_RESET);

        System.out.println("\n");

        System.out.println(cc.convertToCrypto() + ANSI_PURPLE + " Ether" + ANSI_RESET);
        System.out.println(cc.convertToCrypto("btc", "eth", 7.7) + ANSI_PURPLE + " Ether" + ANSI_RESET);
        System.out.println(cc.convertToCrypto("btc", "sol", 2.380) + ANSI_BLUE + " Solana" + ANSI_RESET);


        System.out.println("\n");

        System.out.println("В кінцевому результаті ви отримаєте - " + ANSI_YELLOW + ci.calcIncome() + ANSI_RESET);
        System.out.println("В кінцевому результаті ви отримаєте - " + ANSI_YELLOW + ci2.calcIncome() + ANSI_RESET);
        System.out.println("В кінцевому результаті ви отримаєте - " + ANSI_YELLOW + ci3.calcIncome() + ANSI_RESET);

    }
}