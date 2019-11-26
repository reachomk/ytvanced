package defpackage;

/* renamed from: gcr */
final class gcr implements gcz {
    private final /* synthetic */ gcl a;

    gcr(gcl gcl) {
        this.a = gcl;
    }

    public final void a() {
        acvx ad = this.a.ad();
        if (ad != null) {
            ad.a(3, new acvs(acwc.SWIPE_TO_CAMERA_ENGAGED_ACTION), null);
        }
    }

    public final void b() {
        acvx ad = this.a.ad();
        if (ad != null) {
            ad.a(3, new acvs(acwc.SWIPE_TO_CAMERA_CANCELLED_ACTION), null);
        }
    }
}
