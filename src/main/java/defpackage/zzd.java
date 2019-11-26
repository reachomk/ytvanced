package defpackage;

/* renamed from: zzd */
public final class zzd implements zyw {
    public final bbzv a = new bbzv();
    private final zzi b;

    public zzd(bdfg bdfg, zzi zzi) {
        this.b = zzi;
        bdfg.d().a(new zzc(this));
    }

    public final apxn a() {
        return d();
    }

    public final String b() {
        return this.b.c();
    }

    public final long c() {
        d();
        return this.b.d();
    }

    private final apxn d() {
        bbzv bbzv = this.a;
        if (bbzv.a.get() != bbzv.b || bbzv.c == null) {
            apxn apxn = (apxn) this.a.a();
            if (apxn == null) {
                afpc.a(2, afpf.innertube, "coldConfigGroup is null event though we finished blocking.");
            }
            return apxn;
        }
        bbzv = this.a;
        return (apxn) (bbzv.a.get() == bbzv.b ? bbzv.c : null);
    }
}
