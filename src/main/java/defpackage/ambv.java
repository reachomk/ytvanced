package defpackage;

/* renamed from: ambv */
public final class ambv {
    public final amea a;
    public final amea b;

    public ambv(amea amea, amea amea2) {
        this.a = amea;
        this.b = amea2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ambv) {
            ambv ambv = (ambv) obj;
            if (amqq.a(this.a, ambv.a) && amqq.a(this.b, ambv.b)) {
                return true;
            }
        }
        return false;
    }
}
