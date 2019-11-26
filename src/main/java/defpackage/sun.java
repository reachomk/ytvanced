package defpackage;

/* renamed from: sun */
public final class sun implements sya {
    private final sxz a;

    public sun(sxz sxz) {
        this.a = sxz;
    }

    public final aobz a() {
        return bdhy.a;
    }

    public final /* synthetic */ aoca a(aocf aocf) {
        try {
            byte[] a = this.a.a(((bdhy) aocf).b);
            return a != null ? (bdhv) aocf.mergeFrom(new bdhv(), a) : null;
        } catch (aocg e) {
            throw new sxf("Error parsing TemplateConfig", e);
        }
    }
}
