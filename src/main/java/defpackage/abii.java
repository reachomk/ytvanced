package defpackage;

import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: abii */
public final class abii implements aaap {
    private final abim a;
    private final aaas b;
    private final xoi c;
    private final Executor d;

    public abii(abim abim, aaas aaas, xoi xoi, Executor executor) {
        this.a = (abim) amqw.a((Object) abim);
        this.b = aaas;
        this.c = xoi;
        this.d = executor;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        aaml a = this.a.a();
        a.a(aabc.a(apxu));
        anxr access$000 = anxl.checkIsLite(SetSettingEndpointOuterClass$SetSettingEndpoint.setSettingEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        a.a((SetSettingEndpointOuterClass$SetSettingEndpoint) obj);
        xan.a(this.a.a(a), this.d, new abil(this), new abik(this, map, apxu), ankh.a);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Map map, apxu apxu, athy athy) {
        if (this.b != null) {
            Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
            aaas aaas = this.b;
            anxr access$000 = anxl.checkIsLite(SetSettingEndpointOuterClass$SetSettingEndpoint.setSettingEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aaas.a(((SetSettingEndpointOuterClass$SetSettingEndpoint) b).e, c);
            this.b.a(athy.c, null);
        }
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Throwable th) {
        xoi xoi = this.c;
        if (xoi != null) {
            xoi.c(th);
        }
        xtl.b("Error requesting SetSetting", th);
    }
}
