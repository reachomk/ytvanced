package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: ldt */
public final class ldt extends ldg implements akxw, wed {
    private Set A;
    public final xoi b;
    public final aaas c;
    public final xpa d;
    public final weg e;
    public LoadingFrameLayout f;
    public akwy g;
    public lei h;
    public wei i;
    private final Context j;
    private final aapn k;
    private final xci l;
    private final akpe m;
    private final akvz o;
    private final Executor p;
    private final gab q;
    private final eoa r;
    private final zyw s;
    private final bcaa t;
    private enx u;
    private lff v;
    private View w;
    private apxu x;
    private boolean y;
    private boolean z;

    public ldt(Context context, aapn aapn, xoi xoi, xci xci, akpe akpe, akvz akvz, Executor executor, acvx acvx, aaas aaas, gab gab, eoa eoa, xpa xpa, zyw zyw, weg weg, bcaa bcaa) {
        super(acvx);
        this.j = context;
        this.k = aapn;
        this.b = xoi;
        this.l = xci;
        this.m = akpe;
        this.o = akvz;
        this.p = executor;
        this.c = aaas;
        this.q = gab;
        this.r = eoa;
        this.d = xpa;
        this.s = zyw;
        this.e = weg;
        this.t = bcaa;
    }

    public final void a(lel lel) {
    }

    public final boolean ap_() {
        return true;
    }

    public final Object e() {
        return null;
    }

    private final lff o() {
        lff lff = this.v;
        if (lff != null) {
            return lff;
        }
        this.v = (lff) this.t.get();
        lff = this.v;
        lff.g = this.a;
        return lff;
    }

    public final View f() {
        return this.f;
    }

    public final void a(apxu apxu) {
        this.x = apxu;
        this.y = false;
        this.z = true;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) b;
                lff o = o();
                arml arml = showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.c;
                if (arml == null) {
                    arml = arml.f;
                }
                o.a(ajqy.a(arml));
                o = o();
                arml arml2 = showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.f;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                o.c(ajqy.a(arml2));
                this.w = this.v.a();
            }
        }
        if (this.f == null) {
            View inflate = LayoutInflater.from(this.j).inflate(R.layout.comment_replies_engagement_panel, null, false);
            this.f = (LoadingFrameLayout) inflate.findViewById(R.id.loading_layout);
            this.f.a(new ldy(this));
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.section_list_refresher);
            swipeRefreshLayout.a(xwe.a(this.j, R.attr.ytTextPrimary, -16777216));
            swipeRefreshLayout.a(xwe.a(this.j, R.attr.ytText1Inverse, -1));
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.section_list);
            recyclerView.a(new ans());
            recyclerView.r = true;
            this.u = this.r.a(swipeRefreshLayout);
            acvx acvx = this.a;
            if (acvx == null) {
                xtl.c("CommentRepliesEngagementPanel: Cannot initialize with a null InteractionLogger.");
                return;
            }
            this.g = new akwy(null, (RecyclerView) this.f.findViewById(R.id.section_list), this.m, new akwn(), this.k, this.l, new ldx(this, this.k, this.l, this.o, this.b, acvx), this.b, this.a, (akpb) this.o.get(), this, this.u);
            Set<akoq> set = this.A;
            if (set != null) {
                for (akoq a : set) {
                    this.g.a(a);
                }
                this.A.clear();
            }
            this.u.a(this.g);
            this.g.L = new ldz(this);
            if (foh.h(this.s) && !foh.i(this.s)) {
                ((akpd) this.g.e).a(this.q);
            }
        }
    }

    public final void g() {
        l();
    }

    public final void h() {
        k();
        this.z = false;
        if (!this.y) {
            a(false);
        }
    }

    public final void d() {
        View view = this.w;
        if (view != null && xrn.c(view.getContext())) {
            this.w.sendAccessibilityEvent(8);
        }
    }

    public final void i() {
        this.a.a();
    }

    public final void j() {
        this.a.a();
    }

    public final void a(akoq akoq) {
        if (akoq != null) {
            akwy akwy = this.g;
            if (akwy != null) {
                akwy.a(akoq);
                return;
            }
            if (this.A == null) {
                this.A = new HashSet();
            }
            this.A.add(akoq);
        }
    }

    public final void k() {
        if (this.z) {
            this.a.a(acwl.e, acww.OVERLAY, this.x);
        } else {
            this.z = true;
        }
    }

    private final void a(boolean z) {
        anxr access$000;
        ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
        l();
        this.y = true;
        byte[] a = foe.a(this.x);
        aaps a2 = this.k.a();
        a2.a(a);
        apxu apxu = this.x;
        if (apxu != null) {
            access$000 = anxl.checkIsLite(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) b;
        } else {
            showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = null;
        }
        if (showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand != null) {
            a2.c(showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.b);
            a2.d(showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.d);
            if (z || showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.e) {
                a2.a(aall.WRITE_ONLY);
                apxx apxx = (apxx) ((anxo) this.x.toBuilder());
                access$000 = ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand;
                axlf axlf = (axlf) ((anxo) showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.toBuilder());
                axlf.a(false);
                apxx.a(access$000, (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) ((anxl) axlf.build()));
                this.x = (apxu) ((anxl) apxx.build());
            }
        } else {
            xtl.c("CommentRepliesEngagementPanel: cannot load navigation endpoint.");
        }
        xan.a(this.k.a(a2, this.p), aniv.a, new lds(this), new ldv(this));
    }

    public final void a(Throwable th) {
        k();
        xst b = this.b.b(th);
        this.f.a(b.a, true);
        ldt.a(this.a, b.b);
    }

    public final void l() {
        this.y = false;
        this.f.a();
        enx enx = this.u;
        if (enx != null) {
            enx.a();
        }
    }

    public final void H_() {
        akwy akwy = this.g;
        if (akwy != null) {
            akwy.f();
        }
        this.u.a(1);
        if (this.f != null) {
            this.p.execute(new ldu(this));
        }
    }

    public static void a(acvx acvx, String str) {
        if (acvx.c() != null && acvx.c().e != null) {
            int i = acvx.c().e.aH;
            atss atss = (atss) atst.q.createBuilder();
            atsi atsi = (atsi) atsj.d.createBuilder();
            atsi.a(str);
            atsi.a(i);
            atss.a(atsi);
            atst atst = (atst) ((anxl) atss.build());
            azfa a = acvx.a(new Object(), acwc.GENERIC_ERROR);
            acvx.a(a, atst);
            acvx.b(a, atst);
        }
    }

    public final void m() {
        apxu apxu = this.x;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                apxu = this.x;
                access$000 = anxl.checkIsLite(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                axlf axlf = (axlf) ((anxo) ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) b).toBuilder());
                axlf.a(true);
                apxx apxx = (apxx) ((anxo) this.x.toBuilder());
                apxx.a(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand, (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) ((anxl) axlf.build()));
                this.x = (apxu) ((anxl) apxx.build());
            }
        }
    }

    public final /* synthetic */ leg n() {
        return o();
    }
}
