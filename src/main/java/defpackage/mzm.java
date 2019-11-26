package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mzm */
public final class mzm extends dhu implements mzk {
    public mzm(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IDataBusClient");
    }

    public final void a(ngp[] ngpArr) {
        throw null;
    }

    public final void a(ngp ngp) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) ngp);
        b(1, aK_);
    }
}
