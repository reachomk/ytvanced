package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: cee */
public final class cee implements bsp {
    private final List a;
    private final bsp b;
    private final bwb c;

    public cee(List list, bsp bsp, bwb bwb) {
        this.a = list;
        this.b = bsp;
        this.c = bwb;
    }

    public final /* synthetic */ bvw a(Object obj, int i, int i2, bsq bsq) {
        byte[] toByteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
            toByteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            String str = "StreamGifDecoder";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Error reading data from stream", e);
            }
            toByteArray = null;
        }
        if (toByteArray == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(toByteArray), i, i2, bsq);
    }

    public final /* synthetic */ boolean a(Object obj, bsq bsq) {
        InputStream inputStream = (InputStream) obj;
        if (((Boolean) bsq.a(ceb.b)).booleanValue() || bsk.a(this.a, inputStream, this.c) != ImageType.GIF) {
            return false;
        }
        return true;
    }
}
