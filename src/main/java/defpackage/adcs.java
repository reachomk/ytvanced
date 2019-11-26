package defpackage;

/* renamed from: adcs */
final class adcs extends addh {
    private final String a;
    private final String b;
    private final String c;
    private final int d = 3;

    public final String a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final String b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final String c() {
        return this.c;
    }

    public final String toString() {
        Object obj;
        int i = this.d;
        if (i == 0) {
            obj = "null";
        } else if (i == 0) {
            throw null;
        } else if (i != 0) {
            obj = Integer.toString(i - 1);
        } else {
            throw null;
        }
        String valueOf = String.valueOf(obj);
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 73) + length2) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("MdxDeviceInfo{connectionType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(str);
        stringBuilder.append(", modelName=");
        stringBuilder.append(str2);
        stringBuilder.append(", deviceVersion=");
        stringBuilder.append(str3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof addh)) {
            return false;
        }
        addh addh = (addh) obj;
        int i = this.d;
        int d = addh.d();
        if (i != 0) {
            if (i == d) {
                String str = this.a;
                if (str == null ? addh.a() != null : !str.equals(addh.a())) {
                    str = this.b;
                    if (str == null ? addh.b() != null : !str.equals(addh.b())) {
                        str = this.c;
                        if (str == null ? addh.c() == null : str.equals(addh.c())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            i = (i ^ 1000003) * 1000003;
            String str = this.a;
            int i2 = 0;
            i = (i ^ (str != null ? str.hashCode() : 0)) * 1000003;
            str = this.b;
            i = (i ^ (str != null ? str.hashCode() : 0)) * 1000003;
            String str2 = this.c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return i ^ i2;
        }
        throw null;
    }

    adcs(int i, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final int d() {
        return this.d;
    }
}
