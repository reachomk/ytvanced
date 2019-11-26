package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;
import com.google.android.libraries.youtube.conversation.technodrome.view.ChatInlineFixedVideoView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint;
import com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint;

/* renamed from: frf */
public final class frf extends fja implements xcp {
    public yqq ae;
    public ezq af;
    public akkq ag;
    public ywk ah;
    public aaas ai;
    public ysc aj;
    public fru ak;
    public xci al;
    public fsx am;
    public hdk an;
    public ylx ao = ylx.h().a();
    private frs ap;
    private yqk aq;
    private View ar;

    public static fiw a(apxu apxu) {
        Bundle b = fiw.b();
        anxr access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
        apxu.a(access$000);
        String str = "entity_key";
        Object b2;
        Object obj;
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
            apxu.a(access$000);
            b2 = apxu.h.b(access$000.d);
            if (b2 == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b2);
            }
            b.putString(str, ((SharedConversationEndpointOuterClass$SharedConversationEndpoint) obj).g);
        } else {
            access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
                apxu.a(access$000);
                b2 = apxu.h.b(access$000.d);
                if (b2 == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b2);
                }
                ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint = (ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) obj;
                b.putString(str, conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.e);
                aqpr aqpr = conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.d;
                if (aqpr == null) {
                    aqpr = aqpr.c;
                }
                if ((aqpr.a & 1) != 0) {
                    aqpr aqpr2 = conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.d;
                    if (aqpr2 == null) {
                        aqpr2 = aqpr.c;
                    }
                    anvf anvf = aqpr2.b;
                    if (anvf == null) {
                        anvf = aqpp.d;
                    }
                    b.putByteArray("attachment", anvf.toByteArray());
                }
            }
        }
        return fiw.a(frf.class, apxu, b);
    }

    public static boolean a(fiw fiw) {
        return fiw.a == frf.class;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((fri) xse.a(p())).a(new frk(this)).a(this);
        this.al.a((Object) this);
    }

    public final void X_() {
        super.X_();
        this.al.b(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        aqpp aqpp;
        fru fru;
        yqq yqq;
        fre fre;
        Context context;
        Handler handler;
        yil yil;
        ywk ywk;
        ynp ynp;
        yps yps;
        Context context2;
        Handler handler2;
        yqk yqk;
        yqk yqk2;
        yil yil2;
        ywk ywk2;
        ynp ynp2;
        acvx acvx;
        String str;
        xsd xsd;
        View inflate = layoutInflater.inflate(R.layout.chat, viewGroup, false);
        frl frl = new frl(inflate, this.ag);
        String a = fiw.a((fja) this).a("entity_key");
        if (bundle == null) {
            byte[] byteArray = fiw.a((fja) this).b.getByteArray("attachment");
            if (byteArray != null) {
                try {
                    aqpp = (aqpp) anxl.parseFrom(aqpp.d, byteArray, anxa.c());
                } catch (anyg unused) {
                }
                fru = this.ak;
                this.ap = new frs((ywk) fru.a((ywk) fru.a.get(), 1), (xpw) fru.a((xpw) fru.b.get(), 2), (InlinePlayerLayout) fru.a((InlinePlayerLayout) fru.c.get(), 3), (fgc) fru.a((fgc) fru.d.get(), 4), (fgb) fru.a((fgb) fru.e.get(), 5), (zbe) fru.a((zbe) fru.f.get(), 6), (eif) fru.a((eif) fru.g.get(), 7), (lwc) fru.a((lwc) fru.h.get(), 8), (frb) fru.a((frb) fru.i.get(), 9), (aaas) fru.a((aaas) fru.j.get(), 10), (acvx) fru.a((acvx) fru.k.get(), 11), (ChatInlineFixedVideoView) fru.a((ChatInlineFixedVideoView) inflate.findViewById(R.id.chat_fixed_player), 12), (yxy) fru.a(frl.c(), 13), (RecyclerView) fru.a((RecyclerView) inflate.findViewById(R.id.recycler_view), 14));
                this.ap.bk_();
                yqq = this.ae;
                fre = new fre(this);
                context = (Context) yqq.a((Context) yqq.a.get(), 1);
                handler = (Handler) yqq.a((Handler) yqq.b.get(), 2);
                yil = (yil) yqq.a((yil) yqq.c.get(), 3);
                ywk = (ywk) yqq.a((ywk) yqq.d.get(), 4);
                ynp = (ynp) yqq.a((ynp) yqq.e.get(), 5);
                yps = (yps) yqq.a(frl, 8);
                context2 = context;
                handler2 = handler;
                yqk = yqk2;
                yil2 = yil;
                ywk2 = ywk;
                ynp2 = ynp;
                acvx = (acvx) yqq.a((acvx) yqq.f.get(), 6);
                str = (String) yqq.a(a, 7);
                xsd = (xsd) yqq.a(fre, 9);
                yqk2 = new yqk(context2, handler2, yil2, ywk2, ynp2, acvx, str, yps, xsd, (yty) yqq.a(new frh(this), 10), aqpp, (ynv) yqq.a(this.ap, 12));
                this.aq = yqk;
                this.am.a();
                return inflate;
            }
        }
        aqpp = null;
        fru = this.ak;
        this.ap = new frs((ywk) fru.a((ywk) fru.a.get(), 1), (xpw) fru.a((xpw) fru.b.get(), 2), (InlinePlayerLayout) fru.a((InlinePlayerLayout) fru.c.get(), 3), (fgc) fru.a((fgc) fru.d.get(), 4), (fgb) fru.a((fgb) fru.e.get(), 5), (zbe) fru.a((zbe) fru.f.get(), 6), (eif) fru.a((eif) fru.g.get(), 7), (lwc) fru.a((lwc) fru.h.get(), 8), (frb) fru.a((frb) fru.i.get(), 9), (aaas) fru.a((aaas) fru.j.get(), 10), (acvx) fru.a((acvx) fru.k.get(), 11), (ChatInlineFixedVideoView) fru.a((ChatInlineFixedVideoView) inflate.findViewById(R.id.chat_fixed_player), 12), (yxy) fru.a(frl.c(), 13), (RecyclerView) fru.a((RecyclerView) inflate.findViewById(R.id.recycler_view), 14));
        this.ap.bk_();
        yqq = this.ae;
        fre = new fre(this);
        context = (Context) yqq.a((Context) yqq.a.get(), 1);
        handler = (Handler) yqq.a((Handler) yqq.b.get(), 2);
        yil = (yil) yqq.a((yil) yqq.c.get(), 3);
        ywk = (ywk) yqq.a((ywk) yqq.d.get(), 4);
        ynp = (ynp) yqq.a((ynp) yqq.e.get(), 5);
        yps = (yps) yqq.a(frl, 8);
        context2 = context;
        handler2 = handler;
        yqk = yqk2;
        yil2 = yil;
        ywk2 = ywk;
        ynp2 = ynp;
        acvx = (acvx) yqq.a((acvx) yqq.f.get(), 6);
        str = (String) yqq.a(a, 7);
        xsd = (xsd) yqq.a(fre, 9);
        yqk2 = new yqk(context2, handler2, yil2, ywk2, ynp2, acvx, str, yps, xsd, (yty) yqq.a(new frh(this), 10), aqpp, (ynv) yqq.a(this.ap, 12));
        this.aq = yqk;
        this.am.a();
        return inflate;
    }

    public final void a(View view, Bundle bundle) {
        this.aq.bk_();
        t().a(acwl.aq, aa(), null);
    }

    public final void i() {
        super.i();
        this.aq.bl_();
        this.aq = null;
        this.ap.bl_();
        this.ap = null;
        this.am.b();
    }

    public final void ad_() {
        super.ad_();
        this.ap.m();
    }

    public final void W_() {
        super.W_();
        this.am.a(true);
    }

    public final void N_() {
        super.N_();
        this.am.a(false);
    }

    public final ezz W() {
        faf i = this.ab.i();
        i.a(amwp.a);
        i.a(this.an);
        if (!TextUtils.isEmpty(this.ao.a())) {
            i.a = this.ao.a();
        }
        ymf b = this.ao.b();
        if (!(b == null || TextUtils.isEmpty(b.b()))) {
            i.a(new fsd(M_(), this.ao.b().a(), this.ao.b().b(), this.ad));
        }
        ylj c = this.ao.c();
        if (!(c == null || TextUtils.isEmpty(c.a()))) {
            i.a(new fqy(M_(), this.ao.c().a(), this.ai));
        }
        ylz f = this.ao.f();
        if (f != null) {
            i.a(new frz(M_(), f.a(), f.b(), this.aj));
        }
        ymd d = this.ao.d();
        if (!(d == null || TextUtils.isEmpty(d.a()))) {
            i.a(new fsb(M_(), d.a(), d.b(), this.ad, this.ah, new yyi()));
        }
        ymb e = this.ao.e();
        if (e != null) {
            i.a(new fry(M_(), e.a(), e.b(), this.ah));
        }
        String a = b != null ? b.a() : null;
        String b2 = b != null ? b.b() : null;
        boolean z = false;
        if (e != null && e.b()) {
            z = true;
        }
        String a2 = this.ao.a();
        if (this.ar == null) {
            this.ar = View.inflate(M_(), R.layout.chat_title, null);
        }
        ((TextView) this.ar.findViewById(R.id.title)).setText(a2);
        xpr.a(this.ar.findViewById(R.id.muted), z);
        this.ar.setOnClickListener(new frg(this, a, b2));
        i.b = this.ar;
        return i.a();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ybg.class};
        } else if (i == 0) {
            yqk yqk = this.aq;
            if (yqk != null && yqk.bj_()) {
                yqk.d();
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
