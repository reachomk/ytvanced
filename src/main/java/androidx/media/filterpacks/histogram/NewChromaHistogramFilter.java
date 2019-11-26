package androidx.media.filterpacks.histogram;

import defpackage.ayw;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public final class NewChromaHistogramFilter extends ayw {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean extractChromaHistogram(ByteBuffer byteBuffer, FloatBuffer floatBuffer, int i, int i2, FloatBuffer floatBuffer2, int i3, int i4, int i5);
}
