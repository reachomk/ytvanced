package defpackage;

import java.util.ArrayList;

/* renamed from: cua */
public final class cua extends cuc {
    private final ctw a;
    private final cvi b;

    public cua(ctw ctw, cvi cvi) {
        this.a = ctw;
        this.b = cvi;
    }

    public final void a(ArrayList arrayList) {
        arrayList.add(this.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(cty cty) {
        cvc cvc = new cvc(this.b);
        cur cur = new cur(cty.a(this.a.a));
        cur cur2 = new cur(this.a.b);
        a(cur, cvc, "initial");
        a(cur2, cvc, "end");
        a(cvc, cty.b(this.a.a));
    }
}
