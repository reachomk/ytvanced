package defpackage;

import android.preference.ListPreference;

/* renamed from: jce */
public final class jce {
    public static void a(ListPreference listPreference, String[] strArr, String[] strArr2, int i) {
        listPreference.setEntries(strArr);
        listPreference.setEntryValues(strArr2);
        if (listPreference.getEntry() == null) {
            listPreference.setValueIndex(i);
        }
        listPreference.setSummary("%s");
    }
}
