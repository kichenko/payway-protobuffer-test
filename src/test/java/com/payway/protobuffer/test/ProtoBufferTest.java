/*
 * (c) Payway, 2016. All right reserved.
 */
package com.payway.protobuffer.test;

import com.example.tutorial.FooBarProto;
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

        final FooBarProto.Animal animal = FooBarProto.Animal.newBuilder()
                .setId(1)
                .setType(FooBarProto.Animal.Type.Cat)
                .setExtension(FooBarProto.Cat.animal, FooBarProto.Cat.newBuilder().build())
                .build();

        animal.getExtension(FooBarProto.Cat.animal).getDeclawed();
    }
}
