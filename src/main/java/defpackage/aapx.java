package defpackage;

import com.google.protos.youtube.api.innertube.ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction;
import java.util.Map;

/* renamed from: aapx */
public final class aapx implements aaap {
    private final bapu a;

    public aapx(bapu bapu) {
        this.a = bapu;
    }

    public final void a(apxu apxu, Map map) {
        aapl aapl = (aapl) this.a.get();
        anxr access$000 = anxl.checkIsLite(ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.clearPersistentCacheAction);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        String str = ((ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction) b).b;
        if (aapl.a()) {
            aapl.b.execute(new aapk(aapl, str));
        } else {
            xtl.d("Couldn't remove entry due to uninitialized disk cache");
        }
    }
}
