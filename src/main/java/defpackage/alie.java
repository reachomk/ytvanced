package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToContactsEndpoint;
import java.util.Map;

/* renamed from: alie */
public final class alie implements aaap {
    public final xoi a;
    public final aaas b;
    public final acwa c;
    private final aarh d;
    private final Context e;
    private final afve f;

    public alie(aarh aarh, xoi xoi, aaas aaas, acwa acwa, Context context, afve afve) {
        this.d = (aarh) amqw.a((Object) aarh);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (acwa) amqw.a((Object) acwa);
        this.e = (Context) amqw.a((Object) context);
        this.f = (afve) amqw.a((Object) afve);
    }

    public final void a(apxu apxu, Map map) {
        alig alig = (alig) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", alig.class);
        if (alig != null) {
            alig.bG_();
        }
        anxr access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = (SendShareEndpoint$SendShareToContactsEndpoint) b;
        aarh aarh = this.d;
        asfa asfa = sendShareEndpoint$SendShareToContactsEndpoint.b;
        if (asfa == null) {
            asfa = asfa.f;
        }
        ases ases = sendShareEndpoint$SendShareToContactsEndpoint.c;
        if (ases == null) {
            ases = ases.c;
        }
        aarh.a(asfa, null, ases, null, Boolean.valueOf(this.f.a(this.e)), new alih(this, alig, map));
    }
}
