package defpackage;

/* renamed from: ajmt */
final /* synthetic */ class ajmt implements amqd {
    private final ajmu a;
    private final Class b;

    ajmt(ajmu ajmu, Class cls) {
        this.a = ajmu;
        this.b = cls;
    }

    public final Object a(Object obj) {
        ajmu ajmu = this.a;
        ajmp ajmp = (ajmp) obj;
        boolean isInstance = this.b.isInstance(ajmp);
        Object valueOf = Boolean.valueOf(false);
        if (!isInstance) {
            return valueOf;
        }
        if (!ajmu.a) {
            return Boolean.valueOf(true);
        }
        ajmu.b.add(ajmp);
        return valueOf;
    }
}
