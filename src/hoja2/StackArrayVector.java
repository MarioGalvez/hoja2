/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

/**
 *
 * @author Mario Fernando
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

public class StackArrayVector<E>
 implements Stack<E>
{
        protected ArrayList<E> data;

        public StackArrayVector()
        // post: constructs a new, empty stack
        {
                data = new ArrayList<E>();
        }

        public void push(E item)
        // post: the value is added to the stack
        //          will be popped next if no intervening push
        {
                data.add(item);
        }

        public E pop()
        // pre: stack is not empty
        // post: most recently pushed item is removed and returned
        {
                return data.remove(size()-1);
        }

        public E peek()
        // pre: stack is not empty
        // post: top value (next to be popped) is returned
        {
                return data.get(size() - 1);
        }
        
        public int size()
        // post: returns the number of elements in the stack
        {
                return data.size();
        }
  
        public boolean empty()
        // post: returns true if and only if the stack is empty
        {
                return size() == 0;
        }

    @Override
    public void add(E item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(E value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enumeration elements() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<E> values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

