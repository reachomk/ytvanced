package defpackage;

/* renamed from: vgn */
public final class vgn implements ajpc {
    private final String a;
    private final vsm b;
    private final /* synthetic */ vge c;

    public vgn(vge vge, String str, vsm vsm) {
        this.c = vge;
        this.a = (String) amqw.a((Object) str);
        this.b = (vsm) amqw.a((Object) vsm);
    }

    public final int b() {
        return 0;
    }

    public final void a(ajpa ajpa) {
        ((vgb) this.c.c.get()).a(true);
        vgd vgd = this.c.m;
        if (vgd != null) {
            String str = this.a;
            xak.a();
            vgd.h.put(str, ajpa);
        }
        ((vjr) this.c.a.get()).a(this.c.m.a, this.a, this.b);
    }

    public final void a() {
        vgd vgd = this.c.m;
        if (vgd != null) {
            vgd.h.remove(this.a);
        }
        ((vfw) this.c.g.get()).a();
        ((vjr) this.c.a.get()).a(this.a, this.b);
    }
}
