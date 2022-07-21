package katas;

public class FindOdd {
    public static int findIt(int[] a){

        int TAMANHO = a.length;
        int cont  = 0;
        int charat;
        int odd = 0;
        boolean impar = false;

        while (!impar){
            for (int i = 0; i < TAMANHO; i++) {
                charat = a[i];
                for (int j = 0; j < TAMANHO || impar==true; j++) {
                    if (charat==a[j]){
                        cont++;
                    }
                    if (cont % 2 != 0){
                        odd=charat;
                        impar=true;
                    }else {
                        cont=0;
                    }
                }
            }
        }
        return odd;
    }
}
