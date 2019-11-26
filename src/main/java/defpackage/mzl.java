package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IControlsOverlayService;
import java.util.List;
import java.util.Map;

/* renamed from: mzl */
public final class mzl extends dhu implements mzj {
    public mzl(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IControlsOverlayClient");
    }

    public final void a(IControlsOverlayService iControlsOverlayService) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) iControlsOverlayService);
        b(1, aK_);
    }

    public final void a(aicd aicd) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) aicd);
        b(2, aK_);
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(3, aK_);
    }

    public final void a(aajq[] aajqArr, int i) {
        Parcel aK_ = aK_();
        aK_.writeTypedArray(aajqArr, 0);
        aK_.writeInt(i);
        b(4, aK_);
    }

    public final void b(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(5, aK_);
    }

    public final void c(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(6, aK_);
    }

    public final void d(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(7, aK_);
    }

    public final void e(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(8, aK_);
    }

    public final void b() {
        b(9, aK_());
    }

    public final void c() {
        b(10, aK_());
    }

    public final void a(aich aich) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) aich);
        b(11, aK_);
    }

    public final void a(String str, boolean z) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        dhw.a(aK_, z);
        b(12, aK_);
    }

    public final void f(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(13, aK_);
    }

    public final void a(long j, long j2, long j3, long j4) {
        Parcel aK_ = aK_();
        aK_.writeLong(j);
        aK_.writeLong(j2);
        aK_.writeLong(j3);
        aK_.writeLong(j4);
        b(14, aK_);
    }

    public final void d() {
        b(15, aK_());
    }

    public final void e() {
        b(16, aK_());
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        dhw.a(aK_, (Parcelable) keyEvent);
        Parcel a = a(17, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean b(int i, KeyEvent keyEvent) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        dhw.a(aK_, (Parcelable) keyEvent);
        Parcel a = a(18, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final void g(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(19, aK_);
    }

    public final void h(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(20, aK_);
    }

    public final void a(ajis ajis) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) ajis);
        b(21, aK_);
    }

    public final void a(Map map) {
        Parcel aK_ = aK_();
        aK_.writeMap(map);
        b(22, aK_);
    }

    public final void f() {
        b(23, aK_());
    }

    public final void a(List list) {
        Parcel aK_ = aK_();
        aK_.writeTypedList(list);
        b(24, aK_);
    }

    public final void i(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(25, aK_);
    }

    public final void a(String str) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        b(26, aK_);
    }

    public final void j(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(27, aK_);
    }
}
