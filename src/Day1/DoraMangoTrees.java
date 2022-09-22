package Day1;

import java.util.Scanner;

public class DoraMangoTrees {
    static boolean isMangoTree(int row, int column, int treeNumber){

        if(treeNumber<row){
            return true;
        }

        for(int i=1;i<=row;i++){
            if(i*column==treeNumber){
                return  true;
            }
            if(i!=1){
                if((i*column)+1==treeNumber){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        int row=scanner.nextInt();
        System.out.println("Enter Number of Coloumns");
        int column=scanner.nextInt();
        System.out.println("Enter Target Tree");
        int treeNumber=scanner.nextInt();
        System.out.println(isMangoTree(row,column,treeNumber));
    }
}