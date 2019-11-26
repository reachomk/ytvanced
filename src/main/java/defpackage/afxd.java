package defpackage;

/* renamed from: afxd */
final class afxd implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ afxe b;

    afxd(afxe afxe, String str) {
        this.b = afxe;
        this.a = str;
    }

    public final void run() {
        synchronized (this.b.b) {
            ajtf ajtf = (ajtf) this.b.b.get(this.a);
            if (ajtf != null) {
                this.b.a.a(ajtf);
            }
        }
    }
}
