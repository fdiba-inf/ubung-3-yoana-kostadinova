package exercise3;
public class NumberSearch {
  public static void main (String [] args) {
int i = 100;
int n = 0;
for (i=100;i<1000;i++) {
if (i%5==0 && i%6==0) {
  System.out.print(" " +i);
  n++;
}
if (n>5) {
  System.out.println ("");
  n=0;
}
}
  }
}