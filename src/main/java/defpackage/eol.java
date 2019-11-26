package defpackage;

/* renamed from: eol */
final class eol implements cmq {
    private final boolean a;

    eol(boolean z) {
        this.a = z;
    }

    public final void a(crh crh) {
        eoi eoi = (eoi) crh;
        cri cri = new cri();
        cri.a = Boolean.valueOf(eoi.c);
        boolean z = this.a;
        if (((Boolean) cri.a).booleanValue() != z) {
            cri.a = Boolean.valueOf(z);
        }
        eoi.c = ((Boolean) cri.a).booleanValue();
    }
}
