package defpackage;

import java.util.List;

/* renamed from: ykb */
public final class ykb extends yli {
    private final String f;

    private final ykc c(aadw aadw) {
        String str = this.a;
        apsn b = this.b.b();
        aprv aprv = (aprv) ((anxo) this.b.getChatMessageChannelType().toBuilder());
        aprv.copyOnWrite();
        ((aprs) aprv.instance).c = anxl.emptyProtobufList();
        List list = this.e;
        aprv.copyOnWrite();
        aprs aprs = (aprs) aprv.instance;
        if (!aprs.c.a()) {
            aprs.c = anxl.mutableCopy(aprs.c);
        }
        anvf.addAll(list, aprs.c);
        aprs aprs2 = (aprs) ((anxl) aprv.build());
        aprz aprz = b.a;
        aprz.copyOnWrite();
        aprw aprw = (aprw) aprz.instance;
        if (aprs2 != null) {
            aprw.c = aprs2;
            aprw.b = 8;
            return new ykc(str, (apsk) b.a(aadw), this.f, this.c, this.d);
        }
        throw new NullPointerException();
    }

    public final /* synthetic */ yie b(aadw aadw) {
        return c(aadw);
    }

    public final /* synthetic */ aadq a(aadw aadw) {
        return c(aadw);
    }

    /* synthetic */ ykb(ykc ykc, String str) {
        super(ykc.a, ykc.b() ? (apsk) ykc.getEntity() : null, ykc.b, ykc.c);
        this.f = str;
        if (ykc.b()) {
            this.e = ykc.getEmotions();
        }
    }
}
