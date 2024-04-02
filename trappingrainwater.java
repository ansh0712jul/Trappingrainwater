import java.util.*;
public class trappingrainwater {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainwater(arr));
        
    }
    public static int rainwater(int arr[]){
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        left[0]=arr[0];
        right[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        for(int i=arr.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.min(left[i],right[i])-arr[i];
        }
        return sum;
    }
}
//intuition 
// phle har ek ith element ka left or right dono ka maximum nikalo 
// frr uske baad dono m se jo chhota ho usme se ith elemnt ko sub krdo area aajaayega 
// do loop m tle aa skta h isliye prefix suffix approach lagayi h 
