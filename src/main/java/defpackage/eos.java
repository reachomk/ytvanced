package defpackage;

/* renamed from: eos */
final class eos implements eow {
    public cmg a;
    private final eoz b;

    eos(eoz eoz, cmg cmg) {
        this.b = eoz;
        this.a = cmg;
    }

    public final void a(boolean z) {
        String str = "InlinePlayback.updatePlayerTrackingViewVisibilityState";
        cmg cmg;
        if (z) {
            this.b.a(true);
            cmg = this.a;
            if (cmg.h != null) {
                cmg.b(eoh.a(true), str);
                return;
            }
            return;
        }
        cmg = this.a;
        if (cmg.h != null) {
            cmg.a(eoh.a(false), str);
        }
    }
}
