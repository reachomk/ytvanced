package defpackage;

/* renamed from: ycp */
public final class ycp {
    public final ajtu a;
    public ycy b;
    public boolean c = true;

    public ycp(ajtu ajtu, ycy ycy) {
        this.a = (ajtu) amqw.a((Object) ajtu);
        this.b = ycy;
    }

    public final void a() {
        this.c = false;
    }

    public static Object a(Object obj) {
        if (obj instanceof ycp) {
            return ((ycp) obj).a;
        }
        if (obj instanceof ycs) {
            obj = ((ycs) obj).a;
        }
        return obj;
    }
}
