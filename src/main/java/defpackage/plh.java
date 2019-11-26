package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

/* renamed from: plh */
public final class plh extends qou {
    public static final Creator CREATOR = new pmg();
    private static final pon e = new pon("CastMediaOptions");
    public final String a;
    public final String b;
    public final plu c;
    public final boolean d;
    private final pmv f;

    plh(String str, String str2, IBinder iBinder, plu plu, boolean z) {
        pmv pmx;
        this.a = str;
        this.b = str2;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            pmx = queryLocalInterface instanceof pmv ? (pmv) queryLocalInterface : new pmx(iBinder);
        } else {
            pmx = null;
        }
        this.f = pmx;
        this.c = plu;
        this.d = z;
    }

    public final pli a() {
        pmv pmv = this.f;
        if (pmv != null) {
            try {
                return (pli) qct.a(pmv.b());
            } catch (RemoteException unused) {
                e.b("Unable to call %s on %s.", "getWrappedClientObject", pmv.class.getSimpleName());
            }
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        pmv pmv = this.f;
        qov.a(parcel, 4, pmv != null ? pmv.asBinder() : null);
        qov.a(parcel, 5, this.c, i);
        qov.a(parcel, 6, this.d);
        qov.a(parcel, a);
    }
}
