package ru.askalite.nnue;

//суммация и обработка сигналов
//хранит в себе индексы весов из Net
public class Neuron {
	public float a;
    
	public int [] weight_index={};
    
    
    //технические методы
    //weight ind - индекс веса в массиве Net
	int connectWeight(int weight_ind){
		int[] array=new int[weight_index.length+1];
		System.arraycopy(weight_index,0,array,0,weight_index.length);
        array[array.length]=weight_ind;
        weight_index=array;
        return weight_index.length;
	}
    void disconnectWeight(int i){
        if (i!=weight_index.length){
            weight_index[i]=weight_index[weight_index.length];
        }
        int[] array=new int[weight_index.length-1];
        System.arraycopy(weight_index,0,array,0,weight_index.length-1);
        weight_index=array;
    }
    
    
}
