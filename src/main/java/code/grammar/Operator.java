package code.grammar;

import org.junit.jupiter.api.Test;

/**
 * 运算符
 */
public class Operator {

    @Test
    public void test01() {
        // 整数相除，只保留整数部分
        int i = 1;
        i *= 0.1;
        System.out.println(i);// 0
        i++;
        System.out.println(i);// 1
    }

    @Test
    public void test02() {
        int m = 2;
        int n = 3;
        n *= m++;
        System.out.println("m=" + m);
        System.out.println("n=" + n);
    }

    @Test
    public void test03() {
        char x = 'x';
        int i = 10;
        System.out.println(true ? x : i);
        System.out.println(true ? 'x' : 10);
    }

    @Test
    public void test04() {
        int a = 8, b = 3;
        System.out.println(a >>> b);
        System.out.println(a >>> b | 2);
    }

    @Test
    public void test05() {
        int a = 23;
        int b = 12;
        System.out.println(a + "+" + b + "=" + (a + b));
        int sum = a + b;
        System.out.println(a + "+" + b + "=" + sum);

        int sub = a - b;
        //System.out.println(a + "-" + b + "=" + a-b);//错误，原因是a + "-" + b + "=" + a的结果是字符串，字符串不能进行减法
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "-" + b + "=" + sub);

        int mul = a * b;
        System.out.println(a + "*" + b + "=" + a * b);
        System.out.println(a + "*" + b + "=" + mul);

        //整数相除，只保留整数部分
        int div = a / b;
        System.out.println(a + "/" + b + "=" + a / b);
        System.out.println(a + "/" + b + "=" + div);

        double d = (double) a / b;//先把a的类型进行转换，转换成double类型，然后再和b相除
        System.out.println(a + "/" + b + "=" + d);

        int yu = a % b;
        System.out.println(a + "%" + b + "=" + yu);

        System.out.println("------------------特殊的取模----------------------");
        // TODO
        System.out.println(5 % 2);//1
        System.out.println(-5 % -2);//-1
        System.out.println(-5 % 2);//-1
        System.out.println(5 % -2);//1

        System.out.println("------------------负号----------------------");
        int num1 = 12;
        int num2 = -num1;
        System.out.println("num2=" + num2);

        System.out.println("------------------自增----------------------");
        int i = 0;
        System.out.println("自增之前i=" + i);
        i++;
        System.out.println("自增第一次之后i=" + i);
        ++i;
        System.out.println("自增第二次之后i=" + i);
        int j = ++i;//把i自增1，然后结果赋值给j，或者说，先算++i，然后再赋值
        System.out.println("自增第三次之后i=" + i);
        System.out.println("j=" + j);
        int k = i++;//先算赋值，把i的值赋值给k，i原来是3，把3赋值给k，然后i在自增1，i变成4
        System.out.println("自增第四次之后i=" + i);
        System.out.println("k=" + k);

        //面试题：陷阱题
        i = i++;//先赋值，把i原来的值重新赋值给i，不变，然后i自增，但是这个自增后的值没有在放回变量i的位置
        System.out.println("自增第五次之后i=" + i);


    }

    @Test
    public void test06() {
        int x = 0, y = 1;
        if (++x == y-- & x++ == 1 || --y == 0)
            System.out.println("x=" + x + ",y=" + y);   //x = 2,y = 0;
        else
            System.out.println("y=" + y + ",x=" + x);

    }

    @Test
    public void test07() {
        // 两个变量值交换
        int m = 3, n = 5;
        // 答案一：
        int temp = m;
        m = n;
        n = temp;
        // 答案二：
        m = m + n;
        n = m - n;
        m = m - n;
        // 答案三：
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;

    }

    @Test
    public void test08() {
        // 求一个0~255范围内的整数的十六进制值
        //方式一：自动实现
        String str1 = Integer.toBinaryString(60);
        String str2 = Integer.toHexString(60);

        //方式二：手动实现
        int i1 = 60;
        int i2 = i1 & 15;
        String j = (i2 > 9) ? (char) (i2 - 10 + 'A') + "" : i2 + "";
        int temp = i1 >>> 4;
        i2 = temp & 15;
        String k = (i2 > 9) ? (char) (i2 - 10 + 'A') + "" : i2 + "";
        System.out.println(k + "" + j);

    }

    @Test
    public void test09() {
        int a = 3, b = 8;

        int c = (a > b) ? a++ : b++;
        System.out.println("a=" + a + "\tb=" + b + "\tc=" + c);  //

        int d = (a > b) ? ++a : ++b;
        System.out.println("a=" + a + "\tb=" + b + "\td=" + d);  //

        int e = (a < b) ? a++ : b++;
        System.out.println("a=" + a + "\tb=" + b + "\te=" + e);  //

        int f = (a < b) ? ++a : ++b;
        System.out.println("a=" + a + "\tb=" + b + "\tf=" + f);  //

    }

    @Test
    public void test10() {
        int x = 1;
        int y = 1;
        if (x++ == 2 & ++y == 2) {
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);
    }

    @Test
    public void test11() {
        int x = 1, y = 1;
        if (x++ == 2 && ++y == 2) {
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);

    }

    @Test
    public void test12() {
        int x = 1, y = 1;
        if (x++ == 1 | ++y == 1) {
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);
    }

    @Test
    public void test13() {
        int x = 1, y = 1;
        if (x++ == 1 || ++y == 1) {
            x = 7;
        }
        System.out.println("x=" + x + ",y=" + y);
    }

    @Test
    public void test14() {

        boolean x = true;
        boolean y = false;
        short z = 42;
        //if(y == true)
        if ((z++ == 42) && (y = true)) z++;
        if ((x = false) || (++z == 45)) z++;

        System.out.println("z=" + z);// 46
    }
}

