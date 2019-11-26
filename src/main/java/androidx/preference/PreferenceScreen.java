package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.bec;
import defpackage.sd;

public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, sd.a(context, (int) R.attr.preferenceScreenStyle, 16842891), (byte) 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        if (this.h == null && e() != 0) {
            bec bec = null.b;
            if (bec != null) {
                bec.a();
            }
        }
    }
}
