package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import defpackage.ujf;
import defpackage.ujh;
import defpackage.ujk;
import java.util.Set;

public class AudioCrossFadeView extends FrameLayout implements OnSeekBarChangeListener, ujk {
    public final YouTubeTextView a;
    public final YouTubeTextView b;
    public final SeekBar c;
    public ujf d;
    public int e = 1308622847;

    public AudioCrossFadeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(R.layout.audio_swap_audio_cross_fade_view, this, true);
        this.a = (YouTubeTextView) inflate.findViewById(R.id.audio_swap_cross_fade_view_original_audio_text);
        this.b = (YouTubeTextView) inflate.findViewById(R.id.audio_swap_cross_fade_view_music_track_text);
        this.c = (SeekBar) inflate.findViewById(R.id.audio_swap_cross_fade_view_slider);
        this.c.setOnSeekBarChangeListener(this);
    }

    public final void a(ujf ujf, Set set) {
    }

    public final void b(ujf ujf, Set set) {
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float progress = ((float) seekBar.getProgress()) / 100.0f;
        ujf ujf = this.d;
        if (ujf != null) {
            ujf.a(progress);
        }
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Integer valueOf = Integer.valueOf(this.e);
        Integer valueOf2 = Integer.valueOf(-1);
        this.a.setTextColor(((Integer) argbEvaluator.evaluate(1.0f - progress, valueOf, valueOf2)).intValue());
        this.b.setTextColor(((Integer) argbEvaluator.evaluate(progress, Integer.valueOf(this.e), valueOf2)).intValue());
    }

    public final void a(ujf ujf, ujh ujh) {
        this.c.setProgress(Math.round(this.d.v() * 100.0f));
    }

    public static void a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(i, 0, i2, 0);
        view.setLayoutParams(layoutParams);
    }
}
