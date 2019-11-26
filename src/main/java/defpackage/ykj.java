package defpackage;

/* renamed from: ykj */
public final class ykj implements aacn {
    public final aadq a(aadq aadq, aadq aadq2, aadw aadw) {
        ykk ykk = (ykk) aadq;
        ykk ykk2 = (ykk) aadq2;
        apsy e = ((apsz) ykk2.getEntity()).e();
        e.a();
        amuv i = amuw.i();
        i.b(ykk.getMessageKeys());
        i.b(ykk2.getMessageKeys());
        amul e2 = i.a().e();
        aprf aprf = e.a;
        aprf.copyOnWrite();
        aprc aprc = (aprc) aprf.instance;
        aprc.a();
        anvf.addAll(e2, aprc.c);
        return ykk.a((apsz) e.a(aadw));
    }
}
