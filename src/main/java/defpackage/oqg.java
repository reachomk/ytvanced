package defpackage;

import android.util.SparseArray;

/* renamed from: oqg */
public final class oqg implements ofo {
    public final ofm a;
    public ofu b;
    public nzw[] c;
    private final int d;
    private final nzw e;
    private final SparseArray f = new SparseArray();
    private boolean g;
    private oqi h;
    private long i;

    public oqg(ofm ofm, int i, nzw nzw) {
        this.a = ofm;
        this.d = i;
        this.e = nzw;
    }

    public final void a(oqi oqi, long j, long j2) {
        this.h = oqi;
        this.i = j2;
        if (this.g) {
            ofm ofm = this.a;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            ofm.a(0, j);
            for (int i = 0; i < this.f.size(); i++) {
                ((oqj) this.f.valueAt(i)).a(oqi, j2);
            }
            return;
        }
        this.a.a((ofo) this);
        if (j != -9223372036854775807L) {
            this.a.a(0, j);
        }
        this.g = true;
    }

    public final ofy a(int i, int i2) {
        ofy ofy = (oqj) this.f.get(i);
        if (ofy == null) {
            oxz.b(this.c == null);
            ofy = new oqj(i, i2, i2 == this.d ? this.e : null);
            ofy.a(this.h, this.i);
            this.f.put(i, ofy);
        }
        return ofy;
    }

    public final void a() {
        nzw[] nzwArr = new nzw[this.f.size()];
        for (int i = 0; i < this.f.size(); i++) {
            nzwArr[i] = ((oqj) this.f.valueAt(i)).a;
        }
        this.c = nzwArr;
    }

    public final void a(ofu ofu) {
        this.b = ofu;
    }
}
