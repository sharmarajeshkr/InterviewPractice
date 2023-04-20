package com.sharma.innerClass.methodLocalInnerClass;

public class Outer {

    public int multiply(int a, int b) {
        int value1 = a;
        int value2 = b;

        class InnerMultiplyLogic {
            public int logicmultiply() {
                return value1 + value2;
            }
        }

        InnerMultiplyLogic innerMultiplyLogic = new InnerMultiplyLogic();
        return innerMultiplyLogic.logicmultiply();
    }


    public void addValues() {
        System.out.println("In Outer Method");

        class InnerInOuterMethod {
            public void innerMethods() {
                System.out.println("In Inner Methods");
            }
        }

        // Calling Inner Call method
        InnerInOuterMethod inner = new InnerInOuterMethod();
        inner.innerMethods();

    }
}
