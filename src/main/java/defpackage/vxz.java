package defpackage;

/* renamed from: vxz */
final class vxz extends vyh {
    private Boolean a;

    vxz() {
    }

    public final vyh a(boolean z) {
        this.a = Boolean.valueOf(z);
        return this;
    }

    public final vye a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" remotePlayback");
        }
        if (str.isEmpty()) {
            return new vxw(this.a.booleanValue());
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
