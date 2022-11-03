import java.util.Objects;

public class CryptoConverter {
    String btc;
    String crypto;
    int amount;

    public CryptoConverter(String btc, String crypto, int amount) {
        this.btc = btc;
        this.crypto = crypto;
        this.amount = amount;
    }


    int convertToCrypto() {
        int total = 0;
        int ether = 1250;
        int bitcoin = 20000;
        int solana = 30;
        int tether = 1;
        if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "eth"))) {
            total = (amount * bitcoin) / ether;
        } else if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "sol"))) {
            total = (amount * bitcoin) / solana;
        } else if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "tet"))) {
            total = (amount * bitcoin) * tether;
        }
        return total;
    }

    double convertToCrypto(String btc, String crypto, double amount) {
        double total = 0;
        double ether = 1250.60;
        double solana = 30.88;
        double tether = 1.01;
        int bitcoin = 20000;
        if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "eth"))) {
            total = (amount * bitcoin) / ether;
        } else if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "sol"))) {
            total = (amount * bitcoin) / solana;
        } else if ((Objects.equals(btc, "btc")) && (Objects.equals(crypto, "tet"))) {
            total = (amount * bitcoin) / tether;
        }

        return total;
    }
}
