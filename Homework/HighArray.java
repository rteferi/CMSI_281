import java.util.ArrayList;

public class HighArray{

  private long[] a;
  private int nElems;
  public HighArray(int max){
    a = new long[max];
    nElems = 0;
  }

  public boolean find(long searchKey){
    int j;
    for(j=0; j<nElems; j++)
    if(a[j] == searchKey)
    break;
    if(j == nElems)
    return false;
    else
    return true;
  }
  public void insert(long value) {
    a[nElems] = value;
    nElems++;
  }
  public boolean delete(long value){
    int j;
    for(j=0; j<nElems; j++)
    if( value == a[j] )
    break;
    if(j==nElems) return false;
    else{
      for(int k=j; k<nElems; k++) a[k] = a[k+1];
      nElems--; return true;
    }
  }

  public void display(){
    for(int j=0; j<nElems; j++)
    System.out.print(a[j] + " ");
  }

  public long getMax(){
    int j;
		long maxVal = -1;
		if(nElems == 0)
    return maxVal;
		else{
			for(j=0; j < nElems; j++){
				if(a[j] > maxVal) maxVal = a[j];
			}
			return maxVal;

		}

  }

  public static long[] noDups(long[] arr){

    ArrayList<Long> list = new ArrayList<Long>();

    for (long item : arr)
        if(!list.contains(item))
          list.add(item);

    long[] result = new long[list.size()];
    for (int i = 0; i < result.length; i++)
        result[i] = list.get(i);


    return result;
  }


}
