package defpackage;

import android.content.Intent;
import com.google.protos.youtube.api.innertube.YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
import java.util.Map;

/* renamed from: wqf */
public final class wqf implements aaap {
    public final aaas a;
    private final wos b;

    public wqf(wos wos, aaas aaas) {
        this.b = wos;
        this.a = aaas;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.ypcFixInstrumentEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint = (YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint) b;
        wos wos = this.b;
        byte[] d = ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.f.d();
        byte[] d2 = ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.g.d();
        wos.h.add(new wqe(this, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint));
        tnw tnw = wos.f;
        wos.c.a();
        tnw = (tnw) ((tnw) tnw.a()).a(d).a(wos.d.a(wos.e.c()));
        wos.c.b();
        tnw = (tnw) tnw.a(1);
        tnt a = wos.b.a();
        a.a();
        Intent b2 = ((tnw) tnw.a(a)).b();
        wos.a(d2, 2);
        wos.a.a(b2, 1900, new wov(wos, d2));
    }
}
