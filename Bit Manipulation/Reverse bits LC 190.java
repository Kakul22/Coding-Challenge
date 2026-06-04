class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0; i<32;i++){       // integer= total 32 bits so[har bit ko reverse krne k lie 32 time loop]
            int bit=n & 1;            // last bit 
            result =((result << 1)|bit);    // result left shift  and add the last bit to result bit
            n = n >>> 1;   // Unsigned right shift   (next bit pe move krenge )
        }
        return result;

    }
}
