package defpackage;

import java.io.EOFException;

/* renamed from: nri */
final class nri {
    public nrc a;
    private final nrc[] b;
    private final nre c;

    public nri(nrc[] nrcArr, nre nre) {
        this.b = nrcArr;
        this.c = nre;
    }

    public final nrc a(nrb nrb) {
        nrc nrc = this.a;
        if (nrc != null) {
            return nrc;
        }
        nrc[] nrcArr = this.b;
        int length = nrcArr.length;
        int i = 0;
        while (i < length) {
            nrc nrc2 = nrcArr[i];
            try {
                if (nrc2.a(nrb)) {
                    this.a = nrc2;
                    nrb.a();
                    break;
                }
                nrb.a();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                nrb.a();
            }
        }
        nrc nrc3 = this.a;
        if (nrc3 != null) {
            nrc3.a(this.c);
            return this.a;
        }
        throw new nrk(this.b);
    }
}
