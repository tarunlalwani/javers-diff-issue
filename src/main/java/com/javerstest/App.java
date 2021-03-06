package com.javerstest;

import com.google.common.collect.ImmutableList;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.javers.core.diff.ListCompareAlgorithm;

import java.util.List;

public class App {


    public static void main(String[] args) {

        List<ListItem> list1 = ImmutableList.of(
                ListItem.builder()
                        .itemName("item1")
                        .itemValue("value")
                        .build(),
                ListItem.builder()
                        .itemName("item2")
                        .itemValue("value2")
                        .build()
        );

        List<ListItem> list2 = ImmutableList.of(
                ListItem.builder()
                        .itemName("item2")
                        .itemValue("value2change")
                        .build(),
                ListItem.builder()
                        .itemName("item1")
                        .itemValue("value")
                        .build(),
                ListItem.builder()
                        .itemName("item3")
                        .itemValue("value3")
                        .build()

        );

        TopLevelClass tlc1 = TopLevelClass.builder().items(list1).build();
        TopLevelClass tlc2 = TopLevelClass.builder().items(list2).build();

//        Diff diff = JaversBuilder.javers().withListCompareAlgorithm(ListCompareAlgorithm.AS_SET).build().compare(list1, list2);
//        System.out.println(diff);
//        List<ListItem> x = null;
        Javers jvc = JaversBuilder.javers().withListCompareAlgorithm(ListCompareAlgorithm.AS_SET)
                .build();
        Diff diffTlc = jvc.compare(tlc1, tlc2);
        System.out.println(diffTlc);
    }
}