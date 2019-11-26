package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: kji */
public final class kji extends akpl {
    private final Context a;
    private final akkq b;
    private final aaas c;
    private final fmx d;
    private final akkl e;
    private final gax f;
    private final FrameLayout g;
    private kjl h;
    private kjl i;
    private kjl j;

    public kji(Context context, akkq akkq, aaas aaas, fmx fmx, akkl akkl, gax gax) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = fmx;
        this.e = akkl;
        this.f = gax;
        this.g = new FrameLayout(context);
        this.g.setLayoutParams(new LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.reels_avatar_row_container_width), -2));
    }

    public final View K_() {
        return this.g;
    }

    public final void a(akpb akpb) {
        kjl kjl = this.j;
        if (kjl != null) {
            kjl.a(akpb);
        }
    }

    private final kjl a(int i) {
        return new kjl(this.a, this.b, this.c, this.d, this.e, this.f, i);
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        awyw awyw = (awyw) obj;
        akor.a.a(awyw.f.d(), null);
        this.g.removeAllViews();
        int a = awwl.a(awyw.j);
        if (a != 0 && a == 2) {
            if (this.h == null) {
                this.h = a((int) R.layout.reels_avatar_row_item);
            }
            this.j = this.h;
        } else {
            a = awwl.a(awyw.j);
            if (a != 0 && a == 3) {
                if (this.i == null) {
                    this.i = a((int) R.layout.reels_avatar_row_circular_item);
                }
                this.j = this.i;
            } else {
                return;
            }
        }
        this.g.addView(this.j.a);
        this.j.a(akor, awyw);
    }
}
