package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bbep */
final class bbep extends OutputStream {
    public final List a = new ArrayList();
    private bbhv b;
    private final /* synthetic */ bbeq c;

    public final void write(int i) {
        bbhv bbhv = this.b;
        if (bbhv == null || bbhv.a() <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
            return;
        }
        this.b.a((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            this.b = this.c.a.a(i2);
            this.a.add(this.b);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.b.a());
            if (min == 0) {
                min = this.b.b();
                this.b = this.c.a.a(Math.max(i2, min + min));
                this.a.add(this.b);
            } else {
                this.b.a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }

    /* synthetic */ bbep(bbeq bbeq) {
        this.c = bbeq;
    }
}
