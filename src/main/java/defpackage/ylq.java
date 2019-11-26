package defpackage;

/* renamed from: ylq */
final class ylq extends yma {
    private String a;
    private ymf b;
    private ylj c;
    private ymd d;
    private ymb e;
    private ylz f;

    ylq() {
    }

    public final yma a(String str) {
        this.a = str;
        return this;
    }

    public final yma a(ymf ymf) {
        this.b = ymf;
        return this;
    }

    public final yma a(ylj ylj) {
        this.c = ylj;
        return this;
    }

    public final yma a(ymd ymd) {
        this.d = ymd;
        return this;
    }

    public final yma a(ymb ymb) {
        this.e = ymb;
        return this;
    }

    public final yma a(ylz ylz) {
        this.f = ylz;
        return this;
    }

    public final ylx a() {
        return new yln(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    /* synthetic */ ylq(ylx ylx) {
        yln yln = (yln) ylx;
        this.a = yln.a;
        this.b = yln.b;
        this.c = yln.c;
        this.d = yln.d;
        this.e = yln.e;
        this.f = yln.f;
    }
}
