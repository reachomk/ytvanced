package defpackage;

/* renamed from: bbkf */
final class bbkf extends bbkn {
    private Boolean a;
    private bbkx b;

    bbkf() {
    }

    public final bbkn a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final bbkn a(bbkx bbkx) {
        this.b = bbkx;
        return this;
    }

    public final bbko a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" sampleToLocalSpanStore");
        }
        if (str.isEmpty()) {
            return new bbkg(this.a.booleanValue(), this.b);
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
