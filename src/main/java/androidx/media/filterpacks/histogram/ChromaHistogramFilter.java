package androidx.media.filterpacks.histogram;

import defpackage.ayw;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public final class ChromaHistogramFilter extends ayw {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void extractChromaHistogram(ByteBuffer byteBuffer, FloatBuffer floatBuffer, int i, int i2);
}
