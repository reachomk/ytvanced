package defpackage;

import com.google.android.gms.common.api.Scope;

/* renamed from: rxx */
public final class rxx {
    public static final psq a = new rxw();
    public static final pso b = new pso("SignIn.API", a, c);
    private static final psv c = new psv();
    private static final psv d = new psv();
    private static final psq e = new rxz();

    static {
        Scope scope = new Scope("profile");
        scope = new Scope("email");
        pso pso = new pso("SignIn.INTERNAL_API", e, d);
    }
}
