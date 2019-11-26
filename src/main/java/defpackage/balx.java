package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: balx */
public class balx extends balt {
    private String a;

    protected balx(String str) {
        super(str);
    }

    public final byte[] a() {
        return ciq.a(this.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final int g() {
        return this.a.getBytes(Charset.forName("UTF-8")).length;
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(ByteBuffer byteBuffer) {
        this.a = cio.a(byteBuffer, byteBuffer.remaining());
    }
}
