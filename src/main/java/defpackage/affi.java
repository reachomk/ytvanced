package defpackage;

/* renamed from: affi */
final /* synthetic */ class affi implements Runnable {
    private final affj a;
    private final afne b;
    private final int c;
    private final afkn d;
    private final String e;
    private final int f;

    affi(affj affj, afne afne, int i, int i2, afkn afkn, String str) {
        this.a = affj;
        this.b = afne;
        this.f = i;
        this.c = i2;
        this.d = afkn;
        this.e = str;
    }

    public final void run() {
        affj affj = this.a;
        afne afne = this.b;
        int i = this.f;
        int i2 = this.c;
        afkn afkn = this.d;
        String str = this.e;
        affj.a(17, afne);
        affj.a(i, afne, i2, afkn, str);
    }
}
