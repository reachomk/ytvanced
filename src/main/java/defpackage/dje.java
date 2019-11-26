package defpackage;

/* renamed from: dje */
final class dje implements bcaa {
    private final /* synthetic */ djf a;

    dje(djf djf) {
        this.a = djf;
    }

    public final Object get() {
        djf djf = this.a;
        Object obj = djf.a;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = djf.a;
                if (obj2 instanceof baqe) {
                    obj2 = new akpi();
                    djf.a = bapx.a(djf.a, obj2);
                }
            }
            obj = obj2;
        }
        return (akpi) obj;
    }
}
