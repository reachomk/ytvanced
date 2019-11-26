package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: bbfi */
public final class bbfi {
    public static bbff a(byte[] bArr, int i, int i2) {
        return new bbfk(bArr, i, i2);
    }

    public static bbff a(ByteBuffer byteBuffer) {
        return new bbfj(byteBuffer);
    }

    public static String a(bbff bbff, Charset charset) {
        amqw.a((Object) charset, (Object) "charset");
        amqw.a((Object) bbff, (Object) "buffer");
        int a = bbff.a();
        byte[] bArr = new byte[a];
        bbff.a(bArr, 0, a);
        return new String(bArr, charset);
    }

    public static InputStream a(bbff bbff) {
        return new bbfh(bbff);
    }

    static {
        bbfk bbfk = new bbfk(new byte[0]);
    }
}
