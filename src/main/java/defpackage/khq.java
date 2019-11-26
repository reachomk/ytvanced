package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: khq */
public final class khq extends akpl {
    public final akkq a;
    private final Context b;
    private final flu c;
    private final aaas d;
    private final akvo e;
    private final FrameLayout f;
    private final akvp g;
    private kht h;
    private kht i;
    private kht j;

    public khq(Context context, akkq akkq, flu flu, aaas aaas, akvo akvo, akvp akvp) {
        this.b = context;
        this.c = (flu) amqw.a((Object) flu);
        this.a = akkq;
        this.d = aaas;
        this.e = akvo;
        this.f = new FrameLayout(context);
        this.g = akvp;
        flu.a(this.f);
    }

    public final View K_() {
        return this.c.b;
    }

    private final kht a(int i) {
        return new kht(this, this.b, this.a, i, this.c, this.d, this.e, this.g);
    }

    public final void a(akpb akpb) {
        kht kht = this.j;
        if (kht != null) {
            kht.a(akpb);
        }
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        awug awug = (awug) obj;
        this.f.removeAllViews();
        if (this.b.getResources().getConfiguration().orientation == 2) {
            this.h = a((int) R.layout.landscape_playlist_item);
            this.j = this.h;
        } else {
            int a = awue.a(awug.l);
            if (a == 0) {
                a = 1;
            }
            a--;
            a = (a == 1 || a == 2) ? R.layout.full_bleed_playlist_item : a != 3 ? R.layout.playlist_item : R.layout.full_bleed_playlist_item_three_up;
            this.i = a(a);
            this.j = this.i;
        }
        this.f.addView(this.j.c);
        this.j.a_(akor, awug);
        kht kht = this.j;
        View view = this.c.b;
        auvr auvr = awug.j;
        if (auvr == null) {
            auvr = auvr.c;
        }
        kht.a(view, auvr, awug, akor.a);
        this.c.a(akor);
    }
}
