package defpackage;

/* renamed from: kes */
public final class kes {
    public final amqp a;
    public final amqp b;
    public final amqp c;

    public kes() {
        this.a = ampo.a;
        this.b = ampo.a;
        this.c = ampo.a;
    }

    public kes(arbw arbw) {
        amqp amqp;
        amqp b;
        if (!arbw.b || (arbw.a & 8) == 0) {
            amqp = ampo.a;
        } else {
            amqp = amqp.b(Integer.valueOf((int) arbw.e));
        }
        this.a = amqp;
        if ((arbw.a & 4) != 0) {
            amqp = amqp.b(Float.valueOf(arbw.d));
        } else {
            amqp = ampo.a;
        }
        this.b = amqp;
        if ((arbw.a & 2) != 0) {
            b = amqp.b(Float.valueOf(arbw.c));
        } else {
            b = ampo.a;
        }
        this.c = b;
    }
}
