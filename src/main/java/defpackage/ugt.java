package defpackage;

import java.util.Arrays;

/* renamed from: ugt */
public final class ugt extends ugr {
    public ugt() {
        super(Arrays.asList(new ugo[]{ugo.COLLAPSED, ugo.FULLY_EXPANDED}));
    }

    public final ugo c(ugo ugo) {
        return ugo == ugo.EXPANDED ? ugo.FULLY_EXPANDED : ugo;
    }

    public final ugo a(ugo ugo) {
        ugo = ugo.e;
        return ugo == ugo.EXPANDED ? ugo.COLLAPSED : ugo;
    }
}
