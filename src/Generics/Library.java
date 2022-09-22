package Generics;

import java.util.ArrayList;
import java.util.List;

public class Library<T> {
    private List<T> block = new ArrayList<T>();

    public List<T> getBlock() {
        return block;
    }

    public void setBlock(List<T> block) {
        this.block = block;
    }

    public void add(T x) {
        this.block.add(x);
    }

    T peek() {
        return this.block.get(this.block.size() - 1);
    }

    public T removeFromeEnd() {
        return this.block.remove(this.block.size() - 1);
    }

    int size() {
        return this.block.size();
    }
}