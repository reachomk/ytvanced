package defpackage;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: aft */
final class aft {
    public static aft a;
    public final Context b;
    public final afs c = new afs();
    private final LocationManager d;

    aft(Context context, LocationManager locationManager) {
        this.b = context;
        this.d = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.d.isProviderEnabled(str)) {
                return this.d.getLastKnownLocation(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
