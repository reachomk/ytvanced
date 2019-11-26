package defpackage;

/* renamed from: jpx */
final class jpx extends jqq {
    private final amqp a;
    private final amqp b;

    jpx(amqp amqp, amqp amqp2) {
        if (amqp != null) {
            this.a = amqp;
            if (amqp2 != null) {
                this.b = amqp2;
                return;
            }
            throw new NullPointerException("Null currentSelectedFilterIndex");
        }
        throw new NullPointerException("Null previouslySelectedFilterIndex");
    }

    /* Access modifiers changed, original: final */
    public final amqp a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final amqp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jqq) {
            jqq jqq = (jqq) obj;
            return this.a.equals(jqq.a()) && this.b.equals(jqq.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
