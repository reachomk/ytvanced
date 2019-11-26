package defpackage;

/* renamed from: acca */
final class acca implements Runnable {
    private final /* synthetic */ acby a;

    acca(acby acby) {
        this.a = acby;
    }

    public final void run() {
        acby acby = this.a;
        if (acby.d != null && acby.e) {
            acby.c.postDelayed(acby.j, 70000);
        }
    }
}
