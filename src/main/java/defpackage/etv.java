package defpackage;

/* renamed from: etv */
public final class etv extends euc {
    public final String a;
    public final long b;
    public final boolean c;
    private final String d;
    private final int e;
    private final long f;

    public etv(String str, String str2, int i, long j, long j2, boolean z) {
        this.a = str;
        this.d = str2;
        this.e = i;
        this.f = j;
        this.b = j2;
        this.c = z;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public final long d() {
        return this.f;
    }

    public final long e() {
        return this.b;
    }

    public final boolean f() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.d;
        int i = this.e;
        long j = this.f;
        long j2 = this.b;
        boolean z = this.c;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 167) + String.valueOf(str2).length());
        stringBuilder.append("RestoreContextInfo{videoId=");
        stringBuilder.append(str);
        stringBuilder.append(", playlistId=");
        stringBuilder.append(str2);
        stringBuilder.append(", playlistIndex=");
        stringBuilder.append(i);
        stringBuilder.append(", videoStartTime=");
        stringBuilder.append(j);
        stringBuilder.append(", lastCrashTimestamp=");
        stringBuilder.append(j2);
        stringBuilder.append(", lastTimeShown=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euc) {
            euc euc = (euc) obj;
            String str = this.a;
            if (str == null ? euc.a() != null : !str.equals(euc.a())) {
                str = this.d;
                if (str == null ? euc.b() == null : str.equals(euc.b())) {
                    return this.e == euc.c() && this.f == euc.d() && this.b == euc.e() && this.c == euc.f();
                }
            }
        }
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) ^ 1000003) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = this.e;
        long j = this.f;
        long j2 = this.b;
        return ((((((((hashCode ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ (!this.c ? 1237 : 1231);
    }
}
