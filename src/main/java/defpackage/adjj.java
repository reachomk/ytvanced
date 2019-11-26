package defpackage;

/* renamed from: adjj */
final class adjj extends adko {
    private Boolean a;
    private Boolean b;

    adjj() {
    }

    public final adko a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final adko b(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final adkl a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" enableLocalNotifications");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" isCounterfactual");
        }
        if (str.isEmpty()) {
            return new adjk(this.a.booleanValue(), this.b.booleanValue());
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
