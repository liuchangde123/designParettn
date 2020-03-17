package designParettn.builder;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

public abstract class Burger implements Item {
    public Packing pack(){
        return new WrapPack();
    }
}
