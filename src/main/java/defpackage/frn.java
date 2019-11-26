package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: frn */
public final class frn extends fja {
    public ezq ae;
    public yqe af;
    public yox ag;
    public ypz ah;
    public View ai;
    private ymt aj;
    private ypw ak;

    public static fiw a(String str, String str2) {
        amqw.a(TextUtils.isEmpty(str) ^ 1);
        amqw.a(TextUtils.isEmpty(str2) ^ 1);
        Bundle b = fiw.b();
        b.putString("chat_entity_key", str);
        b.putString("chat_body_entity_key", str2);
        return new fiw(frn.class, b);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((frr) xse.a(p())).a(new frq(this)).a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.chat_participants, viewGroup, false);
        frp frp = new frp(inflate, new frm(this));
        String a = fiw.a((fja) this).a("chat_entity_key");
        String a2 = fiw.a((fja) this).a("chat_body_entity_key");
        String a3 = fiw.a((fja) this).a("chat_message_entity_key");
        if (TextUtils.isEmpty(a2)) {
            yox yox = this.ag;
            this.aj = new yoy((Context) yox.a((Context) yox.a.get(), 1), (Handler) yox.a((Handler) yox.b.get(), 2), (ywk) yox.a((ywk) yox.c.get(), 3), (yil) yox.a((yil) yox.d.get(), 4), (akkq) yox.a((akkq) yox.e.get(), 5), (yio) yox.a((yio) yox.f.get(), 6), (ymx) yox.a((ymx) yox.g.get(), 7), (String) yox.a(a3, 8), (yqc) yox.a(frp, 9));
            this.ak = this.ah.a(a, frp, false);
        } else {
            yqe yqe = this.af;
            this.aj = new yqb((Context) yqe.a((Context) yqe.a.get(), 1), (Handler) yqe.a((Handler) yqe.b.get(), 2), (ywk) yqe.a((ywk) yqe.c.get(), 3), (yil) yqe.a((yil) yqe.d.get(), 4), (akkq) yqe.a((akkq) yqe.e.get(), 5), (yio) yqe.a((yio) yqe.f.get(), 6), (ymx) yqe.a((ymx) yqe.g.get(), 7), (aaas) yqe.a((aaas) yqe.h.get(), 8), (String) yqe.a(a2, 9), (yqc) yqe.a(frp, 10));
            this.ak = this.ah.a(a, frp, true);
        }
        return inflate;
    }

    public final void a(View view, Bundle bundle) {
        this.aj.bk_();
        this.ak.bk_();
        t().a(acwl.i, aa(), null);
    }

    public final void i() {
        super.i();
        this.aj.bl_();
        this.aj = null;
        this.ak.bl_();
        this.ak = null;
    }

    public final ezz W() {
        faf i = this.ab.i();
        i.a(amwp.a);
        View view = this.ai;
        if (view == null) {
            i.a = a((int) R.string.chat_participants_title);
        } else {
            i.b = view;
        }
        return i.a();
    }
}
