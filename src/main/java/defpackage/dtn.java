package defpackage;

/* renamed from: dtn */
final class dtn implements Runnable {
    private final /* synthetic */ wzd a;
    private final /* synthetic */ dtl b;

    dtn(dtl dtl, wzd wzd) {
        this.b = dtl;
        this.a = wzd;
    }

    public final void run() {
        if (!((xti) this.b.a.get()).a("disable_binder_callback_flush", false)) {
            wzd wzd = this.a;
            if (wzd.b) {
                throw new IllegalStateException("Cannot change state, class already initialized.");
            }
            wzd.a = true;
        }
    }
}
