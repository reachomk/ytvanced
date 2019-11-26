package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.youtube.R;
import defpackage.bed;
import defpackage.beg;
import defpackage.sd;

public class SwitchPreference extends TwoStatePreference {
    private final beg c = new beg(this);
    private CharSequence d;
    private CharSequence k;

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int a = sd.a(context, (int) R.attr.switchPreferenceStyle, 16843629);
        super(context, attributeSet, a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.aD, a, 0);
        a(sd.b(obtainStyledAttributes, bed.aW, bed.aR));
        b(sd.b(obtainStyledAttributes, bed.aV, bed.aQ));
        this.d = sd.b(obtainStyledAttributes, bed.aY, bed.aT);
        b();
        this.k = sd.b(obtainStyledAttributes, bed.aX, bed.aS);
        b();
        this.b = sd.a(obtainStyledAttributes, bed.aU, bed.aP, false);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view) {
        g();
        if (((AccessibilityManager) this.e.getSystemService("accessibility")).isEnabled()) {
            View findViewById = view.findViewById(16908352);
            boolean z = findViewById instanceof Switch;
            if (z) {
                ((Switch) findViewById).setOnCheckedChangeListener(null);
            }
            if (findViewById instanceof Checkable) {
                ((Checkable) findViewById).setChecked(this.a);
            }
            if (z) {
                Switch switchR = (Switch) findViewById;
                switchR.setTextOn(this.d);
                switchR.setTextOff(this.k);
                switchR.setOnCheckedChangeListener(this.c);
            }
            b(view.findViewById(16908304));
        }
    }
}
