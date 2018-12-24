
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]={10,3,30,2,4,50,20,100};
    int len=arr.length;
    //System.out.println(len);
    for(int i=0;i<=len-1;i++)
    {
    	for(int j=0;j<=len-1;j++)
    	{
    		if(arr[i]<arr[j])
    		{
    			int temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    			
    		}
    	}
    }
    System.out.println("Sorted array");
    for(int i=0;i<len;i++)
    {
    	System.out.print("\t"+arr[i]);
    }
	}

}
