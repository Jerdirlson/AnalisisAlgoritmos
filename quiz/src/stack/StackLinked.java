package stack;

import interfaces.stack.StackInterface;
import nodes.SinglyLinkedNode;
import singly.linked.SinglyLinkedList;

public class StackLinked<T> implements StackInterface<T>{

    private SinglyLinkedList<T> list;

    @Override
    public boolean clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public T peek() {

        try {
            return list.getHead().getObject();
        } catch (Exception e) {
            // TODO: handle exception
        }
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public T pop() {
        try {
            list.pop();
        } catch (Exception e) {
            // TODO: handle exception
        }
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }


    @Override
    public boolean push(T object) {
        try {
            list.addOnHead(object);
        } catch (Exception e) {
            // TODO: handle exception
        }
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean search(T object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public boolean sort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }

    @Override
    public boolean reverse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }
    
}
