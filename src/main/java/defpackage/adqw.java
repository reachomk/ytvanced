package defpackage;

/* renamed from: adqw */
final class adqw extends adtl {
    private final long a;
    private final long b;
    private final String c;
    private final adtd d;
    private final String e;
    private final String f;
    private final int g;
    private final int h;

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final adtd d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String toString() {
        Object obj;
        int i = this.g;
        Object obj2 = "null";
        if (i == 0) {
            obj = obj2;
        } else {
            obj = aurr.c(i);
        }
        String valueOf = String.valueOf(obj);
        long j = this.a;
        long j2 = this.b;
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        String str3 = this.f;
        int i2 = this.h;
        if (i2 != 0) {
            if (i2 == 0) {
                throw null;
            } else if (i2 != 0) {
                obj2 = Integer.toString(i2 - 1);
            } else {
                throw null;
            }
        }
        String valueOf3 = String.valueOf(obj2);
        i2 = valueOf.length();
        int length = String.valueOf(str).length();
        int length2 = valueOf2.length();
        int length3 = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder((((((i2 + 189) + length) + length2) + length3) + String.valueOf(str3).length()) + valueOf3.length());
        stringBuilder.append("MdxSessionInfo{sessionType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", lastConnectedTimeMs=");
        stringBuilder.append(j);
        stringBuilder.append(", recoveryExpirationTimeMs=");
        stringBuilder.append(j2);
        stringBuilder.append(", ssid=");
        stringBuilder.append(str);
        stringBuilder.append(", dialSessionInfo=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", mediaRouteId=");
        stringBuilder.append(str2);
        stringBuilder.append(", screenName=");
        stringBuilder.append(str3);
        stringBuilder.append(", disconnectReason=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adtl)) {
            return false;
        }
        adtl adtl = (adtl) obj;
        int i = this.g;
        int g = adtl.g();
        if (i != 0) {
            if (i == g && this.a == adtl.a() && this.b == adtl.b()) {
                String str = this.c;
                if (str == null ? adtl.c() != null : !str.equals(adtl.c())) {
                    adtd adtd = this.d;
                    if (adtd == null ? adtl.d() == null : adtd.equals(adtl.d())) {
                        if (this.e.equals(adtl.e()) && this.f.equals(adtl.f())) {
                            i = this.h;
                            int h = adtl.h();
                            if (i == 0) {
                                throw null;
                            } else if (i == h) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int a = aurr.a(this.g);
        long j = this.a;
        long j2 = this.b;
        a = (((((a ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        String str = this.c;
        int i = 0;
        a = (a ^ (str != null ? str.hashCode() : 0)) * 1000003;
        adtd adtd = this.d;
        if (adtd != null) {
            i = adtd.hashCode();
        }
        a = (((((a ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        int i2 = this.h;
        if (i2 != 0) {
            return a ^ i2;
        }
        throw null;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    /* synthetic */ adqw(int i, long j, long j2, String str, adtd adtd, String str2, String str3, int i2) {
        this.g = i;
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = adtd;
        this.e = str2;
        this.f = str3;
        this.h = i2;
    }
}
