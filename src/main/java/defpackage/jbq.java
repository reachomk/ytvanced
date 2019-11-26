package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.view.View;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jbq */
public final class jbq extends Preference implements OnSeekBarChangeListener {
    public int a;
    public int b;
    public boolean c;
    public jbp d;
    private SeekBar e;
    private TextView f;
    private TextView g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;

    public jbq(Context context) {
        super(context, null, 0);
        setLayoutResource(R.layout.setting_seekbar_preference);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBindView(View view) {
        super.onBindView(view);
        this.e = (SeekBar) view.findViewById(R.id.seekbar);
        this.e.setOnSeekBarChangeListener(this);
        this.e.setEnabled(isEnabled());
        this.f = (TextView) view.findViewById(R.id.label_start);
        this.g = (TextView) view.findViewById(R.id.label_end);
        a();
        a(this.i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSetInitialValue(boolean z, Object obj) {
        int persistedInt;
        if (z) {
            persistedInt = getPersistedInt(0);
        } else {
            persistedInt = ((Integer) obj).intValue();
        }
        a(persistedInt, true);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object onGetDefaultValue(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInteger(i, 0));
    }

    public final void a() {
        int i = this.b - this.a;
        int i2 = i / 100;
        this.h = i2;
        SeekBar seekBar = this.e;
        if (seekBar != null) {
            seekBar.setMax(i / i2);
            a(this.i);
        }
    }

    private final void a(int i, boolean z) {
        int i2 = this.a;
        if (i < i2) {
            i = i2;
        }
        if (z) {
            int i3 = this.i;
            if (!(i == i3 && this.j)) {
                this.j = true;
                this.i = i;
                persistInt(i);
                if (i != i3) {
                    OnPreferenceChangeListener onPreferenceChangeListener = getOnPreferenceChangeListener();
                    if (onPreferenceChangeListener != null) {
                        onPreferenceChangeListener.onPreferenceChange(this, Integer.valueOf(this.i));
                    }
                    notifyChanged();
                }
            }
        }
        a(i);
    }

    private final void a(int i) {
        if (!this.k) {
            SeekBar seekBar = this.e;
            if (seekBar != null) {
                seekBar.setProgress((i - this.a) / this.h);
            }
        }
        jbp jbp = this.d;
        if (jbp != null) {
            TextView textView = this.f;
            if (textView != null && this.g != null) {
                textView.setText(jbp.a(i));
                this.g.setText(this.d.b(i));
            }
        }
    }

    private final int b(int i) {
        return this.a + (i * this.h);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (!z) {
            return;
        }
        if (!this.k) {
            a(b(i), true);
        } else if (this.c) {
            a(b(i), false);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.k = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.k = false;
        a(b(seekBar.getProgress()), true);
    }
}
