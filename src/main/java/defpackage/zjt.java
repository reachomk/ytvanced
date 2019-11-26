package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.List;

/* renamed from: zjt */
public final class zjt implements Parcelable {
    public static final Creator CREATOR = new zjw();
    public final String a;
    public boolean b;
    public zjs c;
    private final int d;
    private final String e;

    public zjt(String str, String str2, boolean z, boolean z2) {
        this.a = xvd.a(str);
        if (z2 && zju.a.get(str) != null) {
            this.d = ((Integer) zju.a.get(str)).intValue();
            this.e = null;
        } else {
            this.e = xvd.a(str2);
            this.d = -1;
        }
        this.b = z;
    }

    public final int describeContents() {
        return 0;
    }

    protected zjt(Parcel parcel) {
        this.a = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.b = z;
        this.c = new zjs(parcel.readInt());
    }

    public final String a(Context context) {
        if (TextUtils.isEmpty(this.e)) {
            return context.getString(this.d);
        }
        return this.e;
    }

    public final boolean a() {
        return zjs.a(this.c);
    }

    public final boolean b() {
        return zjs.b(this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.b);
        zjs zjs = this.c;
        parcel.writeInt(zjs != null ? zjs.a : 0);
    }

    public static zjt a(List list, String str) {
        if (!(list == null || str == null)) {
            for (zjt zjt : list) {
                if (zjt.a.equals(str)) {
                    return zjt;
                }
            }
        }
        return null;
    }

    public static boolean a(String str) {
        return str == null || str.equals("NORMAL");
    }

    public final String toString() {
        return this.a;
    }
}
