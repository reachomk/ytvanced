package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ajis;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;

public interface IControlsOverlayService extends IInterface {

    public abstract class Stub extends dhx implements IControlsOverlayService {

        public class Proxy extends dhu implements IControlsOverlayService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IControlsOverlayService");
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

            public final void a(long j) {
                Parcel aK_ = aK_();
                aK_.writeLong(j);
                b(4, aK_);
            }

            public final void d() {
                b(5, aK_());
            }

            public final void e() {
                b(6, aK_());
            }

            public final void a(int i) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                b(7, aK_);
            }

            public final void f() {
                b(8, aK_());
            }

            public final void g() {
                b(9, aK_());
            }

            public final void h() {
                b(10, aK_());
            }

            public final void a(boolean z) {
                Parcel aK_ = aK_();
                dhw.a(aK_, z);
                b(11, aK_);
            }

            public final void i() {
                b(12, aK_());
            }

            public final void j() {
                b(13, aK_());
            }

            public final void a(ajis ajis) {
                Parcel aK_ = aK_();
                dhw.a(aK_, (Parcelable) ajis);
                b(14, aK_);
            }

            public final void k() {
                b(15, aK_());
            }

            public final void l() {
                b(16, aK_());
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IControlsOverlayService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    a();
                    break;
                case 2:
                    b();
                    break;
                case 3:
                    c();
                    break;
                case 4:
                    a(parcel.readLong());
                    break;
                case 5:
                    d();
                    break;
                case 6:
                    e();
                    break;
                case 7:
                    a(parcel.readInt());
                    break;
                case 8:
                    f();
                    break;
                case 9:
                    g();
                    break;
                case 10:
                    h();
                    break;
                case 11:
                    a(dhw.a(parcel));
                    break;
                case 12:
                    i();
                    break;
                case 13:
                    j();
                    break;
                case 14:
                    a((ajis) dhw.a(parcel, ajis.CREATOR));
                    break;
                case 15:
                    k();
                    break;
                case 16:
                    l();
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a();

    void a(int i);

    void a(long j);

    void a(ajis ajis);

    void a(boolean z);

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();
}
