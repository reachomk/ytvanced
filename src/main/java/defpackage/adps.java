package defpackage;

/* renamed from: adps */
final class adps extends adqs {
    private Integer a;
    private String b;

    adps() {
    }

    public final adqs a(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    public final adqs a(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        throw new NullPointerException("Null screenName");
    }

    public final adqp a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" recoveryState");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" screenName");
        }
        if (str.isEmpty()) {
            return new adpp(this.a.intValue(), this.b);
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
