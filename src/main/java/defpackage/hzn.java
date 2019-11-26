package defpackage;

/* renamed from: hzn */
final class hzn extends hzy {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final int d;

    /* Access modifiers changed, original: final */
    public final String a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
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
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 95) + String.valueOf(str).length());
        stringBuilder.append("VideoStageEventContext{audioRouteType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", cpn=");
        stringBuilder.append(str);
        stringBuilder.append(", isOfflinePlayback=");
        stringBuilder.append(z);
        stringBuilder.append(", backgroundability=");
        stringBuilder.append(z2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hzy)) {
            return false;
        }
        hzy hzy = (hzy) obj;
        int i = this.d;
        int d = hzy.d();
        if (i != 0) {
            return i == d && this.a.equals(hzy.a()) && this.b == hzy.b() && this.c == hzy.c();
        } else {
            throw null;
        }
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            int i2 = 1237;
            i = (((((i ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003;
            if (this.c) {
                i2 = 1231;
            }
            return i ^ i2;
        }
        throw null;
    }

    hzn(int i, String str, boolean z, boolean z2) {
        this.d = i;
        if (str != null) {
            this.a = str;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null cpn");
    }

    /* Access modifiers changed, original: final */
    public final int d() {
        return this.d;
    }
}
