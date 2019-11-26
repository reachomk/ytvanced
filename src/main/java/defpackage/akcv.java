package defpackage;

import java.util.List;

/* renamed from: akcv */
final class akcv extends aked {
    private Object a;
    private List b;

    akcv() {
    }

    public final aked a(Object obj) {
        this.a = obj;
        return this;
    }

    public final aked a(List list) {
        this.b = list;
        return this;
    }

    public final akee a() {
        return new akcw(this.a, this.b);
    }
}
