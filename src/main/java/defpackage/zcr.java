package defpackage;

import android.animation.ValueAnimator;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.HashMap;
import java.util.List;

/* renamed from: zcr */
public final class zcr implements ybe {
    public final ycv a;
    private final aaas b;
    private ValueAnimator c;
    private zcv d;
    private akpk e;

    public zcr(aaas aaas) {
        Object ycv = new ycv();
        this.b = (aaas) amqw.a((Object) aaas);
        this.a = (ycv) amqw.a(ycv);
    }

    public final void a(zcv zcv, akpk akpk) {
        Object zcu = new zcu(zcv);
        this.e = (akpk) amqw.a((Object) akpk);
        this.d = (zcv) amqw.a((Object) zcv);
        this.c = (ValueAnimator) amqw.a(zcu);
    }

    public final void a(ycy ycy) {
        this.e.clear();
        this.d.a(null);
        List list = ycy.b;
        if (list == null || list.size() == 0) {
            this.d.a(0.0f);
            return;
        }
        this.e.addAll(ycy.b);
        this.d.a(ycy);
        if (ycy.d) {
            this.c.start();
        } else {
            this.d.a(1.0f);
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.reverse();
        }
    }

    public final void a(ycp ycp) {
        ajtu ajtu = ycp.a;
        aryi aryi = null;
        if (ajtu != null) {
            aqnp aqnp = ajtu.e;
            if (!(aqnp == null || (aqnp.a & 2) == 0)) {
                aryi = aqnp.c;
                if (aryi == null) {
                    aryi = aryi.o;
                }
            }
        }
        if (aryi != null) {
            anxp anxp = aryi.i;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                this.a.a.clear();
                aaas aaas = this.b;
                anxp anxp2 = aryi.i;
                if (anxp2 == null) {
                    anxp2 = apxu.d;
                }
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                anxp2.a(access$000);
                Object b = anxp2.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                List list = ((azje) b).i;
                Object hashMap = new HashMap();
                hashMap.put("RUNNABLE_LISTENER", this);
                aaas.a(list, hashMap);
            }
        }
    }
}
