package defpackage;

import java.util.Map;

/* renamed from: dqp */
public final class dqp implements aaap {
    private final nn a;
    private final afqe b;
    private final utv c;
    private final uyp d;

    public dqp(nn nnVar, afqe afqe, utv utv, uyp uyp) {
        this.a = nnVar;
        this.b = afqe;
        this.c = utv;
        this.d = uyp;
    }

    public final void a(apxu apxu, Map map) {
        boolean booleanValue = ((Boolean) xsb.c(map, "FromTopBarMenu", Boolean.valueOf(false))).booleanValue();
        if (this.c.g() && booleanValue) {
            this.d.a();
            return;
        }
        this.b.a(this.a, apxu, (afqd) xsb.a(map, (Object) "sign_in_callback", afqd.class));
    }
}
