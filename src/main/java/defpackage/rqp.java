package defpackage;

import android.content.Context;

/* renamed from: rqp */
public final class rqp {
    public static final pso a = new pso("LocationServices.API", d, c);
    @Deprecated
    public static final rqm b = new rrt();
    private static final psv c = new psv();
    private static final psq d = new rse();

    public static rre a(ptd ptd) {
        boolean z = true;
        pzr.b(ptd != null, "GoogleApiClient parameter is required.");
        rre rre = (rre) ptd.a(c);
        if (rre == null) {
            z = false;
        }
        pzr.a(z, (Object) "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return rre;
    }

    public static rql a(Context context) {
        return new rql(context);
    }

    static {
        rqs rqs = new rqs();
        rrk rrk = new rrk();
    }
}
