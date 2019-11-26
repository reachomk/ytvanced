package com.google.android.exoplayer2.ext.vp9;

import defpackage.nzt;
import defpackage.oyq;

public final class VpxLibrary {
    private static final oyq a = new oyq("vpx", "vpxV2JNI");

    private VpxLibrary() {
    }

    private static native String vpxGetBuildConfig();

    public static native String vpxGetVersion();

    public static native boolean vpxIsSecureDecodeSupported();

    public static boolean a() {
        return a.a();
    }

    static {
        nzt.a("goog.exo.vpx");
    }
}
