package defpackage;

/* renamed from: jko */
final /* synthetic */ class jko implements Runnable {
    private final jkp a;
    private final amea b;

    jko(jkp jkp, amea amea) {
        this.a = jkp;
        this.b = amea;
    }

    public final void run() {
        jkp jkp = this.a;
        jkp.a.a(this.b);
    }
}
