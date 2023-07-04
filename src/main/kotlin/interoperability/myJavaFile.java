
package interoperability;

import function.Default_argsKt;

public class myJavaFile {

    public static void main(String[] args) {
        int sum = MyCustomName.add(5,6);
        System.out.println("Printing sum of kotlin method : "+ sum);

        int area = Default_argsKt.area(5,6);
        System.out.println("area of Default function from kotlin file : " + area);
    }

    public static int getArea(int l,int b){
        return l*b;
    }
}
