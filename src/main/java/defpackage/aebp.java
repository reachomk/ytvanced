package defpackage;

/* renamed from: aebp */
final class aebp extends aebv {
    private adih a;
    private aakj b;

    aebp() {
    }

    public final aebv a(adih adih) {
        if (adih != null) {
            this.a = adih;
            return this;
        }
        throw new NullPointerException("Null autonavMode");
    }

    public final aebv a(aakj aakj) {
        this.b = aakj;
        return this;
    }

    public final aebw a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" autonavMode");
        }
        if (str.isEmpty()) {
            return new aebq(this.a, this.b);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* synthetic */ aebp(aebw aebw) {
        aebq aebq = (aebq) aebw;
        this.a = aebq.a;
        this.b = aebq.b;
    }
}
