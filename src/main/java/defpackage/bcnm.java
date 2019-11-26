package defpackage;

/* renamed from: bcnm */
final class bcnm implements Runnable {
    private final /* synthetic */ bcnw a;
    private final /* synthetic */ bcmw b;

    bcnm(bcmw bcmw, bcnw bcnw) {
        this.b = bcmw;
        this.a = bcnw;
    }

    public final void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            this.b.a(new bclu("System error", th));
        }
    }
}
