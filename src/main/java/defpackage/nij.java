package defpackage;

/* renamed from: nij */
final class nij implements Runnable {
    private final /* synthetic */ nid a;

    nij(nid nid) {
        this.a = nid;
    }

    public final void run() {
        this.a.a.a = null;
        System.gc();
    }
}
