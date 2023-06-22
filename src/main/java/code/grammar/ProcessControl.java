package code.grammar;

import org.junit.jupiter.api.Test;

public class ProcessControl {

    @Test
    public void test01() {
        int a = 3;
        int b = 1;
//        if(a = b){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not Equal");
//        }
    }

    @Test
    public void test02() {
        double a = .25;
        System.out.println("a = " + a);
    }

    @Test
    public void test03() {
        // String str1 = 4; //判断对错：no
        String str2 = 3.5f + ""; //判断str2对错：yes
        System.out.println(str2); //输出："3.5"
        System.out.println(3 + 4 + "Hello !"); //输出：7Hello!
        System.out.println("Hello !" + 3 + 4); //输出：Hello!34
        System.out.println('a' + 1 + "Hello !"); //输出：98Hello!
        System.out.println("Hello" + 'a' + 1); //输出：Helloa1
    }

    @Test
    public void test04() {
        short s = 5;
        // s = s - 2; //判断：no
        byte b = 3;
        // b = b + 4; //判断：no
        b = (byte) (b + 4); //判断：yes
        char c = 'a';
        int i = 5;
        float d = .314F;
        double result = c + i + d; //判断：yes
        // byte b = 5;
        // short s = 3;
        // short t = s + b; //判断：no
    }
    
    @Test
    public void test05() {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i="+i);
        System.out.println("i1="+i1);
        i = ++i1;
        System.out.print("i="+i);
        System.out.println("i1="+i1);
        i = i2--;
        System.out.print("i="+i);
        System.out.println("i2="+i2);
        i = --i2;
        System.out.print("i="+i);
        System.out.println("i2="+i2);
    }

    @Test
    public void test06() {
        short s = 3;
        // s = s+2;
        s += 2;

        int i = 1;
        i *= 0.1;
        System.out.println(i);//
        i++;
        System.out.println(i);//


//        int m = 2;
//        int n = 3;
//        n *= m++;
//        System.out.println("m=" + m);
//        System.out.println("n=" + n);

        int n = 10;
        n += (n++) + (++n);
        System.out.println(n);

    }
}
