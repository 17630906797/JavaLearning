package com.heima.Array;

public class FindMax {
    public static void main(String[] args) {

        //目标：找到到数组中的最大值
        int[] facescore = {95, 50, 80, 100, 20, 5, 10, 27, 101, 78};
        int maxnum = 0;
        for (int i = 0; i < facescore.length; i++) {
            if (facescore[i] > maxnum) {
                maxnum = facescore[i];
            }
        }
        System.out.println("颜值最高的得分是：" + maxnum);
    }
}
