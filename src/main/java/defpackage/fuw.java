package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
import java.util.Map;

/* renamed from: fuw */
public final class fuw extends wrr {
    private final nn a;
    private aaap b;
    private aaap c;

    public fuw(nn nnVar, wsa wsa, aaas aaas, acvx acvx) {
        super(nnVar, wsa, aaas, acvx);
        this.a = nnVar;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        aymo aymo = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) obj).b;
        if (aymo == null) {
            aymo = aymo.c;
        }
        int i = aymo.a;
        if (i == 127046814) {
            if (this.b == null) {
                this.b = new dya(this.a, fuv.a);
            }
            this.b.a(apxu, map);
        } else if (i == 127387931) {
            if (this.c == null) {
                this.c = new dya(this.a, fuy.a);
            }
            this.c.a(apxu, map);
        } else {
            super.a(apxu, map);
        }
    }

    static nd a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aymo aymo = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) b).b;
        if (aymo == null) {
            aymo = aymo.c;
        }
        if (aymo.a == 127046814) {
            b = (ayms) aymo.b;
        } else {
            b = ayms.k;
        }
        amqw.a(b);
        wsv wsv = new wsv();
        Bundle bundle = new Bundle();
        bundle.putByteArray("UnlimitedFamilyProfileInterstitialRenderer", b.toByteArray());
        wsv.f(bundle);
        return wsv;
    }

    static nd b(apxu apxu) {
        aymq aymq;
        anxr access$000 = anxl.checkIsLite(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aymo aymo = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) b).b;
        if (aymo == null) {
            aymo = aymo.c;
        }
        if (aymo.a == 127387931) {
            aymq = (aymq) aymo.b;
        } else {
            aymq = aymq.h;
        }
        return wsq.a(aymq);
    }
}
