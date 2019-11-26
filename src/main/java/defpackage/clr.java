package defpackage;

import java.util.ArrayList;

/* renamed from: clr */
public final class clr extends cmc {
    public cls a;

    public final /* bridge */ /* synthetic */ clz d() {
        return this;
    }

    public final clr a(cma cma) {
        if (cma != null) {
            cls cls = this.a;
            if (cls.a == null) {
                cls.a = new ArrayList();
            }
            this.a.a.add(cma);
        }
        return this;
    }

    public final clr a(clz clz) {
        if (clz != null) {
            a(clz.c());
        }
        return this;
    }

    public final clr a() {
        this.a.f = true;
        return this;
    }

    /* renamed from: b */
    public final cls c() {
        cls cls = this.a;
        super.e();
        this.a = null;
        cls.g.a(this);
        return cls;
    }

    public final /* synthetic */ cmc b(cma cma) {
        a(cma);
        return this;
    }

    static /* synthetic */ void a(clr clr, cmg cmg, cls cls) {
        super.a(cmg, (cma) cls);
        clr.a = cls;
    }
}
