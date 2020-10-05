public interface Algoritmo {
    public void ordena(int ini, int fim, Produto[] produtos, Criterio criterio);
}

class insertionSort implements Algoritmo {

    public void ordena(int ini, int fim, Produto[] produtos, Criterio criterio) {

        for(int i = ini; i <= fim; i++){

            Produto x = produtos[i];				
            int j = (i - 1);

            while(j >= ini){
                if(criterio.compara(x, produtos, j)) {

                    produtos[j + 1] = produtos[j];
                    j--;
                } else break;
            }        
            produtos[j + 1] = x;
        }
    }
}

class quickSort implements Algoritmo {

    public static int particiona(int ini, int fim, Produto[] produtos, Criterio criterio) {
        
        Produto x = produtos[ini];
		int i = (ini - 1);
		int j = (fim + 1);

		while(true){

            do{ 
                j--;

            } while(criterio.comparaMaior(produtos, i, j, x));
        
            do{
                i++;

            } while(criterio.comparaMenor(produtos, i, j, x));

            if(i < j){
				Produto temp = produtos[i];
				produtos[i] = produtos[j]; 				
				produtos[j] = temp;
			}
			else return j;
        }     
    }

    public void ordena(int i, int j, Produto[] produtos, Criterio criterio) {
        
        if(i < j) {

            int q = particiona(i, j, produtos, criterio);
            
            ordena(i, q, produtos, criterio);
            ordena(q + 1, j, produtos, criterio);
        }
    }
}
