package defpackage;

/* renamed from: aklu */
final class aklu implements cgd {
    private final alwu a;

    public aklu(alwu alwu) {
        this.a = alwu;
    }

    public final boolean a(bvn bvn, Object obj, cgu cgu, boolean z) {
        this.a.a("GLIDE", "UNKNOWN", true);
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, int i) {
        alwu alwu = this.a;
        int i2 = i - 1;
        if (i != 0) {
            String str = i2 != 1 ? i2 != 2 ? i2 != 4 ? "UNKNOWN" : "MEMORY" : "DISK" : "NOT_CACHED";
            alwu.a("GLIDE", str, false);
            return false;
        }
        throw null;
    }
}
