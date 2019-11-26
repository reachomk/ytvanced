package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.acel;

public class StreamStatusView extends LinearLayout {
    public Chronometer a;
    private acel b = acel.GOOD;
    private String c;
    private LinearLayout d;
    private FrameLayout e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private View j;
    private View k;
    private View l;

    public StreamStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.lc_stream_status, this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (LinearLayout) findViewById(R.id.healthy_status_container);
        this.a = (Chronometer) findViewById(R.id.stream_duration);
        this.j = findViewById(R.id.stream_status_viewers_image);
        this.f = (TextView) findViewById(R.id.stream_status_viewers_count);
        this.g = (TextView) findViewById(R.id.stream_status_thumbs_up_count);
        this.h = (TextView) findViewById(R.id.super_chat_total);
        this.k = findViewById(R.id.stream_status_thumbs_up_count_image);
        this.l = findViewById(R.id.super_chat_total_image);
        this.e = (FrameLayout) findViewById(R.id.problem_status_container);
        this.i = (TextView) findViewById(R.id.stream_status_text);
        a(this.b, this.c);
    }

    public final void a(acel acel, String str) {
        String valueOf = String.valueOf(acel);
        String valueOf2 = String.valueOf(this.b);
        valueOf.length();
        valueOf2.length();
        this.b = acel;
        this.c = str;
        Object obj = (!TextUtils.equals(this.c, getContext().getString(R.string.lc_error_battery_low)) || TextUtils.isEmpty(this.c)) ? null : 1;
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            this.d.setVisibility(0);
            this.e.setVisibility(8);
        } else if (ordinal == 1) {
            this.d.setVisibility(8);
            if (obj != null) {
                this.i.setText(this.c);
            } else {
                this.i.setText(R.string.lc_stream_status_poor_connection);
            }
            this.e.setVisibility(0);
        } else if (ordinal == 2) {
            this.d.setVisibility(8);
            if (obj != null) {
                this.i.setText(this.c);
            } else {
                this.i.setText(R.string.lc_stream_status_bad_connection);
            }
            this.e.setVisibility(0);
        }
    }

    public final void a(String str) {
        this.f.setText(str);
        int i = !TextUtils.isEmpty(str) ? 0 : 8;
        this.f.setVisibility(i);
        this.j.setVisibility(i);
    }

    public final void b(String str) {
        this.g.setText(str);
        int i = !TextUtils.isEmpty(str) ? 0 : 8;
        this.g.setVisibility(i);
        this.k.setVisibility(i);
    }

    public final void c(String str) {
        this.h.setText(str);
        int i = !TextUtils.isEmpty(str) ? 0 : 8;
        this.h.setVisibility(i);
        this.l.setVisibility(i);
    }
}
