package defpackage;

/* renamed from: afww */
final class afww extends afwy {
    public String a;
    private Boolean b;
    private Integer c;
    private Integer d;

    afww() {
    }

    public final afwy a(String str) {
        this.a = str;
        return this;
    }

    public final afwy a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final afwy a(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final afwy b(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final afwv a() {
        String str = "";
        if (this.b == null) {
            str = str.concat(" newContent");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" deliveryTimestamp");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" unseenItemCount");
        }
        if (str.isEmpty()) {
            return new afwt(this.a, this.b.booleanValue(), this.c.intValue(), this.d.intValue());
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
