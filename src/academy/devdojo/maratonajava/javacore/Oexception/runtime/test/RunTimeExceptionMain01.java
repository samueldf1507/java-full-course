package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionMain01 {
    public static void main(String[] args) {
        //Checked e Unchecked
        Object o = null;
        int[] nums = {1, 2};
        System.out.println(o.toString()); //vai dar NullPointerException
        System.out.println(nums[2]); //Vai dar ArrayIndexOutOfBoundsException



    }
}
