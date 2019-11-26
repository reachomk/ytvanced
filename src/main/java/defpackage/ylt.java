package defpackage;

/* renamed from: ylt */
public final class ylt extends ymd {
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
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 70);
        stringBuilder.append("RemoveChatActionBarItemConfig{chatEntityKey=");
        stringBuilder.append(str);
        stringBuilder.append(", viewerIsChatOwner=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ymd) {
            ymd ymd = (ymd) obj;
            return this.a.equals(ymd.a()) && this.b == ymd.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231);
    }

    public /* synthetic */ ylt(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
