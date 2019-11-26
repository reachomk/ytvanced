package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
import java.util.Map;

/* renamed from: alho */
public final class alho implements aaap {
    public final xoi a;
    public final aaas b;
    public final akmx c;
    private final aarh d;
    private final Context e;
    private final afve f;

    public alho(aarh aarh, xoi xoi, aaas aaas, akmx akmx, Context context, afve afve) {
        this.d = (aarh) amqw.a((Object) aarh);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (akmx) amqw.a((Object) akmx);
        this.e = (Context) amqw.a((Object) context);
        this.f = (afve) amqw.a((Object) afve);
    }

    public final void a(apxu apxu, Map map) {
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        alht alht = c instanceof alht ? (alht) c : null;
        if (alht != null) {
            c = alht.a();
            if (c == null) {
                c = alht;
            }
            alht.c();
        }
        anxr access$000 = anxl.checkIsLite(EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.editConnectionStateEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint = (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint) b;
        this.b.a(editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.c, new alhq(true, c));
        this.d.a(editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.b, Boolean.valueOf(this.f.a(this.e)), new alhr(this, new alhq(false, c), alht));
    }
}
