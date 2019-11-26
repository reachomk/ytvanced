package defpackage;

/* renamed from: afru */
public final class afru implements afsd {
    private final nkg a;

    public afru(nkg nkg) {
        this.a = (nkg) amqw.a((Object) nkg);
    }

    public final boolean a(aulc aulc) {
        for (Integer intValue : this.a.f) {
            if (intValue.intValue() == aulc.e) {
                return true;
            }
        }
        return false;
    }
}
