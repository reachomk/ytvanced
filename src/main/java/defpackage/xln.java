package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: xln */
public final class xln extends ByteArrayOutputStream {
    public xln(int i) {
        super(i);
    }

    public final ByteBuffer a() {
        return ByteBuffer.wrap(this.buf, 0, this.count);
    }
}
