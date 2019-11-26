package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatRecyclerView;
import com.google.android.youtube.R;

/* renamed from: hbg */
public final class hbg extends aito implements OnClickListener, enc {
    public final abqy a;
    public final Context b;
    public final boolean c;
    public boolean d;
    public LiveChatRecyclerView e;
    public ViewGroup f;
    public hbk g = hbl.d();
    private final bcaa h;
    private final bcaa i;
    private final acwa j;
    private final akpe k;
    private final akvz l;
    private final abpk m;
    private final abwx n;
    private final bcud o;
    private abwv p;
    private RelativeLayout q;
    private hbn r;
    private boolean s;

    public hbg(Context context, bcaa bcaa, acwa acwa, akvz akvz, bcaa bcaa2, akpe akpe, abpk abpk, abwx abwx, abqy abqy, bcud bcud) {
        super(context);
        this.b = context;
        this.h = bcaa;
        this.i = bcaa2;
        this.l = akvz;
        this.j = acwa;
        this.k = akpe;
        this.a = abqy;
        this.m = abpk;
        this.n = abwx;
        this.o = bcud;
        this.c = abqy.a.e;
    }

    public final void onClick(View view) {
        this.o.e_(emv.a);
    }

    public final boolean a(ejd ejd) {
        return emq.a(ejd) && ejd.a() && !ejd.k() && !ejd.n();
    }

    public final boolean c() {
        hbl a = this.g.a();
        return a.b() && a.c() != null && a(a.a());
    }

    public final void b(ejd ejd) {
        this.g.a(ejd);
        if (a(ejd) && this.g.a().b()) {
            e();
        } else {
            ag_();
        }
        m();
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(boolean z) {
        this.g.a(z);
        if (z) {
            e();
        } else {
            ag_();
            ((abpo) this.h.get()).n();
        }
        m();
    }

    public final void d() {
        RelativeLayout relativeLayout = this.q;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(!this.d ? 1.0f : 0.3f);
        }
    }

    private final void e() {
        this.s = true;
        af_();
    }

    public final /* synthetic */ void a(Context context, View view) {
        if (this.s) {
            hbl a = this.g.a();
            if (a.b() && a.c() != null) {
                abpo abpo = (abpo) this.h.get();
                ((abpm) this.i.get()).a = abpo;
                abpo.a(this.r);
                abpo.b(a.c());
                if (this.a.a()) {
                    abri abri = this.p;
                    if (abri != null) {
                        this.m.a(abri);
                    }
                }
            }
            if (this.c) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.live_chat_overlay_conversation_list_width);
                if (((Integer) xss.j(context).first).intValue() >= dimensionPixelSize) {
                    LayoutParams layoutParams = this.e.getLayoutParams();
                    layoutParams.width = dimensionPixelSize;
                    this.e.setLayoutParams(layoutParams);
                }
                d();
            }
            this.s = false;
        }
    }
}
