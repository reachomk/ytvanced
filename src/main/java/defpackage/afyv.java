package defpackage;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: afyv */
public final class afyv {
    public static final wxy a = new wxy(0, b, c);
    private static final int b = ((int) TimeUnit.MINUTES.toSeconds(10));
    private static final int c = ((int) TimeUnit.HOURS.toSeconds(3));

    static Bundle a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("identityId", str);
        return bundle;
    }
}
