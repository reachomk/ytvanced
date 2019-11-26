package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import com.google.protos.youtube.api.innertube.AdFeedbackEndpointOuterClass$AdFeedbackEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dxd */
public final class dxd implements aaap {
    private final Activity a;
    private final aaas b;
    private final xci c;

    public dxd(Activity activity, aaas aaas, xci xci) {
        this.a = (Activity) amqw.a((Object) activity);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        arml arml;
        Context context = this.a;
        anxr access$000 = anxl.checkIsLite(AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aohq aohq = ((AdFeedbackEndpointOuterClass$AdFeedbackEndpoint) b).b;
        if (aohq == null) {
            aohq = aohq.c;
        }
        aohu aohu = aohq.b;
        if (aohu == null) {
            aohu = aohu.l;
        }
        aaas aaas = this.b;
        xci xci = this.c;
        String str = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        Object c = xsb.c(map, str);
        vuy vuy = new vuy(context, aohu, aaas, xci, c);
        Builder builder = new Builder(context);
        arml arml2 = null;
        if ((aohu.a & 1) != 0) {
            arml = aohu.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        builder.setTitle(ajqy.a(arml));
        if (aohu.g.size() > 0) {
            CharSequence[] charSequenceArr = new CharSequence[aohu.g.size()];
            for (int i = 0; i < aohu.g.size(); i++) {
                arml arml3;
                if ((((aohs) aohu.g.get(i)).a & 1) == 0) {
                    arml3 = null;
                } else {
                    arml3 = ((aohs) aohu.g.get(i)).b;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                }
                charSequenceArr[i] = ajqy.a(arml3);
            }
            builder.setSingleChoiceItems(charSequenceArr, -1, vuy);
        }
        if ((aohu.a & 4) != 0) {
            arml = aohu.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        builder.setNegativeButton(ajqy.a(arml), vuy);
        if ((aohu.a & 2) != 0) {
            arml2 = aohu.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        builder.setPositiveButton(ajqy.a(arml2), vuy);
        builder.setCancelable(false);
        if ((aohu.a & 64) != 0) {
            Map hashMap = new HashMap();
            hashMap.put(str, c);
            apxu = aohu.i;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
        vuy.a(builder.create());
        vuy.d();
        vuy.f.getButton(-1).setEnabled(false);
    }
}
