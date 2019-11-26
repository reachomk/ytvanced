package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qoc */
public final class qoc extends riy implements qnz {
    qoc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    public final Bitmap a(Uri uri) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) uri);
        Parcel a = a(1, aX_);
        Bitmap bitmap = (Bitmap) rjz.a(a, Bitmap.CREATOR);
        a.recycle();
        return bitmap;
    }
}
