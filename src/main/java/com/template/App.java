package com.template;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        int resultado=a+b;
        return resultado;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if(number%2==0) {
            return true;
        }
        else{
            return false;
        }
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if(a>b) {
            return a;
        }
        else{
            return b;
        }
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        int resultado=1;
        for (int i=n; i>1; i--) {
            resultado=resultado*i;
        }
        return resultado;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        int longitud=input.length();
        return longitud;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String resultado="";
        for(int i=input.length()-1;i>=0;i--){
            resultado += input.charAt(i);
        }
        return resultado;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        boolean resultado=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                resultado=false;
            }
        }
        return resultado;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int minimo=array[0];
        for (int i=1 ; i<array.length ; i++){
            if(array[i] < minimo){
                minimo=array[i];
            }
        }
        return minimo;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int resultado=0;
        for (int i=0; i<array.length; i++){
            resultado+=array[i];
        }
        return resultado;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double resultado= celsius * 9 / 5 + 32;
        return resultado;
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        int resultado=0;
        for (int i=0; i<list.size();i++){
            resultado+=list.get(i);
        }
        return resultado;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        if (list.size()==0) {
            throw new IllegalArgumentException();
        }
        int maximo=list.get(0);
        for (int i=1 ; i<list.size() ; i++){
            if(list.get(i) > maximo){
                maximo=list.get(i);
            }
        }
        return maximo;
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> resultado=new ArrayList<>();
        for (int i=0; i<list.size();i++){
            if (list.get(i)%2==0){
                resultado.add(list.get(i));
            }
        }
        return resultado;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        List<String> resultado=new ArrayList<>(list1);
        for (int i=0; i<list2.size();i++){
            resultado.add(list2.get(i));
        }
        return resultado;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        for (int i=0; i<list.size();i++){
            if(list.get(i).equals(element)){
                return true;
            }
        }
        return false;
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        List<String> resultado=new ArrayList<>();
        for (int i=0; i<list.size();i++){
            resultado.add(list.get(i).toUpperCase());
        }
        return resultado;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> resultado=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if(!resultado.contains(list.get(i))){
                resultado.add(list.get(i));
            }
        }
        return resultado;
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        Set<Integer> resultado=new HashSet<>();
        for (int i=0; i<list.size();i++){
            resultado.add(list.get(i));
        }
        return resultado;
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        for (String clave : map.keySet()) {
            if(clave.equals(key)){
                return true;
            }
        }
        return false;
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        for (String valor : map.values()) {
            if(valor.equals(value)){
                return true;
            }
        }
        return false;
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        List<String> lista = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            lista.add(entry.getKey() + " -> " + entry.getValue());
        }
        return lista;
    }
}
