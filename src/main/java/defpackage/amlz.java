package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: amlz */
public final class amlz extends dhu implements amma {
    amlz(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IThumbnailLoaderClient");
    }

    public final void a(Bitmap bitmap, String str, boolean z, boolean z2) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bitmap);
        aK_.writeString(str);
        dhw.a(aK_, z);
        dhw.a(aK_, z2);
        b(1, aK_);
    }

    public final void a(String str, boolean z, boolean z2) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        dhw.a(aK_, z);
        dhw.a(aK_, z2);
        b(2, aK_);
    }
}
