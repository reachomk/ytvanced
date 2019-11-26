package defpackage;

import android.app.Application;

/* renamed from: bg */
public final class bg {
    public static bc a(nn nnVar) {
        Application application = nnVar.getApplication();
        if (application != null) {
            if (bb.a == null) {
                bb.a = new bb(application);
            }
            return new bc(nnVar.R_(), bb.a);
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }
}
