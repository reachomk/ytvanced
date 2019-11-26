package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rwt */
public final class rwt extends riy implements rwq {
    rwt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void a(rwp rwp, String str, int i, String[] strArr) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rwp);
        aX_.writeString(str);
        aX_.writeInt(i);
        aX_.writeStringArray(strArr);
        aX_.writeByteArray(null);
        b(1, aX_);
    }

    public final void a(rwp rwp, String str, String[] strArr, int[] iArr) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rwp);
        aX_.writeString(str);
        aX_.writeInt(0);
        aX_.writeStringArray(strArr);
        aX_.writeIntArray(iArr);
        aX_.writeByteArray(null);
        b(2, aX_);
    }

    public final void a(rwp rwp, String str, String str2, String str3) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rwp);
        aX_.writeString(str);
        aX_.writeString(str2);
        aX_.writeString(null);
        b(11, aX_);
    }

    public final void a(rwp rwp, String str) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rwp);
        aX_.writeString(str);
        b(5, aX_);
    }
}
