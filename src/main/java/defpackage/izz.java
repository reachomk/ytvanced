package defpackage;

import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;
import com.google.android.youtube.R;

/* renamed from: izz */
final class izz implements Runnable {
    private final /* synthetic */ izw a;

    izz(izw izw) {
        this.a = izw;
    }

    public final void run() {
        this.a.a.a((int) R.string.pref_developer_offline_browse_response_sync_starting_toast, 1);
        aaps a = this.a.a.d.a();
        a.n();
        a.g();
        String str = "FElibrary";
        a.c(str);
        DeveloperPrefsFragment developerPrefsFragment;
        try {
            this.a.a.f.a(this.a.a.d.a(a), str);
            developerPrefsFragment = this.a.a;
            developerPrefsFragment.g.post(new izr(developerPrefsFragment, developerPrefsFragment.getActivity().getString(R.string.pref_developer_offline_browse_response_sync_success_toast, new Object[]{str})));
        } catch (aanq unused) {
            developerPrefsFragment = this.a.a;
            developerPrefsFragment.g.post(new izr(developerPrefsFragment, developerPrefsFragment.getActivity().getString(R.string.pref_developer_offline_browse_response_sync_error_toast, new Object[]{str})));
        }
    }
}
