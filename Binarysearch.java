

public class Main
{
    public int binaryu(int[] arr,int target){
    
        int left =0;
        int right =arr.length-1;
        
        
        while(left<=right)
        {
            int mid = (left+right)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(target>arr[mid])
        {
            left=mid+1;
        }
        else{
            right= mid-1;
        }
        }
        return -1;
    }
    
	public static void main(String[] args) {
	    Main obj = new Main();
      
	    int[] arr={1,2,3,4,5};
	    int target=3;
	    int res = obj.binaryu(arr, target);
	    if(res!=-1)
	    {
	        System.out.println("done "+res);
	}
	    
	    else{
	        System.out.println("nope ");
	    }
	}
    }
