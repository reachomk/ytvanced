package defpackage;

/* renamed from: ylv */
public final class ylv extends ymf {
    private final String a;
    private final String b;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 71) + String.valueOf(str2).length());
        stringBuilder.append("ViewParticipantsActionBarItemConfig{chatEntityKey=");
        stringBuilder.append(str);
        stringBuilder.append(", chatBodyEntityKey=");
        stringBuilder.append(str2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ymf) {
            ymf ymf = (ymf) obj;
            return this.a.equals(ymf.a()) && this.b.equals(ymf.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public /* synthetic */ ylv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
