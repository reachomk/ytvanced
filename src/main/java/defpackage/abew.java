package defpackage;

import java.util.ArrayList;

/* renamed from: abew */
public final class abew extends aaml {
    public final avlh a = ((avlh) avli.g.createBuilder());
    public final ArrayList b = new ArrayList();
    private avla c = avla.c;

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = true;
        if ((((avli) this.a.instance).a & 1) == 0) {
            z = false;
        }
        amqw.b(z);
    }

    public final /* synthetic */ anzd c() {
        xak.b();
        aszd aszd = (aszd) asze.d.createBuilder();
        avlb avlb = (avlb) ((anxo) this.c.toBuilder());
        avlh avlh = this.a;
        avlh.copyOnWrite();
        ((avli) avlh.instance).f = anxl.emptyProtobufList();
        ArrayList arrayList = this.b;
        avlh.copyOnWrite();
        avli avli = (avli) avlh.instance;
        if (!avli.f.a()) {
            avli.f = anxl.mutableCopy(avli.f);
        }
        anvf.addAll(arrayList, avli.f);
        avlb.copyOnWrite();
        avla avla = (avla) avlb.instance;
        avla.b = (anxl) avlh.build();
        avla.a = 1;
        this.c = (avla) ((anxl) avlb.build());
        avla avla2 = this.c;
        aszd.copyOnWrite();
        asze asze = (asze) aszd.instance;
        if (avla2 != null) {
            asze.c = avla2;
            asze.a |= 2;
            return aszd;
        }
        throw new NullPointerException();
    }

    public /* synthetic */ abew(aamd aamd, afpt afpt) {
        super("notification_registration/set_registration", aamd, afpt);
        g();
    }
}
