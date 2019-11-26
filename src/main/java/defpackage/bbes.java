package defpackage;

import java.io.OutputStream;

/* renamed from: bbes */
final class bbes extends OutputStream {
    private final /* synthetic */ bbeq a;

    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
    }

    /* synthetic */ bbes(bbeq bbeq) {
        this.a = bbeq;
    }
}
