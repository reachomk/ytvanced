package defpackage;

import android.content.Context;
import android.preference.ListPreference;
import java.util.Map;

/* renamed from: jay */
public final class jay extends ListPreference {
    public Map a;

    public jay(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final String getPersistedString(String str) {
        return String.valueOf(getPersistedInt(-1));
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean persistString(String str) {
        return persistInt(Integer.parseInt(str));
    }

    public final CharSequence getSummary() {
        int persistedInt = getPersistedInt(-1);
        if (persistedInt >= 0) {
            Map map = this.a;
            if (map != null && map.containsKey(String.valueOf(persistedInt))) {
                return (CharSequence) this.a.get(String.valueOf(persistedInt));
            }
        }
        return super.getSummary();
    }
}
