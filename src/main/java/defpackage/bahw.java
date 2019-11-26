package defpackage;

import android.os.Parcel;

/* renamed from: bahw */
public abstract class bahw extends dhx implements bahx {
    public bahw() {
        super("com.google.vr.vrcore.common.api.ITransitionCallbacks");
    }

    /* Access modifiers changed, original: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        onTransitionComplete();
        return true;
    }
}
