public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int print(int copies, int pages){
        if (this.sheets >= (copies * pages)){
            this.sheets = (this.sheets - (copies * pages));
            this.toner = this.toner - pages;
            return this.sheets;
        }
        return this.sheets;
    }

    public int refill() {
        if (this.sheets < 100) {
            this.sheets = 100;
        }
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }
}
