package com.javerstest;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.javers.core.metamodel.annotation.IgnoreDeclaredProperties;
import org.javers.core.metamodel.annotation.ShallowReference;

import java.util.List;
import java.util.Set;


@Builder
@Getter
@Setter
@EqualsAndHashCode
public class TopLevelClass {

    @ShallowReference
    List<ListItem> items;
}