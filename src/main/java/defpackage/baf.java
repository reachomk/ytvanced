package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: baf */
public class baf extends nd {
    public boolean Z = false;
    public baz aa;
    public Dialog c;

    public baf() {
        i_(true);
    }

    public azl b(Context context) {
        return new azl(context);
    }

    public final Dialog a(Bundle bundle) {
        this.c = b(M_());
        return this.c;
    }

    public final void N_() {
        super.N_();
        Dialog dialog = this.c;
        if (dialog != null) {
            ((azl) dialog).f(false);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.c;
        if (dialog != null) {
            ((azl) dialog).b();
        }
    }
}
