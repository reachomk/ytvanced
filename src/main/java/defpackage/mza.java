package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IAdOverlayService;

/* renamed from: mza */
public final class mza extends dhu implements myy {
    public mza(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IAdOverlayClient");
    }

    public final void a(IAdOverlayService iAdOverlayService) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) iAdOverlayService);
        b(1, aK_);
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(2, aK_);
    }

    public final void b(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(3, aK_);
    }

    public final void a(CharSequence charSequence) {
        Parcel aK_ = aK_();
        dhw.a(aK_, charSequence);
        b(4, aK_);
    }

    public final void a(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(5, aK_);
    }

    public final void a(Bitmap bitmap) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bitmap);
        b(6, aK_);
    }

    public final void e(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(7, aK_);
    }

    public final void b(CharSequence charSequence) {
        Parcel aK_ = aK_();
        dhw.a(aK_, charSequence);
        b(8, aK_);
    }

    public final void c(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(9, aK_);
    }

    public final void d(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(10, aK_);
    }

    public final void b(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(11, aK_);
    }
}
