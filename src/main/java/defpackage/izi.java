package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;

/* renamed from: izi */
public final class izi implements OnPreferenceChangeListener {
    private final /* synthetic */ DeveloperPrefsFragment a;

    public izi(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        String str = (String) obj;
        if (str == null || str.isEmpty()) {
            this.a.a((int) R.string.pref_developer_simulate_remote_video_offline_no_video_id_error, 0);
            return true;
        }
        this.a.a.edit().putString("SimulateRemoteVideoOffline", str).apply();
        avrh avrh = (avrh) OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.f.createBuilder();
        avrh.a(2);
        avrh.a(str);
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) ((anxl) avrh.build());
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, offlineVideoEndpointOuterClass$OfflineVideoEndpoint);
        apxu apxu = (apxu) ((anxl) apxx.build());
        apac apac = (apac) apaa.d.createBuilder();
        apac.copyOnWrite();
        apaa apaa = (apaa) apac.instance;
        if (apxu != null) {
            if (!apaa.c.a()) {
                apaa.c = anxl.mutableCopy(apaa.c);
            }
            apaa.c.add(apxu);
            this.a.m.a(((apaa) ((anxl) apac.build())).toByteArray(), apac.getClass().getName());
            this.a.a((int) R.string.pref_developer_simulate_remote_video_offline_success, 0);
            return true;
        }
        throw new NullPointerException();
    }
}
