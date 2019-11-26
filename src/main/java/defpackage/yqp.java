package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.EditConversationEndpointOuterClass$EditConversationEndpoint;

/* renamed from: yqp */
public final class yqp extends yig implements yyb {
    public final Handler a;
    public final yxy f;
    public final yyt g;
    public final ymx h;
    public final ywk i;
    public String j;
    public String k;
    private final String l;
    private final yqt m;
    private final yuh n;
    private final yqw o;

    public yqp(Context context, Handler handler, ywk ywk, yil yil, yqt yqt, ymx ymx, String str, yxy yxy, yyt yyt, yqw yqw) {
        ywk ywk2 = ywk;
        super(context, handler, ywk2.i, ywk, yil);
        this.l = xvd.a(str);
        this.a = (Handler) amqw.a((Object) handler);
        this.f = (yxy) amqw.a((Object) yxy);
        this.g = (yyt) amqw.a((Object) yyt);
        this.m = (yqt) amqw.a((Object) yqt);
        this.h = (ymx) amqw.a((Object) ymx);
        this.i = (ywk) amqw.a((Object) ywk);
        this.o = (yqw) amqw.a((Object) yqw);
        this.n = (yuh) amqw.a(ywk2.h);
        yxy.a((yyb) this);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(yic.a("ChatReplyBox", this.l), new yqs(this));
    }

    public final void bl_() {
        super.bl_();
        this.f.a();
    }

    public final void a(String str) {
        ywk ywk = this.i;
        String str2 = this.l;
        yuh yuh = ywk.h;
        yuh.b(str2).a(new yuk(yuh, str, str2)).c();
        yvg yvg = ywk.m;
        xvd.a(str2);
        ykd ykd = (ykd) yvg.a.a(str2);
        if (ykd != null && !TextUtils.isEmpty(ykd.getShowTypingStatusToken())) {
            long a = yvg.d.a();
            ykt a2 = yvg.a(str2);
            long j = a - (a2 != null ? a2.d : 0);
            aprm aprm = ((yjf) yvg.g.get()).b().c;
            if (aprm == null) {
                aprm = aprm.f;
            }
            if (j >= ((long) aprm.e)) {
                ykw h;
                arat arat = (arat) EditConversationEndpointOuterClass$EditConversationEndpoint.e.createBuilder();
                String showTypingStatusToken = ykd.getShowTypingStatusToken();
                if (showTypingStatusToken != null) {
                    arat.a(showTypingStatusToken);
                }
                apxx apxx = (apxx) apxu.d.createBuilder();
                apxx.a(EditConversationEndpointOuterClass$EditConversationEndpoint.editConversationEndpoint, (EditConversationEndpointOuterClass$EditConversationEndpoint) ((anxl) arat.build()));
                yvg.c.a((apxu) ((anxl) apxx.build()), null);
                aaea b = yvg.a.b();
                ykt a3 = yvg.a(str2);
                if (a3 != null) {
                    h = a3.h();
                } else {
                    h = ykt.f();
                    h.a = yvg.b(str2);
                }
                h.b = a;
                b.a(h.a()).a();
            }
        }
    }

    public final void f() {
        this.n.a(this.l, null);
    }

    public final void g() {
        this.m.a(this.k);
    }

    public final void h() {
        this.o.a();
        ywk ywk = this.i;
        String str = this.l;
        yuh yuh = ywk.h;
        yuh.b(str).a(ykp.class).a(new yuw(yuh)).c();
        yvg yvg = ywk.m;
        xvd.a(str);
        ykd ykd = (ykd) yvg.a.a(str);
        if (ykd != null && !TextUtils.isEmpty(ykd.getHideTypingStatusToken())) {
            arat arat = (arat) EditConversationEndpointOuterClass$EditConversationEndpoint.e.createBuilder();
            str = ykd.getHideTypingStatusToken();
            if (str != null) {
                arat.a(str);
            }
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(EditConversationEndpointOuterClass$EditConversationEndpoint.editConversationEndpoint, (EditConversationEndpointOuterClass$EditConversationEndpoint) ((anxl) arat.build()));
            yvg.c.a((apxu) ((anxl) apxx.build()), null);
        }
    }
}
