package defpackage;

/* renamed from: ahtt */
final class ahtt implements ahnf {
    private final /* synthetic */ ahre a;
    private final /* synthetic */ ahry b;

    ahtt(ahre ahre, ahry ahry) {
        this.a = ahre;
        this.b = ahry;
    }

    public final boolean a() {
        ahre ahre = this.a;
        boolean z = ahre.h ^ 1;
        ahre.h = z;
        ahry ahry = this.b;
        ahry.h = z;
        ahqp ahqp = ahry.b;
        if (ahqp.j != z) {
            ahqp.j = z;
            if (ahqp.i && (ahqp.d == aaju.RECTANGULAR_3D || ahqp.d == aaju.RECTANGULAR_2D)) {
                ahqp.c();
            }
        }
        ahry.c();
        return true;
    }
}
