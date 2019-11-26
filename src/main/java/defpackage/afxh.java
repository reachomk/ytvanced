package defpackage;

/* renamed from: afxh */
public final class afxh {
    public static final String[] a = new String[]{"ACTION1_CLICKED", "ACTION2_CLICKED", "ACTION3_CLICKED"};

    public static void a(bcaa bcaa, String str, zzl zzl) {
        if (afxh.a(zzl, bcaa)) {
            ((uib) ((alwu) bcaa.get()).k.get()).a(str);
        }
    }

    private static boolean a(bcaa bcaa) {
        return bcaa != null;
    }

    public static void a(bcaa bcaa, String str, boolean z, zzl zzl) {
        if (afxh.a(zzl, bcaa)) {
            ((uib) ((alwu) bcaa.get()).l.get()).a(str, Boolean.valueOf(z));
        }
    }

    public static void b(bcaa bcaa, String str, zzl zzl) {
        if (afxh.a(zzl, bcaa)) {
            afxh.a(bcaa, str);
        }
    }

    public static void a(bcaa bcaa, String str, avmc avmc) {
        if (afxh.a(avmc, bcaa)) {
            afxh.a(bcaa, str);
        }
    }

    public static void a(bcaa bcaa, String str) {
        if (afxh.a(bcaa)) {
            ((uib) ((alwu) bcaa.get()).j.get()).a(str, Boolean.valueOf(false));
        }
    }

    public static void c(bcaa bcaa, String str, zzl zzl) {
        if (afxh.a(zzl, bcaa)) {
            ((uib) ((alwu) bcaa.get()).h.get()).a(str);
        }
    }

    public static boolean a(zzl zzl, bcaa bcaa) {
        if (!(zzl == null || zzl.b() == null)) {
            avmc avmc = zzl.b().q;
            if (avmc == null) {
                avmc = avmc.m;
            }
            if (afxh.a(avmc, bcaa)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(avmc avmc, bcaa bcaa) {
        return avmc != null && avmc.k && afxh.a(bcaa);
    }
}
