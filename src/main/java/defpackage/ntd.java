package defpackage;

/* renamed from: ntd */
final class ntd {
    public final nth a = new nth();
    public final nwz b = new nwz(282);
    public int c = -1;
    public long d;
    private final nti e = new nti();

    ntd() {
    }

    public final boolean a(nrb nrb, nwz nwz) {
        nwf.b(nwz != null);
        Object obj = null;
        while (obj == null) {
            int i;
            int i2 = this.c;
            if (i2 < 0) {
                if (!ntf.a(nrb, this.a, this.b, true)) {
                    return false;
                }
                nth nth = this.a;
                i = nth.h;
                if ((nth.b & 1) == 1 && nwz.c == 0) {
                    ntf.a(nth, 0, this.e);
                    nti nti = this.e;
                    i += nti.a;
                    i2 = nti.b;
                } else {
                    i2 = 0;
                }
                nrb.a(i);
                this.c = i2;
            }
            ntf.a(this.a, i2, this.e);
            i2 = this.c;
            nti nti2 = this.e;
            i2 += nti2.b;
            i = nti2.a;
            if (i > 0) {
                nrb.b(nwz.a, nwz.c, i);
                nwz.b(nwz.c + this.e.a);
                obj = this.a.j[i2 + -1] != 255 ? 1 : null;
            }
            if (i2 == this.a.g) {
                i2 = -1;
            }
            this.c = i2;
        }
        return true;
    }
}
