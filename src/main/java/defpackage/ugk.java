package defpackage;

import java.util.Arrays;

/* renamed from: ugk */
public final class ugk extends ugr {
    public ugk() {
        super(Arrays.asList(new ugo[]{ugo.COLLAPSED, ugo.EXPANDED}));
    }

    public final ugo a(ugo ugo) {
        return ugo.COLLAPSED;
    }

    public final ugo b(ugo ugo) {
        return ugo.EXPANDED;
    }

    public final ugo c(ugo ugo) {
        if (ugo == ugo.HIDDEN) {
            return ugo.COLLAPSED;
        }
        if (ugo == ugo.FULLY_EXPANDED) {
            ugo = ugo.EXPANDED;
        }
        return ugo;
    }
}
