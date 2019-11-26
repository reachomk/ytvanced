package defpackage;

/* renamed from: aibj */
final /* synthetic */ class aibj implements bcvk {
    private final aibk a;

    aibj(aibk aibk) {
        this.a = aibk;
    }

    public final void a(Object obj) {
        aibk aibk = this.a;
        aakj Z = ((ahkq) obj).b.Z();
        if (Z != null) {
            aibk.a.o = Z.e.a("PLAYER_IS_CONTENT_INTERSTITIAL_KEY");
            aibk.a.n = Z.e.a("PLAYER_CONTENT_INTERSTITIAL_IS_PREROLL_KEY");
            aibk.a.e();
        }
    }
}
