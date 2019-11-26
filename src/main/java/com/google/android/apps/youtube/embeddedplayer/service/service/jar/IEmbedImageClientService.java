package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;
import defpackage.ngm;

public interface IEmbedImageClientService extends IInterface {

    public abstract class Stub extends dhx implements IEmbedImageClientService {

        public class Proxy extends dhu implements IEmbedImageClientService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedImageClientService");
            }

            public final void a(ngm ngm) {
                Parcel aK_ = aK_();
                dhw.a(aK_, (Parcelable) ngm);
                b(1, aK_);
            }

            public final void b(ngm ngm) {
                Parcel aK_ = aK_();
                dhw.a(aK_, (Parcelable) ngm);
                b(2, aK_);
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedImageClientService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                a((ngm) dhw.a(parcel, ngm.CREATOR));
            } else if (i != 2) {
                return false;
            } else {
                b((ngm) dhw.a(parcel, ngm.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(ngm ngm);

    void b(ngm ngm);
}
