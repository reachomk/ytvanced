package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: anqa */
public final class anqa extends ClassLoader {
    /* Access modifiers changed, original: protected|final */
    public final Class loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        FirebaseInstanceId.e();
        return anpx.class;
    }
}
