package com.google.android.libraries.youtube.edit.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.nlp;
import defpackage.uhy;
import defpackage.ujf;
import defpackage.ujh;
import defpackage.umo;
import defpackage.ums;
import java.util.Set;

public class EditableVideoControllerView extends umo {
    private final ImageView h;

    public EditableVideoControllerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = true;
        LayoutInflater.from(context).inflate(R.layout.editable_video_controller_view, this, true);
        Object obj = (TextView) findViewById(R.id.play_position_text);
        Object obj2 = (TextView) findViewById(R.id.video_duration_text);
        Object obj3 = (SeekBar) findViewById(R.id.play_progress_bar);
        if (this.d != null) {
            z = false;
        }
        uhy.b(z);
        this.b = (TextView) uhy.a(obj);
        this.c = (TextView) uhy.a(obj2);
        this.d = (SeekBar) uhy.a(obj3);
        obj3.setOnSeekBarChangeListener(this);
        this.h = (ImageView) findViewById(R.id.play_button);
        this.h.setOnClickListener(new ums(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        if (d()) {
            this.h.setImageResource(R.drawable.ic_preview_pause_btn);
            this.h.setContentDescription(getContext().getString(R.string.edit_pause_button_content_description));
            return;
        }
        this.h.setImageResource(R.drawable.ic_preview_play_btn);
        this.h.setContentDescription(getContext().getString(R.string.edit_play_button_content_description));
    }

    public final void a(ujf ujf, Set set) {
        this.f.addAll(set);
        if (this.e != null) {
            this.g = d();
            this.e.a(false);
        }
        for (ujh a : set) {
            a(ujf, a);
        }
        setVisibility(4);
    }

    public final void b(ujf ujf, Set set) {
        this.f.removeAll(set);
        nlp nlp = this.e;
        if (nlp != null) {
            long i = nlp.i() * 1000;
            if (set.contains(ujh.TrimStart)) {
                i = ujf.j();
            } else if (set.contains(ujh.TrimEnd)) {
                i = Math.max(ujf.l() - (!this.g ? 0 : 1000000), ujf.j());
            }
            if (!(set.size() == 1 && set.contains(ujh.RotationDegrees))) {
                a(i);
                this.e.a(this.g);
            }
        }
        setVisibility(0);
    }
}
