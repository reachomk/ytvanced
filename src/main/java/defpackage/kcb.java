package defpackage;

/* renamed from: kcb */
public final class kcb {
    public static boolean a(zyw zyw) {
        String G = foh.G(zyw);
        boolean z = true;
        if (G != null) {
            if (!(G.equals("small_divider_exp") || G.equals("small_div_space") || G.equals("big_divider_exp"))) {
                if (G.equals("big_div_space")) {
                    return true;
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    public static boolean b(zyw zyw) {
        String G = foh.G(zyw);
        boolean z = false;
        if (G != null) {
            if (G.equals("small_divider_exp")) {
                z = true;
            } else if (G.equals("small_div_space")) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    public static boolean c(zyw zyw) {
        String G = foh.G(zyw);
        boolean z = false;
        if (G != null) {
            if (G.equals("small_div_space")) {
                z = true;
            } else if (G.equals("big_div_space")) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    public static boolean d(zyw zyw) {
        String G = foh.G(zyw);
        return G != null && G.equals("small_div_space");
    }
}
