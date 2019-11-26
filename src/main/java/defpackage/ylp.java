package defpackage;

/* renamed from: ylp */
public final class ylp extends ylz {
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
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 63) + String.valueOf(str2).length());
        stringBuilder.append("EditChatNameActionBarItemConfig{chatEntityKey=");
        stringBuilder.append(str);
        stringBuilder.append(", chatHeaderKey=");
        stringBuilder.append(str2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ylz) {
            ylz ylz = (ylz) obj;
            return this.a.equals(ylz.a()) && this.b.equals(ylz.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public /* synthetic */ ylp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
