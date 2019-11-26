package defpackage;

/* renamed from: mu */
final class mu implements Runnable {
    private final /* synthetic */ mz a;
    private final /* synthetic */ Object b;

    mu(mz mzVar, Object obj) {
        this.a = mzVar;
        this.b = obj;
    }

    public final void run() {
        this.a.a = this.b;
    }
}
