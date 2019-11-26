package com.google.android.exoplayer2.ext.opus;

import defpackage.nzt;
import defpackage.oyq;

public final class OpusLibrary {
    private static final oyq a = new oyq("opusV2JNI");

    private OpusLibrary() {
    }

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();

    public static boolean a() {
        return a.a();
    }

    static {
        nzt.a("goog.exo.opus");
    }
}
