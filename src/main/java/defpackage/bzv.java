package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bzv */
final class bzv implements bsv, bsy {
    private final List a;
    private final zy b;
    private int c = 0;
    private bre d;
    private bsy e;
    private List f;
    private boolean g;

    bzv(List list, zy zyVar) {
        this.b = zyVar;
        chw.a((Collection) list);
        this.a = list;
    }

    public final void a(bre bre, bsy bsy) {
        this.d = bre;
        this.e = bsy;
        this.f = (List) this.b.a();
        ((bsv) this.a.get(this.c)).a(bre, this);
        if (this.g) {
            b();
        }
    }

    public final void a() {
        List list = this.f;
        if (list != null) {
            this.b.a(list);
        }
        this.f = null;
        for (bsv a : this.a) {
            a.a();
        }
    }

    public final void b() {
        this.g = true;
        for (bsv b : this.a) {
            b.b();
        }
    }

    public final Class d() {
        return ((bsv) this.a.get(0)).d();
    }

    public final void a(Object obj) {
        if (obj != null) {
            this.e.a(obj);
        } else {
            e();
        }
    }

    public final void a(Exception exception) {
        ((List) chw.a(this.f)).add(exception);
        e();
    }

    private final void e() {
        if (!this.g) {
            if (this.c < this.a.size() - 1) {
                this.c++;
                a(this.d, this.e);
                return;
            }
            chw.a(this.f);
            this.e.a(new bvn("Fetch failed", new ArrayList(this.f)));
        }
    }

    public final int c() {
        return ((bsv) this.a.get(0)).c();
    }
}
