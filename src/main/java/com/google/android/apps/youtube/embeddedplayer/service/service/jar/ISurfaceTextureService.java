package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;

public interface ISurfaceTextureService extends IInterface {

    public abstract class Stub extends dhx implements ISurfaceTextureService {

        public class Proxy extends dhu implements ISurfaceTextureService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceTextureService");
            }

            public final void a(Surface surface) {
                Parcel aK_ = aK_();
                dhw.a(aK_, (Parcelable) surface);
                b(1, aK_);
            }

            public final void a(int i, int i2) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                aK_.writeInt(i2);
                b(2, aK_);
            }

            public final void a() {
                b(3, aK_());
            }

            public final void b() {
                b(4, aK_());
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceTextureService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                a((Surface) dhw.a(parcel, Surface.CREATOR));
            } else if (i == 2) {
                a(parcel.readInt(), parcel.readInt());
            } else if (i == 3) {
                a();
            } else if (i != 4) {
                return false;
            } else {
                b();
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a();

    void a(int i, int i2);

    void a(Surface surface);

    void b();
}
