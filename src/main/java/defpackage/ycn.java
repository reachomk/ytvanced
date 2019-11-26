package defpackage;

/* renamed from: ycn */
public final class ycn {
    public String a;
    public aqpp b;
    public long c;
    public boolean d;
    public boolean e;
    public aqpp f;

    public ycn() {
        this(null);
    }

    public ycn(yco yco) {
        if (yco == null) {
            this.c = -1;
            this.d = false;
            this.e = true;
            return;
        }
        this.a = yco.a;
        this.b = yco.b;
        this.c = yco.c;
        this.d = yco.d;
        this.e = yco.e;
        this.f = yco.f;
    }

    public final yco a() {
        return new yco(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
