package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: qgw */
final class qgw extends qgc {
    private final /* synthetic */ qdx a;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ long i;
    private final /* synthetic */ GoogleHelp j;

    qgw(ptd ptd, qdx qdx, Bundle bundle, long j, GoogleHelp googleHelp) {
        this.a = qdx;
        this.h = bundle;
        this.i = j;
        this.j = googleHelp;
        super(ptd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(qgj qgj) {
        try {
            qgj.a(this.a, this.h, this.i, this.j, new qgz(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            c(qfx.a);
        }
    }
}
