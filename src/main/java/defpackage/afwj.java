package defpackage;

/* renamed from: afwj */
final /* synthetic */ class afwj implements Runnable {
    private final afwk a;
    private final String b;
    private final atur c;

    afwj(afwk afwk, String str, atur atur) {
        this.a = afwk;
        this.b = str;
        this.c = atur;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
