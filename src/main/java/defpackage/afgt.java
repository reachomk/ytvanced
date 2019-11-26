package defpackage;

/* renamed from: afgt */
public final class afgt {
    public static final afgq a = new afgq(2, 1);
    public final afgq b;
    public final afgq c;
    public final boolean d;
    public final String e;
    public final int f;
    public final int g;
    public final long h;

    public afgt(afgq afgq, String str) {
        this(afgq, a, false, str);
    }

    public afgt(afgq afgq, afgq afgq2, boolean z, String str) {
        this.b = (afgq) amqw.a((Object) afgq);
        this.c = (afgq) amqw.a((Object) afgq2);
        this.d = z;
        this.e = str;
        this.f = -1;
        this.g = -2;
        this.h = -1;
    }

    public afgt(afgq afgq, afgq afgq2, String str, int i, int i2, long j) {
        this.b = (afgq) amqw.a((Object) afgq);
        this.c = (afgq) amqw.a((Object) afgq2);
        this.d = true;
        this.e = str;
        this.f = i;
        this.g = i2;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afgt) {
            afgt afgt = (afgt) obj;
            if (amqq.a(this.b, afgt.b) && amqq.a(this.c, afgt.c) && amqq.a(this.e, afgt.e) && this.d == afgt.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() + 5363) * 31) + this.c.hashCode()) * 31) + (!this.d ? 0 : 313);
    }
}
