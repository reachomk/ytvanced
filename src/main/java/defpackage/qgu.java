package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: qgu */
final class qgu extends qgc {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ long h;
    private final /* synthetic */ GoogleHelp i;

    qgu(ptd ptd, Bundle bundle, long j, GoogleHelp googleHelp) {
        this.a = bundle;
        this.h = j;
        this.i = googleHelp;
        super(ptd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(qgj qgj) {
        try {
            qgj.b(this.a, this.h, this.i, new qgx(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            c(qfx.a);
        }
    }
}
