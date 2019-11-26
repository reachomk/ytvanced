package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kat */
final /* synthetic */ class kat implements OnClickListener {
    private final kaq a;
    private final allb b;
    private final aaas c;

    kat(kaq kaq, allb allb, aaas aaas) {
        this.a = kaq;
        this.b = allb;
        this.c = aaas;
    }

    public final void onClick(View view) {
        kaq kaq = this.a;
        allb allb = this.b;
        aaas aaas = this.c;
        jif jif = kaq.c;
        if (jif != null) {
            jif.a(kaq, kaq.b);
        }
        byte[] bArr = kaq.f;
        if (bArr != null) {
            kaq.g.a(3, new acvs(bArr), null);
        }
        if (kaq.d != null) {
            Map hashMap = new HashMap();
            hashMap.put("permission_requester", allb);
            hashMap.put("interaction_logger_override", kaq.g);
            aaas.a(kaq.d, hashMap);
        }
        if (kaq.e != null) {
            Map hashMap2 = new HashMap();
            hashMap2.put("com.google.android.libraries.youtube.rendering.presenter.PresentContext", kaq.a);
            apxu apxu = kaq.e;
            anxr access$000 = anxl.checkIsLite(SignInEndpointOuterClass.signInEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                hashMap2.put("FromTopBarMenu", Boolean.valueOf(true));
            }
            aaas.a(kaq.e, hashMap2);
        }
    }
}
