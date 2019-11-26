package defpackage;

/* renamed from: say */
final class say implements pkc {
    private final /* synthetic */ sap a;

    say(sap sap) {
        this.a = sap;
    }

    public final void a() {
        sap sap = this.a;
        sap.H();
        for (sbo l : sap.H) {
            l.l();
        }
        try {
            sap.b(sap.v());
        } catch (sbt | sbv e) {
            sdf.a(sap.r, "Failed to update lock screen metadata due to a network issue", e);
        }
    }
}
