package defpackage;

/* renamed from: nik */
final class nik implements Runnable {
    private final /* synthetic */ nid a;

    nik(nid nid) {
        this.a = nid;
    }

    public final void run() {
        mmx mmx = this.a.b.e;
        if (mmx == null) {
            ammj.a("Ignoring call to first() on YouTubeThumbnailView due to no playlist being set.", new Object[0]);
            return;
        }
        mmx.d();
    }
}
