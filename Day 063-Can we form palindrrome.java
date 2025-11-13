import java.io.*;
import java.util.*;

class BeingZero {
    public boolean CanWeFormPalindrome(String s, int n, int k) {
        //Write your logic here
        int f[]=new int[26];
        for(char ch:s.toCharArray()){
            f[ch-'a']++;
        }
        int c=0;
        for(int ele:f) if(ele%2!=0)c++;
        if(c-1<=k) return true;
        else return false;
    }
}