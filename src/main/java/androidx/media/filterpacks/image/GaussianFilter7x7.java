package androidx.media.filterpacks.image;

import defpackage.ayw;
import java.nio.ByteBuffer;

public class GaussianFilter7x7 extends ayw {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean blur(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
