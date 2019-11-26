package defpackage;

/* renamed from: amqa */
public abstract class amqa implements amqd {
    private final boolean a = true;
    private transient amqa b;

    protected amqa() {
    }

    public abstract Object b(Object obj);

    public abstract Object c(Object obj);

    /* Access modifiers changed, original: 0000 */
    public Object d(Object obj) {
        if (this.a) {
            return obj != null ? amqw.a(b(obj)) : null;
        } else {
            return b(obj);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public Object e(Object obj) {
        if (this.a) {
            return obj != null ? amqw.a(c(obj)) : null;
        } else {
            return c(obj);
        }
    }

    public final Iterable a(Iterable iterable) {
        amqw.a((Object) iterable, (Object) "fromIterable");
        return new ampz(this, iterable);
    }

    public amqa a() {
        amqa amqa = this.b;
        if (amqa != null) {
            return amqa;
        }
        amqb amqb = new amqb(this);
        this.b = amqb;
        return amqb;
    }

    @Deprecated
    public final Object a(Object obj) {
        return d(obj);
    }
}
