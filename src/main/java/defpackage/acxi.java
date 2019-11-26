package defpackage;

/* renamed from: acxi */
public final class acxi {
    private final xby a = new xby();

    public final boolean a(Object obj) {
        return this.a.containsKey(obj);
    }

    public final acwc b(Object obj) {
        return this.a.containsKey(obj) ? ((acxh) this.a.get(obj)).b : null;
    }

    public final void a(acvx acvx, Object obj, Object obj2) {
        amqw.a(a(obj));
        amqw.a(a(obj2));
        acvx.a(b(acvx, obj), b(acvx, obj2));
    }

    public final void a(acvx acvx, Object obj) {
        amqw.a(a(obj));
        acvx.b(b(acvx, obj), null);
    }

    public final azfa b(acvx acvx, Object obj) {
        amqw.a(obj);
        amqw.b(a(obj));
        int intValue = ((acxh) this.a.get(obj)).c.intValue();
        if (intValue != -1) {
            return acvx.a(c(obj), b(obj), intValue);
        }
        return acvx.a(c(obj), b(obj));
    }

    private final Object c(Object obj) {
        return ((acxh) this.a.get(obj)).a;
    }
}
