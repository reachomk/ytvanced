package defpackage;

/* renamed from: ader */
final class ader extends adgg {
    private Boolean a;

    ader() {
    }

    /* Access modifiers changed, original: final */
    public final adgg a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final adgh a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" isUnselectUserInitiated");
        }
        if (str.isEmpty()) {
            return new ades(this.a.booleanValue());
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
