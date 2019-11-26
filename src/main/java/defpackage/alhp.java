package defpackage;

import com.google.protos.youtube.api.innertube.DataSyncActionOuterClass$DataSyncAction;
import java.util.Map;

/* renamed from: alhp */
public final class alhp implements aaap {
    private final bcaa a;

    public alhp(bcaa bcaa) {
        this.a = (bcaa) amqw.a((Object) bcaa);
    }

    public final void a(apxu apxu, Map map) {
        zdr zdr = (zdr) this.a.get();
        anxr access$000 = anxl.checkIsLite(DataSyncActionOuterClass$DataSyncAction.dataSyncAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aqss aqss = ((DataSyncActionOuterClass$DataSyncAction) b).b;
        if (aqss == null) {
            aqss = aqss.d;
        }
        zdr.a(aqss);
    }
}
