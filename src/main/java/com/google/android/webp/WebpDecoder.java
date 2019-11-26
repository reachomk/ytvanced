package com.google.android.webp;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class WebpDecoder {

    public class Config {
        private final int a;
        private final int b;

        private Config(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    private static native boolean decode(ByteBuffer byteBuffer, int i, Bitmap bitmap, boolean z);

    private static native boolean decodeInto(ByteBuffer byteBuffer, int i, Bitmap bitmap, boolean z);

    public static native Config getConfig(ByteBuffer byteBuffer);

    public static native int version();

    static {
        System.loadLibrary("webp_android");
        version();
    }
}
