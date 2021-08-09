package com.guoquan.store.operation.log.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author LZH on 2020/9/17 16:31
 */
public class OpeUUIDUtil {

    public static String getUUID() {
       return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }


    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(5);

        System.out.println("====求交集===");
        boolean b = list1.retainAll(list2);
        System.out.println("list1》》》"+list1);
        System.out.println("list2》》》"+list2);
    }
}
