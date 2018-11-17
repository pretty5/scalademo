package com;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //test1();
        //test2();
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println( maxProfit(arr));
    }

    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }



    private static void test2() {
        int[] arr = {1,5,3,6,4,7};
        int minindex=0;
        int tmp;
        if (arr.length==0 || arr==null){
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            minindex = i;
            for (int j =i+1; j <arr.length ; j++) {
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
        if (minindex!=i){
                tmp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=tmp;
        }
        }
        for (int a:arr
             ) {
            System.out.print(a);
        }

    }

  /*  private static void test2() {
        int[] a={1,2,5,9,4,8,3,6,7};
            int minIndex=0;
            int temp=0;
            if((a==null)||(a.length==0))
                return;
            for(int i=0;i<a.length-1;i++){
                minIndex=i;//无序区的最小数据数组下标
                for(int j=i+1;j<a.length;j++) {
                    //在无序区中找到最小数据并保存其数组下标
                    if(a[j]<a[minIndex]){
                        minIndex=j;
                    }
                }
                if(minIndex!=i) {
//如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
                    temp=a[i];
                    a[i]=a[minIndex];
                    a[minIndex]=temp;
                }
    }
        System.out.println(Arrays.toString(a));
    }*/

    private static void test1() {
        int[] arr={1,2,5,9,4,8,3,6,7};
        int tmp;
        for (int i = 1; i <arr.length ; i++) {
                for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
                //System.out.println(arr);
            }
           // System.out.println(arr);
        }
        //System.out.println(Arrays.toString(arr));
        for (int a:arr
             ) {
            System.out.println(a);
        }

    }

}
