package androidx.media.filterpacks.image;

import defpackage.ayw;
import java.nio.ByteBuffer;

public class StructureTensor2DFilter extends ayw {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean constructStructureTensor(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);
}
