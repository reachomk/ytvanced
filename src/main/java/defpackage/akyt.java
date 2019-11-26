package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* renamed from: akyt */
public final class akyt implements akyv {
    private final aaas a;
    private final Map b;

    private akyt(aaas aaas, Map map) {
        this.a = aaas;
        this.b = map;
    }

    public static void a(nn nnVar, auvn auvn, aaas aaas, Map map) {
        akyt akyt = new akyt(aaas, map);
        akys akys = new akys();
        if (auvn != null) {
            Bundle bundle = new Bundle();
            aobp.a(bundle, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", (anze) auvn);
            akys.f(bundle);
        }
        akys.w();
        akys.Z = akyt;
        akys.a(nnVar.f(), null);
    }

    public final void a(auvj auvj) {
        if (abmk.d(auvj) != null) {
            this.a.a(abmk.d(auvj), a());
        } else if (abmk.c(auvj) != null) {
            this.a.a(abmk.c(auvj), a());
        }
    }

    private final Map a() {
        HashMap hashMap = new HashMap();
        Map map = this.b;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(acwi.b, Boolean.TRUE);
        return hashMap;
    }
}
