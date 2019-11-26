package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: gpt */
public final class gpt {
    public final int a;
    public final int b;
    public final Context c;
    public final aaas d;
    public final zzl e;
    public gpu f;
    public awga g;
    public OnGlobalLayoutListener h;
    public Dialog i;
    public int j;
    public int k;
    private final acwa l;

    public gpt(Context context, aaas aaas, acwa acwa, zzl zzl) {
        this.c = context;
        this.d = aaas;
        this.l = acwa;
        this.e = zzl;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.channel_mention_dialog_y_offset);
        this.b = context.getResources().getDimensionPixelSize(R.dimen.channel_mention_dialog_top_limit);
    }

    public final void a() {
        Dialog dialog = this.i;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static awge a(awgc awgc) {
        axak axak = awgc.c;
        if (axak == null) {
            axak = axak.a;
        }
        awge awge = (awge) ajzv.a(ajzv.a(axak), awge.class);
        return (awge == null || (awge.a & 2) == 0) ? null : awge;
    }

    public final void a(anvu anvu) {
        if (anvu != null) {
            this.l.t().b(new acvs(anvu));
        }
    }

    public final void b(anvu anvu) {
        if (anvu != null) {
            this.l.t().a(3, new acvs(anvu), null);
        }
    }

    public final Point a(View view) {
        if (view != null && xrn.c(this.c)) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            return new Point(rect.centerX(), rect.centerY());
        }
        gpu gpu = this.f;
        return new Point(gpu.a, gpu.b);
    }

    /* Access modifiers changed, original: final */
    public final View a(View view, awge awge) {
        View inflate = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.channel_mention_dialog, this.f, false);
        View findViewById = inflate.findViewById(R.id.top_arrow);
        View findViewById2 = inflate.findViewById(R.id.bottom_arrow);
        if (a(view).y < this.b) {
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
        } else {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
        }
        inflate.findViewById(R.id.channel_mention_dialog_chevron).setScaleX(abe.g(inflate) == 1 ? -1.0f : 1.0f);
        if (!(awge == null || (awge.a & 1) == 0)) {
            TextView textView = (TextView) inflate.findViewById(R.id.dialog_text);
            arml arml = awge.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        return inflate;
    }
}
