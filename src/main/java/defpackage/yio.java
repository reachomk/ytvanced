package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: yio */
public final class yio {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public int c;
    private final yir d;

    public yio(yir yir) {
        this.d = (yir) amqw.a((Object) yir);
    }

    public final void a(amul amul, yiq yiq, yjd yjd) {
        amqw.a((Object) amul);
        amqw.a((Object) yiq);
        this.b.clear();
        a();
        int size = amul.size();
        this.c = size;
        if (size != 0) {
            amxn amxn = (amxn) amul.listIterator();
            while (amxn.hasNext()) {
                String str = (String) amxn.next();
                this.a.put(str, this.d.a(str, new yin(this, str, amul, yiq), false, yjd));
            }
            return;
        }
        yiq.a(amul.g());
    }

    public final void a() {
        for (bbnc bbnc : this.a.values()) {
            if (!bbnc.c()) {
                bbnc.bK_();
            }
        }
        this.a.clear();
    }

    public final void a(amul amul, yiq yiq) {
        amuo amuo = new amuo();
        amxn amxn = (amxn) amul.listIterator();
        while (amxn.hasNext()) {
            aadq aadq = (aadq) this.b.get((String) amxn.next());
            if (aadq != null) {
                amuo.c(aadq);
            }
        }
        yiq.a(amuo.a());
    }
}
