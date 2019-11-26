package defpackage;

/* renamed from: amrp */
final class amrp implements amro {
    private volatile amro a;
    private volatile boolean b;
    private Object c;

    amrp(amro amro) {
        this.a = (amro) amqw.a((Object) amro);
    }

    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object obj = this.a.get();
                    this.c = obj;
                    this.b = true;
                    this.a = null;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        String valueOf;
        StringBuilder stringBuilder;
        Object obj = this.a;
        if (obj == null) {
            valueOf = String.valueOf(this.c);
            stringBuilder = new StringBuilder(valueOf.length() + 25);
            stringBuilder.append("<supplier that returned ");
            stringBuilder.append(valueOf);
            stringBuilder.append(">");
            obj = stringBuilder.toString();
        }
        valueOf = String.valueOf(obj);
        stringBuilder = new StringBuilder(valueOf.length() + 19);
        stringBuilder.append("Suppliers.memoize(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
