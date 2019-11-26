package defpackage;

import com.google.android.apps.youtube.app.settings.developer.DebugForceInnertubeCapabilitiesActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jcj */
public final class jcj implements jcl {
    private final /* synthetic */ DebugForceInnertubeCapabilitiesActivity a;

    public jcj(DebugForceInnertubeCapabilitiesActivity debugForceInnertubeCapabilitiesActivity) {
        this.a = debugForceInnertubeCapabilitiesActivity;
    }

    public final void a(jcm jcm) {
        for (jcq jcq : jcm.b) {
            if (jcq.d) {
                this.a.a(jcm, jcq);
            }
        }
        this.a.o.remove(jcm);
        this.a.n.notifyDataSetChanged();
    }

    public final void a(jcm jcm, jcq jcq) {
        if (jcm.e && jcq.d) {
            jcu jcu = this.a.l;
            String str = jcm.d;
            String str2 = jcq.c;
            boolean z = jcq.b;
            String str3 = "debugForceInnertubeCapabilityForcedCapabilities";
            Map a = jcu.a(jcu.b.getString(str3, ""));
            Map map = (Map) a.get(str);
            if (map == null) {
                map = new HashMap();
                a.put(str, map);
            }
            map.put(str2, Boolean.valueOf(z));
            jcu.a(str3, jcu.a(a));
        }
    }

    public final void b(jcm jcm, jcq jcq) {
        if (jcm.e && jcq.d) {
            this.a.a(jcm, jcq);
        }
    }
}
