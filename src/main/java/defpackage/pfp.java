package defpackage;

/* renamed from: pfp */
public final class pfp {
    public final /* synthetic */ pfq a;
    private final String b;

    public final String a() {
        return String.valueOf(this.b).concat(":start");
    }

    public final String b() {
        return String.valueOf(this.b).concat(":count");
    }

    public final String c() {
        return String.valueOf(this.b).concat(":value");
    }

    /* synthetic */ pfp(pfq pfq, String str, long j) {
        this.a = pfq;
        pzr.a(str);
        pzr.b(j > 0);
        this.b = str;
    }
}
