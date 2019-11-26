package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aape */
public final class aape extends aaml {
    public final List a = new ArrayList();

    public aape(aamd aamd, afpt afpt, String str, boolean z) {
        super("att/get", aamd, afpt, aall.DISABLED, false, str, Boolean.valueOf(z));
        g();
    }

    public final boolean n() {
        return this.a.isEmpty();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(n() ^ 1);
    }

    public final /* synthetic */ anzd c() {
        asaj asaj = (asaj) asag.d.createBuilder();
        List list = this.a;
        asaj.copyOnWrite();
        asag asag = (asag) asaj.instance;
        if (!asag.c.a()) {
            asag.c = anxl.mutableCopy(asag.c);
        }
        anvf.addAll(list, asag.c);
        return asaj;
    }
}
