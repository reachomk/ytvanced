package defpackage;

/* renamed from: nqz */
public final class nqz implements nrs {
    public final void a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    public final void a(nmx nmx) {
    }

    public final int a(nrb nrb, int i, boolean z) {
        nqx nqx = (nqx) nrb;
        int c = nqx.c(i);
        if (c == 0) {
            byte[] bArr = nqx.a;
            c = nqx.a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        nqx.d(c);
        return c;
    }

    public final void a(nwz nwz, int i) {
        nwz.d(i);
    }
}
