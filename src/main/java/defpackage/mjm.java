package defpackage;

import android.app.Activity;

/* renamed from: mjm */
public final class mjm implements aafb, ezs {
    private final Activity a;
    private final aaey b;
    private final fjo c;

    public mjm(Activity activity, aaey aaey, fjo fjo) {
        this.a = activity;
        this.b = aaey;
        this.c = fjo;
    }

    public final ezu a() {
        return new jpi(this.a, this.b, new mjp(this));
    }

    public final String b() {
        fja e = this.c.e();
        return e != null ? e.Z() : null;
    }
}
