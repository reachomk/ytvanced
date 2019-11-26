package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bakf */
public final class bakf extends dhu implements bakd {
    bakf(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
    }

    public final long a(int i, int i2, int i3) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        aK_.writeInt(i2);
        aK_.writeInt(i3);
        Parcel a = a(2, aK_);
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    public final long a() {
        Parcel a = a(4, aK_());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    public final long a(String str, String str2) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        aK_.writeString(str2);
        Parcel a = a(5, aK_);
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
