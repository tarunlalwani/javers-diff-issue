package com.javerstest;

import org.javers.core.diff.changetype.ValueChange;
import org.javers.core.diff.changetype.container.ListChange;
import org.javers.core.diff.custom.CustomPropertyComparator;
import org.javers.core.metamodel.object.GlobalId;
import org.javers.core.metamodel.property.Property;

import java.util.List;

public class ListCustomComparator implements CustomPropertyComparator<List, ListChange> {
    public ListChange compare(List left, List right, GlobalId affectedId, Property property){
        System.out.println("I was really called");
        return null;
    }
}
