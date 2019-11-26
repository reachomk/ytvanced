package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;

/* renamed from: hjz */
final /* synthetic */ class hjz implements OnClickListener {
    private final aaas a;

    hjz(aaas aaas) {
        this.a = aaas;
    }

    public final void onClick(View view) {
        aaas aaas = this.a;
        aoxg aoxg = (aoxg) aoxe.e.createBuilder();
        aoxg.copyOnWrite();
        aoxe aoxe = (aoxe) aoxg.instance;
        aoxe.a |= 2;
        aoxe.b = false;
        aoxg.a("10029");
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint, (aoxe) ((anxl) aoxg.build()));
        aaas.a((apxu) ((anxl) apxx.build()), null);
    }
}
