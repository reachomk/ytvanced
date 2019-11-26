package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.youtube.R;
import defpackage.bdt;
import defpackage.bed;
import defpackage.sd;

public class CheckBoxPreference extends TwoStatePreference {
    private final bdt c = new bdt(this);

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int a = sd.a(context, (int) R.attr.checkBoxPreferenceStyle, 16842895);
        super(context, attributeSet, a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.a, a, 0);
        a(sd.b(obtainStyledAttributes, bed.g, bed.d));
        b(sd.b(obtainStyledAttributes, bed.f, bed.c));
        this.b = sd.a(obtainStyledAttributes, bed.e, bed.b, false);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view) {
        g();
        if (((AccessibilityManager) this.e.getSystemService("accessibility")).isEnabled()) {
            View findViewById = view.findViewById(16908289);
            boolean z = findViewById instanceof CompoundButton;
            if (z) {
                ((CompoundButton) findViewById).setOnCheckedChangeListener(null);
            }
            if (findViewById instanceof Checkable) {
                ((Checkable) findViewById).setChecked(this.a);
            }
            if (z) {
                ((CompoundButton) findViewById).setOnCheckedChangeListener(this.c);
            }
            b(view.findViewById(16908304));
        }
    }
}
