package defpackage;

import java.util.ArrayList;

/* renamed from: cqy */
public final class cqy extends cmc {
    private cqz a;

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final cqy a() {
        this.a.e = true;
        return this;
    }

    public final /* synthetic */ cmc b(cma cma) {
        if (cma != null) {
            cqz cqz = this.a;
            if (cqz.a == null) {
                cqz.a = new ArrayList();
            }
            this.a.a.add(cma);
        }
        return this;
    }

    public final /* synthetic */ cma c() {
        cqz cqz = this.a;
        super.e();
        this.a = null;
        cqz.f.a(this);
        return cqz;
    }

    static /* synthetic */ void a(cqy cqy, cmg cmg, cqz cqz) {
        super.a(cmg, (cma) cqz);
        cqy.a = cqz;
    }
}
