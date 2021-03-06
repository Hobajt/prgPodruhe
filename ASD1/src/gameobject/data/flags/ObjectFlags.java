/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject.data.flags;

import java.io.Serializable;

/**
 * Describes how can the object be interacted with
 * @author Radek
 */
public class ObjectFlags implements Serializable {
    
    private final boolean dynamic;              //can move, rotate
    private final boolean damagable;            //can take damage (has to be creature)
    private final boolean behaviourAttached;    //has behaviour script attached

    ObjectFlags() {
        this.dynamic= 
        this.damagable= 
        this.behaviourAttached= false;
    }
    
    ObjectFlags(boolean dynamic, boolean damagable, boolean behaviourAttached) {
        this.dynamic= dynamic;
        this.damagable= damagable;
        this.behaviourAttached= behaviourAttached;
    }
    
    public boolean isDynamic() {
        return dynamic;
    }

    public boolean isDamagable() {
        return damagable;
    }

    public boolean hasBehaviourAttached() {
        return behaviourAttached;
    }
}
