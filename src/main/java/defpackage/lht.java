package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: lht */
public final class lht extends adnx {
    private final bcaa a;

    public lht(bcaa bcaa) {
        this.a = bcaa;
    }

    /* Access modifiers changed, original: protected|final */
    public final List a() {
        aikc aikc = (aikc) this.a.get();
        int a = aikc.a(0);
        if (a == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a; i++) {
            arrayList.add(((enm) aikc.a(0, i)).c());
        }
        return arrayList;
    }
}
