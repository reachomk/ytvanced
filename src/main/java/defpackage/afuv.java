package defpackage;

/* renamed from: afuv */
final /* synthetic */ class afuv implements Runnable {
    private final afuu a;
    private final boolean b;
    private final zn c;
    private final axxf d;

    afuv(afuu afuu, boolean z, zn znVar, axxf axxf) {
        this.a = afuu;
        this.b = z;
        this.c = znVar;
        this.d = axxf;
    }

    public final void run() {
        afuu afuu = this.a;
        boolean z = this.b;
        zn znVar = this.c;
        axxf axxf = this.d;
        afuu.a();
        if (!z) {
            znVar.a(axxf);
        }
    }
}
