package defpackage;

import java.util.ArrayList;

/* renamed from: vgc */
public final class vgc implements ajmy {
    private final xci a;

    public vgc(xci xci) {
        this.a = xci;
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
        xci xci = this.a;
        if (obj == null) {
            aihu = aihu.AD_MARKER;
        } else {
            aihu = aihu.LIVE_AD_MARKER;
        }
        xci.d(new aiht(aihu, arrayList));
    }
}
