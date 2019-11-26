package androidx.media.filterfw;

import java.nio.ByteBuffer;

public class PixelUtils {
    private static native void nativeCopyPixels(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5);

    static {
        System.loadLibrary("filterframework_jni");
    }
}
