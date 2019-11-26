package defpackage;

/* renamed from: hbh */
final class hbh extends hbk {
    private ejd a;
    private Boolean b;
    private ajxa c;

    hbh() {
    }

    /* Access modifiers changed, original: final */
    public final hbk a(ejd ejd) {
        if (ejd != null) {
            this.a = ejd;
            return this;
        }
        throw new NullPointerException("Null playerViewMode");
    }

    /* Access modifiers changed, original: final */
    public final hbk a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final hbk a(ajxa ajxa) {
        this.c = ajxa;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final hbl a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" playerViewMode");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" isEnabled");
        }
        if (str.isEmpty()) {
            return new hbe(this.a, this.b.booleanValue(), this.c);
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
