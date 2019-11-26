package defpackage;

import java.io.Serializable;

/* renamed from: amqp */
public abstract class amqp implements Serializable {
    public static final long serialVersionUID = 0;

    public static amqp b(Object obj) {
        return new amra(amqw.a(obj));
    }

    public abstract amqp a(amqd amqd);

    public abstract amqp a(amqp amqp);

    public abstract Object a(amro amro);

    public abstract Object a(Object obj);

    public abstract boolean a();

    public abstract Object b();

    public abstract Object c();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public static amqp c(Object obj) {
        if (obj != null) {
            return new amra(obj);
        }
        return ampo.a;
    }

    amqp() {
    }
}
