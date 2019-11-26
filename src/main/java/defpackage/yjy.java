package defpackage;

/* renamed from: yjy */
public final class yjy extends ykn {
    private final aygk a;
    private final String b;
    private final arml c;

    public final aygk a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final arml c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 66) + String.valueOf(str).length()) + valueOf2.length());
        stringBuilder.append("ChatReplyBoxAttachment{thumbnail=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", serializedShareEntity=");
        stringBuilder.append(str);
        stringBuilder.append(", title=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ykn) {
            ykn ykn = (ykn) obj;
            aygk aygk = this.a;
            if (aygk == null ? ykn.a() != null : !aygk.equals(ykn.a())) {
                String str = this.b;
                if (str == null ? ykn.b() != null : !str.equals(ykn.b())) {
                    arml arml = this.c;
                    if (arml == null ? ykn.c() == null : arml.equals(ykn.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        aygk aygk = this.a;
        int i = 0;
        int hashCode = ((aygk != null ? aygk.hashCode() : 0) ^ 1000003) * 1000003;
        String str = this.b;
        hashCode = (hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003;
        arml arml = this.c;
        if (arml != null) {
            i = arml.hashCode();
        }
        return hashCode ^ i;
    }

    public /* synthetic */ yjy(aygk aygk, String str, arml arml) {
        this.a = aygk;
        this.b = str;
        this.c = arml;
    }
}
