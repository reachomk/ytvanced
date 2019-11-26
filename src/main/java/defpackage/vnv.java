package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: vnv */
public final class vnv extends acxv {
    private final ahis f;
    private final airc g;
    private final Map h;

    public vnv(ahis ahis, int i, airc airc, boolean z, Map map) {
        super("video_to_ad", i, z);
        this.f = (ahis) amqw.a((Object) ahis);
        this.g = airc;
        this.h = (Map) amqw.a((Object) map);
    }

    public final dik a() {
        a("vis", this.g.a());
        a("mod_ad", "1");
        if (this.f.b() > 0) {
            a("cache_bytes", String.valueOf(this.f.b()));
        }
        return super.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(xbb xbb, Set set, Set set2) {
        super.a(xbb, set, set2);
        if (!this.h.isEmpty()) {
            for (Entry entry : this.h.entrySet()) {
                a((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(xbb xbb) {
        if (xbb.g.isEmpty() || !xbb.g.equals("ad_ba")) {
            return super.a(xbb);
        }
        super.c();
        return true;
    }
}
