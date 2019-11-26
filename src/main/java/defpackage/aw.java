package defpackage;

import java.util.List;

/* renamed from: aw */
final class aw implements y {
    private final Object a;
    private final p b = q.a.b(this.a.getClass());

    aw(Object obj) {
        this.a = obj;
    }

    public final void a(af afVar, aa aaVar) {
        p pVar = this.b;
        Object obj = this.a;
        p.a((List) pVar.a.get(aaVar), afVar, aaVar, obj);
        p.a((List) pVar.a.get(aa.ON_ANY), afVar, aaVar, obj);
    }
}
