package defpackage;

/* renamed from: bbyh */
final class bbyh implements Runnable {
    private final bbyf a;
    private final /* synthetic */ bbyi b;

    bbyh(bbyi bbyi, bbyf bbyf) {
        this.b = bbyi;
        this.a = bbyf;
    }

    public final void run() {
        this.a.b = true;
        this.b.a.remove(this.a);
    }
}
