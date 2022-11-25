package ru.askalite.nnme;
import java.util.ArrayList;
import java.util.Collections;

public class Net {
    /*
    * все нейроны
    * нейроны хранят в себе индекс весов из нейросети
    * нейроны не хранят в себе ссылки на веса
    */
    public Neuron[] neurones={};
    //все веса
    public Weight[] w={};
    
    ArrayList<LayerMark> layers;
    
    /*
    * layers - слои и их примерная пространственная организация
    * w - все веса нейросети
    * in, out - какой из слоёв является входным, выходным
    */
    public void Net(LayerMark[] in_layers, Weight[] ws,LayerMark in, LayerMark out){
        if (layers==null)layers=new ArrayList<LayerMark>();
        Collections.addAll(layers,in_layers);
        w=ws;
    }
    
    //a --> b
    void connectLayers(LayerMark a, LayerMark b){
        boolean ab=a.child.contains(b);
        boolean ba=b.parent.contains(a);
        if(ab&ba)return;
        if(ab){
            Neuron l[] = a.layer;
            for( int i=0; i<l.length; i++){
                int index[]=l[i].weight_index;
                for( int j : index){
                    deleteWeight(index[j]);
                }
                l[i].weight_index=new int[]{};
            }
        }

        if(ba){
            
        }
    }
    
    LayerMark newLayer(int width){
        Neuron[] layer=new Neuron[width];
        for(int i=0; i<layer.length; i++){
            layer[i]=new Neuron();
        }
        LayerMark lm=new LayerMark();
        layers.add(lm);
        return lm;
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
