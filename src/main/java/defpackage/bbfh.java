package defpackage;

import java.io.InputStream;

/* renamed from: bbfh */
final class bbfh extends InputStream implements batw {
    private final bbff a;

    public bbfh(bbff bbff) {
        this.a = (bbff) amqw.a((Object) bbff, (Object) "buffer");
    }

    public final int available() {
        return this.a.a();
    }

    public final int read() {
        return this.a.a() != 0 ? this.a.b() : -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.a.a() == 0) {
            return -1;
        }
        i2 = Math.min(this.a.a(), i2);
        this.a.a(bArr, i, i2);
        return i2;
    }

    public final void close() {
        this.a.close();
    }
}
