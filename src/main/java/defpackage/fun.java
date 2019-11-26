package defpackage;

import com.google.protos.youtube.api.innertube.VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint;
import java.util.Map;

/* renamed from: fun */
public final class fun implements aaap {
    public final xoi a;
    public final jnl b;
    private final aaxo c;

    public fun(aaxo aaxo, xoi xoi, jnl jnl) {
        this.c = (aaxo) amqw.a((Object) aaxo);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = jnl;
    }

    public final void a(apxu apxu, Map map) {
        aaxo aaxo = this.c;
        aaml aaxp = new aaxp(aaxo.c, aaxo.d.c());
        aaxp.a(aabc.a(apxu));
        anxr access$000 = anxl.checkIsLite(VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint.videoFlagDetailsFormEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aaxp.a = ((VideoFlagDetailsFormEndpointOuterClass$VideoFlagDetailsFormEndpoint) b).b;
        afsw afsw = (afsw) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", afsw.class);
        if (afsw == null) {
            afsw = new fuq(this);
        }
        this.c.a.a(aaxp, afsw);
    }
}
