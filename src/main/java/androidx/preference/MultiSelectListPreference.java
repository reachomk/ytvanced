package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.bed;
import defpackage.sd;
import java.util.HashSet;

public class MultiSelectListPreference extends DialogPreference {
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int a = sd.a(context, (int) R.attr.dialogPreferenceStyle, 16842897);
        super(context, attributeSet, a);
        HashSet hashSet = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.A, a, 0);
        sd.d(obtainStyledAttributes, bed.D, bed.B);
        sd.d(obtainStyledAttributes, bed.E, bed.C);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
