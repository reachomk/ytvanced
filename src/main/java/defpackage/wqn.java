package defpackage;

import com.google.protos.youtube.api.innertube.YpcUpdateFopEndpoint$YPCUpdateFopEndpoint;
import java.util.Map;

/* renamed from: wqn */
public final class wqn implements aaap, afsw {
    private final aaas a;
    private final abko b;
    private final xoi c;

    public wqn(aaas aaas, abko abko, xoi xoi) {
        this.b = abko;
        this.a = aaas;
        this.c = xoi;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.ypcUpdateFopEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        YpcUpdateFopEndpoint$YPCUpdateFopEndpoint ypcUpdateFopEndpoint$YPCUpdateFopEndpoint = (YpcUpdateFopEndpoint$YPCUpdateFopEndpoint) obj;
        abko abko = this.b;
        aaml abkt = new abkt(abko.c, abko.d.c());
        abkt.a = ypcUpdateFopEndpoint$YPCUpdateFopEndpoint.b;
        abkt.a(apxu.b);
        this.b.a.a(abkt, (afsw) this);
    }

    public final void a(bqn bqn) {
        xoi xoi = this.c;
        xoi.a(xoi.a((Throwable) bqn));
    }
}
