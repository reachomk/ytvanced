package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.io.InputStream;
import java.util.List;

/* renamed from: bsk */
public final class bsk {
    public static ImageType a(List list, InputStream inputStream, bwb bwb) {
        if (inputStream == null) {
            return ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ccl(inputStream, bwb);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ImageType a = ((ImageHeaderParser) list.get(i)).a(inputStream);
                if (a == ImageType.UNKNOWN) {
                    inputStream.reset();
                    i++;
                } else {
                    inputStream.reset();
                    return a;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageType.UNKNOWN;
    }

    public static int b(List list, InputStream inputStream, bwb bwb) {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new ccl(inputStream, bwb);
            }
            inputStream.mark(5242880);
            int size = list.size();
            int i = 0;
            while (i < size) {
                try {
                    int a = ((ImageHeaderParser) list.get(i)).a(inputStream, bwb);
                    if (a == -1) {
                        inputStream.reset();
                        i++;
                    } else {
                        inputStream.reset();
                        return a;
                    }
                } catch (Throwable th) {
                    inputStream.reset();
                    throw th;
                }
            }
        }
        return -1;
    }
}
