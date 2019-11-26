package defpackage;

/* renamed from: bbbk */
final class bbbk implements Runnable {
    private final /* synthetic */ bbbf a;
    private final /* synthetic */ bbbi b;

    bbbk(bbbi bbbi, bbbf bbbf) {
        this.b = bbbi;
        this.a = bbbf;
    }

    public final void run() {
        bbbe bbbe = this.b.a;
        bbbe.p = this.a;
        if (bbbe.m > 0) {
            amrj amrj = bbbe.o;
            amrj.c();
            amrj.b();
        }
    }
}
