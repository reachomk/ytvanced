package defpackage;

import android.os.Bundle;

/* renamed from: sgn */
public enum sgn {
    TOKEN_REQUESTED(3),
    ACCOUNT_CHOOSER(4),
    CREATE_ACCOUNT(6),
    FINISH_CREATE_ACCOUNT(6),
    THIRD_PARTY_CONSENT(5),
    APP_AUTH(7),
    APP_FLIP(14);
    
    public final int h;

    public static sgn a(String str) {
        return (sgn) Enum.valueOf(sgn.class, str);
    }

    public static sgn a(String str, Bundle bundle) {
        if (bundle.containsKey(str)) {
            int i = bundle.getInt(str);
            if (i >= 0 && i < sgn.values().length) {
                return sgn.values()[i];
            }
        }
        return null;
    }

    static {
        sgn.class.getSimpleName();
    }

    private sgn(int i) {
        this.h = i;
    }
}
