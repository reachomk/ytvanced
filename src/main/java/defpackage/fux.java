package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fux */
public final class fux extends wqs implements wpl {
    public final Activity a;
    public final xci b;
    public final xoi c;
    public final wph d;
    public final jos e;
    public final egp f;
    public final wqq g;
    public final Resources h;
    public final afpu i;
    public final afqe j;
    public final agwc k;
    public final xhv l;
    public final agvs m;
    public final hqj n;
    public final wnt o;
    public final eqw p;
    public final acwa q;
    public final akmx r;
    private final aaas u;

    public fux(Activity activity, wph wph, xoi xoi, xci xci, aaas aaas, egp egp, jos jos, wqq wqq, afpu afpu, afqe afqe, agwc agwc, xhv xhv, agvs agvs, hqj hqj, wnt wnt, eqw eqw, acwa acwa, ablj ablj, akmx akmx, aamj aamj) {
        wph wph2 = wph;
        egp egp2 = egp;
        jos jos2 = jos;
        super(wph, ablj, aamj);
        this.a = activity;
        this.h = activity.getResources();
        this.d = wph2;
        this.c = xoi;
        this.b = xci;
        this.u = aaas;
        this.f = egp2;
        this.e = jos2;
        this.g = wqq;
        this.i = afpu;
        this.j = afqe;
        this.k = agwc;
        this.l = xhv;
        this.m = agvs;
        this.n = hqj;
        this.o = wnt;
        this.p = eqw;
        this.q = acwa;
        this.r = akmx;
        egp2.a = new fva(this, egp, jos);
    }

    public final void a(apxu apxu, Map map) {
        this.e.d();
        this.f.h();
        this.f.c();
        super.a(apxu, map);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(apxu apxu, Map map) {
        if (map == null) {
            map = new HashMap();
        }
        Object obj = "OnYpcTransactionListener";
        apxu apxu2 = apxu;
        map.put(obj, new fuz(this, apxu2, (ahca) xsb.a(map, (Object) "VideoToSaveInfoContainerKey", ahca.class), (wpk) xsb.a(map, obj, wpk.class), this.u));
        super.b(apxu, map);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                if (!((YpcGetCartEndpoint$YPCGetCartEndpoint) obj).b.isEmpty()) {
                    this.b.d(new ecr());
                }
            }
        }
        super.a(apxu);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(atqe atqe, apxu apxu) {
        this.b.d(new ecu());
        super.a(atqe, apxu);
    }

    public final void a() {
        this.b.d(new ecv());
    }
}
