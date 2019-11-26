package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* renamed from: pfk */
public final class pfk extends riy implements pfi {
    pfk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void a(Map map, long j, String str, List list) {
        Parcel aX_ = aX_();
        aX_.writeMap(map);
        aX_.writeLong(j);
        aX_.writeString(str);
        aX_.writeTypedList(list);
        b(1, aX_);
    }
}
