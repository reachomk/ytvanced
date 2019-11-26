package defpackage;

/* renamed from: afwt */
final class afwt extends afwv {
    private final String a;
    private final boolean b;
    private final int c;
    private final int d;

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        int i = this.c;
        int i2 = this.d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 113);
        stringBuilder.append("BrowseTabNewContent{tabIdentifier=");
        stringBuilder.append(str);
        stringBuilder.append(", newContent=");
        stringBuilder.append(z);
        stringBuilder.append(", deliveryTimestamp=");
        stringBuilder.append(i);
        stringBuilder.append(", unseenItemCount=");
        stringBuilder.append(i2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afwv) {
            afwv afwv = (afwv) obj;
            String str = this.a;
            if (str == null ? afwv.a() != null : !str.equals(afwv.a())) {
                return this.b == afwv.b() && this.c == afwv.c() && this.d == afwv.d();
            }
        }
    }

    public final int hashCode() {
        String str = this.a;
        return (((((((str != null ? str.hashCode() : 0) ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    /* synthetic */ afwt(String str, boolean z, int i, int i2) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }
}
