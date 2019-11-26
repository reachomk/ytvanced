package defpackage;

/* renamed from: iqg */
final /* synthetic */ class iqg implements amqv {
    private final iqe a;

    iqg(iqe iqe) {
        this.a = iqe;
    }

    public final boolean a(Object obj) {
        ayhz ayhz = (ayhz) obj;
        aafk aafk = this.a.c;
        if (aafk == null) {
            return false;
        }
        ajzz ajzz = aafk.a;
        ayhz ayhz2 = null;
        if (ajzz != null) {
            atgp atgp = ajzz.f;
            if (atgp != null && atgp.a == 152873793) {
                ayhz2 = (ayhz) atgp.b;
            }
        }
        if (ayhz2 != null && ayhz2.c.equals(ayhz.c)) {
            return true;
        }
        return false;
    }
}
