package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.youtube.R;
import defpackage.bed;
import defpackage.beh;
import defpackage.sd;

public class SwitchPreferenceCompat extends TwoStatePreference {
    private final beh c = new beh(this);
    private CharSequence d;
    private CharSequence k;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.aE, R.attr.switchPreferenceCompatStyle, 0);
        a(sd.b(obtainStyledAttributes, bed.aM, bed.aH));
        b(sd.b(obtainStyledAttributes, bed.aL, bed.aG));
        this.d = sd.b(obtainStyledAttributes, bed.aO, bed.aJ);
        b();
        this.k = sd.b(obtainStyledAttributes, bed.aN, bed.aI);
        b();
        this.b = sd.a(obtainStyledAttributes, bed.aK, bed.aF, false);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view) {
        g();
        if (((AccessibilityManager) this.e.getSystemService("accessibility")).isEnabled()) {
            View findViewById = view.findViewById(R.id.switchWidget);
            boolean z = findViewById instanceof SwitchCompat;
            if (z) {
                ((SwitchCompat) findViewById).setOnCheckedChangeListener(null);
            }
            if (findViewById instanceof Checkable) {
                ((Checkable) findViewById).setChecked(this.a);
            }
            if (z) {
                SwitchCompat switchCompat = (SwitchCompat) findViewById;
                switchCompat.a = this.d;
                switchCompat.requestLayout();
                switchCompat.b = this.k;
                switchCompat.requestLayout();
                switchCompat.setOnCheckedChangeListener(this.c);
            }
            b(view.findViewById(16908304));
        }
    }
}
