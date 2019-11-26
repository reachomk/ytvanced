package defpackage;

/* renamed from: skf */
final class skf extends skh {
    private final amqp a;
    private final amqp b;
    private final amqp c;
    private final amqp d;
    private final amqp e;
    private final amqp f;

    public final amqp a() {
        return this.a;
    }

    public final amqp b() {
        return this.b;
    }

    public final amqp c() {
        return this.c;
    }

    public final amqp d() {
        return this.d;
    }

    public final amqp e() {
        return this.e;
    }

    public final amqp f() {
        return this.f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 100) + length2) + length3) + length4) + valueOf5.length()) + valueOf6.length());
        stringBuilder.append("CommandEventDataImpl{view=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", anchorView=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", touchLocation=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", customData=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", senderState=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", elementBuilder=");
        stringBuilder.append(valueOf6);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skh) {
            skh skh = (skh) obj;
            return this.a.equals(skh.a()) && this.b.equals(skh.b()) && this.c.equals(skh.c()) && this.d.equals(skh.d()) && this.e.equals(skh.e()) && this.f.equals(skh.f());
        }
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    /* synthetic */ skf(amqp amqp, amqp amqp2, amqp amqp3, amqp amqp4, amqp amqp5, amqp amqp6) {
        this.a = amqp;
        this.b = amqp2;
        this.c = amqp3;
        this.d = amqp4;
        this.e = amqp5;
        this.f = amqp6;
    }
}
