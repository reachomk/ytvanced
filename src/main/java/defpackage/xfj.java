package defpackage;

import java.io.IOException;
import java.util.Collection;

/* renamed from: xfj */
public final class xfj extends xgt {
    private final String a;
    private final String b;
    private final Long c;
    private final Long d;
    private final Long e;
    private final Long f;
    private final Integer g;
    private final String h;
    private final IOException i = null;
    private final int j;
    private final Integer k;
    private final Integer l;
    private final Collection m;

    public final String a() {
        return this.a;
    }

    public final IOException i() {
        return null;
    }

    public final String b() {
        return this.b;
    }

    public final Long c() {
        return this.c;
    }

    public final Long d() {
        return this.d;
    }

    public final Long e() {
        return this.e;
    }

    public final Long f() {
        return this.f;
    }

    public final Integer g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final int j() {
        return this.j;
    }

    public final Integer k() {
        return this.k;
    }

    public final Integer l() {
        return this.l;
    }

    public final Collection m() {
        return this.m;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String str3 = this.h;
        int i = this.j;
        String valueOf6 = String.valueOf(this.k);
        String valueOf7 = String.valueOf(this.l);
        String valueOf8 = String.valueOf(this.m);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        int length5 = valueOf3.length();
        int length6 = valueOf4.length();
        int length7 = valueOf5.length();
        int length8 = String.valueOf(str3).length();
        String str4 = "null";
        int length9 = str4.length();
        int length10 = valueOf6.length();
        String str5 = valueOf8;
        StringBuilder stringBuilder = new StringBuilder((((((((((((length + 294) + length2) + length3) + length4) + length5) + length6) + length7) + length8) + length9) + length10) + valueOf7.length()) + valueOf8.length());
        stringBuilder.append("ExecutedHttpRequestInfo{url=");
        stringBuilder.append(str);
        stringBuilder.append(", responseContentType=");
        stringBuilder.append(str2);
        stringBuilder.append(", numberBytesDownloaded=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", numberBytesUploaded=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", timeToResponseHeadersMillis=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", timeToResponseCompletedMillis=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", negotiatedProtocol=");
        stringBuilder.append(str3);
        stringBuilder.append(", IOException=");
        stringBuilder.append(str4);
        stringBuilder.append(", requestStatus=");
        stringBuilder.append(i);
        stringBuilder.append(", requestFailedReason=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", quicDetailedErrorCode=");
        stringBuilder.append(valueOf7);
        stringBuilder.append(", annotations=");
        stringBuilder.append(str5);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgt) {
            xgt xgt = (xgt) obj;
            if (this.a.equals(xgt.a())) {
                String str = this.b;
                if (str == null ? xgt.b() != null : !str.equals(xgt.b())) {
                    Long l = this.c;
                    if (l == null ? xgt.c() != null : !l.equals(xgt.c())) {
                        l = this.d;
                        if (l == null ? xgt.d() != null : !l.equals(xgt.d())) {
                            l = this.e;
                            if (l == null ? xgt.e() != null : !l.equals(xgt.e())) {
                                l = this.f;
                                if (l == null ? xgt.f() != null : !l.equals(xgt.f())) {
                                    Integer num = this.g;
                                    if (num == null ? xgt.g() != null : !num.equals(xgt.g())) {
                                        str = this.h;
                                        if (str == null ? xgt.h() != null : !str.equals(xgt.h())) {
                                            if (xgt.i() == null && this.j == xgt.j()) {
                                                num = this.k;
                                                if (num == null ? xgt.k() != null : !num.equals(xgt.k())) {
                                                    num = this.l;
                                                    if (num == null ? xgt.l() != null : !num.equals(xgt.l())) {
                                                        Collection collection = this.m;
                                                        if (collection == null ? xgt.m() == null : collection.equals(xgt.m())) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        String str = this.b;
        int i = 0;
        hashCode = (hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003;
        Long l = this.c;
        hashCode = (hashCode ^ (l != null ? l.hashCode() : 0)) * 1000003;
        l = this.d;
        hashCode = (hashCode ^ (l != null ? l.hashCode() : 0)) * 1000003;
        l = this.e;
        hashCode = (hashCode ^ (l != null ? l.hashCode() : 0)) * 1000003;
        l = this.f;
        hashCode = (hashCode ^ (l != null ? l.hashCode() : 0)) * 1000003;
        Integer num = this.g;
        hashCode = (hashCode ^ (num != null ? num.hashCode() : 0)) * 1000003;
        str = this.h;
        hashCode = (((hashCode ^ (str != null ? str.hashCode() : 0)) * -721379959) ^ this.j) * 1000003;
        num = this.k;
        hashCode = (hashCode ^ (num != null ? num.hashCode() : 0)) * 1000003;
        num = this.l;
        hashCode = (hashCode ^ (num != null ? num.hashCode() : 0)) * 1000003;
        Collection collection = this.m;
        if (collection != null) {
            i = collection.hashCode();
        }
        return hashCode ^ i;
    }

    public /* synthetic */ xfj(String str, String str2, Long l, Long l2, Long l3, Long l4, Integer num, String str3, int i, Integer num2, Integer num3, Collection collection) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = num;
        this.h = str3;
        this.j = i;
        this.k = num2;
        this.l = num3;
        this.m = collection;
    }
}
