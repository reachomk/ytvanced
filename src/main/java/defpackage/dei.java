package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dei */
public final class dei extends dhu implements deg {
    dei(IBinder iBinder) {
        super(iBinder, "com.firebase.jobdispatcher.IRemoteJobService");
    }

    public final void a(Bundle bundle, def def) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bundle);
        dhw.a(aK_, (IInterface) def);
        c(1, aK_);
    }

    public final void a(Bundle bundle, boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bundle);
        dhw.a(aK_, z);
        c(2, aK_);
    }
}
