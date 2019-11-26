package defpackage;

/* renamed from: ohz */
final class ohz {
    public ohi a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public ohw o;
    public int p;
    public oza q;
    public boolean r;
    public long s;

    ohz() {
    }

    public final void a(int i) {
        oza oza = this.q;
        if (oza == null || oza.c < i) {
            this.q = new oza(i);
        }
        this.p = i;
        this.m = true;
        this.r = true;
    }

    public final long b(int i) {
        return this.k[i] + ((long) this.j[i]);
    }

    public final boolean c(int i) {
        return this.m && this.n[i];
    }
}
