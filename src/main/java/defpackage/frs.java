package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;
import com.google.android.libraries.youtube.conversation.technodrome.view.ChatInlineFixedVideoView;
import java.util.concurrent.Executor;

/* renamed from: frs */
public final class frs implements adqi, ejc, ffx, fgt, ynv, ynx {
    private final xpw a;
    private final fgc b;
    private final fgb c;
    private final zbe d;
    private final eif e;
    private final lwc f;
    private final frb g;
    private final ywk h;
    private final ChatInlineFixedVideoView i;
    private final yxy j;
    private final RecyclerView k;
    private final xpu l;
    private final aaas m;
    private final acvx n;
    private yny o;

    public frs(ywk ywk, xpw xpw, InlinePlayerLayout inlinePlayerLayout, fgc fgc, fgb fgb, zbe zbe, eif eif, lwc lwc, frb frb, aaas aaas, acvx acvx, ChatInlineFixedVideoView chatInlineFixedVideoView, yxy yxy, RecyclerView recyclerView) {
        this.h = (ywk) amqw.a((Object) ywk);
        this.a = (xpw) amqw.a((Object) xpw);
        this.b = (fgc) amqw.a((Object) fgc);
        this.c = (fgb) amqw.a((Object) fgb);
        this.d = (zbe) amqw.a((Object) zbe);
        this.e = (eif) amqw.a((Object) eif);
        this.f = (lwc) amqw.a((Object) lwc);
        this.g = (frb) amqw.a((Object) frb);
        this.m = (aaas) amqw.a((Object) aaas);
        this.n = (acvx) amqw.a((Object) acvx);
        this.i = (ChatInlineFixedVideoView) amqw.a((Object) chatInlineFixedVideoView);
        this.j = (yxy) amqw.a((Object) yxy);
        this.k = (RecyclerView) amqw.a((Object) recyclerView);
        this.k.a(new frv(this));
        fgc.a((fgt) this);
        this.l = new xpu();
    }

    public final void a(boolean z) {
    }

    public final void b(adqe adqe) {
    }

    public final boolean b() {
        return true;
    }

    public final void c() {
    }

    public final void c(adqe adqe) {
    }

    public final boolean f() {
        return true;
    }

    public final boolean g() {
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final int j() {
        return 1;
    }

    public final void bk_() {
        this.c.a(this);
        this.e.a(this);
        this.g.a.a((adqi) this);
    }

    public final void bl_() {
        this.c.b(this);
        this.e.b(this);
        this.g.a.b((adqi) this);
    }

    public final void a(String str) {
        m();
        this.m.a(yjg.a(str, this.n), null);
    }

    public final void a(yny yny) {
        yny yny2 = this.o;
        if (yny2 != null) {
            yny2.b(true);
        }
        if (this.g.a()) {
            frb frb = this.g;
            ykf ykf = yny.e;
            if (ykf != null && frb.a()) {
                nkn nkn = (nkn) nkm.x.createBuilder();
                nkn.a(ykf.a.j);
                nkm nkm = (nkm) ((anxl) nkn.build());
                aiqs a = aiqq.a();
                a.h = nkm;
                frb.b.a(new airl(a.b()));
            }
            return;
        }
        if (this.e.c() == ejd.WATCH_WHILE_MINIMIZED) {
            this.f.g(false);
        }
        this.o = yny;
        yny = this.o;
        Object obj = this.i;
        yny.f = (ynx) amqw.a((Object) this);
        yny.g = (ChatInlineFixedVideoView) amqw.a(obj);
        ChatInlineFixedVideoView chatInlineFixedVideoView = yny.g;
        chatInlineFixedVideoView.d = yny;
        chatInlineFixedVideoView.a(yny.d.c);
        this.b.a(frs.c(yny), null, 1);
        this.d.a(yny, false);
        yny.c.a(true);
        ywk ywk = this.h;
        String str = this.o.b;
        yvb yvb = ywk.l;
        aadq a2 = yvb.b.a(str);
        if (a2 != null) {
            String relatedVideoRepliesToken = ((ylh) a2).getRelatedVideoRepliesToken();
            if (!TextUtils.isEmpty(relatedVideoRepliesToken)) {
                aarh aarh = yvb.a;
                Executor executor = yvb.c;
                aaml aaua = new aaua(aarh.c, aarh.d.c(), relatedVideoRepliesToken, true);
                aaua.g();
                xan.a(aarh.a(atft.f, aarh.g, aasj.a, aasi.a).a(aaua, executor), aniv.a, yve.a, new yvd(yvb, str));
            }
        }
    }

    public final void m() {
        yny yny = this.o;
        if (yny != null) {
            yny.b(false);
        }
    }

    public final void b(yny yny) {
        yny yny2 = this.o;
        if (yny2 != null && yny2.b.equals(yny.b)) {
            yny2 = this.o;
            if (yny2.a != yny.a) {
                yny.f = yny2.f;
                yny.h = yny2.h;
                yny.g = yny2.g;
                yny.g.d = yny;
                if (yny2.h) {
                    yny.c();
                } else {
                    yny.d();
                }
                yny.c.a(false);
                this.d.a(yny, false);
                this.o.c.b(false);
                this.o = yny;
            }
        }
    }

    public final void n() {
        this.b.g();
        this.d.b();
        this.o = null;
    }

    public final void a(View view) {
        this.a.a(view);
    }

    public final View a() {
        return this.k;
    }

    public final void d() {
        yny yny = this.o;
        if (yny != null) {
            ChatInlineFixedVideoView chatInlineFixedVideoView = yny.g;
            chatInlineFixedVideoView.e = true;
            chatInlineFixedVideoView.b.setLayoutParams(chatInlineFixedVideoView.c);
            chatInlineFixedVideoView.a();
            yny.f.a(yny.g.b);
            this.j.d(false);
        }
    }

    public final void e() {
        this.j.d(true);
        yny yny = this.o;
        if (yny != null) {
            ChatInlineFixedVideoView chatInlineFixedVideoView = yny.g;
            yxc yxc = yny.d.c;
            chatInlineFixedVideoView.e = false;
            chatInlineFixedVideoView.a(yxc);
            yny.h = true;
            o();
        }
    }

    public final Object h() {
        return frs.c(this.o);
    }

    public final void a(ffu ffu, int i, int i2) {
        String.valueOf(ffu.b.b()).length();
        if (i == 2 && i2 == 3) {
            yny yny = this.o;
            if (yny != null) {
                this.a.a(yny.b());
            }
        } else if (i2 == 0) {
            this.a.a();
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        String valueOf = String.valueOf(ejd);
        String valueOf2 = String.valueOf(ejd2);
        valueOf.length();
        valueOf2.length();
    }

    public final void a(adqe adqe) {
        yny yny = this.o;
        if (yny != null) {
            yny.b(true);
        }
    }

    private static fob c(yny yny) {
        return fod.b(yny.e);
    }

    public final void o() {
        yny yny = this.o;
        if (yny != null) {
            xpu.a(this.l, yny.b(), this.k);
            yny = this.o;
            Rect rect = this.l.a;
            int height = this.k.getHeight();
            if (!(yny.g.e || (yny.h && rect.isEmpty()))) {
                if (!yny.h && rect.top <= 0) {
                    yny.c();
                } else if (yny.h && rect.top >= 0) {
                    yny.d();
                } else if (!yny.h && rect.top > height) {
                    yny.b(false);
                }
            }
        }
    }
}
