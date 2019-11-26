package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: jje */
final class jje implements akww {
    private final Map a;

    jje() {
        this(null);
    }

    jje(akyd akyd) {
        this.a = new HashMap();
        if (akyd instanceof jjh) {
            this.a.putAll(((jjh) akyd).a());
        }
    }

    public final void a(Object obj, Object obj2) {
        amqw.a(obj, (Object) "keyModel cannot be null");
        amqw.a(obj2, (Object) "valueModel cannot be null");
        this.a.put(jje.b(obj), obj2);
    }

    public final amqp a(Object obj) {
        amqw.a(obj, (Object) "keyModel cannot be null");
        return amqp.c(this.a.remove(jje.b(obj)));
    }

    private static Object b(Object obj) {
        if (obj instanceof avls) {
            return new jjg(obj.getClass(), ((avls) obj).e.d(), (byte) 0);
        }
        if (obj instanceof ajwm) {
            return new jjg(obj.getClass(), ((ajwm) obj).h, (byte) 0);
        }
        return obj instanceof avkv ? new jjg(obj.getClass(), ((avkv) obj).f.d(), (byte) 0) : obj;
    }

    public final akyd E_() {
        return new jft(amur.a(this.a));
    }
}
