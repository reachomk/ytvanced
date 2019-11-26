package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.bea;
import defpackage.bed;
import defpackage.sd;

public abstract class DialogPreference extends Preference {
    private CharSequence a;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.h, i, 0);
        this.a = sd.b(obtainStyledAttributes, bed.p, bed.k);
        if (this.a == null) {
            this.a = this.f;
        }
        sd.b(obtainStyledAttributes, bed.o, bed.j);
        if (obtainStyledAttributes.getDrawable(8) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        sd.b(obtainStyledAttributes, bed.r, bed.m);
        sd.b(obtainStyledAttributes, bed.q, bed.l);
        sd.a(obtainStyledAttributes, bed.n, bed.i, 0);
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sd.a(context, (int) R.attr.dialogPreferenceStyle, 16842897));
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        bea bea = null.a;
        if (bea != null) {
            bea.a();
        }
    }
}
