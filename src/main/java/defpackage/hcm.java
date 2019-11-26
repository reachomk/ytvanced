package defpackage;

/* renamed from: hcm */
public final class hcm {
    public static hcj a(ajuo ajuo) {
        ajul ajul = ajuo.c;
        if (ajul == null) {
            return null;
        }
        akab akab = ajul.a;
        if (akab == null) {
            return null;
        }
        akad[] akadArr = akab.b;
        if (akadArr == null || akadArr.length == 0) {
            return null;
        }
        ajwt ajwt = akadArr[0].c;
        if (ajwt == null) {
            return null;
        }
        ajww[] ajwwArr = ajwt.b;
        if (ajwwArr == null || ajwwArr.length == 0) {
            return null;
        }
        ajxa ajxa = ajwwArr[0].ak;
        if (ajxa == null) {
            return null;
        }
        arfd arfd = ajuo.b;
        if (arfd != null && arfd.a == 138681548) {
            return new hcj((arfg) arfd.b, ajxa);
        }
        return null;
    }

    public static axyq b(ajuo ajuo) {
        ajul ajul = ajuo.c;
        if (ajul != null) {
            akab akab = ajul.a;
            if (akab != null) {
                akad[] akadArr = akab.b;
                if (!(akadArr == null || akadArr.length == 0)) {
                    ajwt ajwt = akadArr[0].c;
                    if (ajwt != null) {
                        ajww[] ajwwArr = ajwt.b;
                        if (!(ajwwArr == null || ajwwArr.length == 0)) {
                            return ajwwArr[0].bn;
                        }
                    }
                }
            }
        }
        return null;
    }
}
