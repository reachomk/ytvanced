package defpackage;

import java.util.List;

/* renamed from: akni */
public class akni implements aknz {
    public final int a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public akni(int i, List list, int i2, int i3, int i4, int i5, int i6) {
        amqw.a(i > 0);
        this.a = i;
        this.b = (List) amqw.a((Object) list);
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public final Object a(int i) {
        return (i < 0 || i >= this.b.size()) ? null : this.b.get(i);
    }

    public static aknl a() {
        return new aknl();
    }
}
