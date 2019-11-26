package defpackage;

/* renamed from: afat */
final class afat implements ofy {
    private final ofy a;
    private final afav b;
    private final int c;

    afat(ofy ofy, afav afav, int i) {
        this.a = ofy;
        this.b = afav;
        this.c = i;
    }

    public final void a(nzw nzw) {
        this.a.a(nzw);
    }

    public final int a(ofp ofp, int i, boolean z) {
        return this.a.a(ofp, i, z);
    }

    public final void a(oza oza, int i) {
        this.a.a(oza, i);
    }

    public final void a(long j, int i, int i2, int i3, ogb ogb) {
        afav afav = this.b;
        int i4 = this.c;
        if (j > ((long) afav.c) && !afav.b) {
            if (i4 == 1) {
                afav.a.a.a.a(new aefz());
            } else if (i4 == 2) {
                afav.a.a.a.a(new aeix());
            }
            afav.b = true;
        }
        this.a.a(j, i, i2, i3, ogb);
    }
}
