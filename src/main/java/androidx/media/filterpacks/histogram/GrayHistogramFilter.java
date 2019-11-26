package androidx.media.filterpacks.histogram;

import defpackage.ayw;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public final class GrayHistogramFilter extends ayw {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void extractHistogram(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, IntBuffer intBuffer);
}
