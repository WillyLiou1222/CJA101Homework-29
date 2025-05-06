package ContainStudy13;

import java.util.LinkedList;

public class StringStack {
    private LinkedList<String> linkedList;

    public StringStack(){
        this.linkedList = new LinkedList<String>();
    }
    public void push(String name){
        //將元素加入串列前端
        linkedList.addFirst(name);
    }
    public String top(){
        //取出串列第一個子元素
        return linkedList.getFirst();
    }
    public String pop(){
        //移出第一個元素
        return linkedList.removeFirst();
    }
    public boolean isEmpty(){
        //檢查串列是否為空
        return linkedList.isEmpty();
    }
}
