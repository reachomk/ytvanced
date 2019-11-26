package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.CastDevice;
import java.net.Inet4Address;
import java.net.InetAddress;

/* renamed from: tdn */
public final class tdn extends tdg {
    public static final Creator CREATOR = new tdm();

    public final /* bridge */ /* synthetic */ int describeContents() {
        return 0;
    }

    public tdn(CastDevice castDevice) {
        super(castDevice);
    }

    public tdn(Parcel parcel) {
        super(parcel);
    }

    public final boolean a(int i) {
        if (i == 1) {
            return this.a.a(1);
        }
        if (i == 2) {
            return this.a.a(2);
        }
        if (i == 4) {
            return this.a.a(4);
        }
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append("Unsupported capability constant: ");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final /* synthetic */ void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public final /* synthetic */ boolean d() {
        return !this.a.a.startsWith("__cast_nearby__");
    }

    public final /* bridge */ /* synthetic */ Inet4Address c() {
        InetAddress inetAddress = this.a.b;
        return (inetAddress != null && (inetAddress instanceof Inet4Address)) ? (Inet4Address) inetAddress : null;
    }

    public final /* synthetic */ String b() {
        CastDevice castDevice = this.a;
        if (castDevice.a.startsWith("__cast_nearby__")) {
            return castDevice.a.substring(16);
        }
        return castDevice.a;
    }

    public final /* bridge */ /* synthetic */ String a() {
        return this.a.c;
    }
}
