package defpackage;

/* renamed from: hqb */
final /* synthetic */ class hqb implements Runnable {
    private final hpy a;
    private final String b;

    hqb(hpy hpy, String str) {
        this.a = hpy;
        this.b = str;
    }

    public final void run() {
        hpy hpy = this.a;
        String str = this.b;
        hpx hpx = (hpx) hpy.c.get();
        xak.a();
        hpw hpw = hpx.e;
        if (hpw != null) {
            hpx.c.removeCallbacks(hpw);
            hpx.e = null;
        }
        hpx.d.put(str, null);
        hpx.e = new hpw(hpx);
        hpx.c.postDelayed(hpx.e, hpx.a);
    }
}
