package defpackage;

/* renamed from: koe */
final class koe extends kpd {
    private final String a;
    private final String b;
    private final int c;

    koe(String str, String str2, int i) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = i;
                return;
            }
            throw new NullPointerException("Null regionCode");
        }
        throw new NullPointerException("Null regionName");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 62) + String.valueOf(str2).length());
        stringBuilder.append("RegionEntry{regionName=");
        stringBuilder.append(str);
        stringBuilder.append(", regionCode=");
        stringBuilder.append(str2);
        stringBuilder.append(", callingCode=");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kpd) {
            kpd kpd = (kpd) obj;
            return this.a.equals(kpd.a()) && this.b.equals(kpd.b()) && this.c == kpd.c();
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }
}
