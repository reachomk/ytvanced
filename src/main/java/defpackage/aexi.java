package defpackage;

/* renamed from: aexi */
final /* synthetic */ class aexi implements Runnable {
    private final aexj a;
    private final afaj b;
    private final afif c;

    aexi(aexj aexj, afaj afaj, afif afif) {
        this.a = aexj;
        this.b = afaj;
        this.c = afif;
    }

    public final void run() {
        aexj aexj = this.a;
        afaj afaj = this.b;
        afif afif = this.c;
        afaj.c.e();
        aexj.a(afaj.c, afif);
    }
}
