package defpackage;

import android.os.Binder;

/* renamed from: udz */
public final /* synthetic */ class udz {
    public static Object a(udy udy) {
        long clearCallingIdentity;
        try {
            udy = udy.a();
            return udy;
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = udy.a();
            return a;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
