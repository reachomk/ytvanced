package defpackage;

import com.google.android.youtube.R;

/* renamed from: jab */
final class jab implements Runnable {
    private final /* synthetic */ izy a;

    jab(izy izy) {
        this.a = izy;
    }

    public final void run() {
        agwc agwc = (agwc) this.a.a.j.get();
        int a = this.a.a.h.a(agwc.c(), agwc.b());
        if (a == 0) {
            this.a.a.a((int) R.string.pref_developer_trigger_auto_offline_success, 0);
        } else if (a == 1) {
            this.a.a.a((int) R.string.pref_developer_trigger_auto_offline_retry, 0);
        }
    }
}
