package defpackage;

/* renamed from: agqh */
public final class agqh implements agqj {
    public final agqi a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    private final int f;

    public agqh(agqi agqi, int i, int i2, int i3, int i4, boolean z) {
        this.a = (agqi) amqw.a((Object) agqi);
        this.f = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public final String a() {
        return this.a.a;
    }

    public final boolean b() {
        return this.a.f;
    }

    public final int c() {
        return this.a.e;
    }

    public final int d() {
        return this.a.e - this.f;
    }

    public final boolean e() {
        return !b() && this.f == 0;
    }

    public final int f() {
        return this.c;
    }
}
