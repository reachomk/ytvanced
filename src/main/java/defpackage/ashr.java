package defpackage;

/* renamed from: ashr */
public enum ashr implements anxv {
    UNKNOWN_INTERFACE(0),
    WEB(1),
    WEB_GAMING(32),
    WEB_MUSIC(61),
    WEB_REMIX(67),
    WEB_EXPERIMENTS(42),
    WEB_HEROES(60),
    WEB_CREATOR(62),
    WEB_LIVE_STREAMING(73),
    WEB_KIDS(76),
    WEB_UNPLUGGED(41),
    WEB_UNPLUGGED_ONBOARDING(69),
    WEB_UNPLUGGED_OPS(70),
    WEB_UNPLUGGED_PUBLIC(71),
    MWEB(2),
    MWEB_TIER_2(27),
    ANDROID(3),
    ANDROID_CASUAL(54),
    ANDROID_CREATOR(14),
    ANDROID_EMBEDDED_PLAYER(55),
    ANDROID_GAMING(24),
    ANDROID_INSTANT(20),
    ANDROID_KIDS(18),
    ANDROID_MUSIC(21),
    ANDROID_TESTSUITE(30),
    ANDROID_UNPLUGGED(29),
    ANDROID_VR(28),
    ANDROID_WITNESS(34),
    ANDROID_SPORTS(36),
    ANDROID_LITE(38),
    IOS(5),
    IOS_CREATOR(15),
    IOS_DIRECTOR(40),
    IOS_GAMING(25),
    IOS_INSTANT(17),
    IOS_KIDS(19),
    IOS_LIVE_CREATION_EXTENSION(64),
    IOS_MESSAGES_EXTENSION(66),
    IOS_MUSIC(26),
    IOS_TABLOID(22),
    IOS_UNPLUGGED(33),
    IOS_UPTIME(68),
    IOS_WITNESS(35),
    IOS_PILOT_STUDIO(53),
    IOS_SPORTS(37),
    IOS_EMBEDDED_PLAYER(39),
    TVHTML5(7),
    TVHTML5_AUDIO(57),
    TVHTML5_CAST(43),
    TVHTML5_KIDS(59),
    ANDROID_TV_KIDS(74),
    TVHTML5_SIMPLY(75),
    TVHTML5_UNPLUGGED(65),
    TVHTML5_YONGLE(80),
    TVLITE(8),
    TVANDROID(10),
    TV_UNPLUGGED_CAST(58),
    TV_UNPLUGGED_ANDROID(63),
    TVHTML5_VR(72),
    ANDROID_TV(23),
    XBOX(11),
    XBOXONEGUIDE(13),
    CLIENTX(12),
    TVAPPLE(16),
    WEB_EMBEDDED_PLAYER(56),
    WEB_MUSIC_ANALYTICS(31),
    MUSIC_INTEGRATIONS(77),
    GOOGLE_ASSISTANT(84);
    
    public final int g;

    public final int getNumber() {
        return this.g;
    }

    public static ashr a(int i) {
        if (i == 0) {
            return UNKNOWN_INTERFACE;
        }
        if (i == 1) {
            return WEB;
        }
        if (i == 2) {
            return MWEB;
        }
        if (i == 3) {
            return ANDROID;
        }
        if (i == 5) {
            return IOS;
        }
        if (i == 80) {
            return TVHTML5_YONGLE;
        }
        if (i == 84) {
            return GOOGLE_ASSISTANT;
        }
        if (i == 7) {
            return TVHTML5;
        }
        if (i == 8) {
            return TVLITE;
        }
        switch (i) {
            case 10:
                return TVANDROID;
            case 11:
                return XBOX;
            case 12:
                return CLIENTX;
            case 13:
                return XBOXONEGUIDE;
            case 14:
                return ANDROID_CREATOR;
            case 15:
                return IOS_CREATOR;
            case 16:
                return TVAPPLE;
            case 17:
                return IOS_INSTANT;
            case 18:
                return ANDROID_KIDS;
            case 19:
                return IOS_KIDS;
            case 20:
                return ANDROID_INSTANT;
            case 21:
                return ANDROID_MUSIC;
            case 22:
                return IOS_TABLOID;
            case 23:
                return ANDROID_TV;
            case 24:
                return ANDROID_GAMING;
            case 25:
                return IOS_GAMING;
            case 26:
                return IOS_MUSIC;
            case 27:
                return MWEB_TIER_2;
            case 28:
                return ANDROID_VR;
            case 29:
                return ANDROID_UNPLUGGED;
            case 30:
                return ANDROID_TESTSUITE;
            case 31:
                return WEB_MUSIC_ANALYTICS;
            case 32:
                return WEB_GAMING;
            case 33:
                return IOS_UNPLUGGED;
            case 34:
                return ANDROID_WITNESS;
            case 35:
                return IOS_WITNESS;
            case 36:
                return ANDROID_SPORTS;
            case 37:
                return IOS_SPORTS;
            case 38:
                return ANDROID_LITE;
            case 39:
                return IOS_EMBEDDED_PLAYER;
            case 40:
                return IOS_DIRECTOR;
            case 41:
                return WEB_UNPLUGGED;
            case 42:
                return WEB_EXPERIMENTS;
            case 43:
                return TVHTML5_CAST;
            default:
                switch (i) {
                    case cv.aX /*53*/:
                        return IOS_PILOT_STUDIO;
                    case cv.aY /*54*/:
                        return ANDROID_CASUAL;
                    case cv.aZ /*55*/:
                        return ANDROID_EMBEDDED_PLAYER;
                    case cv.ba /*56*/:
                        return WEB_EMBEDDED_PLAYER;
                    case cv.bb /*57*/:
                        return TVHTML5_AUDIO;
                    case 58:
                        return TV_UNPLUGGED_CAST;
                    case cv.bc /*59*/:
                        return TVHTML5_KIDS;
                    case cv.bd /*60*/:
                        return WEB_HEROES;
                    case cv.be /*61*/:
                        return WEB_MUSIC;
                    case cv.bf /*62*/:
                        return WEB_CREATOR;
                    case cv.bg /*63*/:
                        return TV_UNPLUGGED_ANDROID;
                    case 64:
                        return IOS_LIVE_CREATION_EXTENSION;
                    case 65:
                        return TVHTML5_UNPLUGGED;
                    case 66:
                        return IOS_MESSAGES_EXTENSION;
                    case 67:
                        return WEB_REMIX;
                    case 68:
                        return IOS_UPTIME;
                    case 69:
                        return WEB_UNPLUGGED_ONBOARDING;
                    case 70:
                        return WEB_UNPLUGGED_OPS;
                    case 71:
                        return WEB_UNPLUGGED_PUBLIC;
                    case 72:
                        return TVHTML5_VR;
                    case 73:
                        return WEB_LIVE_STREAMING;
                    case 74:
                        return ANDROID_TV_KIDS;
                    case 75:
                        return TVHTML5_SIMPLY;
                    case 76:
                        return WEB_KIDS;
                    case 77:
                        return MUSIC_INTEGRATIONS;
                    default:
                        return null;
                }
        }
    }

    public static anxx a() {
        return ashq.a;
    }

    private ashr(int i) {
        this.g = i;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
