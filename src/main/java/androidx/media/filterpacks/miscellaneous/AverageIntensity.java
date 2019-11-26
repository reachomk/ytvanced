package androidx.media.filterpacks.miscellaneous;

import defpackage.ayw;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public final class AverageIntensity extends ayw {
    public static int mBinHeight = 2;
    public static int mBinWidth = 2;

    private final native void averageIntensity(ByteBuffer byteBuffer, IntBuffer intBuffer, int i, int i2, int i3, int i4);

    static {
        System.loadLibrary("filterframework_jni");
    }
}
