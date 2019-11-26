package defpackage;

/* renamed from: aalj */
final class aalj extends aalv {
    private Long a;
    private String b;
    private Integer c;
    private Integer d;
    private amul e;

    aalj() {
    }

    public final aalv a(Long l) {
        this.a = l;
        return this;
    }

    public final aalv a(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        throw new NullPointerException("Null rpcName");
    }

    public final aalv a(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final aalv b(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final aalv a(amul amul) {
        if (amul != null) {
            this.e = amul;
            return this;
        }
        throw new NullPointerException("Null networkHealthAnnotations");
    }

    public final aals a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" parsingTimeMillis");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" rpcName");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" responseProtoByteSize");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" retryCount");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" networkHealthAnnotations");
        }
        if (str.isEmpty()) {
            return new aalg(this.a, this.b, this.c.intValue(), this.d.intValue(), this.e);
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
