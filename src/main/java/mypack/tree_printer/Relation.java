package mypack.tree_printer;

import java.util.Objects;

public class Relation {

    private String parent;
    private String child;

    public Relation(String parent, String child){
        this.setParent(parent);
        this.setChild(child);
    }


    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relation relation = (Relation) o;
        return parent.equals(relation.parent) &&
                child.equals(relation.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, child);
    }
}
