package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
import java.util.Map;

/* renamed from: wqb */
public final class wqb implements aaap {
    private final ablj a;
    private final Activity b;
    private final wox c = new wox();
    private final wqd d;

    public wqb(ablj ablj, Activity activity, wqd wqd) {
        this.a = ablj;
        this.b = activity;
        this.d = wqd;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxp anxp = apxu;
        this.c.show(this.b.getFragmentManager(), wox.a);
        abma b = this.a.b();
        anxr access$000 = anxl.checkIsLite(YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.ypcCompleteTransactionEndpoint);
        anxp.a(access$000);
        Object b2 = anxp.h.b(access$000.d);
        if (b2 == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b2);
        }
        YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint = (YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint) obj;
        b.t = aali.b(ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.b);
        b.a(anxp.b);
        ablj ablj = this.a;
        wqd wqd = this.d;
        Map map2 = map;
        wqt wqt = (wqt) xsb.a(map2, (Object) "YpcCompleteTransactionCallback", wqt.class);
        ablj.a(b, new wqa((acum) wqd.a((acum) wqd.a.get(), 1), (xoi) wqd.a((xoi) wqd.b.get(), 2), (wqq) wqd.a((wqq) wqd.c.get(), 3), wqd.d, (acvx) wqd.a((acvx) wqd.e.get(), 5), (Activity) wqd.a(this.b, 6), (wox) wqd.a(this.c, 7), (YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint) wqd.a(ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, 8), wqt));
    }
}
