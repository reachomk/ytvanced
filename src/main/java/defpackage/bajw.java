package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bajw */
public final class bajw extends dhu implements baju {
    bajw(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IGvrLayout");
    }

    public final boolean enableCardboardTriggerEmulation(baka baka) {
        throw null;
    }

    public final void onBackPressed() {
        throw null;
    }

    public final boolean setOnDonNotNeededListener(baka baka) {
        throw null;
    }

    public final void setReentryIntent(baka baka) {
        throw null;
    }

    public final long getNativeGvrContext() {
        Parcel a = a(2, aK_());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    public final baka getRootView() {
        baka bakc;
        Parcel a = a(3, aK_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
            bakc = queryLocalInterface instanceof baka ? (baka) queryLocalInterface : new bakc(readStrongBinder);
        } else {
            bakc = null;
        }
        a.recycle();
        return bakc;
    }

    public final bajv getUiLayout() {
        Parcel a = a(4, aK_());
        bajv asInterface = bajy.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    public final void onPause() {
        b(5, aK_());
    }

    public final void onResume() {
        b(6, aK_());
    }

    public final void shutdown() {
        b(7, aK_());
    }

    public final void setPresentationView(baka baka) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) baka);
        b(8, aK_);
    }

    public final boolean enableAsyncReprojection(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        Parcel a = a(9, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final void setStereoModeEnabled(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(11, aK_);
    }
}
