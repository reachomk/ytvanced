package defpackage;

/* renamed from: alcn */
final /* synthetic */ class alcn implements alcj {
    private final alck a;
    private final albu b;

    alcn(alck alck, albu albu) {
        this.a = alck;
        this.b = albu;
    }

    public final void a(int i) {
        alck alck = this.a;
        albu albu = this.b;
        alck.c.a();
        albc n = albu.n();
        if (n != null) {
            n.a(albu, i);
        }
        for (albc n2 : alck.b) {
            n2.a(albu, i);
        }
    }
}
