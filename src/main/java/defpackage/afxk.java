package defpackage;

/* renamed from: afxk */
final class afxk extends afxm {
    private final int a;
    private final String b;

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 45);
        stringBuilder.append("NotificationCommandData{id=");
        stringBuilder.append(i);
        stringBuilder.append(", tag=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afxm) {
            afxm afxm = (afxm) obj;
            return this.a == afxm.a() && this.b.equals(afxm.b());
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    /* synthetic */ afxk(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
