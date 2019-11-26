package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: azi */
public class azi extends nd {
    public boolean Z = false;
    private baz aa;
    public Dialog c;

    public azi() {
        i_(true);
    }

    private final baz W() {
        X();
        return this.aa;
    }

    private final void X() {
        if (this.aa == null) {
            Bundle bundle = this.j;
            if (bundle != null) {
                this.aa = baz.a(bundle.getBundle("selector"));
            }
            if (this.aa == null) {
                this.aa = baz.c;
            }
        }
    }

    public final void a(baz baz) {
        if (baz != null) {
            X();
            if (!this.aa.equals(baz)) {
                this.aa = baz;
                Bundle bundle = this.j;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", baz.a);
                f(bundle);
                Dialog dialog = this.c;
                if (dialog != null) {
                    ((azf) dialog).a(baz);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public azf b(Context context) {
        return new azf(context);
    }

    public final Dialog a(Bundle bundle) {
        this.c = b(M_());
        ((azf) this.c).a(W());
        return this.c;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.c;
        if (dialog != null) {
            ((azf) dialog).b();
        }
    }
}
