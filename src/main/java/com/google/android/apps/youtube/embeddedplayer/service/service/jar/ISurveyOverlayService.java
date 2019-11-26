package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;

public interface ISurveyOverlayService extends IInterface {

    public abstract class Stub extends dhx implements ISurveyOverlayService {

        public class Proxy extends dhu implements ISurveyOverlayService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurveyOverlayService");
            }

            public final void a(int i, int i2) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                aK_.writeInt(i2);
                b(1, aK_);
            }

            public final void a(int[] iArr) {
                Parcel aK_ = aK_();
                aK_.writeIntArray(iArr);
                b(2, aK_);
            }

            public final void a(Bundle bundle) {
                Parcel aK_ = aK_();
                dhw.a(aK_, (Parcelable) bundle);
                b(3, aK_);
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurveyOverlayService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                a(parcel.readInt(), parcel.readInt());
            } else if (i == 2) {
                a(parcel.createIntArray());
            } else if (i != 3) {
                return false;
            } else {
                a((Bundle) dhw.a(parcel, Bundle.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(int i, int i2);

    void a(Bundle bundle);

    void a(int[] iArr);
}
