package defpackage;

/* renamed from: adib */
final class adib extends adin {
    private adix b;
    private String c;
    private adjb d;
    private adik e;

    adib() {
    }

    public final adin a(adix adix) {
        if (adix != null) {
            this.b = adix;
            return this;
        }
        throw new NullPointerException("Null pairingType");
    }

    public final adin a(String str) {
        if (str != null) {
            this.c = str;
            return this;
        }
        throw new NullPointerException("Null name");
    }

    public final adin a(adjb adjb) {
        if (adjb != null) {
            this.d = adjb;
            return this;
        }
        throw new NullPointerException("Null screenId");
    }

    public final adin a(adik adik) {
        this.e = adik;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final adio a() {
        String str = "";
        if (this.b == null) {
            str = str.concat(" pairingType");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" name");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" screenId");
        }
        if (str.isEmpty()) {
            return new adic(this.b, this.c, this.d, this.e);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* synthetic */ adib(adio adio) {
        adic adic = (adic) adio;
        this.b = adic.a;
        this.c = adic.b;
        this.d = adic.c;
        this.e = adic.d;
    }
}
