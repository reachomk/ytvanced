package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: mzg */
public final class mzg extends dhu implements mze {
    public mzg(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiPlayerClient");
    }

    public final void a() {
        b(1, aK_());
    }

    public final void b() {
        b(2, aK_());
    }

    public final void c() {
        b(3, aK_());
    }

    public final void d() {
        b(4, aK_());
    }

    public final void a(String str, String str2, long j, long j2, boolean z, boolean z2, int i) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        aK_.writeString(str2);
        aK_.writeLong(j);
        aK_.writeLong(j2);
        dhw.a(aK_, z);
        dhw.a(aK_, z2);
        aK_.writeInt(i);
        b(5, aK_);
    }

    public final void e() {
        b(6, aK_());
    }

    public final void f() {
        b(7, aK_());
    }

    public final void g() {
        b(8, aK_());
    }

    public final void a(String str) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        b(9, aK_);
    }

    public final void a(long j, long j2) {
        Parcel aK_ = aK_();
        aK_.writeLong(j);
        aK_.writeLong(j2);
        b(10, aK_);
    }

    public final void a(long j) {
        Parcel aK_ = aK_();
        aK_.writeLong(j);
        b(11, aK_);
    }

    public final void h() {
        b(12, aK_());
    }

    public final void b(long j, long j2) {
        Parcel aK_ = aK_();
        aK_.writeLong(j);
        aK_.writeLong(j2);
        b(13, aK_);
    }

    public final void a(boolean z, long j) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        aK_.writeLong(j);
        b(14, aK_);
    }

    public final void b(long j) {
        Parcel aK_ = aK_();
        aK_.writeLong(j);
        b(15, aK_);
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(16, aK_);
    }

    public final void i() {
        b(17, aK_());
    }

    public final void j() {
        b(18, aK_());
    }

    public final void k() {
        b(19, aK_());
    }

    public final String b(String str) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        Parcel a = a(20, aK_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
