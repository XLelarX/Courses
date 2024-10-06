package com.company.another;

public class ClassThatNeedToImport {

    public final static int CONSTANT_THAT_NEED_TO_IMPORT = 1;
    private int innerValue = 1;


    public static void staticMethod() {

    }

    public long convertToLong2(int value) {
        return innerValue;
    }


    public class InnerClassThatNeedToImport {
        
    }

}
