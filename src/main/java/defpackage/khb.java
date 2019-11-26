package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: khb */
public final class khb extends akpl {
    private final Context a;
    private final flu b;
    private final aaas c;
    private final akkq d;
    private final akvo e;
    private final FrameLayout f;
    private final akvp g;
    private kha h;
    private kha i;
    private kha j;

    public khb(Context context, akkq akkq, flu flu, aaas aaas, akvo akvo, akvp akvp) {
        this.a = context;
        this.b = (flu) amqw.a((Object) flu);
        this.d = akkq;
        this.c = aaas;
        this.e = akvo;
        this.f = new FrameLayout(context);
        this.g = akvp;
        flu.a(this.f);
    }

    public final View K_() {
        return this.b.b;
    }

    private final kha a(int i) {
        return new kha(this.a, this.d, i, this.b, this.c, this.e, this.g);
    }

    public final void a(akpb akpb) {
        kha kha = this.j;
        if (kha != null) {
            kha.a(akpb);
        }
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        awjp awjp = (awjp) obj;
        this.f.removeAllViews();
        if (this.a.getResources().getConfiguration().orientation != 2) {
            if (this.i == null) {
                this.i = a((int) R.layout.playlist_item);
            }
            this.j = this.i;
        } else {
            if (this.h == null) {
                this.h = a((int) R.layout.landscape_playlist_item);
            }
            this.j = this.h;
        }
        this.f.addView(this.j.c);
        this.j.a_(akor, awjp);
        kha kha = this.j;
        View view = this.b.b;
        auvr auvr = awjp.o;
        if (auvr == null) {
            auvr = auvr.c;
        }
        kha.a(view, auvr, awjp, akor.a);
        this.b.a(akor);
    }
}
