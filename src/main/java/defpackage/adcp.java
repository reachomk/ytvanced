package defpackage;

/* renamed from: adcp */
final class adcp extends adda {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final boolean f;

    adcp(String str, String str2, int i, String str3, boolean z) {
        if (str != null) {
            this.b = str;
            this.c = str2;
            this.d = i;
            if (str3 != null) {
                this.e = str3;
                this.f = z;
                return;
            }
            throw new NullPointerException("Null wifiSsid");
        }
        throw new NullPointerException("Null name");
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        int i = this.d;
        String str3 = this.e;
        boolean z = this.f;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 89) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("PersistentDialDevice{name=");
        stringBuilder.append(str);
        stringBuilder.append(", macAddress=");
        stringBuilder.append(str2);
        stringBuilder.append(", timeout=");
        stringBuilder.append(i);
        stringBuilder.append(", wifiSsid=");
        stringBuilder.append(str3);
        stringBuilder.append(", wakeOnLan=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adda) {
            adda adda = (adda) obj;
            if (this.b.equals(adda.a())) {
                String str = this.c;
                if (str == null ? adda.b() == null : str.equals(adda.b())) {
                    return this.d == adda.c() && this.e.equals(adda.d()) && this.f == adda.e();
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        String str = this.c;
        return ((((((hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (!this.f ? 1237 : 1231);
    }
}
