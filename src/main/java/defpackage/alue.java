package defpackage;

/* renamed from: alue */
final class alue implements alui {
    private alun a;
    private alum b;
    private aluk c;

    alue() {
    }

    public final alui a(alun alun) {
        if (alun != null) {
            this.a = alun;
            return this;
        }
        throw new NullPointerException("Null expiryGenerator");
    }

    public final alui a(alum alum) {
        if (alum != null) {
            this.b = alum;
            return this;
        }
        throw new NullPointerException("Null keyConverter");
    }

    public final alui a(aluk aluk) {
        if (aluk != null) {
            this.c = aluk;
            return this;
        }
        throw new NullPointerException("Null costGenerator");
    }

    public final aluj a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" expiryGenerator");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" keyConverter");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" costGenerator");
        }
        if (str.isEmpty()) {
            return new aluf(this.a, this.b, this.c);
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
