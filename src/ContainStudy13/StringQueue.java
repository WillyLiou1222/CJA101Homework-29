package ContainStudy13;

import java.util.LinkedList;

public class StringQueue {
    private LinkedList<String> linkedList;

    public StringQueue(){
        this.linkedList = new LinkedList<String>();
    }
    public void push(String name){
        linkedList.addFirst(name);
    }
    public String get(){
        return linkedList.removeLast();
    }
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}
