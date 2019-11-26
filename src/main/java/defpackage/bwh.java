package defpackage;

import java.util.List;

/* renamed from: bwh */
final class bwh {
    public final Object a;
    public List b;
    public bwh c;
    public bwh d;

    bwh() {
        this(null);
    }

    bwh(Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final Object a() {
        int b = b();
        return b > 0 ? this.b.remove(b - 1) : null;
    }

    public final int b() {
        List list = this.b;
        return list != null ? list.size() : 0;
    }
}
