package defpackage;

import android.app.Application;
import android.util.Log;
import java.util.Locale;

/* renamed from: ses */
public abstract class ses implements set {
    private static final String a = set.class.getSimpleName();

    public abstract sgz a();

    public abstract sgn b();

    public static ses a(sgz sgz) {
        sdw sdw = new sdw();
        sdw.a(sgz);
        return sdw.a();
    }

    public final ses a(sgn sgn) {
        sdw sdw = new sdw();
        sdw.a(a());
        sdw.a = b();
        sdw.a = sgn;
        return sdw.a();
    }

    public final sgn c() {
        if (b() != null) {
            return b();
        }
        sgn sgn;
        sgz a = a();
        seo seo = a.k;
        if (seo == null || seo.b()) {
            antp antp = a.g;
            if (antp == null) {
                Log.w(a, "Attempted to resolve flow without a SignInState");
                antp = antp.UNRECOGNIZED;
            }
            int ordinal = antp.ordinal();
            if (ordinal == 0) {
                sgn = sgn.TOKEN_REQUESTED;
            } else if (ordinal == 1) {
                sgn = sgn.ACCOUNT_CHOOSER;
            } else if (ordinal == 2) {
                sgn = sgn.CREATE_ACCOUNT;
            } else if (ordinal == 3) {
                sgn = sgn.THIRD_PARTY_CONSENT;
            } else if (ordinal != 4) {
                Log.w(a, "SignInState is unrecognized, falling back to AppAuth.");
                sgn = sgn.APP_AUTH;
            } else {
                sgn = sgn.APP_AUTH;
            }
        } else {
            sgn = sgn.APP_AUTH;
        }
        return sgn;
    }

    public final sdv a(Application application) {
        return b(sgn.ACCOUNT_CHOOSER) ? new sdv(application, this, sga.b.a()) : null;
    }

    public final sev b(Application application) {
        return b(sgn.THIRD_PARTY_CONSENT) ? new sev(application, this) : null;
    }

    public final sfc c(Application application) {
        if (b(sgn.CREATE_ACCOUNT) || b(sgn.FINISH_CREATE_ACCOUNT)) {
            return new sfc(application, this);
        }
        return null;
    }

    private final boolean b(sgn sgn) {
        if (c() == sgn) {
            return true;
        }
        Log.e(a, String.format(Locale.ENGLISH, "Inconsistent UI state. Expected %s, got %s", new Object[]{sgn, c()}));
        return false;
    }
}
