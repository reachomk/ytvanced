package defpackage;

/* renamed from: adqt */
final class adqt extends adtg {
    private adjg a;

    adqt() {
    }

    public final adtg a(adjg adjg) {
        if (adjg != null) {
            this.a = adjg;
            return this;
        }
        throw new NullPointerException("Null ssdpId");
    }

    public final adtd a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" ssdpId");
        }
        if (str.isEmpty()) {
            return new adqu(this.a);
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
