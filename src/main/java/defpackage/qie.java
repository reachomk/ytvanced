package defpackage;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qie */
public final class qie extends riy implements qib {
    public qie(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    public final void a(Message message) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) message);
        c(1, aX_);
    }
}
