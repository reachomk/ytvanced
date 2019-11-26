package defpackage;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import android.service.media.MediaBrowserService.Result;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uq */
final class uq {
    private final Result a;

    uq(Result result) {
        this.a = result;
    }

    public final void a(Object obj) {
        Object obj2 = null;
        if (obj instanceof List) {
            Result result = this.a;
            List<Parcel> list = (List) obj;
            if (list != null) {
                obj2 = new ArrayList();
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    obj2.add(MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            result.sendResult(obj2);
        } else if (obj instanceof Parcel) {
            Parcel parcel2 = (Parcel) obj;
            parcel2.setDataPosition(0);
            this.a.sendResult(MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        } else {
            this.a.sendResult(null);
        }
    }
}
