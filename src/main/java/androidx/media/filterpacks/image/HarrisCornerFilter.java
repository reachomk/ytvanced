package androidx.media.filterpacks.image;

import defpackage.ayw;
import java.nio.ByteBuffer;

public class HarrisCornerFilter extends ayw {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean markCorners(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
