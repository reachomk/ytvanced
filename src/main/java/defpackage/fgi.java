package defpackage;

/* renamed from: fgi */
final /* synthetic */ class fgi implements Runnable {
    private final fgc a;
    private final int b;
    private final fgu c;

    fgi(fgc fgc, int i, fgu fgu) {
        this.a = fgc;
        this.b = i;
        this.c = fgu;
    }

    public final void run() {
        fgc fgc = this.a;
        int i = this.b;
        fgu fgu = this.c;
        if (fgc.b(i, fgu)) {
            fgc.a(i, fgu);
        }
    }
}
