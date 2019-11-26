package defpackage;

import java.util.ArrayList;

/* renamed from: vfh */
public final class vfh implements ajmy {
    private final bcaa a;

    public vfh(bcaa bcaa) {
        this.a = bcaa;
    }

    public final void a(Iterable iterable) {
        aihu aihu;
        ArrayList arrayList = new ArrayList();
        Object obj = null;
        for (ajmp ajmp : iterable) {
            int ordinal = ajmp.k.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        obj = 1;
                    }
                }
                ajmp.f();
                arrayList.add(new aihs(ajmp.h(), ajmp.i()));
            } else {
                ajmp.f();
            }
        }
        xci xci = (xci) this.a.get();
        if (obj == null) {
            aihu = aihu.AD_MARKER;
        } else {
            aihu = aihu.LIVE_AD_MARKER;
        }
        xci.d(new aiht(aihu, arrayList));
    }
}
