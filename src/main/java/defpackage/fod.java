package defpackage;

/* renamed from: fod */
public final class fod {
    private static final foc d(Object obj) {
        if (obj instanceof foq) {
            return foc.AUTOPLAYABLE;
        }
        if (obj instanceof aryi) {
            return foc.INLINE_PLAYBACK;
        }
        if (obj instanceof hai) {
            return foc.INLINE_PLAYBACK_VIDEO_FEED;
        }
        if (obj instanceof ycp) {
            return foc.CONVERSATION_PLAYABLE;
        }
        if (obj instanceof ajzk) {
            return foc.PROMOTED_VIDEO_PLAYABLE;
        }
        if (fod.c(obj)) {
            return foc.CAROUSEL_PLAYABLE;
        }
        if (obj instanceof aqto) {
            return foc.DEFAULT_PROMO_PANEL;
        }
        if (obj instanceof ykf) {
            return foc.CHAT_INLINE_PLAYABLE;
        }
        if (obj instanceof jtk) {
            return foc.DISCOVERY_ACTION_VIDEO_PLAYABLE;
        }
        if (obj instanceof jtn) {
            return foc.DISCOVERY_APP_VIDEO_PLAYABLE;
        }
        if (fod.e(obj)) {
            return foc.INLINE_SURVEY_PLAYABLE;
        }
        return foc.NONE;
    }

    public static final boolean a(Object obj) {
        return fod.d(obj) != foc.NONE;
    }

    public static final foq b(Object obj) {
        foc d = fod.d(obj);
        float f = d.m;
        switch (d.ordinal()) {
            case 1:
                return (foq) obj;
            case 2:
                return new foq((aryi) obj, f);
            case 3:
                return new foq((hai) obj, f);
            case 4:
                return new foq((ycp) obj, f);
            case 5:
                if (fod.e(obj)) {
                    return new foq((ajwm) obj, f);
                }
                break;
            case 6:
                return new foq((ajzk) obj, f);
            case 7:
                return new foq((ajry) obj, f);
            case 8:
                return new foq((aqto) obj, f);
            case 9:
                return new foq((jtk) obj, f);
            case 10:
                return new foq((jtn) obj, f);
            case 11:
                return new foq((ykf) obj, f);
        }
        return null;
    }

    public static final arye a(aryi aryi) {
        if (aryi != null) {
            aryg aryg = aryi.f;
            if (aryg == null) {
                aryg = aryg.c;
            }
            if ((aryg.a & 1) != 0) {
                aryg aryg2 = aryi.f;
                if (aryg2 == null) {
                    aryg2 = aryg.c;
                }
                arye arye = aryg2.b;
                if (arye == null) {
                    arye = arye.u;
                }
                return arye;
            }
        }
        return null;
    }

    public static boolean c(Object obj) {
        if (obj instanceof ajry) {
            for (ajsa ajsa : ((ajry) obj).a) {
                aqto aqto = ajsa.c;
                if (aqto != null && aqto.b == 18) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean e(Object obj) {
        if (obj instanceof ajwm) {
            aryr aryr = ((ajwm) obj).f;
            if (aryr != null && aryr.a == 83537025) {
                return true;
            }
        }
        return false;
    }
}
