package sort;

import java.util.Arrays;

public class BubblingSort{

    protected int[] arr= {};

    BubblingSort(int[] arr){
        this.arr = arr;
    }

    //for ascending order
    public void bubblingForAsc(){
        if( this.arr.length < 2 ){
            this.echo(this.arr);
        }

        int[] arr = this.arr;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length-i-1 ; j++){
                if( arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        this.echo(arr);
    }

    //for Descending order
    public void bubblingForDesc(){
        if( this.arr.length < 2 ){
            this.echo(this.arr);
        }

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length-i-1 ; j++){
                if( arr[j] < arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        this.echo(arr);
    }

    public void echo(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}