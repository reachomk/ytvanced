package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
import java.util.List;
import java.util.Map;

/* renamed from: yap */
public final class yap implements aaap {
    private final Context a;
    private final aarh b;
    private final zzf c;

    public yap(Context context, aarh aarh, zzf zzf) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aarh) amqw.a((Object) aarh);
        this.c = (zzf) amqw.a((Object) zzf);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        yar yar = (yar) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", yar.class);
        List a = alpq.a(xuz.a(this.a.getPackageManager()), this.c.i());
        aarh aarh = this.b;
        anxr access$000 = anxl.checkIsLite(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        aarh.a(((PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint) obj).b, a, new yas(yar, apxu, a), true);
    }
}
