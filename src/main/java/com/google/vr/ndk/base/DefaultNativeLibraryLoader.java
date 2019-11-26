package com.google.vr.ndk.base;

public abstract class DefaultNativeLibraryLoader {
    public static volatile boolean shouldIgnoreDefaultLibrary = false;

    public static void maybeLoadDefaultLibrary() {
        if (!shouldIgnoreDefaultLibrary) {
            try {
                System.loadLibrary("gvr");
            } catch (UnsatisfiedLinkError unused) {
            }
        }
    }
}
