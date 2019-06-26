package Problem703;

public class PrintHeap {
    public static void main(int[] a){
        StringBuilder sb = new StringBuilder();
        int max=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<10;j++){

                if(j>max){
                    max=j;
                }
            }

        }

        for(int i=0;i<10;i++){
            for(int j=0;j<Math.pow(2,i)&&j+Math.pow(2,i)<10;j++){

                for(int k=0;(k<max/((int)Math.pow(2, i)));k++){
                    sb.append(" ");
                }
                sb.append(a[j+(int)Math.pow(2,i)-1]+" ");

            }
            sb.append("\n");

        }
        System.out.println(sb.toString());
    }
}