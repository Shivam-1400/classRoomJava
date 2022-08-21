//Bhavya Gupta

package Friends;
import java.util.Scanner; ///error1: j of java should be small

public class GreatestEleArr {
  public static void main(String ary[])
    {
        Function ref = new Function();
        int n = ref.size();
        int []arr = ref.createArray(n);// [n] replaced with (n);//CreateArray function receives n
        ref.fill(arr);
        ref.greatestElement(arr);
       
    }
  }
 
class Function
{
    Scanner cin = new Scanner(System.in);
    int size()
    {
        System.out.print("Enter the number of elements:");
       return  cin.nextInt();
    }
    int [] createArray(int n)
    {
        int[] arr = new int[n]; //int arr = new int[n];
        return arr;							//arr referance should be of array type and initialised with int[] arr= new int[n];
    }
    void fill(int arr[])
    {
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = cin.nextInt();//cin.nextInt; nextInt is a function. Add round brackets after nextInt();
        }
    }
    void greatestElement(int[] arr) //argument type should be array .//replace (int arr) by (int[] arr)
    {
        int largest = arr[0];
      for(int i=0;i<arr.length;i++)
      {
         if(arr[i]>largest)
         {
             largest = arr[i];
         }
      }
      System.out.print("Greatest element in array:"+largest);
    }
}