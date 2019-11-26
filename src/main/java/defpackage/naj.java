package defpackage;

import android.graphics.Rect;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceHolderService;

/* renamed from: naj */
public final class naj extends dhu implements nah {
    public naj(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISurfaceHolderClient");
    }

    public final void a(ISurfaceHolderService iSurfaceHolderService) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) iSurfaceHolderService);
        b(1, aK_);
    }

    public final boolean a() {
        Parcel a = a(2, aK_());
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final Rect b() {
        Parcel a = a(3, aK_());
        Rect rect = (Rect) dhw.a(a, Rect.CREATOR);
        a.recycle();
        return rect;
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(4, aK_);
    }

    public final void a(int i, int i2) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        aK_.writeInt(i2);
        b(5, aK_);
    }

    public final void a(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(6, aK_);
    }

    public final void c() {
        b(7, aK_());
    }

    public final void b(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(8, aK_);
    }
}
