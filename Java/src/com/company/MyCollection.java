package com.company;

import java.util.Arrays;

public class  MyCollection <T>{
    private T myCollection[];

    public MyCollection(T[] myCollection) {
        this.myCollection = myCollection;
    }


    @Override
    public String toString() {
        return "MyCollection{" +
                "myCollection=" + Arrays.toString(myCollection) +
                '}';
    }

    private T[] enlargeArray() {
        return Arrays.copyOf(myCollection, myCollection.length + 1);
    }

    public void Add(T element){
        myCollection = enlargeArray();
        myCollection[myCollection.length-1] = element;
    }

    public T getByIndex(int index){
        return myCollection[index];
    }

    public int size(){
       return myCollection.length;
    }

    public int compareLengh(MyCollection<?> collection){
        if (this.size() > collection.size()){
            return 1;
        }
        else if(this.size() == collection.size()){
            return 0;
        }
        return -1;

    }

    public void AddNewCollection(MyCollection <? extends T> collection){
        for (int i =0; i < collection.size(); i++) {
            myCollection = enlargeArray();
            myCollection[myCollection.length-1] = collection.getByIndex(i);
        }

    }

    public boolean isElementPresent(T element){
        for(int i = 0; i < myCollection.length; i++){
            if(myCollection[i].equals(element)){
                return true;
            }
        }
        return false;
    }
}

