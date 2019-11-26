package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: mks */
final /* synthetic */ class mks implements bcvk {
    private final mkq a;

    mks(mkq mkq) {
        this.a = mkq;
    }

    public final void a(Object obj) {
        mkq mkq = this.a;
        int intValue = ((Integer) obj).intValue();
        mkq.a.e();
        mkq.a.a(intValue, TimeUnit.MINUTES);
        mkq.b.e();
    }
}
