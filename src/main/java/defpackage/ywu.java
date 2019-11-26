package defpackage;

/* renamed from: ywu */
public final class ywu extends yya {
    private final String a;
    private final aygk b;
    private final boolean c;

    public final String a() {
        return this.a;
    }

    public final aygk b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 63) + valueOf.length());
        stringBuilder.append("ChatTypingStatusEntry{contactEntityKey=");
        stringBuilder.append(str);
        stringBuilder.append(", avatar=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", active=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yya) {
            yya yya = (yya) obj;
            return this.a.equals(yya.a()) && this.b.equals(yya.b()) && this.c == yya.c();
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (!this.c ? 1237 : 1231);
    }

    public /* synthetic */ ywu(String str, aygk aygk, boolean z) {
        this.a = str;
        this.b = aygk;
        this.c = z;
    }
}
