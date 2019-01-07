
package cerca;

public class Fil extends Thread{
    private int maxim;
    private int inici;
    private int fi;
    private int[] nums;
    
    public Fil(int i, int f, int[] nums){
        this.inici=i;
        this.fi=f;
        this.nums = nums;
        this.maxim=nums[inici];
    }
    
    public int getMaxim(){
        return maxim;
    }    
    
    public void run(){
        for (int x=inici+1; x<=fi; x++){
            if (nums[x]>maxim) maxim=nums[x];
        }
    }
    
}
