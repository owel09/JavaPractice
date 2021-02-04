package Fundamentals.Calculator;

public class simplecalc_inhe extends simplecalc {

    public simplecalc_inhe(){
        super();
    }

    public int mult(){
        return this.getX() * this.getY();
    }

    public int div(){
        int z = this.getY();
        if(z == 0){
            return 0;
        }
        return this.getX() / z;
    }
}
