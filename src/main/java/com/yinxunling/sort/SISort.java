package com.yinxunling.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 直接插入排序
 */
public class SISort {


    public static void main(String[]args){
        int arr[] = {52,39,67,95,70,8,25,52};
        //建立一个临时数组存放有序值
        int temparr[] = new int[8];
        //分别比较每个数值与临时数组的关系确定位置
        temparr[0] = arr[0];
        //输出排序结果
        for(int i =0 ;i<arr.length;i++){
            for(int j=0 ;j<temparr.length;j++){
                if(arr[i]<temparr[j]){
                    int a = temparr[j];
                    temparr[j]= arr[i];
                    temparr[j+1] = a;
                }else{
                    temparr[j+1]=arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(temparr));
    }
}
