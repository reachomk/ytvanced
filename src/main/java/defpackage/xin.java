package defpackage;

/* renamed from: xin */
final class xin implements xiy {
    public bcaa a;
    public bcaa b;
    private bcaa c;
    private Boolean d;
    private xax e;
    private xgp f;

    xin() {
    }

    public final xiy a(xgp xgp) {
        if (xgp != null) {
            this.f = xgp;
            return this;
        }
        throw new NullPointerException("Null httpClientConfig");
    }

    public final xiv a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" cronetEngineProvider");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" headerDecoratorProvider");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" uriRewriter");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" useObscura");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" commonConfigs");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" httpClientConfig");
        }
        if (str.isEmpty()) {
            return new xiq(this.a, this.c, this.b, this.d.booleanValue(), this.e, this.f);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    public final /* synthetic */ xit b(bcaa bcaa) {
        if (bcaa != null) {
            this.c = bcaa;
            return this;
        }
        throw new NullPointerException("Null headerDecoratorProvider");
    }
}
