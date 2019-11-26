package defpackage;

/* renamed from: aklv */
final class aklv implements cgd {
    private final aort a;
    private final bcaa b;
    private final boolean c;

    aklv(aort aort, bcaa bcaa, boolean z) {
        this.a = aort;
        this.b = bcaa;
        this.c = z;
    }

    public final boolean a(bvn bvn, Object obj, cgu cgu, boolean z) {
        if (this.c) {
            ((alwu) this.b.get()).a("GLIDE", "UNKNOWN", true);
        }
        if (this.a.h && (obj instanceof aygk)) {
            cgu.a(new akly(bvn, z, (aygk) obj));
        }
        return false;
    }

    public final /* synthetic */ boolean a(Object obj, int i) {
        if (this.c) {
            alwu alwu = (alwu) this.b.get();
            int i2 = i - 1;
            if (i != 0) {
                String str = i2 != 1 ? (i2 == 2 || i2 == 3) ? "DISK" : i2 != 4 ? "UNKNOWN" : "MEMORY" : "NOT_CACHED";
                alwu.a("GLIDE", str, false);
            } else {
                throw null;
            }
        }
        return false;
    }
}
