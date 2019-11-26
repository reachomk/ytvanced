package defpackage;

/* renamed from: tmg */
final class tmg implements tfh {
    private final /* synthetic */ int a;

    tmg(int i) {
        this.a = i;
    }

    public final psu a() {
        rsv rsv = new rsv();
        int i = this.a;
        rsv.a = i;
        pzr.b(i >= 0, "Must provide valid client application ID!");
        return new rss(rsv);
    }
}
