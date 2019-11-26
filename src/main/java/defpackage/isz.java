package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: isz */
public final class isz extends akpl {
    private final itg a;
    private final iti b;
    private final itj c;
    private final FrameLayout d;
    private akpl e;
    private akpl f;
    private akpl g;
    private akpl h;
    private akpl i;
    private akpl j;

    public isz(Context context, itg itg, iti iti, itj itj) {
        this.a = itg;
        this.b = iti;
        this.c = itj;
        this.d = new FrameLayout(context);
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        akpl akpl = this.j;
        if (akpl != null) {
            akpl.a(akpb);
        }
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        akpl akpl;
        aptw aptw = (aptw) obj;
        int a;
        if (akor.a("clarify_box_in_metadata_highlights") != Boolean.TRUE) {
            a = aptv.a(aptw.i);
            if (a != 0 && a == 4) {
                if (this.i == null) {
                    this.i = this.c.a(this.d);
                }
                akpl = this.i;
            } else {
                a = aptv.a(aptw.i);
                if (a == 0 || a != 3) {
                    if (this.g == null) {
                        this.g = this.a.a((int) R.layout.clarification_item_small, this.d);
                    }
                    akpl = this.g;
                } else {
                    if (this.h == null) {
                        this.h = this.b.a((int) R.layout.clarification_item_medium, this.d);
                    }
                    akpl = this.h;
                }
            }
        } else {
            a = aptv.a(aptw.i);
            if (a != 0 && a == 4) {
                if (this.i == null) {
                    this.i = this.c.a(this.d);
                }
                akpl = this.i;
            } else {
                a = aptv.a(aptw.i);
                if (a != 0 && a == 3) {
                    if (this.f == null) {
                        this.f = this.b.a((int) R.layout.clarification_metadata_highlights_item_medium, this.d);
                    }
                    akpl = this.f;
                } else {
                    if (this.e == null) {
                        this.e = this.a.a((int) R.layout.clarification_metadata_highlights_item_small, this.d);
                    }
                    akpl = this.e;
                }
            }
        }
        this.j = akpl;
        this.d.removeAllViews();
        this.d.addView(this.j.K_());
        this.j.a_(akor, aptw);
    }
}
