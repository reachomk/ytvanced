package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.CreateCommentEndpointOuterClass$CreateCommentEndpoint;
import java.util.Map;

/* renamed from: aauz */
public final class aauz implements aaap {
    private final aaun a;

    public aauz(aaun aaun) {
        this.a = (aaun) amqw.a((Object) aaun);
    }

    public final void a(apxu apxu, Map map) {
        aavd aavd = (aavd) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", aavd.class);
        if (TextUtils.isEmpty(aavd.a()) && TextUtils.isEmpty(aavd.c()) && TextUtils.isEmpty(aavd.e())) {
            aavd.a(null);
            return;
        }
        Object obj;
        aaun aaun = this.a;
        aava aava = new aava(aaun.c, aaun.d.c());
        anxr access$000 = anxl.checkIsLite(CreateCommentEndpointOuterClass$CreateCommentEndpoint.createCommentEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        aava.a = aali.b(((CreateCommentEndpointOuterClass$CreateCommentEndpoint) obj).b);
        aava.a(apxu.b);
        aava.b = aali.b(aavd.a());
        aava.c = aavd.b();
        aava.d = aavd.c();
        aava.e = aavd.d();
        aava.p = aavd.e();
        aava.q = aavd.f();
        aava.r = aavd.g();
        aaun aaun2 = this.a;
        aaun2.e.b(aaun2.a.a(aava, ajua.class, new aauu(new aauy(aavd)), aaur.a));
    }
}
