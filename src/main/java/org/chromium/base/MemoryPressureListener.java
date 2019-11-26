package org.chromium.base;

import defpackage.bchv;
import defpackage.bchw;

public class MemoryPressureListener {
    private static final bchv a = new bchv();

    private static native void nativeOnMemoryPressure(int i);

    private static void addNativeCallback() {
        a.a(bchw.a);
    }
}
