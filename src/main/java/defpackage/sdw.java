package defpackage;

/* renamed from: sdw */
final class sdw extends seu {
    public sgn a;
    private sgz b;

    sdw() {
    }

    /* Access modifiers changed, original: final */
    public final seu a(sgz sgz) {
        if (sgz != null) {
            this.b = sgz;
            return this;
        }
        throw new NullPointerException("Null flowConfiguration");
    }

    /* Access modifiers changed, original: final */
    public final ses a() {
        String str = "";
        if (this.b == null) {
            str = str.concat(" flowConfiguration");
        }
        if (str.isEmpty()) {
            return new sel(this.b, this.a);
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
