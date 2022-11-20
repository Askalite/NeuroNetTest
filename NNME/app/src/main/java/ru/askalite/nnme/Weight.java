package ru.askalite.nnme;

public class Weight {
    //индекс в массиве входящего нейрона
    public int indexInSourceNeuron;
    public int index;
    public Neuron source, destination;
    
    public void connectNeurones(Neuron a, Neuron b){
        source=a;
        indexInSourceNeuron=a.connectWeight(index);
        destination=b;
    }
    void connectSourceNeuron(Neuron n){
        source=n;
        indexInSourceNeuron=n.connectWeight(index);
    }
    void disconnectSourceNeuron(){
        source.disconnectWeight(indexInSourceNeuron);
        source=null;
    }
    void setIndexInSourceNeuron(int i){
        indexInSourceNeuron=i;
    }
    
    public void connectDestinationNeuron(Neuron n){
      destination=n;
    }
    public void disconnectDestinationNeuron(Neuron n){
      destination=null;
    }
}
