package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public abstract class TwoStatePreference extends Preference {
    public boolean a;
    public boolean b;
    private CharSequence c;
    private CharSequence d;
    private boolean k;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        b(this.a ^ 1);
    }

    public final void b(boolean z) {
        boolean z2 = this.a;
        if (z2 != z || !this.k) {
            this.a = z;
            this.k = true;
            if (z2 != z) {
                a(c());
                b();
            }
        }
    }

    public final boolean c() {
        if (this.b ? this.a : !this.a) {
            if (!super.c()) {
                return false;
            }
        }
        return true;
    }

    public final void a(CharSequence charSequence) {
        this.c = charSequence;
        if (this.a) {
            b();
        }
    }

    public final void b(CharSequence charSequence) {
        this.d = charSequence;
        if (!this.a) {
            b();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (this.a && !TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (this.a || TextUtils.isEmpty(this.d)) {
                CharSequence d = d();
                if (TextUtils.isEmpty(d)) {
                    i = 8;
                } else {
                    textView.setText(d);
                }
            } else {
                textView.setText(this.d);
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }
}
