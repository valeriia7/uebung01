package ueb01;


import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    Element top;
    int len =0;

    @Override
    public void push(char c) {
        Element e = new Element();


        e.c = c;
        e.next=top;
        top=e;
        len++;
    }

    @Override
    public char pop() {
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
