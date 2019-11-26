package defpackage;

/* renamed from: hge */
final class hge extends hgj {
    public String a;
    public Boolean b;

    hge() {
    }

    /* Access modifiers changed, original: final */
    public final hgh a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" key");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" shouldIndicate");
        }
        if (str.isEmpty()) {
            return new hgf(this.a, this.b.booleanValue());
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
