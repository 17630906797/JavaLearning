package com.heima.variable;

public class TypeReversion {
    public static void main(String[] args) {
        //理解自动类型转换
        //自动类型转换是小变量变成大变量
        //byte short char在表达式中的运算时，都是以int 类型的数据参与运算的，所以运算结果需要用int来接收
        char a = 'x';
        byte b =20;
        int c = a + b;
        System.out.println(c);//用int类型接收

        //强制类型转换是：把类型范围大的变量转换为类型范围小的变量，可能会有精度损失或者数值错误
        int d = 129;
        byte e;
        e = (byte)d ;//这就不行，因为byte类型表示不了129，强行转换会出现数值错误。
        System.out.println(e);
        //会输出e = -127,补码存储的129在高位截断的时候就会出现数值错误

    }
}
