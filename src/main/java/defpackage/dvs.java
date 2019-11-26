package defpackage;

/* renamed from: dvs */
public final class dvs extends lkt implements t, xcp {
    private final xci a;
    private final lky b;
    private final lky c;

    public dvs(xci xci, lky lky, lky lky2) {
        super(lky);
        this.a = xci;
        this.b = lky;
        this.c = lky2;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void B_() {
        this.a.a((Object) this);
    }

    public final void C_() {
        this.a.b(this);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{vpa.class};
        } else if (i == 0) {
            vpb vpb = ((vpa) obj).a;
            if (vpb == vpb.AD_VIDEO_PLAYING || vpb == vpb.AD_VIDEO_PLAY_REQUESTED) {
                a(this.c);
                return null;
            }
            a(this.b);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
