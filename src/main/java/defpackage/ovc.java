package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: ovc */
public final class ovc implements ovg {
    public ByteArrayOutputStream a;

    public final void a(ovm ovm) {
        long j = ovm.f;
        if (j != -1) {
            oxz.a(j <= 2147483647L);
            this.a = new ByteArrayOutputStream((int) ovm.f);
            return;
        }
        this.a = new ByteArrayOutputStream();
    }

    public final void a() {
        this.a.close();
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
