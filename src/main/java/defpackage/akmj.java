package defpackage;

import android.preference.EditTextPreference;

/* renamed from: akmj */
final /* synthetic */ class akmj implements Runnable {
    private final EditTextPreference a;
    private final String b;

    akmj(EditTextPreference editTextPreference, String str) {
        this.a = editTextPreference;
        this.b = str;
    }

    public final void run() {
        this.a.setText(this.b);
    }
}
