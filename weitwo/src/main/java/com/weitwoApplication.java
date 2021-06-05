package com;

class weifuwuApplication extends Throwable {
    public static synchronized void main(String[] a) {
       int[] b = new   int[]{8,4,1,6,7,4,9,6,4};
        int[] ints = new int[9];
        int j=0;
        int re=b.length-1;
        for (int i = 0; i < b.length; i++) {
            if(b[i]%2!=0){
                ints[j]= b[i];
            j++;}
            else{
                ints[re]=b[i];
            re--;}

        }
        for (int temp:ints){
            System.out.print(temp);

        }
    }}
