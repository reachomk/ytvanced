package defpackage;

/* renamed from: amio */
final class amio implements amcm {
    public final String a;
    public final amcj b;
    public final /* synthetic */ amii c;

    amio(amii amii, String str, amcj amcj) {
        this.c = amii;
        this.a = str;
        this.b = amcj;
    }

    public final void a(amcj amcj) {
        if (amcj.e().b) {
            amcj.b(this);
            this.c.a(this.a, true);
            this.c.a.execute(new amin(this));
        }
    }
}
