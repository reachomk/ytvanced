package defpackage;

import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: ahix */
public final class ahix extends acxv {
    private final airc f;
    private final ahis g;
    private final Map h;

    public ahix(int i, airc airc, boolean z, ahis ahis, Map map) {
        super("watch", i, z);
        this.f = (airc) amqw.a((Object) airc);
        this.g = (ahis) amqw.a((Object) ahis);
        this.h = (Map) amqw.a((Object) map);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(xbb xbb, Set set, Set set2) {
        super.a(xbb, set, set2);
        for (Entry entry : this.h.entrySet()) {
            a((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(xbb xbb) {
        boolean a = super.a(xbb);
        if (!a || xbb.getClass() == ahjq.class) {
            return a;
        }
        a("abandoned_watch");
        return true;
    }

    public final dik a() {
        a("vis", this.f.a());
        a("bwm", String.format(Locale.US, "%d:%.3f", new Object[]{Long.valueOf(this.g.a.get()), Float.valueOf(((float) this.g.b.get()) / 1000.0f)}));
        if (this.g.b() > 0) {
            a("cache_bytes", String.valueOf(this.g.b()));
        }
        return super.a();
    }
}
