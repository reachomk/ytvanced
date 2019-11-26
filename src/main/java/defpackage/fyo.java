package defpackage;

/* renamed from: fyo */
public final class fyo extends aktw {
    public final akpk a = new akpk();
    private final aoxf b;

    public fyo(aoxf aoxf) {
        amqw.a((Object) aoxf);
        this.b = aoxf;
        if ((this.b.a & 4) != 0) {
            this.a.clear();
            akpk akpk = this.a;
            anxp anxp = this.b.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(aoxh.a);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            akpk.add(new fys((aoxk) b));
        }
        this.a.a(new akwa(this));
    }

    public final aknh a() {
        return this.a;
    }

    public final void b() {
        this.a.clear();
        this.a.add(new fyq(this.b));
    }
}
