package defpackage;

import java.io.Serializable;

/* renamed from: amqb */
final class amqb extends amqa implements Serializable {
    public static final long serialVersionUID = 0;
    private final amqa a;

    amqb(amqa amqa) {
        this.a = amqa;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object b(Object obj) {
        throw new AssertionError();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object c(Object obj) {
        throw new AssertionError();
    }

    /* Access modifiers changed, original: final */
    public final Object d(Object obj) {
        return this.a.e(obj);
    }

    /* Access modifiers changed, original: final */
    public final Object e(Object obj) {
        return this.a.d(obj);
    }

    public final amqa a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amqb)) {
            return false;
        }
        return this.a.equals(((amqb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 10);
        stringBuilder.append(valueOf);
        stringBuilder.append(".reverse()");
        return stringBuilder.toString();
    }
}
