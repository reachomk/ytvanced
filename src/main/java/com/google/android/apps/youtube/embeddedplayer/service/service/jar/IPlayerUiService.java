package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.dhu;
import defpackage.dhx;

public interface IPlayerUiService extends IInterface {

    public abstract class Stub extends dhx implements IPlayerUiService {

        public class Proxy extends dhu implements IPlayerUiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IPlayerUiService");
            }

            public final void a() {
                b(1, aK_());
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IPlayerUiService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            a();
            parcel2.writeNoException();
            return true;
        }
    }

    void a();
}
