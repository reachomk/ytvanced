package defpackage;

/* renamed from: aiyf */
final /* synthetic */ class aiyf implements Runnable {
    private final aixy a;
    private final Exception b;

    aiyf(aixy aixy, Exception exception) {
        this.a = aixy;
        this.b = exception;
    }

    public final void run() {
        aixy aixy = this.a;
        Throwable th = this.b;
        if (!aixy.e) {
            aixy.c.b(new ahjc(12, true, aixy.d.a(th), th));
        }
    }
}
