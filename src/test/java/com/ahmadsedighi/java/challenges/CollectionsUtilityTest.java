package com.ahmadsedighi.java.challenges;

import com.ahmadsedighi.java.challenges.collections.CollectionsUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static com.ahmadsedighi.java.challenges.collections.CollectionsUtility.*;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 30/06/2022
 * Time: 23:40
 */

public class CollectionsUtilityTest {

    @Test
    public void merge_emptyList_returnEmpty(){
        Assertions.assertEquals(List.of(), merge(List.of()));
    }

    @Test
    public void merge_oneList_returnSame(){
        Assertions.assertEquals(List.of("Java"), merge(List.of("Java")));
    }

    @Test
    public void merge_twoEmptyList_returnEmpty(){
        Assertions.assertEquals(List.of(), merge(List.of(), List.of()));
    }

    @Test
    public void merge_twoLists_returnMerged(){
        Assertions.assertEquals(List.of("Java", "Programming", "Language"),
                merge(List.of("Java"), List.of("Programming", "Language")));
    }

    @Test
    public void mergeDistinct_emptyList_returnEmpty(){
        Assertions.assertEquals(Set.of(), mergeDistinct(List.of()));
    }

    @Test
    public void mergeDistinct_oneList_returnSame(){
        Assertions.assertEquals(Set.of("Java"), mergeDistinct(List.of("Java")));
    }

    @Test
    public void mergeDistinct_twoEmptyList_returnEmpty(){
        Assertions.assertEquals(Set.of(), mergeDistinct(List.of(), List.of()));
    }

    @Test
    public void mergeDistinct_twoLists_returnMerged(){
        Assertions.assertEquals(Set.of("Java", "Programming", "Language"),
                mergeDistinct(List.of("Java"), List.of("Programming", "Language")));
    }

    @Test
    public void mergeDistinct_twoListsWithDuplicates_returnMerged(){
        Assertions.assertEquals(Set.of("Java", "Programming", "Language"),
                mergeDistinct(List.of("Java", "Programming", "Language"), List.of("Programming", "Language")));
    }

    @Test
    public void mergeAndRemoveEmpty_notIncludedEmpty_returnSame(){
        Assertions.assertEquals(List.of("Java"), mergeAndRemoveEmpty(List.of("Java")));
    }

    @Test
    public void mergeAndRemoveEmpty_includedEmpty_returnWithoutEmpty(){
        Assertions.assertEquals(List.of("Java"), mergeAndRemoveEmpty(List.of("Java", "", "")));
    }

    @Test
    public void trimTo10_givenEmptyList_returnEmpty(){
        Assertions.assertEquals(List.of(), trimTo10(List.of(), 10));
    }

    @Test
    public void trimTo10_givenNormalList_returnProcessed(){
        Assertions.assertEquals(List.of("Java Progr"), trimTo10(List.of("Java Programming Language"), 10));
    }

    @Test
    public void createMap_givenDiffSize_exceptionExpected(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->createMap(Set.of(""), List.of()));
    }

    @Test
    public void createMap_givenEmpty_returnEmpty(){
        Assertions.assertEquals(Map.of(), createMap(Set.of(), List.of()));
    }

    @Test
    public void createMap_givenNormal_returnExpected(){
        Assertions.assertEquals(Map.of("Language", "Java"), createMap(Set.of("Language"), List.of("Java")));
    }
}
