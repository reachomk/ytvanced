package com.bumptech.glide.load;

import defpackage.bwb;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean a;

        private ImageType(boolean z) {
            this.a = z;
        }

        public final boolean hasAlpha() {
            return this.a;
        }
    }

    int a(InputStream inputStream, bwb bwb);

    ImageType a(InputStream inputStream);

    ImageType a(ByteBuffer byteBuffer);
}
