package defpackage;

/* renamed from: ahfl */
public final class ahfl implements baqa {
    private final bcaa a;

    private ahfl(bcaa bcaa) {
        this.a = bcaa;
    }

    public static ahfl a(bcaa bcaa) {
        return new ahfl(bcaa);
    }

    public static afmq a(zzf zzf) {
        zzn u = zzf.u();
        if (u.d == null) {
            afmq zzm;
            avzm avzm = u.c;
            if ((avzm.a & 1024) == 0) {
                zzm = new zzm(zzn.a, zzn.b);
            } else {
                avzo avzo = avzm.g;
                if (avzo == null) {
                    avzo = avzo.f;
                }
                zzm = new zzm(avzo);
            }
            u.d = zzm;
        }
        return (afmq) baqd.a(u.d, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ahfl.a((zzf) this.a.get());
    }
}
