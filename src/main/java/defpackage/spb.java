package defpackage;

/* renamed from: spb */
final class spb implements cmq {
    spb() {
    }

    public final void a(crh crh) {
        spc spc = (spc) crh;
        cri cri = new cri();
        cri.a = spc.a;
        cri.a = Boolean.valueOf(((Boolean) cri.a).booleanValue() ^ 1);
        spc.a = (Boolean) cri.a;
    }
}
