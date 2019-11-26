package defpackage;

/* renamed from: ryq */
final class ryq implements Runnable {
    private final /* synthetic */ ryi a;
    private final /* synthetic */ ryr b;

    ryq(ryr ryr, ryi ryi) {
        this.b = ryr;
        this.a = ryi;
    }

    public final void run() {
        if (this.a.c()) {
            this.b.b.f();
            return;
        }
        try {
            this.b.b.a(this.b.a.a(this.a));
        } catch (ryj e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.a((Exception) e.getCause());
            } else {
                this.b.b.a(e);
            }
        } catch (Exception e2) {
            this.b.b.a(e2);
        }
    }
}
