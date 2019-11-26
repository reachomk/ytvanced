package defpackage;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: cch */
public final class cch implements ImageHeaderParser {
    public final ImageType a(InputStream inputStream) {
        return ImageType.UNKNOWN;
    }

    public final ImageType a(ByteBuffer byteBuffer) {
        return ImageType.UNKNOWN;
    }

    public final int a(InputStream inputStream, bwb bwb) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        return attributeInt == 0 ? -1 : attributeInt;
    }
}
