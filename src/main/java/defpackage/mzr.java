package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: mzr */
public final class mzr extends dhu implements mzp {
    public mzr(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
    }

    public final void a(boolean z) {
        throw null;
    }

    public final void a(Bitmap bitmap) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bitmap);
        b(1, aK_);
    }

    public final void a(CharSequence charSequence) {
        Parcel aK_ = aK_();
        dhw.a(aK_, charSequence);
        b(2, aK_);
    }

    public final void b(CharSequence charSequence) {
        Parcel aK_ = aK_();
        dhw.a(aK_, charSequence);
        b(3, aK_);
    }

    public final void a(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(5, aK_);
    }

    public final void b(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(6, aK_);
    }

    public final String a(String str) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        Parcel a = a(7, aK_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
