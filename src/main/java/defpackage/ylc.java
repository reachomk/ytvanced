package defpackage;

import java.util.List;

/* renamed from: ylc */
public final class ylc extends yli {
    private final String f;

    private final ykz c(aadw aadw) {
        String str = this.a;
        apsn b = this.b.b();
        apsh apsh = (apsh) ((anxo) this.b.getChatMessagePlaylistType().toBuilder());
        apsh.copyOnWrite();
        ((apse) apsh.instance).c = anxl.emptyProtobufList();
        List list = this.e;
        apsh.copyOnWrite();
        apse apse = (apse) apsh.instance;
        if (!apse.c.a()) {
            apse.c = anxl.mutableCopy(apse.c);
        }
        anvf.addAll(list, apse.c);
        apse apse2 = (apse) ((anxl) apsh.build());
        aprz aprz = b.a;
        aprz.copyOnWrite();
        aprw aprw = (aprw) aprz.instance;
        if (apse2 != null) {
            aprw.c = apse2;
            aprw.b = 9;
            return new ykz(str, (apsk) b.a(aadw), this.f, this.c, this.d);
        }
        throw new NullPointerException();
    }

    public final /* synthetic */ yie b(aadw aadw) {
        return c(aadw);
    }

    public final /* synthetic */ aadq a(aadw aadw) {
        return c(aadw);
    }

    /* synthetic */ ylc(ykz ykz, String str) {
        super(ykz.a, ykz.b() ? (apsk) ykz.getEntity() : null, ykz.b, ykz.c);
        this.f = str;
        if (ykz.b()) {
            this.e = ykz.getEmotions();
        }
    }
}
