package ueb01;


import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    Element top;
    int len =0;

    @Override
    public void push(char c) {//element anlegen
        top = new Element(c, top);// Element c hinzufügen in top
        len++;
    }

    @Override
    public char pop() { //entfernrn ein Object
        if(top==null){
            throw new NoSuchElementException();
        }
        char h =top.c;
        top=top.next;
        len--;
        return h;

    }

    @Override
    public int size() {
        return len;
    }
}
