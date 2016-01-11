/*
 * (c) Payway, 2016. All right reserved.
 */
package com.payway.protobuffer.test;

import org.testng.annotations.Test;

/**
 * ProtoBufferTest
 *
 * @author Sergey Kichenko
 * @created 11.01.2016
 */
public class ProtoBufferTest {

    @Test
    public void test() {
        
        //com.example.tutorial.RequestOuterClass.Request.newBuilder().build().h
        
        //com.example.tutorial.CatOuterClass.Cat.newBuilder().

        /*
        final FooBarProto.Cat cat = FooBarProto.Cat.newBuilder()
                .setDeclawed(true)
                .build();

        final FooBarProto.Animal animal = FooBarProto.Animal.newBuilder()
                .setId(1)
                .setType(FooBarProto.Animal.Type.Cat)
                .setExtension(FooBarProto.Cat.animal, cat)
                .build();

        boolean flag = animal.getExtension(FooBarProto.Cat.animal).getDeclawed();
                */
    }
}
