package defpackage;

import java.util.List;

/* renamed from: ajos */
final class ajos extends aaye {
    public List d;
    private String e;

    protected ajos(aamd aamd, afpt afpt) {
        super(aamd, afpt);
    }

    public final aaye c(String str) {
        this.a = str;
        this.e = str;
        return this;
    }

    public final atcb n() {
        atcb atcb = (atcb) atcc.f.createBuilder();
        atcb.a(this.e);
        List list = this.d;
        if (!(list == null || list.isEmpty())) {
            for (ajow ajow : this.d) {
                if (ajow != null) {
                    ajow.b();
                }
            }
        }
        return atcb;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.e);
        List list = this.d;
        if (list != null && !list.isEmpty()) {
            for (ajow ajow : this.d) {
                if (ajow != null) {
                    atcb atcb = (atcb) c();
                    ajow.a();
                }
            }
        }
    }

    public final /* synthetic */ anzd c() {
        return c();
    }
}
