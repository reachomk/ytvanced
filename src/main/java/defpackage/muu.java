package defpackage;

import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISelectableItemRegistryService;

/* renamed from: muu */
final /* synthetic */ class muu implements OnClickListener {
    private final muv a;

    muu(muv muv) {
        this.a = muv;
    }

    public final void onClick(View view) {
        muv muv = this.a;
        ISelectableItemRegistryService iSelectableItemRegistryService = (ISelectableItemRegistryService) muv.v.get();
        if (iSelectableItemRegistryService != null) {
            nhh nhh = muv.q;
            if (nhh != null) {
                try {
                    iSelectableItemRegistryService.a(nhh);
                } catch (RemoteException unused) {
                }
            }
        }
    }
}
