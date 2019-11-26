package defpackage;

/* renamed from: ovu */
public final class ovu extends ovz {
    private final String a;
    private final owt b;
    private final int c = 8000;
    private final int d = 8000;

    public ovu(String str, owt owt) {
        this.a = oxz.a(str);
        this.b = owt;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ovx a(owg owg) {
        ovr ovr = new ovr(this.a, null, this.c, this.d, owg);
        owt owt = this.b;
        if (owt != null) {
            ovr.a(owt);
        }
        return ovr;
    }
}
