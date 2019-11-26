package defpackage;

/* renamed from: akjv */
final class akjv extends akko {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final akkp d;
    public final akks e;
    public final akkw f;

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final akkp d() {
        return this.d;
    }

    public final akks e() {
        return this.e;
    }

    public final akkw f() {
        return this.f;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        int i = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 155) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("ImageLoadOptions{shouldUpdateOnLayoutChange=");
        stringBuilder.append(z);
        stringBuilder.append(", shouldAnimate=");
        stringBuilder.append(z2);
        stringBuilder.append(", placeholderResId=");
        stringBuilder.append(i);
        stringBuilder.append(", preloadRendererFactory=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", loadListener=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", imageParams=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akko) {
            akko akko = (akko) obj;
            if (this.a == akko.a() && this.b == akko.b() && this.c == akko.c()) {
                akkp akkp = this.d;
                if (akkp == null ? akko.d() != null : !akkp.equals(akko.d())) {
                    akks akks = this.e;
                    if (akks == null ? akko.e() != null : !akks.equals(akko.e())) {
                        akkw akkw = this.f;
                        if (akkw == null ? akko.f() == null : akkw.equals(akko.f())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.b) {
            i = 1231;
        }
        i2 = (((i2 ^ i) * 1000003) ^ this.c) * 1000003;
        akkp akkp = this.d;
        int i3 = 0;
        i2 = (i2 ^ (akkp != null ? akkp.hashCode() : 0)) * 1000003;
        akks akks = this.e;
        i2 = (i2 ^ (akks != null ? akks.hashCode() : 0)) * 1000003;
        akkw akkw = this.f;
        if (akkw != null) {
            i3 = akkw.hashCode();
        }
        return i2 ^ i3;
    }

    public final akkn g() {
        return new akjy(this);
    }

    /* synthetic */ akjv(boolean z, boolean z2, int i, akkp akkp, akks akks, akkw akkw) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = akkp;
        this.e = akks;
        this.f = akkw;
    }
}
