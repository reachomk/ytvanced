package defpackage;

import com.google.protos.youtube.api.innertube.InlineUnmuteEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;
import java.util.Map;

/* renamed from: mru */
public final class mru implements aaas {
    private final mre a;
    private final mrb b;

    public mru(mre mre, mrb mrb) {
        this.a = mre;
        this.b = mrb;
    }

    public final void a(List list, Object obj) {
        aaav.a((aaas) this, list, obj);
    }

    public final void a(List list, Map map) {
        aaav.a((aaas) this, list, map);
    }

    public final void a(apxu[] apxuArr, Object obj) {
        aaav.a((aaas) this, apxuArr, obj);
    }

    public final void a(apxu[] apxuArr, Map map) {
        aaav.a((aaas) this, apxuArr, map);
    }

    public final void a(apxu apxu, Map map) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                anxp anxp = ((aryz) b).b;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                long j = 0;
                if (map != null) {
                    obj = map.get("com.google.android.apps.youtube.embeddedplayer.service.endpoint.starttime");
                    if (obj != null && (obj instanceof Long)) {
                        j = ((Long) obj).longValue();
                    }
                }
                if (anxp != null) {
                    anxr access$0002 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                    anxp.a(access$0002);
                    if (anxp.h.a(access$0002.d)) {
                        access$0002 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                        anxp.a(access$0002);
                        Object b2 = anxp.h.b(access$0002.d);
                        if (b2 == null) {
                            obj = access$0002.b;
                        } else {
                            obj = access$0002.a(b2);
                        }
                        azjd azjd = (azjd) ((anxo) ((azje) obj).toBuilder());
                        azjd.a((float) j);
                        apxx apxx = (apxx) ((anxo) anxp.toBuilder());
                        apxx.a(WatchEndpointOuterClass.watchEndpoint, (azje) ((anxl) azjd.build()));
                        apxu = (apxu) ((anxl) apxx.build());
                        this.b.a(4);
                        mre mre = this.a;
                        aiqs a = aiqq.a();
                        a.a = apxu;
                        mre.a(a.b());
                    }
                }
            }
        }
    }
}
