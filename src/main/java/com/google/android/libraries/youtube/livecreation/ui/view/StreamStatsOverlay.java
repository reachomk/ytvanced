package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

public class StreamStatsOverlay extends RelativeLayout {
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;

    public StreamStatsOverlay(Context context) {
        super(context);
        a(context);
    }

    public StreamStatsOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public StreamStatsOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private final void a(Context context) {
        inflate(context, R.layout.lc_stream_stats_overlay, this);
        setSaveEnabled(true);
        this.a = (TextView) findViewById(R.id.stats_current_resolution);
        this.b = (TextView) findViewById(R.id.stats_target_frame_rate);
        this.c = (TextView) findViewById(R.id.stats_current_frame_rate);
        this.d = (TextView) findViewById(R.id.stats_target_bitrate);
        this.e = (TextView) findViewById(R.id.stats_current_bitrate);
        this.f = (TextView) findViewById(R.id.stats_bandwidth_test);
        this.f.setText("");
    }
}
