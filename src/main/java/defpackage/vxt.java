package defpackage;

/* renamed from: vxt */
final class vxt extends vxl {
    private vxd a;

    vxt() {
    }

    public final vxl a(vxd vxd) {
        if (vxd != null) {
            this.a = vxd;
            return this;
        }
        throw new NullPointerException("Null adOverlayMetadata");
    }

    public final vxi a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" adOverlayMetadata");
        }
        if (str.isEmpty()) {
            return new vxq(this.a);
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
