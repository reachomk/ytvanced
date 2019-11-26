package defpackage;

/* renamed from: aadr */
final class aadr extends aady {
    private String a;
    private aadq b;
    private aadq c;
    private aadu d;
    private aadu e;

    aadr() {
    }

    public final aady a(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        throw new NullPointerException("Null entityKey");
    }

    public final aady a(aadq aadq) {
        this.b = aadq;
        return this;
    }

    public final aady b(aadq aadq) {
        this.c = aadq;
        return this;
    }

    public final aady a(aadu aadu) {
        if (aadu != null) {
            this.d = aadu;
            return this;
        }
        throw new NullPointerException("Null previousMetadata");
    }

    /* Access modifiers changed, original: final */
    public final amqp a() {
        aadu aadu = this.d;
        if (aadu != null) {
            return amqp.b(aadu);
        }
        return ampo.a;
    }

    public final aady b(aadu aadu) {
        if (aadu != null) {
            this.e = aadu;
            return this;
        }
        throw new NullPointerException("Null currentMetadata");
    }

    /* Access modifiers changed, original: final */
    public final amqp b() {
        aadu aadu = this.e;
        if (aadu != null) {
            return amqp.b(aadu);
        }
        return ampo.a;
    }

    /* Access modifiers changed, original: final */
    public final aadz c() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" entityKey");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" previousMetadata");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" currentMetadata");
        }
        if (str.isEmpty()) {
            return new aado(this.a, this.b, this.c, this.d, this.e);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
