package arraypractise;

public class Remove_duplicate {
public static void main(String[] args) {
	

	int[] a = {0,0,0,0,1,1,1,1,2,3,3,3,3};
    int size=a.length;
    System.out.println("Array size before duplicate deletion "+size);
    for(int i =0;i<(size-1);i++)
    {
        for(int j=i+1;j<=(size-1);j++)
        {
            if(a[i]==a[j] &&i!=j)
            { 
                while(j<(size-1))
                {
                a[j]=a[j+1];
                j++;

                }
                size--;
            }

        }
    }
    System.out.print("The array after deleting the duplicates is ");
    for(int k=0;k<=(size-1);k++)
    {
        System.out.print(a[k]);  
        if(k<(size-1))
        {
            System.out.print(",");
        }
        else
            System.out.print(".");

}
}}
