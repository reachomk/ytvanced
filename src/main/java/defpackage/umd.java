package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: umd */
public final class umd implements ume {
    public String a;
    public long b;
    private final List c = new ArrayList();

    public final umd a(String str) {
        this.c.add(umi.a(str));
        return this;
    }

    public final /* synthetic */ cis a() {
        return new cje(this.a, this.b, this.c);
    }
}
