package defpackage;

/* renamed from: yfc */
final /* synthetic */ class yfc implements Runnable {
    private final yez a;
    private final ss b;

    yfc(yez yez, ss ssVar) {
        this.a = yez;
        this.b = ssVar;
    }

    public final void run() {
        yez yez = this.a;
        yez.a.a.setImageDrawable(this.b);
        yez.a.a.invalidate();
    }
}
