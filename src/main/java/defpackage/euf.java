package defpackage;

import android.content.res.Resources;
import android.preference.ListPreference;
import android.text.TextUtils;
import java.util.List;

/* renamed from: euf */
public final class euf {
    public static boolean a(List list, Class cls) {
        if (list != null) {
            for (Object isInstance : list) {
                if (cls.isInstance(isInstance)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(eue eue, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (eue.onIsHidingHeaders() || !eue.onIsMultiPane()) {
                eue.setTitle(charSequence);
            }
        }
    }

    public static void a(Enum[] enumArr, int i, ListPreference listPreference, int i2, Resources resources) {
        amqw.a(r0 > 0);
        String[] strArr = new String[r0];
        int i3 = 0;
        for (Enum enumR : enumArr) {
            strArr[i3] = enumR.toString();
            i3++;
        }
        listPreference.setEntries(strArr);
        listPreference.setEntryValues(strArr);
        if (listPreference.getEntry() == null) {
            listPreference.setValueIndex(i);
        }
        listPreference.setSummary(resources.getString(i2, new Object[]{listPreference.getEntry()}));
        listPreference.setOnPreferenceChangeListener(new eui(resources, i2));
    }
}
