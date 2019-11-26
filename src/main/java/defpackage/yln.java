package defpackage;

/* renamed from: yln */
final class yln extends ylx {
    public final String a;
    public final ymf b;
    public final ylj c;
    public final ymd d;
    public final ymb e;
    public final ylz f;

    public final String a() {
        return this.a;
    }

    public final ymf b() {
        return this.b;
    }

    public final ylj c() {
        return this.c;
    }

    public final ymd d() {
        return this.d;
    }

    public final ymb e() {
        return this.e;
    }

    public final ylz f() {
        return this.f;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 198) + length2) + length3) + length4) + valueOf4.length()) + valueOf5.length());
        stringBuilder.append("ChatActionBarConfig{title=");
        stringBuilder.append(str);
        stringBuilder.append(", viewParticipantsActionBarItemConfig=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", addParticipantsActionBarItemConfig=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", removeChatActionBarItemConfig=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", muteChatActionBarItemConfig=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", editChatNameActionBarItemConfig=");
        stringBuilder.append(valueOf5);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ylx) {
            ylx ylx = (ylx) obj;
            String str = this.a;
            if (str == null ? ylx.a() != null : !str.equals(ylx.a())) {
                ymf ymf = this.b;
                if (ymf == null ? ylx.b() != null : !ymf.equals(ylx.b())) {
                    ylj ylj = this.c;
                    if (ylj == null ? ylx.c() != null : !ylj.equals(ylx.c())) {
                        ymd ymd = this.d;
                        if (ymd == null ? ylx.d() != null : !ymd.equals(ylx.d())) {
                            ymb ymb = this.e;
                            if (ymb == null ? ylx.e() != null : !ymb.equals(ylx.e())) {
                                ylz ylz = this.f;
                                if (ylz == null ? ylx.f() == null : ylz.equals(ylx.f())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) ^ 1000003) * 1000003;
        ymf ymf = this.b;
        hashCode = (hashCode ^ (ymf != null ? ymf.hashCode() : 0)) * 1000003;
        ylj ylj = this.c;
        hashCode = (hashCode ^ (ylj != null ? ylj.hashCode() : 0)) * 1000003;
        ymd ymd = this.d;
        hashCode = (hashCode ^ (ymd != null ? ymd.hashCode() : 0)) * 1000003;
        ymb ymb = this.e;
        hashCode = (hashCode ^ (ymb != null ? ymb.hashCode() : 0)) * 1000003;
        ylz ylz = this.f;
        if (ylz != null) {
            i = ylz.hashCode();
        }
        return hashCode ^ i;
    }

    public final yma g() {
        return new ylq(this);
    }

    /* synthetic */ yln(String str, ymf ymf, ylj ylj, ymd ymd, ymb ymb, ylz ylz) {
        this.a = str;
        this.b = ymf;
        this.c = ylj;
        this.d = ymd;
        this.e = ymb;
        this.f = ylz;
    }
}
