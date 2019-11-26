package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

/* renamed from: rqq */
public final class rqq extends qou implements ptn {
    public static final Creator CREATOR = new rqt();
    public final Status a;

    public rqq(Status status) {
        this.a = status;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.a, i);
        qov.a(parcel, a);
    }

    public final Status a() {
        return this.a;
    }

    static {
        rqq rqq = new rqq(Status.a);
    }
}
