package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pmz */
public final class pmz extends riy implements pmw {
    pmz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    public final List a() {
        Parcel a = a(3, aX_());
        ArrayList createTypedArrayList = a.createTypedArrayList(plt.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final int[] b() {
        Parcel a = a(4, aX_());
        int[] createIntArray = a.createIntArray();
        a.recycle();
        return createIntArray;
    }
}
