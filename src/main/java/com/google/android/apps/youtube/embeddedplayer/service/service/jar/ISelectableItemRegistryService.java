package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;
import defpackage.nhh;

public interface ISelectableItemRegistryService extends IInterface {

    public abstract class Stub extends dhx implements ISelectableItemRegistryService {

        public class Proxy extends dhu implements ISelectableItemRegistryService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISelectableItemRegistryService");
            }

            public final void a(nhh nhh) {
                Parcel aK_ = aK_();
                dhw.a(aK_, (Parcelable) nhh);
                b(1, aK_);
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISelectableItemRegistryService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            a((nhh) dhw.a(parcel, nhh.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    void a(nhh nhh);
}
