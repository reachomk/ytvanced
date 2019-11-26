package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.acso;
import defpackage.acsp;
import defpackage.acsq;
import defpackage.acsr;
import defpackage.acss;
import defpackage.acst;
import defpackage.amqw;

public class DeveloperPanel extends RelativeLayout {
    private SwitchCompat a;
    private SwitchCompat b;
    private Runnable c;
    private SeekBar d;
    private SeekBar e;

    public DeveloperPanel(Context context) {
        super(context);
        a(context);
    }

    public DeveloperPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public DeveloperPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private final void a(Context context) {
        inflate(context, R.layout.lc_developer_panel, this);
        setSaveEnabled(true);
        ((ImageButton) findViewById(R.id.dismiss_developer_button)).setOnClickListener(new acsp(this));
        findViewById(R.id.enable_abr_setting_layout);
        findViewById(R.id.frame_rate_layout);
        findViewById(R.id.bitrate_layout);
        this.b = (SwitchCompat) findViewById(R.id.stats_for_nerds_toggle);
        this.b.setOnCheckedChangeListener(new acso(this));
        this.a = (SwitchCompat) findViewById(R.id.enable_abr_setting_toggle);
        this.a.setOnCheckedChangeListener(new acsr(this));
        TextView textView = (TextView) findViewById(R.id.frame_rate_value);
        this.d = (SeekBar) findViewById(R.id.frame_rate_slider);
        this.d.setOnSeekBarChangeListener(new acsq(this, textView));
        textView = (TextView) findViewById(R.id.bitrate_value);
        this.e = (SeekBar) findViewById(R.id.bitrate_slider);
        this.e.setOnSeekBarChangeListener(new acst(this, textView));
        a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            a();
        }
    }

    private final void a() {
        this.b.setEnabled(false);
        if (!this.b.isChecked()) {
            Runnable runnable = this.c;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.c = null;
            }
        } else if (this.c == null) {
            this.c = new acss(this);
            post(this.c);
        }
        this.a.setEnabled(false);
        this.a.setChecked(false);
        this.d.setEnabled(false);
        this.d.setMax(d(1));
        this.d.setProgress(d(1));
        this.e.setEnabled(false);
        this.e.setMax(c(2500000));
        this.e.setProgress(c(50000));
    }

    private final int c(int i) {
        return ((i - 50000) / 1000) / 50;
    }

    public final int a(int i) {
        amqw.a(i >= 0);
        i = (i * 50) + 50;
        return i <= 2500 ? i : 2500;
    }

    private final int d(int i) {
        amqw.a(true);
        return 1;
    }

    public final int b(int i) {
        amqw.a(i >= 0);
        return i <= 1 ? i : 1;
    }
}
