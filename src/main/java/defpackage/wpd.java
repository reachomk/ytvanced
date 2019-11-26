package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: wpd */
final /* synthetic */ class wpd implements akyx {
    private final woy a;

    wpd(woy woy) {
        this.a = woy;
    }

    public final Map a() {
        woy woy = this.a;
        HashMap hashMap = new HashMap();
        aypv aypv = woy.j;
        hashMap.put("pause_subscription_resume_time_ms_key", Long.valueOf(((aypx) aypv.d.get(woy.k)).e));
        return hashMap;
    }
}
