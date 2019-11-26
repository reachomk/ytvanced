package defpackage;

import java.util.Collection;

/* renamed from: aaui */
public final class aaui extends aamz {
    public aaui(aamd aamd, afpt afpt, Collection collection, Collection collection2) {
        atib atib = (atib) atic.e.createBuilder();
        if (collection2 != null) {
            atib.copyOnWrite();
            atic atic = (atic) atib.instance;
            if (!atic.d.a()) {
                atic.d = anxl.mutableCopy(atic.d);
            }
            anvf.addAll(collection2, atic.d);
        }
        if (collection != null) {
            atib.copyOnWrite();
            atic atic2 = (atic) atib.instance;
            if (!atic2.c.a()) {
                atic2.c = anxl.mutableCopy(atic2.c);
            }
            anvf.addAll(collection, atic2.c);
        }
        super(aamd, afpt, "social_sharing/sync", atib);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
