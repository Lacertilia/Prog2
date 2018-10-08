package Clock;

public class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int maxLimit){
        if(maxLimit>0){
            this.limit = maxLimit;
        }
    }

    public int getValue(){
        return value;
    }

    public void setValue(int newValue){
        if(newValue<limit && newValue>=0){
            this.value = newValue;
        }
    }

    public String getDisplayValue(){
        if(value<10){
            return "0" + value;
        }else{
            return "" + value;
        }
    }

    public void increment(){
        if(value<(limit-1)){
            value++;
        }else{
            value = 0;
        }
    }
}
