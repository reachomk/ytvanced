package defpackage;

/* renamed from: aczc */
final class aczc extends aczt {
    private String a;
    private String b;
    private Integer c;
    private adpw d;
    private int e;

    aczc() {
    }

    public final aczt a(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        throw new NullPointerException("Null routeId");
    }

    public final aczt b(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        throw new NullPointerException("Null deviceName");
    }

    public final aczt a(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final aczt a(adpw adpw) {
        if (adpw != null) {
            this.d = adpw;
            return this;
        }
        throw new NullPointerException("Null playbackDescriptor");
    }

    public final aczq a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" routeId");
        }
        if (this.e == 0) {
            str = String.valueOf(str).concat(" sessionType");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" deviceName");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" timeoutSeconds");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" playbackDescriptor");
        }
        if (str.isEmpty()) {
            return new acyz(this.a, this.e, this.b, this.c.intValue(), this.d);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* synthetic */ aczc(aczq aczq) {
        acyz acyz = (acyz) aczq;
        this.a = acyz.a;
        this.e = acyz.e;
        this.b = acyz.b;
        this.c = Integer.valueOf(acyz.c);
        this.d = acyz.d;
    }

    public final aczt b(int i) {
        if (i != 0) {
            this.e = i;
            return this;
        }
        throw new NullPointerException("Null sessionType");
    }
}
