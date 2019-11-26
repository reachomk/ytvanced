package defpackage;

import java.util.Random;

/* renamed from: vqr */
public final class vqr {
    private final String a;
    private final xsc b;
    private final vny c;

    public vqr(vdj vdj, xsc xsc, vny vny) {
        this.a = vdj.a();
        this.b = xsc;
        this.c = vny;
        vny.a();
    }

    public final vqp a() {
        return new vqp(this.a, new Random(this.b.a()), this.c);
    }
}
