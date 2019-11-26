package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

/* renamed from: anqr */
public final class anqr {
    public static final Pattern a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private static anqr c;
    public final FirebaseInstanceId b;

    public static synchronized anqr a() {
        anqr anqr;
        synchronized (anqr.class) {
            if (c == null) {
                c = new anqr(FirebaseInstanceId.a());
            }
            anqr = c;
        }
        return anqr;
    }

    private anqr(FirebaseInstanceId firebaseInstanceId) {
        this.b = firebaseInstanceId;
    }
}
