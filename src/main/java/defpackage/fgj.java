package defpackage;

/* renamed from: fgj */
final /* synthetic */ class fgj implements Runnable {
    private final fgc a;
    private final int b;
    private final fgu c;

    fgj(fgc fgc, int i, fgu fgu) {
        this.a = fgc;
        this.b = i;
        this.c = fgu;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
