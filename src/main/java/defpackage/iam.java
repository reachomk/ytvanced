package defpackage;

/* renamed from: iam */
final class iam extends icd {
    public aich a;
    public fob b = null;
    public ejd c;
    public String d = null;
    public icg e;
    public aicd f;
    private Integer g;

    iam() {
    }

    /* Access modifiers changed, original: final */
    public final icd a(int i) {
        this.g = Integer.valueOf(i);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final icd a(aich aich) {
        this.a = aich;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final icd a(fob fob) {
        this.b = fob;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final icd a(ejd ejd) {
        this.c = ejd;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final icd a(String str) {
        this.d = str;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final icd a(icg icg) {
        this.e = icg;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final icd a(aicd aicd) {
        this.f = aicd;
        return this;
    }

    /* Access modifiers changed, original: final */
    public final ice a() {
        String str = "";
        if (this.g == null) {
            str = str.concat(" inlinePlaybackState");
        }
        if (str.isEmpty()) {
            return new ian(this.g.intValue(), this.a, this.b, this.c, this.d, this.e, this.f);
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
