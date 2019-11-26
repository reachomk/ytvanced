package defpackage;

import android.util.SparseArray;

/* renamed from: ojj */
final class ojj {
    public final ofy a;
    public final boolean b;
    public final boolean c;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public final oyz f = new oyz(this.g, 0, 0);
    public byte[] g = new byte[128];
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public oji m = new oji();
    public oji n = new oji();
    public boolean o;
    public long p;
    public long q;
    public boolean r;

    public ojj(ofy ofy, boolean z, boolean z2) {
        this.a = ofy;
        this.b = z;
        this.c = z2;
        a();
    }

    public final void a(oyy oyy) {
        this.d.append(oyy.d, oyy);
    }

    public final void a(oyv oyv) {
        this.e.append(oyv.a, oyv);
    }

    public final void a() {
        this.k = false;
        this.o = false;
        this.n.a();
    }
}
