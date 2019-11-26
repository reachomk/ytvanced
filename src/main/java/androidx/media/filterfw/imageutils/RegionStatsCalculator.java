package androidx.media.filterfw.imageutils;

import java.nio.ByteBuffer;

public class RegionStatsCalculator {
    private native void regionscore(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, float[] fArr, boolean z);

    static {
        System.loadLibrary("filterframework_jni");
    }
}
