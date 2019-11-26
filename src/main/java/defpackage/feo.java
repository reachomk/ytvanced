package defpackage;

/* renamed from: feo */
final class feo extends fez {
    private final CharSequence a;
    private final arwh b;
    private final amqp c;
    private final amqp d;
    private final amqp e;
    private final int f;
    private final int g;

    public final CharSequence a() {
        return this.a;
    }

    public final arwh b() {
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

    public final String toString() {
        Object obj;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.f;
        Object obj2 = "null";
        if (i == 0) {
            obj = obj2;
        } else if (i == 0) {
            throw null;
        } else if (i != 0) {
            obj = Integer.toString(i - 1);
        } else {
            throw null;
        }
        String valueOf3 = String.valueOf(obj);
        int i2 = this.g;
        if (i2 != 0) {
            if (i2 == 0) {
                throw null;
            } else if (i2 != 0) {
                obj2 = Integer.toString(i2 - 1);
            } else {
                throw null;
            }
        }
        String valueOf4 = String.valueOf(obj2);
        String valueOf5 = String.valueOf(this.c);
        String valueOf6 = String.valueOf(this.d);
        String valueOf7 = String.valueOf(this.e);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        int length5 = valueOf5.length();
        StringBuilder stringBuilder = new StringBuilder(((((((length + 114) + length2) + length3) + length4) + length5) + valueOf6.length()) + valueOf7.length());
        stringBuilder.append("ContentPillModel{text=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", iconType=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", position=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", behavior=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", onClickedCommand=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", transientUiCallback=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", actionListener=");
        stringBuilder.append(valueOf7);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fez) {
            fez fez = (fez) obj;
            if (this.a.equals(fez.a()) && this.b.equals(fez.b())) {
                int i = this.f;
                int f = fez.f();
                if (i == 0) {
                    throw null;
                } else if (i == f) {
                    i = this.g;
                    f = fez.g();
                    if (i != 0) {
                        return i == f && this.c.equals(fez.c()) && this.d.equals(fez.d()) && this.e.equals(fez.e());
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        int i = this.f;
        if (i != 0) {
            hashCode = (hashCode ^ i) * 1000003;
            i = this.g;
            if (i != 0) {
                return ((((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
            }
            throw null;
        }
        throw null;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    /* synthetic */ feo(CharSequence charSequence, arwh arwh, int i, int i2, amqp amqp, amqp amqp2, amqp amqp3) {
        this.a = charSequence;
        this.b = arwh;
        this.f = i;
        this.g = i2;
        this.c = amqp;
        this.d = amqp2;
        this.e = amqp3;
    }
}
