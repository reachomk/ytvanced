package defpackage;

import java.util.Map;

/* renamed from: qpu */
public final class qpu extends qqa {
    public final /* synthetic */ qce a;
    private final /* synthetic */ Map b;
    private final /* synthetic */ qpr f;

    public qpu(qpr qpr, String str, Map map, qce qce) {
        this.f = qpr;
        this.b = map;
        this.a = qce;
        super(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(qcb qcb) {
        String a = qcb.a(this.b);
        qcb.a();
        this.f.b.post(new qpt(this, a));
        this.f.b.removeCallbacksAndMessages(this);
    }
}
