package defpackage;

/* renamed from: aada */
final class aada implements aadn {
    public String a;
    public aadq b;
    private String c;
    private int d;

    aada() {
    }

    public final aadn a(String str) {
        this.c = str;
        return this;
    }

    public final aadn a(aadq aadq) {
        this.b = aadq;
        return this;
    }

    public final aadq a() {
        return this.b;
    }

    public final aadk b() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" entityKey");
        }
        if (this.d == 0) {
            str = String.valueOf(str).concat(" type");
        }
        if (str.isEmpty()) {
            return new aadb(this.a, this.c, this.d, this.b);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    public final aadn a(int i) {
        if (i != 0) {
            this.d = i;
            return this;
        }
        throw new NullPointerException("Null type");
    }
}
