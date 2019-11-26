package defpackage;

import android.os.Parcel;
import com.google.android.gms.cast.CastDevice;
import java.net.Inet4Address;

/* renamed from: tdg */
class tdg implements tbn {
    public final CastDevice a;

    tdg(CastDevice castDevice) {
        this.a = castDevice;
    }

    public String a() {
        throw null;
    }

    public boolean a(int i) {
        throw null;
    }

    public String b() {
        throw null;
    }

    public Inet4Address c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    tdg() {
        this.a = null;
    }

    tdg(Parcel parcel) {
        this.a = (CastDevice) parcel.readParcelable(tdn.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
