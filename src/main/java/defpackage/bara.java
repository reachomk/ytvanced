package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: bara */
final class bara extends FilterOutputStream {
    public bara(OutputStream outputStream) {
        super(outputStream);
    }

    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            this.out.write(String.format("%x\r\n", new Object[]{Integer.valueOf(i2)}).getBytes());
            this.out.write(bArr, i, i2);
            this.out.write("\r\n".getBytes());
        }
    }

    public final void a() {
        this.out.write("0\r\n\r\n".getBytes());
    }
}
