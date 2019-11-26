package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.concurrent.TimeUnit;

/* renamed from: qcd */
public final class qcd extends qou {
    public static final Creator CREATOR = new qcp();
    private static final int b = ((int) TimeUnit.SECONDS.toMillis(60));
    public Bundle a = new Bundle();

    public qcd() {
        this.a.putInt("clientVersion", psf.b);
    }

    qcd(Bundle bundle) {
        this.a = bundle;
    }

    public final int a() {
        return this.a.getInt("timeoutMs", b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, i);
    }
}
