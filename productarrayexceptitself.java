public class productarrayexceptitself {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int ans[]=array_except_itself(arr);
        for(int i=0;i<ans.length;i++) System.out.print(ans[i]+" ");
        
    }
    public static int[] array_except_itself(int arr[]){
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        left[0]=1;
        right[arr.length-1]=1;
        for(int i=1;i<arr.length;i++){
            left[i]=(left[i-1]*arr[i-1]);
        }
        for(int i=arr.length-2;i>=0;i--){
            right[i]=(right[i+1]*arr[i+1]);
        }
        
        for(int i=0;i<left.length;i++){
            left[i]=left[i]*right[i];
        }
        return left;
    }
}
