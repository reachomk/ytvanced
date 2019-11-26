package defpackage;

/* renamed from: tsa */
final class tsa extends tsf {
    private final /* synthetic */ tsb a;

    tsa(tsb tsb) {
        this.a = tsb;
    }

    public final void a(long j) {
        tsb tsb = this.a;
        tsb.d++;
        if (!tsb.a(tsb.a) && !this.a.a.isStarted()) {
            tsb = this.a;
            int i = tsb.c;
            if (i == -1 || tsb.d < i) {
                Runnable runnable = tsb.b;
                if (runnable != null) {
                    runnable.run();
                }
                this.a.a.start();
            }
        }
    }
}
