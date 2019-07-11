package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {  
    public List<Integer> getListByInterval(int left, int right) {
        throw new NotImplementedException();
         
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        throw new NotImplementedException();
        return getListByInterval(left, right).stream().filter(x->x%2==0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        throw new NotImplementedException();
        return Arrays.stream(array).filter(x->x%2==0).boxed().collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
         
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
