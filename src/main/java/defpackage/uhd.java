package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.HashMap;

/* renamed from: uhd */
public final class uhd implements uhf {
    private volatile Object a;
    private final Object b = new Object();
    private final Activity c;

    public uhd(Activity activity) {
        Object obj = new Object();
        HashMap hashMap = new HashMap();
        this.c = activity;
    }

    public final Object b() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    if (this.c.getApplication() instanceof uhf) {
                        this.a = ((uhb) ((uhf) this.c.getApplication()).b()).a(new uhg(this.c));
                    } else if (Application.class.equals(this.c.getApplication().getClass())) {
                        throw new IllegalStateException("Sting Activity must be attached to an @Sting Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
                    } else {
                        String valueOf = String.valueOf(this.c.getApplication().getClass());
                        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 65);
                        stringBuilder.append("Sting Activity must be attached to an @Sting Application. Found: ");
                        stringBuilder.append(valueOf);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
        }
        return this.a;
    }
}
