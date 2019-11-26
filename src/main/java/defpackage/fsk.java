package defpackage;

import android.os.Handler;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: fsk */
public final class fsk extends ygg implements fgz {
    public ycp a;
    public akor b;
    private final jxr p;
    private final Handler q;

    public fsk(View view, xci xci, akkq akkq, eid eid, aaas aaas, gal gal, elv elv, ffw ffw, hdd hdd, ygu ygu, akmx akmx, zbe zbe, yfg yfg, akpe akpe, Handler handler) {
        super(view, akkq.c(), aaas, akkq, ygu, akmx, zbe, yfg, akpe);
        amqw.a((Object) view);
        this.p = new jxr(view.getContext(), xci, akkq, eid, aaas, elv, ffw, hdd, gal, R.layout.chat_timebar_space);
        this.n.addView(this.p.a, -1, -2);
        this.q = (Handler) amqw.a((Object) handler);
    }

    public final fhc b() {
        return null;
    }

    public final int c() {
        return this.b.a("position", -1);
    }

    public final View a() {
        return this.p.a();
    }

    public final void a(boolean z) {
        this.p.b = z;
    }

    public final void b(boolean z) {
        super.b(z);
        fsm s = s();
        if (s != null) {
            s.a(null);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(boolean z) {
        super.c(z);
        fsm s = s();
        if (s != null) {
            s.b(z);
        }
    }

    private final fsm s() {
        akor akor = this.b;
        return akor != null ? (fsm) akor.a("CONVERSATION_VIDEOS_LISTENER_KEY") : null;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        ycp ycp = (ycp) obj;
        boolean a = akor.a("inlineFullscreen", false);
        if (this.a != ycp || this.l != a) {
            this.a = ycp;
            this.l = a;
            this.b = akor;
            super.a_(akor, ycp);
            aqnp aqnp = ycp.a.e;
            if (!(aqnp == null || (aqnp.a & 2) == 0)) {
                this.p.a_(akor, ycp);
                this.p.b = true;
            }
            fsm s = s();
            if (s != null) {
                this.q.post(new fsn(this, s));
            }
        }
    }
}
