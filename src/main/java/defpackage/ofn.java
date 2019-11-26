package defpackage;

import java.io.EOFException;

/* renamed from: ofn */
public final class ofn implements ofy {
    public final void a(long j, int i, int i2, int i3, ogb ogb) {
    }

    public final void a(nzw nzw) {
    }

    public final int a(ofp ofp, int i, boolean z) {
        ofl ofl = (ofl) ofp;
        int c = ofl.c(i);
        if (c == 0) {
            byte[] bArr = ofl.a;
            c = ofl.a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        ofl.d(c);
        if (c != -1) {
            return c;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void a(oza oza, int i) {
        oza.d(i);
    }
}
