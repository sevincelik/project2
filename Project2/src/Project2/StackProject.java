package Project2;

public class StackProject {
    public static void main(String ...args){

        StackEntity StackList[] = new StackEntity[3];
        StackList[0] = new StackEntity();
        StackList[1] = new StackEntity();
        StackList[2] = new StackEntity();

        StackList[0].push("10");
        StackList[0].push("20");
        StackList[0].push("30");
        StackList[0].push("40");

        for(int i = 0 ; i<18; i++) {
            StackList[1].push( Integer.toString(i));
        }

        System.out.println(StackList[0]);
        System.out.println( StackList[0] + " "+ StackList[0].length());
        System.out.println( StackList[1] + " "+ StackList[1].length());
        System.out.println( StackList[2] + " "+ StackList[2].length());
    }
}
