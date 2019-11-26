package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: abms */
public final class abms extends abnw {
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final List e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final boolean j;
    private final int k;
    private final Set l;
    private final int m;
    private final int n;
    private final String o;
    private final int p;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final List e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final int i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final int k() {
        return this.k;
    }

    public final Set l() {
        return this.l;
    }

    public final int m() {
        return this.m;
    }

    public final int n() {
        return this.n;
    }

    public final String o() {
        return this.o;
    }

    public final String toString() {
        Object obj;
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        int i2 = this.d;
        String valueOf = String.valueOf(this.e);
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = this.i;
        boolean z = this.j;
        int i7 = this.k;
        int i8 = this.p;
        if (i8 == 0) {
            obj = "null";
        } else if (i8 == 0) {
            throw null;
        } else if (i8 != 0) {
            obj = Integer.toString(i8 - 1);
        } else {
            throw null;
        }
        String valueOf2 = String.valueOf(obj);
        String valueOf3 = String.valueOf(this.l);
        int i9 = this.m;
        int i10 = this.n;
        String str3 = this.o;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = valueOf.length();
        int length4 = valueOf2.length();
        String str4 = str3;
        StringBuilder stringBuilder = new StringBuilder((((((length + 479) + length2) + length3) + length4) + valueOf3.length()) + String.valueOf(str3).length());
        stringBuilder.append("SearchboxStatsWrapper{clientName=");
        stringBuilder.append(str);
        stringBuilder.append(", originalQuery=");
        stringBuilder.append(str2);
        stringBuilder.append(", assistedQueryIndex=");
        stringBuilder.append(i);
        stringBuilder.append(", lastVisibleSuggestionIndex=");
        stringBuilder.append(i2);
        stringBuilder.append(", suggestions=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", experimentTriggered=");
        stringBuilder.append(i3);
        stringBuilder.append(", firstEditTimeMillis=");
        stringBuilder.append(i4);
        stringBuilder.append(", lastEditTimeMillis=");
        stringBuilder.append(i5);
        stringBuilder.append(", sessionDurationMillis=");
        stringBuilder.append(i6);
        stringBuilder.append(", zeroPrefixSuggestionsEnabled=");
        stringBuilder.append(z);
        stringBuilder.append(", numZeroPrefixSuggestionsShown=");
        stringBuilder.append(i7);
        stringBuilder.append(", searchMethod=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", inputMethods=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", maxRoundTripTimeMsec=");
        stringBuilder.append(i9);
        stringBuilder.append(", totalRoundTripTimeMsec=");
        stringBuilder.append(i10);
        stringBuilder.append(", compressedRoundTripHistogram=");
        stringBuilder.append(str4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abnw) {
            abnw abnw = (abnw) obj;
            if (this.a.equals(abnw.a())) {
                String str = this.b;
                if (str == null ? abnw.b() != null : !str.equals(abnw.b())) {
                    if (this.c == abnw.c() && this.d == abnw.d()) {
                        List list = this.e;
                        if (list == null ? abnw.e() != null : !list.equals(abnw.e())) {
                            if (this.f == abnw.f() && this.g == abnw.g() && this.h == abnw.h() && this.i == abnw.i() && this.j == abnw.j() && this.k == abnw.k()) {
                                int i = this.p;
                                int p = abnw.p();
                                if (i == 0) {
                                    throw null;
                                } else if (i == p && this.l.equals(abnw.l()) && this.m == abnw.m() && this.n == abnw.n()) {
                                    str = this.o;
                                    if (str == null ? abnw.o() == null : str.equals(abnw.o())) {
                                        return true;
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
        hashCode = (((((hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        List list = this.e;
        hashCode = (((((((((((((hashCode ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ (!this.j ? 1237 : 1231)) * 1000003) ^ this.k) * 1000003;
        int i2 = this.p;
        if (i2 != 0) {
            hashCode = (((((((hashCode ^ i2) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003;
            String str2 = this.o;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode ^ i;
        }
        throw null;
    }

    public final int p() {
        return this.p;
    }

    public /* synthetic */ abms(String str, String str2, int i, int i2, List list, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, Set set, int i9, int i10, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = list;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = z;
        this.k = i7;
        this.p = i8;
        this.l = set;
        this.m = i9;
        this.n = i10;
        this.o = str3;
    }
}
