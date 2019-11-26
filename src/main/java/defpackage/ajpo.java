package defpackage;

/* renamed from: ajpo */
final /* synthetic */ class ajpo implements Runnable {
    private final ajpk a;
    private final aakj b;
    private final String c;

    ajpo(ajpk ajpk, aakj aakj, String str) {
        this.a = ajpk;
        this.b = aakj;
        this.c = str;
    }

    public final void run() {
        ajpk ajpk = this.a;
        ajpk.a.a(this.b, this.c);
    }
}
