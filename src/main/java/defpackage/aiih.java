package defpackage;

/* renamed from: aiih */
public final /* synthetic */ class aiih implements bcvk {
    private final aiii a;

    public aiih(aiii aiii) {
        this.a = aiii;
    }

    public final void a(Object obj) {
        aiii aiii = this.a;
        ahkq ahkq = (ahkq) obj;
        if (ahkq.b.Z() != null) {
            aiii.e |= ahkq.b.Z().e.a("PLAYER_IS_CONTENT_INTERSTITIAL_KEY");
            aiii.a(ahkq.b.Z().a);
            return;
        }
        aiii.c.a(false);
    }
}
