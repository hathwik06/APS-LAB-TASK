class Solution {
    public void sortColors(int[] a) {
        int l,m,r,t;
        l=m=0;
        r=a.length-1;
        while(m<=r){
            if(a[m] == 0){
                t=a[m];
                a[m]=a[l];
                a[l]=t;
                l++;
                m++;
            }
            else if(a[m] == 2){
                t=a[m];
                a[m]=a[r];
                a[r]=t;
                r--;
            }
            else{
                m++;
            }
        }
    }
}