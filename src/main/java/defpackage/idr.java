package defpackage;

import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: idr */
public final /* synthetic */ class idr implements bcvk {
    private final ids a;

    public idr(ids ids) {
        this.a = ids;
    }

    public final void a(Object obj) {
        ids ids = this.a;
        idm idm = (idm) obj;
        idn a = idm.a();
        boolean b = idm.b();
        if (a.a()) {
            int i;
            ids.f.a(ids.a(a), b);
            ids.g.a(ids.a(a), b);
            ids.f.d().setEnabled(a.e());
            ids.g.d().setEnabled(a.f());
            ids.k.a(ids.a(a), b);
            boolean z = (!a.k().t || !xrn.c(ids.a) || a.g() || a.j() || a.h() || a.i()) ? false : true;
            ids.i.a(z, b);
            ids.h.a(z, b);
            if (z) {
                i = ((int) TimeUnit.MILLISECONDS.toSeconds((long) ids.c.a())) == 10 ? 1 : 2;
                if (ids.q != i) {
                    ids.q = i;
                    ImageView imageView = (ImageView) ids.h.d();
                    ImageView imageView2 = (ImageView) ids.i.d();
                    if (i == 1) {
                        imageView.setImageResource(R.drawable.player_replay_10);
                        imageView2.setImageResource(R.drawable.player_forward_10);
                    } else {
                        imageView.setImageResource(R.drawable.player_fast_rewind);
                        imageView2.setImageResource(R.drawable.player_fast_forward);
                    }
                }
            }
            b = a.c();
            if (z) {
                if (b) {
                    i = ids.p;
                } else {
                    i = ids.o;
                }
                ids.a(ids.h.d(), i, 0);
                ids.a(ids.i.d(), 0, i);
            } else if (b) {
                i = ids.n;
            } else {
                i = ids.m;
            }
            ids.a(ids.j.d(), i, i);
            ids.e.t.requestLayout();
            return;
        }
        ids.h.b(b);
        ids.i.b(b);
        ids.g.b(b);
        ids.f.b(b);
        ids.k.a(false, b);
    }
}
