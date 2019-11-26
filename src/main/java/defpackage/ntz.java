package defpackage;

import android.util.SparseArray;

/* renamed from: ntz */
final class ntz {
    public final nrs a;
    public final boolean b = false;
    public final boolean c = false;
    public final nxa d = new nxa();
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public byte[] g = new byte[128];
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public nuc m = new nuc();
    public nuc n = new nuc();
    public boolean o;
    public long p;
    public long q;
    public boolean r;

    public ntz(nrs nrs) {
        this.a = nrs;
        a();
    }

    public final void a(nwx nwx) {
        this.e.append(nwx.a, nwx);
    }

    public final void a(nwy nwy) {
        this.f.append(nwy.a, nwy);
    }

    public final void a() {
        this.k = false;
        this.o = false;
        this.n.a();
    }
}
