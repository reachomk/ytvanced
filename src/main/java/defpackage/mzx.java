package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ILiveOverlayService;

/* renamed from: mzx */
public final class mzx extends dhu implements mzv {
    public mzx(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.ILiveOverlayClient");
    }

    public final void a(ILiveOverlayService iLiveOverlayService) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) iLiveOverlayService);
        b(1, aK_);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        Parcel aK_ = aK_();
        dhw.a(aK_, charSequence);
        dhw.a(aK_, charSequence2);
        dhw.a(aK_, z);
        dhw.a(aK_, charSequence3);
        aK_.writeInt(i);
        dhw.a(aK_, charSequence4);
        aK_.writeInt(i2);
        b(2, aK_);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Parcel aK_ = aK_();
        dhw.a(aK_, charSequence);
        dhw.a(aK_, charSequence2);
        dhw.a(aK_, charSequence3);
        b(3, aK_);
    }

    public final void a() {
        b(4, aK_());
    }

    public final int b() {
        Parcel a = a(5, aK_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int c() {
        Parcel a = a(6, aK_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final void a(Bitmap bitmap) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bitmap);
        b(7, aK_);
    }
}
