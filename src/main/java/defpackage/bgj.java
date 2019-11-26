package defpackage;

import java.util.ArrayList;

/* renamed from: bgj */
final class bgj extends bhc {
    private final /* synthetic */ Object a;
    private final /* synthetic */ ArrayList b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ ArrayList d;
    private final /* synthetic */ Object e;
    private final /* synthetic */ ArrayList f;
    private final /* synthetic */ bge g;

    bgj(bge bge, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = bge;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    public final void d() {
        Object obj = this.a;
        if (obj != null) {
            this.g.b(obj, this.b, null);
        }
        obj = this.c;
        if (obj != null) {
            this.g.b(obj, this.d, null);
        }
        obj = this.e;
        if (obj != null) {
            this.g.b(obj, this.f, null);
        }
    }

    public final void a(bgx bgx) {
        bgx.b((bhd) this);
    }
}
