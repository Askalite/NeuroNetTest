package ru.askalite.nnme;
import java.util.ArrayList;

// класс размечающий слои в нейросети
// клас не предназначен для вычислений
public class LayerMark {
    /*
    * child - слои в который
    * слой передаёт данные
    */
    ArrayList<LayerMark> child;
    /*
    * parent - слои откуда слой читает данные
    */
    ArrayList<LayerMark> parent;
    /*
    * слоты под нейроны слоя
    * слой имеет ограниченное количество нейронов
    * слой может иметь в слотах меньше нейронов
    * проверяйте слоты на null
    */
    Neuron layer[];
    public LayerMark(){
        super();
        child=new ArrayList<LayerMark>();
        parent=new ArrayList<LayerMark>();
    }
}
