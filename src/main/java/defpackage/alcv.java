package defpackage;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

/* renamed from: alcv */
final /* synthetic */ class alcv implements OnPreferenceChangeListener {
    private final alcs a;
    private final axha b;
    private final ListPreference c;

    alcv(alcs alcs, axha axha, ListPreference listPreference) {
        this.a = alcs;
        this.b = axha;
        this.c = listPreference;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        alcs alcs = this.a;
        axha axha = this.b;
        ListPreference listPreference = this.c;
        return new alda(alcs, axha, alcs.b, new alcy(listPreference)).a(listPreference.getValue(), obj);
    }
}
