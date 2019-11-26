package defpackage;

/* renamed from: szj */
final class szj extends szr {
    private final String a;
    private final Long b;
    private final Long c;
    private final Long d;
    private final Integer e;
    private final szt f;

    public final String a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    public final Long c() {
        return this.c;
    }

    public final Long d() {
        return this.d;
    }

    public final Integer e() {
        return this.e;
    }

    public final szt f() {
        return this.f;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 82) + length2) + length3) + length4) + valueOf4.length()) + valueOf5.length());
        stringBuilder.append("TimeSpan{name=");
        stringBuilder.append(str);
        stringBuilder.append(", startTimeUs=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", endTimeUs=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", spanLengthTimeUs=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", parentId=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", spanInfo=");
        stringBuilder.append(valueOf5);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof szr) {
            szr szr = (szr) obj;
            if (this.a.equals(szr.a())) {
                Long l = this.b;
                if (l == null ? szr.b() != null : !l.equals(szr.b())) {
                    l = this.c;
                    if (l == null ? szr.c() != null : !l.equals(szr.c())) {
                        l = this.d;
                        if (l == null ? szr.d() != null : !l.equals(szr.d())) {
                            Integer num = this.e;
                            if (num == null ? szr.e() != null : !num.equals(szr.e())) {
                                szt szt = this.f;
                                if (szt == null ? szr.f() == null : szt.equals(szr.f())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Long l = this.b;
        int i = 0;
        hashCode = (hashCode ^ (l != null ? l.hashCode() : 0)) * 1000003;
        l = this.c;
        hashCode = (hashCode ^ (l != null ? l.hashCode() : 0)) * 1000003;
        l = this.d;
        hashCode = (hashCode ^ (l != null ? l.hashCode() : 0)) * 1000003;
        Integer num = this.e;
        hashCode = (hashCode ^ (num != null ? num.hashCode() : 0)) * 1000003;
        szt szt = this.f;
        if (szt != null) {
            i = szt.hashCode();
        }
        return hashCode ^ i;
    }

    /* synthetic */ szj(String str, Long l, Long l2, Long l3, Integer num, szt szt) {
        this.a = str;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = num;
        this.f = szt;
    }
}
