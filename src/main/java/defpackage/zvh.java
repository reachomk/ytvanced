package defpackage;

/* renamed from: zvh */
final /* synthetic */ class zvh implements Runnable {
    private final zvi a;

    zvh(zvi zvi) {
        this.a = zvi;
    }

    public final void run() {
        zvi zvi = this.a;
        zvi.c.setVisibility(0);
        zvi.c.startAnimation(zvi.b);
    }
}
