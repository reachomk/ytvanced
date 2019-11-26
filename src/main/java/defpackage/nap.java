package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurveyOverlayService;
import java.util.List;

/* renamed from: nap */
public final class nap extends dhu implements nan {
    public nap(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISurveyOverlayClient");
    }

    public final void a(ISurveyOverlayService iSurveyOverlayService) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) iSurveyOverlayService);
        b(1, aK_);
    }

    public final void a() {
        b(2, aK_());
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(3, aK_);
    }

    public final void a(String str, List list, boolean z) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        aK_.writeStringList(list);
        dhw.a(aK_, z);
        b(4, aK_);
    }

    public final void b() {
        b(5, aK_());
    }

    public final void a(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(6, aK_);
    }

    public final void c() {
        b(7, aK_());
    }
}
