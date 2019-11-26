package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: anbi */
public final class anbi extends FilterOutputStream {
    public long a;

    public anbi(OutputStream outputStream) {
        super((OutputStream) amqw.a((Object) outputStream));
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.a += (long) i2;
    }

    public final void write(int i) {
        this.out.write(i);
        this.a++;
    }

    public final void close() {
        this.out.close();
    }
}
