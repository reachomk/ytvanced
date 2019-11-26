package defpackage;

import java.util.Arrays;

/* renamed from: ugq */
public final class ugq extends ugr {
    public ugq() {
        super(Arrays.asList(new ugo[]{ugo.HIDDEN, ugo.EXPANDED}));
    }

    public final ugo a(ugo ugo) {
        return ugo.HIDDEN;
    }

    public final ugo b(ugo ugo) {
        return ugo.EXPANDED;
    }

    public final ugo c(ugo ugo) {
        if (ugo == ugo.COLLAPSED) {
            return ugo.HIDDEN;
        }
        if (ugo == ugo.FULLY_EXPANDED) {
            ugo = ugo.EXPANDED;
        }
        return ugo;
    }
}
