package defpackage;

import java.io.EOFException;

/* renamed from: oft */
public final class oft {
    private final oza a = new oza(10);

    public final olj a(ofp ofp, omn omn) {
        olj olj = null;
        int i = 0;
        while (true) {
            try {
                ofp.c(this.a.a, 0, 10);
                this.a.c(0);
                if (this.a.h() != omk.a) {
                    break;
                }
                this.a.d(3);
                int n = this.a.n();
                int i2 = n + 10;
                if (olj == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    ofp.c(bArr, 10, n);
                    olj = new omk(null).a(bArr, i2);
                } else {
                    ofp.b(n);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        ofp.a();
        ofp.b(i);
        return olj;
    }
}
