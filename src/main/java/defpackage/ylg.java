package defpackage;

import java.util.List;

/* renamed from: ylg */
public final class ylg extends yli {
    private final yld c(aadw aadw) {
        String str = this.a;
        apsn b = this.b.b();
        apsj apsj = (apsj) ((anxo) this.b.getChatMessageTextType().toBuilder());
        apsj.copyOnWrite();
        ((apsg) apsj.instance).d = anxl.emptyProtobufList();
        List list = this.e;
        apsj.copyOnWrite();
        apsg apsg = (apsg) apsj.instance;
        if (!apsg.d.a()) {
            apsg.d = anxl.mutableCopy(apsg.d);
        }
        anvf.addAll(list, apsg.d);
        apsg apsg2 = (apsg) ((anxl) apsj.build());
        aprz aprz = b.a;
        aprz.copyOnWrite();
        aprw aprw = (aprw) aprz.instance;
        if (apsg2 != null) {
            aprw.c = apsg2;
            aprw.b = 5;
            return new yld(str, (apsk) b.a(aadw), this.c, this.d);
        }
        throw new NullPointerException();
    }

    public final /* synthetic */ yie b(aadw aadw) {
        return c(aadw);
    }

    public final /* synthetic */ aadq a(aadw aadw) {
        return c(aadw);
    }

    /* synthetic */ ylg(yld yld) {
        super(yld.a, yld.b() ? (apsk) yld.getEntity() : null, yld.b, yld.c);
        if (yld.b()) {
            this.e = yld.getEmotions();
        }
    }
}
