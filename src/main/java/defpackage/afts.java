package defpackage;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: afts */
public final class afts implements aftu {
    private final SharedPreferences a;
    private final afpu b;

    public afts(SharedPreferences sharedPreferences, afpu afpu) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = afpu;
    }

    public final boolean b() {
        return true;
    }

    public final void a(Map map, afsl afsl) {
        Object k;
        if (afsl.l()) {
            k = afsl.k();
        } else if (this.b.g()) {
            k = this.a.getString("incognito_visitor_id", null);
        } else {
            k = this.a.getString("visitor_id", null);
        }
        if (k != null) {
            map.put("X-Goog-Visitor-Id", k);
        }
    }

    public final aulc a() {
        return aulc.VISITOR_ID;
    }
}
