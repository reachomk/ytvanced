package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: pmx */
public final class pmx extends riy implements pmv {
    pmx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    public final int a() {
        throw null;
    }

    public final pyb a(pjw pjw) {
        throw null;
    }

    public final pyb a(pjw pjw, plj plj) {
        throw null;
    }

    public final qcs b() {
        Parcel a = a(2, aX_());
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
