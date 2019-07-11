package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
        
        int min=Math.min(leftBorder, rightBorder);
        
        int max=Math.max(leftBorder, rightBorder);
        return IntStream.rangeClosed(min, max).filter(x -> x%2 ==0).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
        int min=Math.min(leftBorder, rightBorder);  
        int max=Math.max(leftBorder, rightBorder);
        return IntStream.rangeClosed(min, max).filter(x -> x%2 ==1).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) { 
        throw new NotImplementedException();
        IntSummaryStatistics ssst = arrayList.stream().mapToInt(x -> x * 3 + 2).summaryStatistics();
        return (int) ssst.getSum(); 
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        throw new NotImplementedException();
        return arrayList.stream().map(items -> items % 2 ==1 ? items * 3 + 2 : items).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
        
    }  

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
        IntSummaryStatistics stats = arrayList.stream().filter(x -> x % 2 == 0).mapToInt(x->x).summaryStatistics();
        return stats.getAverage();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
        
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();   
        return arrayList.stream().filter(x -> x % 2 == 0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();  
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
