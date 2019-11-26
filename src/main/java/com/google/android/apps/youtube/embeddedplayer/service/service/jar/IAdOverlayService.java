package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;

public interface IAdOverlayService extends IInterface {

    public abstract class Stub extends dhx implements IAdOverlayService {

        public class Proxy extends dhu implements IAdOverlayService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IAdOverlayService");
            }

            public final void a() {
                b(1, aK_());
            }

            public final void a(Bundle bundle) {
                Parcel aK_ = aK_();
                dhw.a(aK_, (Parcelable) bundle);
                b(2, aK_);
            }

            public final void b() {
                b(3, aK_());
            }

            public final void a(int i, int i2) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                aK_.writeInt(i2);
                b(4, aK_);
            }

            public final void c() {
                b(5, aK_());
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IAdOverlayService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                a();
            } else if (i == 2) {
                a((Bundle) dhw.a(parcel, Bundle.CREATOR));
            } else if (i == 3) {
                b();
            } else if (i == 4) {
                a(parcel.readInt(), parcel.readInt());
            } else if (i != 5) {
                return false;
            } else {
                c();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a();

    void a(int i, int i2);

    void a(Bundle bundle);

    void b();

    void c();
}
