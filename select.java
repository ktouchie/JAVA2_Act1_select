import java.util.*;
class select {

	public static void main(String[] args) {
        
        int[] tab = {5,9,4,1,2,7,3,8,6,0};
        
        for (int i=0; i<tab.length-1; i++) {
            int min = i;
            for (j=i+1; j<tab.length; j++) {    // searches tab[1-9] and saves smaller nums to var min until the absolute min is found.
                if tab[j]<tab[min];
                min = j;
            }
        }   if (min != i) {                     // swaps i for min, so absolute min is now at tab[0]. Then repeats entire process to find new minimum & swap w/ tab[1].
                int x = tab[min];
                tab[min] = tab[i];
                tab[i] = x;
                int a = 1
                System.out.println("Swap" + a);
                a++;
            }
        
        System.out.println(Arrays.toString(tab));
    }
}
