class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        List<Integer> nums3=new ArrayList<>();

    int i=0,j=0,k=0;
    while(i<m && j<n){
        if(nums1[i]<nums2[j]) nums3.add(nums1[i++]);
    else nums3.add(nums2[j++]);
    }
    while(i<m){
nums3.add(nums1[i++]);
    }
    while(j<n){
        nums3.add(nums2[j++]);
    }
    int a=n+m;
    if(a%2==1)return (double)nums3.get(a/2);
    double median=((double)nums3.get(a/2)+(double)nums3.get(a/2-1))/2.0;
     return median;
            }
        }