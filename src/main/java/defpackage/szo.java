package defpackage;

/* renamed from: szo */
final class szo extends szw {
    private amuw a;

    szo() {
    }

    public final szw a(amuw amuw) {
        if (amuw != null) {
            this.a = amuw;
            return this;
        }
        throw new NullPointerException("Null templateUris");
    }

    public final szt a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" templateUris");
        }
        if (str.isEmpty()) {
            return new szl(this.a);
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
