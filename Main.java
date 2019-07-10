 import java.util.*;
 class Main { 
final static int no = 256; 
static int maxchar(String str, int n) { 
int count[] = new int[no]; 
for (int i = 0; i < n; i++) { 
count[str.charAt(i)]++; 
} 
int maxdistinct = 0; 
for (int i = 0; i<no; i++) { 
if (count[i] != 0) { 
maxdistinct++; 
} 
} 
return maxdistinct; 
} 
static int smallesteSubstr_maxDistictChar(String str) { 
int n = str.length();   
int maxdistinct = maxchar(str, n); 
int minl = n;   
for (int i = 0; i < n; i++) { 
for (int j = 0; j < n; j++) { 
String subs = null; 
if(i<j) 
subs = str.substring(i, j); 
else
subs = str.substring(j, i); 
int subslength = subs.length(); 
int subdistinctchar = maxchar(subs, subslength); 
if (subslength < minl && maxdistinct == subdistinctchar) { 
minl = subslength; 
} 
} 
} 
return minl; 
} 
static public void main(String[] args) { 
String str;
Scanner sc=new Scanner(System.in);
str=sc.next();
int len = smallesteSubstr_maxDistictChar(str); 
System.out.println(len); 
} 
}