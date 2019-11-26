package defpackage;

import java.util.List;

/* renamed from: aany */
public final class aany extends aamz {
    /* synthetic */ aany(aamd aamd, afpt afpt, String str, int i, arzg arzg, boolean z) {
        arzi arzi = (arzi) arzh.h.createBuilder();
        List a = abmo.a(aali.b(str));
        arzi.copyOnWrite();
        arzh arzh = (arzh) arzi.instance;
        if (!arzh.d.a()) {
            arzh.d = anxl.mutableCopy(arzh.d);
        }
        anvf.addAll(a, arzh.d);
        arzi.copyOnWrite();
        arzh arzh2 = (arzh) arzi.instance;
        arzh2.a |= 2;
        arzh2.c = i - 1;
        super(aamd, afpt, "account/accounts_list", arzi);
        this.h = z;
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
