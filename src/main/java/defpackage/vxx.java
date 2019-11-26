package defpackage;

/* renamed from: vxx */
final class vxx extends vyf {
    private Boolean a;
    private Boolean b;
    private CharSequence c;

    vxx() {
    }

    public final vyf a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final vyf b(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final vyf a(CharSequence charSequence) {
        if (charSequence != null) {
            this.c = charSequence;
            return this;
        }
        throw new NullPointerException("Null learnMoreText");
    }

    public final vyc a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" learnMoreCtaHidden");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" learnMoreCtaEnabled");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" learnMoreText");
        }
        if (str.isEmpty()) {
            return new vxu(this.a.booleanValue(), this.b.booleanValue(), this.c);
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
