package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rom */
public final class rom extends riy implements roj {
    rom(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String a() {
        Parcel a = a(2, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List b() {
        Parcel a = a(3, aX_());
        ArrayList b = rjz.b(a);
        a.recycle();
        return b;
    }
}
