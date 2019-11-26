package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;
import defpackage.nhm;

public interface IEmbedFragmentService extends IInterface {

    public abstract class Stub extends dhx implements IEmbedFragmentService {

        public class Proxy extends dhu implements IEmbedFragmentService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
            }

            public final void a(nhm nhm) {
                Parcel aK_ = aK_();
                dhw.a(aK_, (Parcelable) nhm);
                b(1, aK_);
            }

            public final void b() {
                b(2, aK_());
            }

            public final int c() {
                Parcel a = a(3, aK_());
                int readInt = a.readInt();
                a.recycle();
                return readInt;
            }

            public final void a(int i) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                b(4, aK_);
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                a((nhm) dhw.a(parcel, nhm.CREATOR));
                parcel2.writeNoException();
            } else if (i == 2) {
                b();
                parcel2.writeNoException();
            } else if (i == 3) {
                i = c();
                parcel2.writeNoException();
                parcel2.writeInt(i);
            } else if (i != 4) {
                return false;
            } else {
                a(parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void a(int i);

    void a(nhm nhm);

    void b();

    int c();
}
