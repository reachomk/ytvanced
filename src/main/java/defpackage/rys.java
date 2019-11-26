package defpackage;

/* renamed from: rys */
final class rys implements Runnable {
    private final /* synthetic */ ryi a;
    private final /* synthetic */ ryt b;

    rys(ryt ryt, ryi ryi) {
        this.b = ryt;
        this.a = ryi;
    }

    public final void run() {
        try {
            ryi ryi = (ryi) this.b.a.a(this.a);
            if (ryi == null) {
                this.b.a(new NullPointerException("Continuation returned null"));
                return;
            }
            ryi.a(ryk.b, this.b);
            ryi.a(ryk.b, this.b);
            ryi.a(ryk.b, this.b);
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
