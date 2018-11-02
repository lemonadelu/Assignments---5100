/*
When a program fails due to an uncaught exception, the system automatically prints out the exception’s stack trace.
If the failure is not easily reproducible, it may be difficult or impossible to get any more information.
Therefore, it is critically important that the exception’s toString() method return, as much information as possible concerning the cause of the failure.
In other words, the detail message of an exception should capture the failure for subsequent analysis.
To capture the failure, the detail message of an exception should contain the values of all parameters and fields that “contributed to the exception.
 */
public class MyIndexOutOfBoundException extends ArrayIndexOutOfBoundsException {
    private int lowerBound; //the lowest legal index value
    private int upperBound; //the highest legal index value
    private int index; //the current index value

    MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.index = index;
    }

    public String toString() {
        return "Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: " + upperBound;
    }


    public static void main(String[] args) throws MyIndexOutOfBoundException {
        int[] a = {1,2,3};
        try {
            for (int i = 0; i < 6; i++) {
                if (i > a.length)
                    throw new MyIndexOutOfBoundException(0, a.length, i);
            }
        } catch(MyIndexOutOfBoundException e){
                System.out.println(e);
        }
        System.out.println("finish");
    }
}

