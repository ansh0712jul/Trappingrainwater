import java.util.Arrays;

public class nextpermu {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,4,3,1};
        int p=0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        int q=0;
        for(int i=arr.length-1;i>p;i--){
            if(arr[i]>arr[p]){
                q=i;
                break;
            }
        }
        if(p==0 && q==0) {
            reverse(arr,0,arr.length-1);
            return;
        }
        //swapping
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        reverse(arr,p+1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int arr[],int i,int j ){
         
        while(i<=j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
}
