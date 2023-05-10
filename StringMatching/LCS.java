package StringMatching;

import java.util.*;
import java.lang.Math;
public class LCS {
public static void LCS_algo(String s1, String s2) {
int size1 = s1.length();
int size2 = s2.length();
int table[][] = new int[size1 + 1][size2 + 1];
for (int i = 0; i <= size1; i++) {
for (int j = 0; j <= size2; j++) {
if (i == 0 || j == 0)
table[i][j] = 0;
else if (s1.charAt(i - 1) == s2.charAt(j - 1))
table[i][j] = table[i - 1][j - 1] + 1;
else
table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
}
}
printMatrix(table, size1, size2, s1, s2);
int index = table[size1][size2];
int index1 = size1;
int index2 = size2;
char[] res = new char[index+1];
res[index]='\0';
while(index1!=0 && index2!=0){
if(s1.charAt(index1-1)!=s2.charAt(index2-1)){
if(index==table[index1-1][index2]){
index1--;
}else{
index2--;
}
}else{
res[index-1] = s1.charAt(index1-1);
index--;
index1--;
index2--;
}
}
System.out.println();
System.out.print("LCS: ");
for (int i = 0; i < res.length; i++) {
System.out.print(res[i]);
}
}
public static void printMatrix(int table[][], int size1, int size2, String
s1, String s2) {
System.out.print(" ");
for (int i = 0; i < s2.length(); i++) {
System.out.print(" "+s2.charAt(i));
}
System.out.println();
for (int i = 0; i <= size1; i++) {
if(i!=0){
System.out.print(s1.charAt(i-1)+" ");
}else{
System.out.print(" ");
}
for (int j = 0; j <= size2; j++) {
System.out.print(table[i][j] + " ");
}
System.out.println();
}
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.print("Enter sequence 1: ");
String s1 = sc.next();
System.out.print("Enter sequence 2: ");
String s2 = sc.next();
LCS_algo(s1, s2);
sc.close();
}
}
