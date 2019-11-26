package defpackage;

import androidx.preference.PreferenceGroup;

/* renamed from: bdz */
public final class bdz implements Runnable {
    private final /* synthetic */ PreferenceGroup a;

    public bdz(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
