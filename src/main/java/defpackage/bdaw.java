package defpackage;

/* renamed from: bdaw */
final class bdaw implements bcvl {
    private final /* synthetic */ bdfx a;
    private final /* synthetic */ bcvl b;
    private final /* synthetic */ bcuo c;
    private final /* synthetic */ bdau d;

    bdaw(bdau bdau, bdfx bdfx, bcvl bcvl, bcuo bcuo) {
        this.d = bdau;
        this.a = bdfx;
        this.b = bcvl;
        this.c = bcuo;
    }

    public final void a() {
        if (!this.a.c()) {
            bcuo a = this.d.a(this.b);
            this.a.a(a);
            if (a.getClass() == bdbe.class) {
                bdbe bdbe = (bdbe) a;
                bdbe.a.a(this.c);
            }
        }
    }
}
