package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: afsi */
public final class afsi implements afsa {
    public afsi(Context context, afmo afmo) {
        amqw.a((Object) context);
        amqw.a((Object) afmo);
    }

    public final boolean b() {
        return true;
    }

    public final void a(Map map, afsl afsl) {
        amqw.b(xvt.c(afsl.D_()));
        afpt bm_ = afsl.bm_();
        if (bm_.g()) {
            map.put("X-Goog-PageId", bm_.c());
        }
    }

    public final aulc a() {
        return aulc.PLUS_PAGE_ID;
    }
}
