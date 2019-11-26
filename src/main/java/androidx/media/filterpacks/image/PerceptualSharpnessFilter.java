package androidx.media.filterpacks.image;

import defpackage.ayw;
import java.nio.ByteBuffer;

public class PerceptualSharpnessFilter extends ayw {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native float computePerceptualSharpness(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);
}
