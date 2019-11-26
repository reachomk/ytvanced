package defpackage;

/* renamed from: ahfk */
public final class ahfk implements baqa {
    private final bcaa a;

    private ahfk(bcaa bcaa) {
        this.a = bcaa;
    }

    public static ahfk a(bcaa bcaa) {
        return new ahfk(bcaa);
    }

    public static afmq a(zzf zzf) {
        zzn u = zzf.u();
        if (u.e == null) {
            afmq zzm;
            avzm avzm = u.c;
            if ((avzm.a & 2048) == 0) {
                zzm = new zzm(zzn.a, zzn.b);
            } else {
                avzo avzo = avzm.h;
                if (avzo == null) {
                    avzo = avzo.f;
                }
                zzm = new zzm(avzo);
            }
            u.e = zzm;
        }
        return (afmq) baqd.a(u.e, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ahfk.a((zzf) this.a.get());
    }
}
