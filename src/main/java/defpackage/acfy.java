package defpackage;

/* renamed from: acfy */
final class acfy implements afsw {
    private final /* synthetic */ acfl a;
    private final /* synthetic */ acfo b;

    acfy(acfo acfo, acfl acfl) {
        this.b = acfo;
        this.a = acfl;
    }

    private final void a(int i, String str, aqhy aqhy) {
        this.b.b.post(new acga(this.a, i, aqhy));
    }

    public final void a(bqn bqn) {
        xtl.a("Cannot load GetBroadcastSetupResponse from InnerTube.", (Throwable) bqn);
        if (bqn != null) {
            bqd bqd = bqn.b;
            if (bqd != null && bqd.a == 403) {
                acef.a().a(3, 2, bqn);
                a(4, null, null);
                return;
            }
        }
        acef.a().a(3, 1, bqn);
        a(1, null, null);
    }
}
