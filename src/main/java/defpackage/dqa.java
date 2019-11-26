package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: dqa */
final class dqa implements Runnable {
    public final /* synthetic */ dos a;

    dqa(dos dos) {
        this.a = dos;
    }

    public final void run() {
        ((SharedPreferences) this.a.ab.get()).registerOnSharedPreferenceChangeListener((OnSharedPreferenceChangeListener) this.a.aA.get());
        ((wxw) this.a.ac.get()).a("OnDeviceSuggestIndexFetcher", new abne(((ixh) this.a.aA.get()).a));
        ((zzl) this.a.ai.get()).a().b(dqd.a).c().a(new dqc(this));
    }
}
