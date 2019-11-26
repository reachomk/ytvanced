package defpackage;

import java.util.ArrayList;

/* renamed from: tyl */
final class tyl {
    public final ArrayList a = new ArrayList();

    private tyl() {
    }

    /* synthetic */ tyl(byte b) {
    }

    /* Access modifiers changed, original: final */
    public final tyl a(int i, tup tup, tup tup2) {
        if (!(tup == null || tup2 == null)) {
            tup = tup.a(tup2, tup);
            bcen bcen = (bcen) bceo.d.createBuilder();
            bced bced = (bced) bcee.d.createBuilder();
            long j = tup.a;
            bced.copyOnWrite();
            bcee bcee = (bcee) bced.instance;
            bcee.a |= 1;
            bcee.b = j / 1000;
            bced.a(tup.a());
            bcen.a(bced);
            bcen.a(i);
            this.a.add((bceo) ((anxl) bcen.build()));
        }
        return this;
    }
}
