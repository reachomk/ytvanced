package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* renamed from: wjd */
public final class wjd implements akot, wem {
    private final wjc a;
    private final xci b;
    private final View c;
    private final LinearLayout d = ((LinearLayout) this.c.findViewById(R.id.comment_thread));
    private final wek e;
    private wei f;
    private ajst g;
    private akor h;
    private final ImageView i = ((ImageView) this.c.findViewById(R.id.comment_divider));
    private View j;
    private View k;

    public wjd(Context context, xci xci, akkq akkq, akvz akvz, wek wek) {
        amqw.a((Object) context);
        this.b = (xci) amqw.a((Object) xci);
        amqw.a((Object) akkq);
        this.a = new wjc(context, (akpb) akvz.get());
        this.e = (wek) amqw.a((Object) wek);
        this.c = View.inflate(context, R.layout.comment_thread, null);
    }

    private final void a(akor akor) {
        View view = this.j;
        int indexOfChild = view != null ? this.d.indexOfChild(view) : -1;
        if (indexOfChild >= 0) {
            this.d.removeViewAt(indexOfChild);
        }
        wjc wjc = this.a;
        Object obj = this.f;
        ajsn ajsn = obj.b().a.a;
        akor = wjc.a(akor);
        akor.a("commentThreadMutator", obj);
        this.j = wjc.a(akor, ajsn);
        this.d.addView(this.j, indexOfChild);
    }

    private final void b(akor akor) {
        wjc wjc = this.a;
        Object obj = this.f;
        akor = wjc.a(akor);
        akor.a("commentThreadMutator", obj);
        ViewGroup viewGroup = (ViewGroup) wjc.a(akor, obj.b().b.a);
        this.k = viewGroup.getChildAt(0);
        this.d.addView(viewGroup);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        wek wek = this.e;
        Object obj = this.g;
        xsb.b(wek.a, obj, this);
        xsb.a(wek.a, obj);
        this.a.a(this.d);
        this.d.removeAllViews();
        this.j = null;
        this.k = null;
        this.h = null;
    }

    public final void a(ajsn ajsn) {
        View view = this.k;
        if (view != null) {
            ((wiz) akoz.a(view)).a(ajsn);
        } else {
            b(this.h);
        }
    }

    public final void be_() {
        this.b.d(zyp.a(this.f.b()));
    }

    public final void b(ajsn ajsn) {
        View view = this.k;
        if (view != null) {
            wiz wiz = (wiz) akoz.a(view);
            int b = wiz.b(ajsn);
            if (b >= 0) {
                wiz.c.removeViewAt(b);
            }
            wiz.b();
        }
    }

    public final void a(ajsn ajsn, ajsn ajsn2) {
        a(this.h);
    }

    public final void b(ajsn ajsn, ajsn ajsn2) {
        View view = this.k;
        if (view != null) {
            wiz wiz = (wiz) akoz.a(view);
            int b = wiz.b(ajsn);
            if (b >= 0) {
                wiz.c.removeViewAt(b);
                wiz.c.addView(wiz.b.a(wiz.d, ajsn2, b), b);
            }
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aoca aoca = (ajst) obj;
        this.g = (ajst) amqw.a((Object) aoca);
        this.h = (akor) amqw.a((Object) akor);
        ajsu ajsu = aoca.a;
        if (ajsu == null || ajsu.a == null) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        if (aoca.e) {
            this.i.setVisibility(8);
        }
        akor.a.a(aoca, aoca.c, this.c);
        this.f = new wex(this.e, (akvy) akor.a("sectionController"), aoca);
        if (!aoca.e) {
            this.i.setVisibility(0);
        }
        a(akor);
        ajss ajss = aoca.b;
        if (!(ajss == null || ajss.a == null)) {
            b(akor);
        }
        this.e.a(aoca, this);
    }
}
