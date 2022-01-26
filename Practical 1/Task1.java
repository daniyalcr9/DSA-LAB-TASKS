public class Task1 {
    public static void main(String[] args) {
        //i for rows and j for columns
        //row denotes the number of rows you want to print
        //pattern 1
        int i, j, row = 6;
        //Outer loop work for rows
        for (i=0; i<row; i++)
        {
            //inner loop work for space
            for (j=row-i; j>1; j--)
            {
                //prints space between two stars
                System.out.print(" ");
            }
            //inner loop for columns
            for (j=0; j<=i; j++ )
            {
                //prints star
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line
            System.out.println();
        }
        System.out.println();
        System.out.println();
        //pattern 2
        int n=7;

        //inner loop
        for (int l= n-1; l>=0 ; l--)
        {
            //outer loop
            for (int p=0; p<=l; p++)
            {
                //prints star and space
                System.out.print("*" + " ");
            }
            //throws the cursor in the next line after printing each line
            System.out.println();
        }
        System.out.println();
        System.out.println();
        //pattern 3
        for (int x=1; x<=5; x++) {
            for (int y=i; y<5; y++) {
                System.out.print(" ");}
            for (int z=x; z<2*x; z++) {
                System.out.print (z);}
            for (int z1=2*x-2; z1>=x; z1--){
                System.out.print(z1);
            }
            System.out.println();
        }
    }
}
