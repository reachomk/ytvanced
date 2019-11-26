package defpackage;

/* renamed from: gio */
final /* synthetic */ class gio implements Runnable {
    private final gim a;

    gio(gim gim) {
        this.a = gim;
    }

    public final void run() {
        gim gim = this.a;
        if (gge.a(gim.c) && gim.d.getVisibility() == 0) {
            gim.e = gfu.a(gim, false, gim.e);
        }
    }
}
