package com.myk.test.algorithm;

/**
 * Created by Administrator on 2019/6/28 0028.
 */
public class Louti {

    public static int  test(int n){

        switch (n){
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return test(n-1) + test(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(test(10));
    }
}
