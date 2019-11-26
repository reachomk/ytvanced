package defpackage;

/* renamed from: zto */
final /* synthetic */ class zto implements Runnable {
    private final ztp a;
    private final ss b;

    zto(ztp ztp, ss ssVar) {
        this.a = ztp;
        this.b = ssVar;
    }

    public final void run() {
        ztp ztp = this.a;
        ztp.a.setIcon(this.b);
    }
}
