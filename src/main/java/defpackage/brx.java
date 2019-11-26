package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: brx */
final class brx extends ByteArrayOutputStream {
    private final /* synthetic */ bry a;

    brx(bry bry, int i) {
        this.a = bry;
        super(i);
    }

    public final String toString() {
        int i;
        if (this.count <= 0 || this.buf[this.count - 1] != (byte) 13) {
            i = this.count;
        } else {
            i = this.count - 1;
        }
        try {
            return new String(this.buf, 0, i, this.a.a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
