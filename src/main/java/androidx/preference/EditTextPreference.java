package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.bdv;
import defpackage.bed;
import defpackage.sd;

public class EditTextPreference extends DialogPreference {
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int a = sd.a(context, (int) R.attr.editTextPreferenceStyle, 16842898);
        super(context, attributeSet, a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.s, a, 0);
        if (sd.a(obtainStyledAttributes, bed.t, bed.t, false)) {
            if (bdv.a == null) {
                bdv.a = new bdv();
            }
            a(bdv.a);
        }
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final boolean c() {
        return TextUtils.isEmpty(null) || super.c();
    }
}
