package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bajx */
public final class bajx extends dhu implements bajv {
    bajx(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IGvrUiLayout");
    }

    public final baka getRootView() {
        throw null;
    }

    public final boolean isEnabled() {
        throw null;
    }

    public final void setEnabled(boolean z) {
        throw null;
    }

    public final void setSettingsButtonEnabled(boolean z) {
        throw null;
    }

    public final void setSettingsButtonListener(baka baka) {
        throw null;
    }

    public final void setTransitionViewListener(baka baka) {
        throw null;
    }

    public final void setCloseButtonListener(baka baka) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) baka);
        b(5, aK_);
    }

    public final void setTransitionViewEnabled(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(6, aK_);
    }

    public final void setViewerName(String str) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        b(10, aK_);
    }
}
