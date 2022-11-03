public class CalcInvest {
    double time;
    double percent;
    double sum;

    public CalcInvest(int time, int percent, int sum) {
        this.time = time;
        this.percent = percent;
        this.sum = sum;
    }

    public CalcInvest(CalcInvest ci2) {
        this.time = ci2.time;
        this.percent = ci2.percent;
        this.sum = ci2.sum;
    }

    public CalcInvest() {

    }

    double calcIncome() {
        return sum *
                (Math.pow((1 + percent / 100), time));
    }
}
