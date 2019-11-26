package defpackage;

/* renamed from: hgt */
final class hgt implements xcp {
    public final /* synthetic */ hgl a;

    hgt(hgl hgl) {
        this.a = hgl;
    }

    public final void a(ahkr ahkr) {
        if (!(!this.a.c.c().b() || this.a.b.c() || this.a.d.c() == null || this.a.d.c().d())) {
            hgl hgl = this.a;
            if ((hgl.f == 2 && ahkr.a == 5) || ahkr.a == 8) {
                hgl.e.removeCallbacks(null);
                this.a.e.postDelayed(new hgs(this), 500);
            }
        }
        this.a.f = ahkr.a;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkr.class};
        } else if (i == 0) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
