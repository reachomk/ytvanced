package defpackage;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: xo */
public final class xo implements Parcelable {
    public static final Creator CREATOR = new xr();
    public final Object a;
    public vy b;
    public bil c;

    xo(Object obj) {
        this(obj, null);
    }

    public final int describeContents() {
        return 0;
    }

    xo(Object obj, vy vyVar) {
        this.a = obj;
        this.b = vyVar;
        this.c = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT >= 21) {
            parcel.writeParcelable((Parcelable) this.a, i);
        } else {
            parcel.writeStrongBinder((IBinder) this.a);
        }
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xo) {
            xo xoVar = (xo) obj;
            Object obj2 = this.a;
            if (obj2 == null) {
                return xoVar.a == null;
            } else {
                obj = xoVar.a;
                if (obj != null) {
                    return obj2.equals(obj);
                }
            }
        }
        return false;
    }
}
