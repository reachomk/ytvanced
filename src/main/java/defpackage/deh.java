package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: deh */
public final class deh extends dhu implements def {
    deh(IBinder iBinder) {
        super(iBinder, "com.firebase.jobdispatcher.IJobCallback");
    }

    public final void a(Bundle bundle, int i) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bundle);
        aK_.writeInt(i);
        c(1, aK_);
    }
}
