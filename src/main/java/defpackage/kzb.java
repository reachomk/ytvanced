package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: kzb */
public final class kzb {
    public final nn a;
    public final bcaa b;
    public final bcaa c;
    public final afpu d;
    public final afqe e;
    public final xoi f;
    public final fkz g;
    public final akoe h;
    public final zzl i;
    public final Set j = Collections.newSetFromMap(new WeakHashMap());
    public final kzg k = new kzg(this);

    public kzb(nn nnVar, bcaa bcaa, bcaa bcaa2, afpu afpu, afqe afqe, xoi xoi, fkz fkz, alfi alfi, akoe akoe, zzl zzl) {
        this.a = nnVar;
        this.b = bcaa;
        this.c = bcaa2;
        this.d = afpu;
        this.e = afqe;
        this.f = xoi;
        this.g = fkz;
        this.h = akoe;
        this.i = zzl;
        alfi.a(this.k);
    }

    public final void a(String str) {
        xvd.a(str);
        this.k.a = str;
        if (this.d.a()) {
            this.k.c();
        } else {
            this.e.a(this.a, null, new kze(this));
        }
    }
}
