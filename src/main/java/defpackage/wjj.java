package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wjj */
public final class wjj implements akot {
    private final View a;
    private final View b = this.a.findViewById(R.id.comment_poll_choice_icon);
    private final TextView c = ((TextView) this.a.findViewById(R.id.comment_poll_choice_text));
    private final TextView d = ((TextView) this.a.findViewById(R.id.comment_poll_choice_vote_percent));
    private final ProgressBar e = ((ProgressBar) this.a.findViewById(R.id.comment_poll_choice_vote_ratio));
    private final Resources f;
    private final Theme g;
    private final int h;

    public wjj(Context context) {
        this.a = View.inflate(context, R.layout.comment_poll_choice, null);
        this.f = context.getResources();
        this.g = context.getTheme();
        this.h = this.a.getPaddingBottom();
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        awlw awlw = (awlw) obj;
        this.b.setSelected(awlw.d);
        boolean a = akor.a("has_voted", false);
        boolean a2 = akor.a("is_last_item", false);
        View view = this.a;
        abe.a(view, abe.j(view), this.a.getPaddingTop(), abe.k(this.a), !a2 ? this.h : 0);
        int i = !a ? 8 : 0;
        int i2 = awlw.a;
        if (((i2 & 128) == 0 || (i2 & 256) == 0) && (i2 & 8) == 0 && (i2 & 64) == 0) {
            this.d.setVisibility(0);
            this.e.setVisibility(0);
            this.b.setVisibility(8);
        } else {
            this.d.setVisibility(i);
            this.e.setVisibility(i);
            this.b.setVisibility(0);
        }
        TextView textView = this.c;
        arml arml2 = null;
        if ((awlw.a & 1) != 0) {
            arml = awlw.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = this.d;
        if ((awlw.a & 32) != 0) {
            arml2 = awlw.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        textView.setText(ajqy.a(arml2));
        this.e.setProgress((int) (awlw.f * 100.0d));
        if (VERSION.SDK_INT < 23) {
            if (VERSION.SDK_INT < 21) {
                if (awlw.d) {
                    this.d.setTextColor(this.f.getColor(R.color.quantum_googblue500));
                    this.e.getProgressDrawable().setColorFilter(this.f.getColor(R.color.quantum_googblue500), Mode.SRC_IN);
                    return;
                }
                this.d.setTextColor(this.f.getColor(R.color.comment_poll_choice_unselected_color));
                this.e.getProgressDrawable().setColorFilter(this.f.getColor(R.color.comment_poll_progress_unselected_color), Mode.SRC_IN);
            } else if (awlw.d) {
                this.d.setTextColor(this.f.getColor(R.color.quantum_googblue500));
                this.e.setProgressTintList(this.f.getColorStateList(R.color.quantum_googblue500));
            } else {
                this.d.setTextColor(this.f.getColor(R.color.comment_poll_choice_unselected_color));
                this.e.setProgressTintList(this.f.getColorStateList(R.color.comment_poll_progress_unselected_color));
            }
        } else if (awlw.d) {
            this.d.setTextColor(this.f.getColor(R.color.quantum_googblue500, this.g));
            this.e.setProgressTintList(this.f.getColorStateList(R.color.quantum_googblue500, this.g));
        } else {
            this.e.setProgressTintList(this.f.getColorStateList(R.color.comment_poll_progress_unselected_color, this.g));
            this.d.setTextColor(this.f.getColor(R.color.comment_poll_choice_unselected_color, this.g));
        }
    }
}
