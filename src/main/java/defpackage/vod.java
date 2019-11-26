package defpackage;

/* renamed from: vod */
public final class vod {
    public Object a;
    private final vdg b;

    public vod(vdg vdg) {
        this.b = (vdg) amqw.a((Object) vdg);
    }

    public final boolean a(Object obj) {
        if (this.b.d() && obj != null && obj == this.a) {
            return true;
        }
        return false;
    }

    public final void a(Object obj, aoqh aoqh) {
        if (obj != null && this.b.g().contains(Integer.valueOf(aoqh.e))) {
            this.a = obj;
        }
    }

    public final void b(Object obj) {
        if (obj != null && obj == this.a) {
            this.a = null;
        }
    }
}
