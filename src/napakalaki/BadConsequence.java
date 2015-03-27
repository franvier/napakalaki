/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author braulio
 */
public class BadConsequence {
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    
    private ArrayList<TreasureKind> specificHiddenTreasures;
    private ArrayList<TreasureKind> specificVisibleTreasures;
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = nVisible;
        this.nHiddenTreasures = nHidden;
        
        specificHiddenTreasures = new ArrayList<TreasureKind>();
        specificVisibleTreasures = new ArrayList<TreasureKind>();
    }
    
    public BadConsequence(String text, boolean death){
        this.text = text;
        this.death = death;
        
        specificHiddenTreasures = new ArrayList<TreasureKind>();
        specificVisibleTreasures = new ArrayList<TreasureKind>();
    }
    
    public BadConsequence(
            String text, 
            int levels, 
            ArrayList<TreasureKind> tVisible, 
            ArrayList<TreasureKind> tHidden
    ){
        this.text = text;
        this.levels = levels;
        this.nVisibleTreasures = tVisible.size();
        this.nHiddenTreasures = tHidden.size();
        
        this.specificVisibleTreasures = tVisible;
        this.specificHiddenTreasures = tHidden;
        
    }
    
    public String getText(){
        return this.text;
    }
    
    public int getLevels(){
        return levels;
    }
    
    public int getNumberOfVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    public int getNumberOfHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public boolean kills(){
        return death;
    }
    
    public ArrayList <TreasureKind> getVisibleTreasures(){
        return this.specificVisibleTreasures;
    }
    
    public ArrayList <TreasureKind> getHiddenTreasures(){
        return this.specificHiddenTreasures;
    }
    
    public boolean isEmpty(){
        return levels == 0 &&
                nVisibleTreasures == 0 &&
                nHiddenTreasures == 0 &&
                death == false &&
                specificHiddenTreasures.isEmpty() &&
                specificVisibleTreasures.isEmpty();
    }

    public String toString(){
        return this.text;
    }
    
}
