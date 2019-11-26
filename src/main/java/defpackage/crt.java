package defpackage;

import java.util.ArrayList;

/* renamed from: crt */
public class crt extends crr {
    public crw c;
    public crv d;
    public csc e = crr.a;
    public ctx f;
    public ctx g;
    private final ArrayList h = new ArrayList();

    /* Access modifiers changed, original: final */
    public final void a() {
        crv crv = this.d;
        if (crv != null) {
            this.h.add(new csb(new cru(this.c, crv), this.e, this.f, this.g));
            this.d = null;
            this.e = crr.a;
            this.f = null;
            this.g = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final ArrayList b() {
        a();
        return this.h;
    }
}
