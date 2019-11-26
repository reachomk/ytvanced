package defpackage;

/* renamed from: aclv */
final /* synthetic */ class aclv implements anij {
    private final aclq a;

    aclv(aclq aclq) {
        this.a = aclq;
    }

    public final anjv a() {
        aclq aclq = this.a;
        try {
            abzv abzv = aclq.ad;
            String str = aclq.am;
            xak.b();
            try {
                abzv.a(str).delete();
            } catch (SecurityException e) {
                xtl.a("Failed to delete thumbnail.", e);
            }
        } catch (Exception e2) {
            xtl.a("Failed to delete thumbnail due to exception.", e2);
        }
        return null;
    }
}
