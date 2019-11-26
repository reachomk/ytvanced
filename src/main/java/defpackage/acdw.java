package defpackage;

import android.os.AsyncTask;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint;

/* renamed from: acdw */
final class acdw extends AsyncTask {
    private ayyw a = null;
    private final /* synthetic */ znv b;
    private final /* synthetic */ acfe c;
    private final /* synthetic */ apxu d;
    private final /* synthetic */ acfk e;

    acdw(znv znv, acfe acfe, apxu apxu, acfk acfk) {
        this.b = znv;
        this.c = acfe;
        this.d = apxu;
        this.e = acfk;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        acfe acfe = this.c;
        apxu apxu = this.d;
        anxr access$000 = anxl.checkIsLite(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.mobileBroadcastSetupShowGoLiveScreenEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        acfe.a(((MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint) b).c, this.a, this.e);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.a = this.b.a();
        return null;
    }
}
