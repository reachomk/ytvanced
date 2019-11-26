package defpackage;

/* renamed from: aebs */
final class aebs extends aeby {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final aebu f;
    public final aafv g;
    public final airi h;
    public final int i;
    public final aebw j;
    public final int k;

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final aebu f() {
        return this.f;
    }

    public final aafv g() {
        return this.g;
    }

    public final airi h() {
        return this.h;
    }

    public final int i() {
        return this.i;
    }

    public final aebw j() {
        return this.j;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String a = airg.a(this.k);
        String valueOf3 = String.valueOf(this.h);
        int i4 = this.i;
        String valueOf4 = String.valueOf(this.j);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        int length5 = String.valueOf(a).length();
        StringBuilder stringBuilder = new StringBuilder(((((((length + 246) + length2) + length3) + length4) + length5) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("MdxWatchState{playbackState=");
        stringBuilder.append(i);
        stringBuilder.append(", videoTitle=");
        stringBuilder.append(str);
        stringBuilder.append(", screenName=");
        stringBuilder.append(str2);
        stringBuilder.append(", totalVideosInQueue=");
        stringBuilder.append(i2);
        stringBuilder.append(", currentVideoIndexInQueue=");
        stringBuilder.append(i3);
        stringBuilder.append(", mdxAdState=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", watchNextResponse=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", sequencerStage=");
        stringBuilder.append(a);
        stringBuilder.append(", videoStage=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", mdxConnectionState=");
        stringBuilder.append(i4);
        stringBuilder.append(", autonavState=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeby) {
            aeby aeby = (aeby) obj;
            if (this.a == aeby.a()) {
                String str = this.b;
                if (str == null ? aeby.b() != null : !str.equals(aeby.b())) {
                    str = this.c;
                    if (str == null ? aeby.c() != null : !str.equals(aeby.c())) {
                        if (this.d == aeby.d() && this.e == aeby.e() && this.f.equals(aeby.f())) {
                            aafv aafv = this.g;
                            if (aafv == null ? aeby.g() == null : aafv.equals(aeby.g())) {
                                int i = this.k;
                                int l = aeby.l();
                                if (i != 0) {
                                    return i == l && this.h.equals(aeby.h()) && this.i == aeby.i() && this.j.equals(aeby.j());
                                } else {
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        i = (i ^ (str != null ? str.hashCode() : 0)) * 1000003;
        str = this.c;
        i = (((((((i ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003;
        aafv aafv = this.g;
        if (aafv != null) {
            i2 = aafv.hashCode();
        }
        i = (i ^ i2) * 1000003;
        int i3 = this.k;
        if (i3 != 0) {
            return ((((((i ^ i3) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode();
        }
        throw null;
    }

    public final aebx k() {
        return new aebr(this);
    }

    public final int l() {
        return this.k;
    }

    /* synthetic */ aebs(int i, String str, String str2, int i2, int i3, aebu aebu, aafv aafv, int i4, airi airi, int i5, aebw aebw) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = aebu;
        this.g = aafv;
        this.k = i4;
        this.h = airi;
        this.i = i5;
        this.j = aebw;
    }
}
