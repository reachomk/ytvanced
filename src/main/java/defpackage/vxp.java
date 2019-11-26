package defpackage;

/* renamed from: vxp */
final class vxp extends vxh {
    private Integer a;
    private Boolean b;
    private vrd c;

    vxp() {
    }

    public final vxh a(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    public final vxh a(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final vxh a(vrd vrd) {
        if (vrd != null) {
            this.c = vrd;
            return this;
        }
        throw new NullPointerException("Null adCountMetadata");
    }

    public final vxe a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" timeRemainingMillis");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" showAdChoices");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" adCountMetadata");
        }
        if (str.isEmpty()) {
            return new vxm(this.a.intValue(), this.b.booleanValue(), this.c);
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
