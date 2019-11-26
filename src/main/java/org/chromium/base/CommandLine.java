package org.chromium.base;

import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine {
    private static final AtomicReference a = new AtomicReference();

    public static CommandLine c() {
        return (CommandLine) a.get();
    }

    private static native void nativeAppendSwitch(String str);

    private static native void nativeAppendSwitchWithValue(String str, String str2);

    private static native void nativeAppendSwitchesAndArguments(String[] strArr);

    private static native String nativeGetSwitchValue(String str);

    private static native boolean nativeHasSwitch(String str);

    private static native void nativeInit(String[] strArr);

    public abstract boolean a();

    public abstract String b();

    private CommandLine() {
    }
}
