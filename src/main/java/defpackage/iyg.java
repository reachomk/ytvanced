package defpackage;

/* renamed from: iyg */
final class iyg extends batf {
    private final /* synthetic */ iyh b;

    public iyg(iyh iyh, barz barz) {
        this.b = iyh;
        super(barz);
    }

    public final void a(basc basc, baum baum) {
        baum baum2 = this.b.b;
        if (baum2 != null) {
            baum.a(baum2);
        }
        if (!amqu.a(this.b.c)) {
            baur baur = iyh.a;
            String valueOf = String.valueOf(this.b.c);
            String str = "Bearer ";
            baum.a(baur, valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
        this.a.a(basc, baum);
    }
}
