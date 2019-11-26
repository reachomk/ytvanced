package defpackage;

import java.util.List;

/* renamed from: ylk */
public final class ylk extends yli {
    private final String f;

    private final ylh c(aadw aadw) {
        String str = this.a;
        apsn b = this.b.b();
        apsl apsl = (apsl) ((anxo) this.b.getChatMessageVideoType().toBuilder());
        apsl.copyOnWrite();
        ((apsi) apsl.instance).e = anxl.emptyProtobufList();
        List list = this.e;
        apsl.copyOnWrite();
        apsi apsi = (apsi) apsl.instance;
        if (!apsi.e.a()) {
            apsi.e = anxl.mutableCopy(apsi.e);
        }
        anvf.addAll(list, apsi.e);
        b.a((apsi) ((anxl) apsl.build()));
        return new ylh(str, (apsk) b.a(aadw), this.f, this.c, this.d, (byte) 0);
    }

    public final /* synthetic */ yie b(aadw aadw) {
        return c(aadw);
    }

    public final /* synthetic */ aadq a(aadw aadw) {
        return c(aadw);
    }

    /* synthetic */ ylk(ylh ylh, String str) {
        super(ylh.a, ylh.b() ? (apsk) ylh.getEntity() : null, ylh.b, ylh.c);
        this.f = str;
        if (ylh.b()) {
            this.e = ylh.getEmotions();
        }
    }
}
