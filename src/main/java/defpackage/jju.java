package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jju */
final /* synthetic */ class jju implements OnClickListener {
    private final jjv a;
    private final kjj b;
    private final avef c;
    private final aphg d;

    jju(jjv jjv, kjj kjj, avef avef, aphg aphg) {
        this.a = jjv;
        this.b = kjj;
        this.c = avef;
        this.d = aphg;
    }

    public final void onClick(View view) {
        jjv jjv = this.a;
        kjj kjj = this.b;
        avef avef = this.c;
        aphg aphg = this.d;
        jjv.g.dismiss();
        if (jjv.h.size() > 0) {
            Map map;
            ArrayList arrayList = new ArrayList();
            for (awxn awxn : jjv.h) {
                if (awxn != null) {
                    arrayList.add(awxn.b);
                }
            }
            if (arrayList.isEmpty()) {
                map = null;
            } else {
                map = new HashMap();
                map.put("feedback_token", arrayList);
            }
            if (map != null) {
                kjj.a(jjv.h);
                aaas aaas = jjv.c;
                apxx apxx = (apxx) apxu.d.createBuilder();
                arjp arjp = (arjp) arjq.g.createBuilder();
                if ((avef.a & 32) != 0) {
                    Object obj = avef.g;
                    if (obj == null) {
                        obj = apxu.d;
                    }
                    arjp.copyOnWrite();
                    arjq arjq = (arjq) arjp.instance;
                    if (obj != null) {
                        if (!arjq.c.a()) {
                            arjq.c = anxl.mutableCopy(arjq.c);
                        }
                        arjq.c.add(obj);
                    } else {
                        throw new NullPointerException();
                    }
                }
                apxx.a(FeedbackEndpointOuterClass.feedbackEndpoint, (arjq) ((anxl) arjp.build()));
                aaas.a((apxu) ((anxl) apxx.build()), map);
            }
            atta atta = (atta) attb.c.createBuilder();
            atta.copyOnWrite();
            attb attb = (attb) atta.instance;
            attb.a |= 1;
            attb.b = true;
            attb attb2 = (attb) ((anxl) atta.build());
            atss atss = (atss) atst.q.createBuilder();
            atss.copyOnWrite();
            atst atst = (atst) atss.instance;
            if (attb2 != null) {
                atst.o = attb2;
                atst.a |= 1073741824;
                atst atst2 = (atst) ((anxl) atss.build());
                for (byte[] bArr : jjv.f.values()) {
                    if (bArr != null) {
                        jjv.d.t().b(new acvs(bArr), atst2);
                    }
                }
                if ((aphg.a & 262144) != 0) {
                    jjv.d.t().a(3, new acvs(aphg.r), null);
                    return;
                }
                return;
            }
            throw new NullPointerException();
        }
    }
}
