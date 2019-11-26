package defpackage;

import java.util.List;

/* renamed from: aaya */
public final class aaya extends aamz {
    public final String a() {
        return k().a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    /* synthetic */ aaya(aamd aamd, afpt afpt, boolean z) {
        asso asso = (asso) assl.f.createBuilder();
        asso.copyOnWrite();
        assl assl = (assl) asso.instance;
        assl.a |= 2;
        List a = abmo.a("");
        asso.copyOnWrite();
        assl assl2 = (assl) asso.instance;
        if (!assl2.d.a()) {
            assl2.d = anxl.mutableCopy(assl2.d);
        }
        anvf.addAll(a, assl2.d);
        asso.copyOnWrite();
        assl = (assl) asso.instance;
        assl.a |= 8;
        assl.e = z;
        super(aamd, afpt, "guide", asso);
        a(aall.ENABLED);
        g();
    }
}
