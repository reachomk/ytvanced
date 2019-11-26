package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.sd;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, sd.a(context, (int) R.attr.preferenceCategoryStyle, 16842892));
    }

    public final boolean f() {
        return false;
    }

    public final boolean c() {
        return super.f() ^ 1;
    }
}
