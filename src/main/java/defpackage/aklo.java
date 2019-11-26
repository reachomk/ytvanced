package defpackage;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: aklo */
public final class aklo implements tph {
    private final bapu a;

    public aklo(bapu bapu) {
        this.a = bapu;
    }

    public final bckw a(String str, int i, Map map, bckz bckz) {
        bckw b = ((bciz) this.a.get()).a(str, bckz, aniv.a).e().b(i);
        for (Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (!("Accept-Encoding".equalsIgnoreCase(str2) || "User-Agent".equalsIgnoreCase(str2))) {
                b.b((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return b;
    }
}
