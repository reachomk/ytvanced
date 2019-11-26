package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: ojc */
public final class ojc implements ojf {
    private final List a;
    private final ofy[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public ojc(List list) {
        this.a = list;
        this.b = new ofy[list.size()];
    }

    public final void a() {
        this.c = false;
    }

    public final void a(ofo ofo, okl okl) {
        for (int i = 0; i < this.b.length; i++) {
            okg okg = (okg) this.a.get(i);
            okl.a();
            ofy a = ofo.a(okl.b(), 3);
            a.a(nzw.a(okl.c(), "application/dvbsubs", 0, Collections.singletonList(okg.b), okg.a, null));
            this.b[i] = a;
        }
    }

    public final void a(long j, int i) {
        if ((i & 4) != 0) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    public final void b() {
        if (this.c) {
            for (ofy a : this.b) {
                a.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    public final void a(oza oza) {
        if (this.c && (this.d != 2 || a(oza, 32))) {
            int i = 0;
            if (this.d != 1 || a(oza, 0)) {
                int i2 = oza.b;
                int b = oza.b();
                ofy[] ofyArr = this.b;
                int length = ofyArr.length;
                while (i < length) {
                    ofy ofy = ofyArr[i];
                    oza.c(i2);
                    ofy.a(oza, b);
                    i++;
                }
                this.e += b;
            }
        }
    }

    private final boolean a(oza oza, int i) {
        if (oza.b() == 0) {
            return false;
        }
        if (oza.d() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }
}
