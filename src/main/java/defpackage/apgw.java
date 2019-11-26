package defpackage;

/* renamed from: apgw */
public enum apgw implements anxv {
    BUNDLE_ITEM_STYLE_UNSPECIFIED(0),
    BUNDLE_ITEM_STYLE_TWO_BY_TWO(1),
    BUNDLE_ITEM_STYLE_ONE_AND_TWO_AVATAR(2),
    BUNDLE_ITEM_STYLE_ONE_AND_TWO(3);
    
    public final int d;

    public final int getNumber() {
        return this.d;
    }

    public static apgw a(int i) {
        if (i == 0) {
            return BUNDLE_ITEM_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return BUNDLE_ITEM_STYLE_TWO_BY_TWO;
        }
        if (i != 2) {
            return i != 3 ? null : BUNDLE_ITEM_STYLE_ONE_AND_TWO;
        } else {
            return BUNDLE_ITEM_STYLE_ONE_AND_TWO_AVATAR;
        }
    }

    public static anxx a() {
        return apgz.a;
    }

    private apgw(int i) {
        this.d = i;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
