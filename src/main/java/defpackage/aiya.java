package defpackage;

/* renamed from: aiya */
final /* synthetic */ class aiya implements Runnable {
    private final aixy a;
    private final Exception b;

    aiya(aixy aixy, Exception exception) {
        this.a = aixy;
        this.b = exception;
    }

    public final void run() {
        aixy aixy = this.a;
        Throwable th = this.b;
        if (!aixy.e) {
            aixy.c.a(new ahjc(4, true, ahjh.UNKNOWN, aixy.d.a(th), th, aixy.a.b()));
        }
    }
}
