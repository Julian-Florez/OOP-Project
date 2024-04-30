public class Pair<T> {

 

    private _________ first;
    private _________ second;

 

    public Pair (_________ first, _________ second) {
        this.first = first;
        this.second = second;
    }

 

    public T getFirst() {
        return first;
    }

 

    public T getSecond() {
        return second;
    }

 

    /**
    * This method interchanges the values of any  
    * type held by the Pair class instance
    */
    public void swapPair() {
        
        T temp = first;

        first = second;
        second = temp;
    }

 

}//End class