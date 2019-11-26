package androidx.media.filterpacks.image;

import defpackage.ayw;
import java.nio.ByteBuffer;

public class GradientFilter extends ayw {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean gradientOperator(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5);
}
