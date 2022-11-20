package ru.askalite.nnue;

public class Net {
    /*
    * все нейроны
    * нейроны хранят в себе индекс весов из нейросети
    * нейроны не хранят в себе ссылки на веса
    */
    public Neuron[] neurones={};
    //все веса
    public Weight[] w={};
    
    void addNeuron(){
        //todo
    }
    
    int addWeight(Weight weight){
        Weight[] array=new Weight[w.length+1];
        System.arraycopy(w,0,array,0,w.length);
        array[array.length]=weight;
        w=array;
        return w.length;
    }
    void deleteWeight(int i){
        if (i!=w.length){
            w[i]=w[w.length];
            w[i].setIndexInSourceNeuron(i);
        }
        Weight[] array=new Weight[w.length-1];
        System.arraycopy(w,0,array,0,w.length-1);
        w=array;
    }
}