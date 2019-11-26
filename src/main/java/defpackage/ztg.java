package defpackage;

/* renamed from: ztg */
final /* synthetic */ class ztg implements Runnable {
    private final zth a;
    private final int b;

    ztg(zth zth, int i) {
        this.a = zth;
        this.b = i;
    }

    public final void run() {
        zth zth = this.a;
        int i = this.b;
        zte zte = zth.b;
        if (zte != null) {
            zte.a(i);
            zth.b = null;
        }
    }
}
