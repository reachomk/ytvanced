package defpackage;

/* renamed from: alhn */
public final class alhn {
    private static boolean a;

    public static synchronized void a(acya acya) {
        synchronized (alhn.class) {
            if (a) {
                return;
            }
            acya.a(alhd.class, new alhk()).a(alhi.class).a(alhe.class).a(alhc.class).a(alhj.class);
            acya.a(alhd.class, "shrb_c");
            acya.a(alhf.class, "shro_r");
            acya.a(alhi.class, "shra_f");
            acya.a(alhg.class, "shrp_p");
            acya.a(alhe.class, "shrp_c");
            acya.a(alhc.class, "shra_f");
            acya.a(alhj.class, "shra_f");
            a = true;
        }
    }
}
