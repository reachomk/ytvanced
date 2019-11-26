package defpackage;

/* renamed from: affw */
public final class affw {
    public final aajs a;
    public final affa b;
    public final String c;
    public final aajj d;
    public final aeuy e;
    public final amro f;
    public final amro g;
    public final long h;

    public affw(aajs aajs, affa affa, String str, aajj aajj, aeuy aeuy, amro amro, amro amro2, long j) {
        this.a = aajs;
        this.b = affa;
        this.c = str;
        this.d = aajj;
        this.e = aeuy;
        this.f = amro;
        this.g = amro2;
        this.h = j;
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 19) + valueOf.length()) + valueOf2.length());
        stringBuilder.append("QueuedVideo(cpn=");
        stringBuilder.append(str);
        str = " ";
        stringBuilder.append(str);
        stringBuilder.append(valueOf);
        stringBuilder.append(str);
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
