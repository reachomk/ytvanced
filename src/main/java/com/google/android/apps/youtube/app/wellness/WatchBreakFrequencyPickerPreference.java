package com.google.android.apps.youtube.app.wellness;

import android.content.Context;
import android.content.res.Resources;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Switch;
import com.google.android.youtube.R;
import defpackage.amul;
import defpackage.mkw;
import defpackage.mkx;
import defpackage.mky;
import defpackage.mlb;
import defpackage.xse;
import defpackage.xsg;

public class WatchBreakFrequencyPickerPreference extends DialogPreference {
    public static final amul a;
    public static final amul b;
    public mlb c;
    private mkw d;

    public WatchBreakFrequencyPickerPreference(Context context) {
        this(context, null);
    }

    public WatchBreakFrequencyPickerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((mkx) xse.a(xsg.b(context))).a(this);
        setKey("watch_break_frequency_picker_preference");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBindView(View view) {
        super.onBindView(view);
        Switch switchR = (Switch) view.findViewById(R.id.toggle);
        if (this.c.a()) {
            setSummary(a(getContext().getResources(), this.c.b()));
            a(switchR, true);
            return;
        }
        setSummary(R.string.watch_break_setting_summary_off);
        a(switchR, false);
    }

    /* Access modifiers changed, original: protected|final */
    public final View onCreateDialogView() {
        this.d = new mkw(getContext());
        return this.d;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBindDialogView(View view) {
        super.onBindDialogView(view);
        this.d.a(a, b);
        int b = this.c.b();
        this.d.a(b / 60);
        this.d.b(b % 60);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDialogClosed(boolean z) {
        mkw mkw = this.d;
        if (mkw != null) {
            int a = mkw.a();
            int b = this.d.b();
            this.d = null;
            if (z) {
                if (a == 0 && b == 0) {
                    this.c.a(false);
                } else {
                    this.c.a(true);
                    this.c.a((a * 60) + b);
                }
                notifyChanged();
            }
        }
    }

    public final void a(boolean z) {
        this.c.a(z);
        notifyChanged();
        if (z) {
            showDialog(null);
        }
    }

    private final void a(Switch switchR, boolean z) {
        switchR.setOnCheckedChangeListener(null);
        switchR.setChecked(z);
        switchR.setOnCheckedChangeListener(new mky(this));
    }

    public static String a(Resources resources, int i) {
        int i2 = i / 60;
        i %= 60;
        if (i2 == 0) {
            return resources.getQuantityString(R.plurals.frequency_minutes_only, i, new Object[]{Integer.valueOf(i)});
        } else if (i == 0) {
            return resources.getQuantityString(R.plurals.frequency_hours_only, i2, new Object[]{Integer.valueOf(i2)});
        } else {
            r3 = new Object[2];
            r3[0] = resources.getQuantityString(R.plurals.frequency_hours_component, i2, new Object[]{Integer.valueOf(i2)});
            r3[1] = resources.getQuantityString(R.plurals.frequency_minutes_component, i, new Object[]{Integer.valueOf(i)});
            return resources.getString(R.string.frequency_compound_time_unit, r3);
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        Integer valueOf2 = Integer.valueOf(1);
        Integer valueOf3 = Integer.valueOf(2);
        Integer valueOf4 = Integer.valueOf(3);
        Integer valueOf5 = Integer.valueOf(4);
        Integer valueOf6 = Integer.valueOf(5);
        Integer valueOf7 = Integer.valueOf(6);
        Integer valueOf8 = Integer.valueOf(7);
        Integer valueOf9 = Integer.valueOf(8);
        Integer valueOf10 = Integer.valueOf(9);
        Integer valueOf11 = Integer.valueOf(10);
        Integer valueOf12 = Integer.valueOf(11);
        r10 = new Integer[12];
        Integer valueOf13 = Integer.valueOf(15);
        r10[3] = valueOf13;
        r10[4] = Integer.valueOf(16);
        r10[5] = Integer.valueOf(17);
        r10[6] = Integer.valueOf(18);
        r10[7] = Integer.valueOf(19);
        Integer valueOf14 = Integer.valueOf(20);
        r10[8] = valueOf14;
        r10[9] = Integer.valueOf(21);
        r10[10] = Integer.valueOf(22);
        r10[11] = Integer.valueOf(23);
        a = amul.a(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, r10);
        b = amul.a(valueOf, valueOf6, valueOf11, valueOf13, valueOf14, Integer.valueOf(25), Integer.valueOf(30), Integer.valueOf(35), Integer.valueOf(40), Integer.valueOf(45), Integer.valueOf(50), Integer.valueOf(55), new Integer[0]);
    }
}
