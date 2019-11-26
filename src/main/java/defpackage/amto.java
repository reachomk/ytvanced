package defpackage;

/* renamed from: amto */
public abstract class amto implements Iterable {
    private final amqp a = ampo.a;

    protected amto() {
    }

    public static amto a(Iterable iterable, Iterable iterable2) {
        r1 = new Iterable[2];
        int i = 0;
        r1[0] = iterable;
        r1[1] = iterable2;
        while (i < 2) {
            amqw.a(r1[i]);
            i++;
        }
        return new amtn(r1);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        Object obj = 1;
        for (Object obj2 : (Iterable) this.a.a((Object) this)) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(obj2);
            obj2 = null;
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
