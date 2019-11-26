package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

public class WebRtcStreamStatsOverlay extends RelativeLayout {
    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;

    public WebRtcStreamStatsOverlay(Context context) {
        super(context);
        a(context);
    }

    public WebRtcStreamStatsOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public WebRtcStreamStatsOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private final void a(Context context) {
        inflate(context, R.layout.lc_webrtc_stream_stats_overlay, this);
        setSaveEnabled(true);
        this.a = (TextView) findViewById(R.id.stats_video_input);
        this.b = (TextView) findViewById(R.id.stats_video_output);
        this.c = (TextView) findViewById(R.id.stats_video_bandwidth_limited);
        this.d = (TextView) findViewById(R.id.stats_video_cpu_limited);
        this.e = (TextView) findViewById(R.id.stats_video_average_encode_ms);
        this.f = (TextView) findViewById(R.id.stats_video_bitrate);
        this.g = (TextView) findViewById(R.id.stats_video_bytes_sent);
        this.h = (TextView) findViewById(R.id.stats_video_adaptation_changes);
        this.i = (TextView) findViewById(R.id.stats_video_codec);
        this.j = (TextView) findViewById(R.id.stats_video_buffer_mode);
        this.k = (TextView) findViewById(R.id.stats_audio_input_level);
        this.l = (TextView) findViewById(R.id.stats_audio_bytes_sent);
        this.m = (TextView) findViewById(R.id.stats_audio_codec);
    }
}
