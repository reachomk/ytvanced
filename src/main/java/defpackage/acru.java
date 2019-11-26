package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupEventButtonRendererOuterClass;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: acru */
public final class acru {
    public final akpk a;
    public final Map b = new HashMap();
    public final akpd c;

    public acru(Context context, akkq akkq, akvp akvp, abzv abzv, aaas aaas, Executor executor, akpe akpe, acrt acrt) {
        amqw.a((Object) context);
        amqw.a((Object) akkq);
        amqw.a((Object) akvp);
        amqw.a((Object) abzv);
        amqw.a((Object) aaas);
        amqw.a((Object) executor);
        amqw.a((Object) akpe);
        amqw.a((Object) acrt);
        aknw aknw = new aknw();
        aknw.a(auyq.class, new acrr(context, akkq, akvp, abzv, aaas, executor, acrt));
        this.c = akpe.a(aknw);
        this.a = new akpk();
        this.c.a(this.a);
    }

    public final void a(List list) {
        this.a.clear();
        this.a.a();
        for (axak axak : list) {
            Object obj;
            anxr access$000 = anxl.checkIsLite(MobileBroadcastSetupEventButtonRendererOuterClass.mobileBroadcastSetupEventButtonRenderer);
            axak.a(access$000);
            Object b = axak.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            auyq auyq = (auyq) obj;
            anxr access$0002 = anxl.checkIsLite(MobileBroadcastSetupEventButtonRendererOuterClass.mobileBroadcastSetupEventButtonRenderer);
            axak.a(access$0002);
            if (axak.h.a(access$0002.d)) {
                this.a.add(auyq);
            }
            anxp anxp = auyq.g;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$0002);
            if (anxp.h.a(access$0002.d)) {
                anxp = auyq.g;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                anxp.a(access$0002);
                Object b2 = anxp.h.b(access$0002.d);
                if (b2 == null) {
                    b2 = access$0002.b;
                } else {
                    b2 = access$0002.a(b2);
                }
                aphg aphg = (aphg) b2;
                anxp anxp2 = aphg.l;
                if (anxp2 == null) {
                    anxp2 = apxu.d;
                }
                anxr access$0003 = anxl.checkIsLite(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint);
                anxp2.a(access$0003);
                if (anxp2.h.a(access$0003.d)) {
                    anxp = aphg.l;
                    if (anxp == null) {
                        anxp = apxu.d;
                    }
                    access$0002 = anxl.checkIsLite(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint);
                    anxp.a(access$0002);
                    b2 = anxp.h.b(access$0002.d);
                    if (b2 == null) {
                        b2 = access$0002.b;
                    } else {
                        b2 = access$0002.a(b2);
                    }
                    DeleteVideoEndpointOuterClass$DeleteVideoEndpoint deleteVideoEndpointOuterClass$DeleteVideoEndpoint = (DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) b2;
                    if ((deleteVideoEndpointOuterClass$DeleteVideoEndpoint.a & 1) != 0) {
                        this.b.put(deleteVideoEndpointOuterClass$DeleteVideoEndpoint.b, auyq);
                    }
                }
            }
        }
    }
}
