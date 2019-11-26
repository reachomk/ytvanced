package defpackage;

/* renamed from: ohm */
final class ohm {
    public final ofy a;
    public final ohz b = new ohz();
    public ohx c;
    public ohi d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final oza i = new oza(1);
    public final oza j = new oza();

    public ohm(ofy ofy) {
        this.a = ofy;
    }

    public final void a(ohx ohx, ohi ohi) {
        this.c = (ohx) oxz.a((Object) ohx);
        this.d = (ohi) oxz.a((Object) ohi);
        this.a.a(ohx.f);
        a();
    }

    public final void a() {
        ohz ohz = this.b;
        ohz.e = 0;
        ohz.s = 0;
        ohz.m = false;
        ohz.r = false;
        ohz.o = null;
        this.e = 0;
        this.g = 0;
        this.f = 0;
        this.h = 0;
    }

    public final boolean b() {
        this.e++;
        int i = this.f + 1;
        this.f = i;
        int[] iArr = this.b.h;
        int i2 = this.g;
        if (i != iArr[i2]) {
            return true;
        }
        this.g = i2 + 1;
        this.f = 0;
        return false;
    }

    public final ohw c() {
        ohz ohz = this.b;
        int i = ohz.a.a;
        ohw ohw = ohz.o;
        if (ohw == null) {
            ohw = this.c.a(i);
        }
        return (ohw == null || !ohw.a) ? null : ohw;
    }
}
