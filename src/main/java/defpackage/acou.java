package defpackage;

/* renamed from: acou */
final class acou implements aceh {
    private boolean a;
    private final /* synthetic */ acnc b;

    public final void a(Object obj) {
        if (obj instanceof auhk) {
            auhk auhk = (auhk) obj;
            String str = this.b.aH;
            auhk.copyOnWrite();
            auhl auhl = (auhl) auhk.instance;
            if (str != null) {
                auhl.a |= 4096;
                auhl.n = str;
                return;
            }
            throw new NullPointerException();
        } else if (obj instanceof auho) {
            auho auho = (auho) obj;
            int ordinal = this.b.ba.ordinal();
            if (ordinal == 0) {
                auho.a(2);
            } else if (ordinal == 1) {
                auho.a(3);
            } else if (ordinal == 2) {
                auho.a(4);
            }
            if (!this.a) {
                ordinal = this.b.bk;
                if (ordinal >= 0) {
                    auho.copyOnWrite();
                    auhp auhp = (auhp) auho.instance;
                    auhp.a = 2 | auhp.a;
                    auhp.c = ordinal;
                    this.a = true;
                }
            }
        }
    }

    /* synthetic */ acou(acnc acnc) {
        this.b = acnc;
    }
}
