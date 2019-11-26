package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;

/* renamed from: hql */
final /* synthetic */ class hql implements OnClickListener {
    private final hqj a;

    hql(hqj hqj) {
        this.a = hqj;
    }

    public final void onClick(View view) {
        aaas aaas = this.a.c;
        aoxg aoxg = (aoxg) aoxe.e.createBuilder();
        aoxg.a(Integer.toString(10013));
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint, (aoxe) ((anxl) aoxg.build()));
        aaas.a((apxu) ((anxl) apxx.build()), null);
    }
}
