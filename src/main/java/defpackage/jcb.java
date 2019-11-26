package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.settings.SettingsActivity;

/* renamed from: jcb */
public class jcb extends dvh implements uhf {
    private volatile uhd a;
    private final Object b = new Object();

    public void onCreate(Bundle bundle) {
        ((jbt) b()).a((SettingsActivity) this);
        super.onCreate(bundle);
    }

    public final Object b() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new uhd(this);
                }
            }
        }
        return this.a.b();
    }
}
