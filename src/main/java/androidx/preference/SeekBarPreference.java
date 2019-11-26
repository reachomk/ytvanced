package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.youtube.R;
import defpackage.bed;
import defpackage.bee;
import defpackage.bef;

public class SeekBarPreference extends Preference {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean k;
    private int l;
    private int m;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        bef bef = new bef(this);
        bee bee = new bee(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.aw, R.attr.seekBarPreferenceStyle, 0);
        this.b = obtainStyledAttributes.getInt(bed.az, 0);
        int i = obtainStyledAttributes.getInt(bed.ay, 100);
        int i2 = this.b;
        if (i < i2) {
            i = i2;
        }
        if (i != this.l) {
            this.l = i;
            b();
        }
        i = obtainStyledAttributes.getInt(bed.aA, 0);
        if (i != this.m) {
            this.m = Math.min(this.l - this.b, Math.abs(i));
            b();
        }
        this.d = obtainStyledAttributes.getBoolean(bed.ax, true);
        obtainStyledAttributes.getBoolean(bed.aB, false);
        this.k = obtainStyledAttributes.getBoolean(bed.aC, false);
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    public final void a(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress != this.a) {
            int i = this.b;
            if (progress >= i) {
                i = progress;
            }
            progress = this.l;
            if (i > progress) {
                i = progress;
            }
            if (i != this.a) {
                this.a = i;
            }
        }
    }
}
