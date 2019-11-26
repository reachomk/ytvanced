package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: oaz */
public final class oaz {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final oaw c = new oaw();
    public oba d;
    public oba e;
    public oau f = oau.a;
    public boolean g;

    public final void a() {
        if (!this.a.isEmpty()) {
            this.d = (oba) this.a.get(0);
        }
    }

    public final oba a(oba oba, oau oau) {
        int a = oau.a(oba.a.a);
        if (a == -1) {
            return oba;
        }
        return new oba(oba.a, oau, oau.a(a, this.c).b);
    }
}
