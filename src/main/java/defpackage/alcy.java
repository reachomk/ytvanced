package defpackage;

import android.preference.ListPreference;

/* renamed from: alcy */
final /* synthetic */ class alcy implements aldc {
    private final ListPreference a;

    alcy(ListPreference listPreference) {
        this.a = listPreference;
    }

    public final void a(CharSequence charSequence) {
        this.a.setSummary(charSequence);
    }
}
