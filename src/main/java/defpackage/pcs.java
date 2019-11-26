package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@qlp
/* renamed from: pcs */
public final class pcs extends qou {
    public static final Creator CREATOR = new pcw();
    private final boolean a;
    private final rmh b;

    pcs(boolean z, IBinder iBinder) {
        rmh rmj;
        this.a = z;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            rmj = queryLocalInterface instanceof rmh ? (rmh) queryLocalInterface : new rmj(iBinder);
        } else {
            rmj = null;
        }
        this.b = rmj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 1, this.a);
        rmh rmh = this.b;
        qov.a(parcel, 2, rmh != null ? rmh.asBinder() : null);
        qov.a(parcel, i);
    }
}
