package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: upd */
public final class upd extends nf {
    public final uoy a = new uoy();

    public final void b(Bundle bundle) {
        super.b(bundle);
        w();
        uoy uoy = this.a;
        if (bundle != null) {
            uoy.f = bundle.getBoolean("extractor_is_enabled");
        }
    }

    public final void B() {
        super.B();
        uoy uoy = this.a;
        uoy.e = true;
        upb upb = uoy.g;
        if (upb != null) {
            upb.e();
        }
    }

    public final void ad_() {
        super.ad_();
        uoy uoy = this.a;
        upb upb = uoy.g;
        if (upb != null) {
            upb.f();
        }
        uoy.e = false;
    }

    public final void e(Bundle bundle) {
        bundle.putBoolean("extractor_is_enabled", this.a.f);
    }

    public final void X_() {
        super.X_();
        upb upb = this.a.g;
        if (upb != null) {
            upb.g();
        }
    }

    public final void a(Activity activity) {
        super.a(activity);
        this.a.d = activity;
    }

    public final void J_() {
        super.J_();
        this.a.d = null;
    }
}
