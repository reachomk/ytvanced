package defpackage;

/* renamed from: usn */
abstract class usn extends ust {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;

    usn(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = z;
                    this.e = z2;
                    if (str4 != null) {
                        this.f = str4;
                        return;
                    }
                    throw new NullPointerException("Null getDataSyncId");
                }
                throw new NullPointerException("Null getPageId");
            }
            throw new NullPointerException("Null getAccountName");
        }
        throw new NullPointerException("Null getId");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        String str4 = this.f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 103) + length2) + String.valueOf(str3).length()) + String.valueOf(str4).length());
        stringBuilder.append("AccountIdentity{getId=");
        stringBuilder.append(str);
        stringBuilder.append(", getAccountName=");
        stringBuilder.append(str2);
        stringBuilder.append(", getPageId=");
        stringBuilder.append(str3);
        stringBuilder.append(", wasUnicorn=");
        stringBuilder.append(z);
        stringBuilder.append(", isPersona=");
        stringBuilder.append(z2);
        stringBuilder.append(", getDataSyncId=");
        stringBuilder.append(str4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ust) {
            ust ust = (ust) obj;
            return this.a.equals(ust.a()) && this.b.equals(ust.b()) && this.c.equals(ust.c()) && this.d == ust.d() && this.e == ust.e() && this.f.equals(ust.f());
        }
    }
}
