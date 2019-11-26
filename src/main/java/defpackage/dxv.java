package defpackage;

import com.google.protos.youtube.api.innertube.DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint;
import java.util.Map;

/* renamed from: dxv */
public final class dxv implements aaap {
    public final xoi a;
    public final aaas b;
    private final aaqn c;

    public dxv(aaqn aaqn, xoi xoi, aaas aaas) {
        this.c = (aaqn) amqw.a((Object) aaqn);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        aaqn aaqn = this.c;
        aaqm aaqm = new aaqm(aaqn.c, aaqn.d.c());
        anxr access$000 = anxl.checkIsLite(DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint.deleteChannelPostEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint deleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint = (DeleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint) obj;
        aaqm.a = deleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint.b;
        aaqm.a(apxu.b);
        aaqn aaqn2 = this.c;
        dxy dxy = new dxy(this, deleteChannelPostEndpointOuterClass$DeleteChannelPostEndpoint, map);
        if (aaqn2.g == null) {
            aaqn2.g = new aaqp(aaqn2.b, aaqn2.e);
        }
        aaqn2.g.b(aaqm, dxy);
    }
}
