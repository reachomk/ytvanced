package defpackage;

/* renamed from: yjb */
final /* synthetic */ class yjb implements bbns {
    private final bbmo a;
    private final aadq b;

    yjb(bbmo bbmo, aadq aadq) {
        this.a = bbmo;
        this.b = aadq;
    }

    public final void a(Object obj, Object obj2) {
        bbmo bbmo = this.a;
        aadq aadq = this.b;
        aadu aadu = (aadu) obj;
        Throwable th = (Throwable) obj2;
        if (th == null) {
            bbmo.b_(aadz.f().a(aadq.a()).b(aadq).b(aadu).d());
        } else {
            bbmo.a(th);
        }
    }
}
