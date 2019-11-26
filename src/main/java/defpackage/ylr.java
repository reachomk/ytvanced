package defpackage;

/* renamed from: ylr */
public final class ylr extends ymb {
    private final String a;
    private final boolean b;

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 56);
        stringBuilder.append("MuteChatActionBarItemConfig{chatEntityKey=");
        stringBuilder.append(str);
        stringBuilder.append(", muted=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ymb) {
            ymb ymb = (ymb) obj;
            return this.a.equals(ymb.a()) && this.b == ymb.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231);
    }

    public /* synthetic */ ylr(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
