package defpackage;

/* renamed from: aete */
final class aete extends afsv {
    private final afsw a;

    aete(String str, afsw afsw) {
        super(1, str, (bqk) afsw);
        this.a = afsw;
    }

    public final boolean j() {
        return true;
    }

    public final bqi d() {
        return bqi.IMMEDIATE;
    }

    public final bqh a(bqd bqd) {
        try {
            return bqh.a(bqd.b, null);
        } catch (Exception e) {
            return bqh.a(new bqf(e));
        }
    }
}
