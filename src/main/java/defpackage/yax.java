package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: yax */
public final class yax implements aaap {
    public final xoi a;
    public final aaas b;
    public final acwa c;
    public final amuw d;
    private final aarh e;
    private final Context f;
    private final afve g;

    public yax(aarh aarh, xoi xoi, aaas aaas, acwa acwa, Context context, afve afve, Set set) {
        this.e = aarh;
        this.a = xoi;
        this.b = aaas;
        this.c = acwa;
        this.f = context;
        this.g = afve;
        this.d = amuw.a((Collection) set);
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        algc algc = (algc) xsb.a(map, (Object) "SendShareToConversationListener", algc.class);
        if (algc != null) {
            algc.a();
        }
        amxo amxo = (amxo) this.d.iterator();
        while (amxo.hasNext()) {
            ((algc) amxo.next()).a();
        }
        anxr access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint = (SendShareEndpoint$SendShareToConversationEndpoint) obj;
        aarh aarh = this.e;
        asfa asfa = sendShareEndpoint$SendShareToConversationEndpoint.b;
        if (asfa == null) {
            asfa = asfa.f;
        }
        aseu aseu = sendShareEndpoint$SendShareToConversationEndpoint.c;
        if (aseu == null) {
            aseu = aseu.c;
        }
        aarh.a(asfa, null, null, aseu, Boolean.valueOf(this.g.a(this.f)), afsy.a(new yba(this, algc, map), new yaz(this, algc, apxu)));
    }
}
