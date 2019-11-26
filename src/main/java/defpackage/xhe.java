package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: xhe */
final class xhe extends xhb {
    private final byte[] d;
    private final int e;
    private ByteBuffer f = null;

    xhe(byte[] bArr, int i, String str) {
        super((long) i, str);
        this.d = bArr;
        this.e = i;
    }

    public final void c() {
    }

    public final InputStream b() {
        return new xlm(this.d, this.e);
    }

    public final byte[] d() {
        int i = this.e;
        byte[] bArr = this.d;
        return i != bArr.length ? null : bArr;
    }

    public final ByteBuffer e() {
        if (this.f == null) {
            this.f = ByteBuffer.wrap(this.d, 0, this.e);
        }
        return this.f.duplicate();
    }
}
