package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: abqf */
public final class abqf implements abql, abwy, xcp {
    public final bcaa a;
    public final bcaa b;
    public ajxa c;
    public abqg d;
    public abww e;
    private final abqi f;
    private final bcaa g;
    private final bcaa h;
    private final abrq i;

    public abqf(abqi abqi, abrq abrq, xci xci, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.f = abqi;
        this.a = bcaa;
        this.f.a(this);
        this.b = bcaa2;
        this.g = bcaa3;
        this.h = bcaa4;
        this.i = abrq;
        xci.a((Object) this);
        abqh abqh = new abqh(this, bcaa, abqi);
    }

    public final void a(boolean z) {
    }

    public final void a(ajxa ajxa) {
        if (!amqq.a(ajxa, this.c)) {
            this.c = ajxa;
            a();
        }
    }

    public final void a() {
        if (this.d != null && abxy.b(this.c)) {
            abpo abpo = (abpo) this.a.get();
            abpo.o();
            if (this.d.a() != null) {
                this.d.a().o();
            }
            abpo.a(this.d.a());
            abqg abqg = this.d;
            if (abqg.d == null) {
                abqg.d = new abxg((abru) abxj.a((abru) abqg.a.a.get(), 1), (View) abxj.a(abqg.b, 2));
            }
            abxg abxg = abqg.d;
            abqc abqc = (abqc) this.h.get();
            abqc.a(abpo);
            abqc.a = abxg;
            abpo.a.b(abqc);
            abri b = this.d.b();
            ((abpk) this.b.get()).a(b);
            b.a(new abqe(this));
            ((abpm) this.g.get()).a = abpo;
            abpo.a(this.c);
            abww abww = this.e;
            if (abww != null) {
                a(abww);
            }
        }
    }

    public final void b() {
        this.c = null;
        if (this.d != null) {
            abpk abpk = (abpk) this.b.get();
            abpk.a();
            abpk.c.clear();
            abpk.e = null;
            akng akng = (abqc) this.h.get();
            akng.a(null);
            akng.a = null;
            abpo abpo = (abpo) this.a.get();
            abpo.a.a(akng);
            abpo.o();
            abpo.a(null);
        }
    }

    public final void a(abww abww) {
        if (abww != null) {
            int min;
            int i;
            Context context = abww.getContext();
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            boolean b = xss.b(context);
            if (this.i.c) {
                min = Math.min(Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels), resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_purchase_dialog_container_max_width));
                i = 1;
            } else if (b) {
                min = abww.getWidth();
                i = 8388693;
            } else {
                i = 87;
                min = -1;
            }
            abrq abrq = this.i;
            abrq.a = min;
            abrq.b = i;
            for (abrt a : abrq.d) {
                a.a();
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        boolean z = false;
        if (i == -1) {
            clsArr = new Class[]{ahjn.class};
        } else if (i == 0) {
            ahjn ahjn = (ahjn) obj;
            if (ahjn.a == airc.FULLSCREEN || ahjn.a == airc.DEFAULT) {
                abrq abrq = this.i;
                if (ahjn.a == airc.FULLSCREEN) {
                    z = true;
                }
                abrq.c = z;
                a(this.e);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
