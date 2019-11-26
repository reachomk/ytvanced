package defpackage;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;

/* renamed from: xlm */
public final class xlm extends ByteArrayInputStream implements xll {
    public xlm(byte[] bArr, int i) {
        super(bArr, 0, i);
    }

    public final int a(ByteBuffer byteBuffer, int i) {
        if (this.pos >= this.count) {
            return -1;
        }
        i = Math.min(this.count - this.pos, i);
        if (i == 0) {
            return 0;
        }
        byteBuffer.put(this.buf, this.pos, i);
        this.pos += i;
        return i;
    }
}
