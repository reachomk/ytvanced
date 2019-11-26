package defpackage;

/* renamed from: acze */
final class acze extends adab {
    private Boolean a;
    private Integer b;
    private Integer c;
    private Integer d;

    acze() {
    }

    public final adab a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final adab a(int i) {
        this.b = Integer.valueOf(i);
        return this;
    }

    public final adab b(int i) {
        this.c = Integer.valueOf(i);
        return this;
    }

    public final adab c(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    public final adac a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" enabled");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" scanDurationSeconds");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" scanPeriodNoDevicesDetectedSeconds");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" scanPeriodDevicesDetectedSeconds");
        }
        if (str.isEmpty()) {
            return new aczb(this.a.booleanValue(), this.b.intValue(), this.c.intValue(), this.d.intValue());
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
