package defpackage;

/* renamed from: bcna */
final class bcna implements Runnable {
    private final /* synthetic */ bcnw a;
    private final /* synthetic */ bcmw b;

    bcna(bcmw bcmw, bcnw bcnw) {
        this.b = bcmw;
        this.a = bcnw;
    }

    public final void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            this.b.a(th);
        }
    }
}
