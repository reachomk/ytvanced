package defpackage;

/* renamed from: aafp */
public final class aafp {
    public final akbc a;
    private aafn b;

    public aafp(akbc akbc) {
        this.a = (akbc) amqw.a((Object) akbc);
    }

    public final aafn a() {
        akaz akaz = this.a.d;
        if (this.b == null && akaz != null) {
            akab akab = akaz.a;
            if (akab != null) {
                this.b = new aafn(akab);
            }
        }
        return this.b;
    }
}
