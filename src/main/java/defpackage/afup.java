package defpackage;

import android.app.IntentService;
import com.google.android.libraries.youtube.notification.NotificationProcessingService;

/* renamed from: afup */
public abstract class afup extends IntentService implements uhf {
    private volatile uhh a;
    private final Object b = new Object();

    public afup(String str) {
        super(str);
    }

    public void onCreate() {
        ((afuo) b()).a((NotificationProcessingService) this);
        super.onCreate();
    }

    public final Object b() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new uhh(this);
                }
            }
        }
        return this.a.b();
    }
}
