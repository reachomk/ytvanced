package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToContactsEndpoint;

/* renamed from: yrk */
public final class yrk extends yig {
    public final yrn f;
    public final yyp g;
    public final xoi h;
    public final yrb i = new yrb(new yrj(this));
    public ykv j;
    private final String k;
    private final ywk l;

    public yrk(Context context, ywk ywk, xoi xoi, Handler handler, yrn yrn, String str, yyp yyp, yyi yyi) {
        super(context, handler, ywk.i, ywk);
        this.f = (yrn) amqw.a((Object) yrn);
        this.k = xvd.a(str);
        this.g = (yyp) amqw.a((Object) yyp);
        this.h = (xoi) amqw.a((Object) xoi);
        amqw.a((Object) yyi);
        this.l = (ywk) amqw.a((Object) ywk);
        yyp.a(false);
        yyp.b(true);
        yyp.c.a(this.i);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.k, null, new yrm(this), new yrl(this));
    }

    /* Access modifiers changed, original: final */
    public final void a(yrd yrd) {
        if (this.j != null) {
            ywk ywk;
            ykv ykv;
            String serializedContactInvitee;
            apxx apxx;
            switch (yrd.a.ordinal()) {
                case 0:
                    ywk = this.l;
                    ywk.g.a(this.j.a, yvq.a, amuw.a(aqkt.CONTACT_STATUS_INVITE_RECEIVED, aqkt.CONTACT_STATUS_INVITE_HIDDEN), 4);
                    break;
                case 1:
                    ywk = this.l;
                    ywk.g.a(this.j.a, yvw.a, amuw.a(aqkt.CONTACT_STATUS_INVITE_SENT, aqkt.CONTACT_STATUS_INVITE_HIDDEN, aqkt.CONTACT_STATUS_INVITE_RECEIVED, aqkt.CONTACT_STATUS_CONNECTED, aqkt.CONTACT_STATUS_UNCONNECTED), 6);
                    break;
                case 2:
                    ywk = this.l;
                    ywk.g.a(this.j.a, yvt.a, amuw.a(aqkt.CONTACT_STATUS_INVITE_SENT), 3);
                    break;
                case 3:
                    ywk = this.l;
                    ykv = (ykv) ywk.b.a(this.j.a);
                    if (ykv != null) {
                        serializedContactInvitee = ykv.getSerializedContactInvitee();
                        if (!TextUtils.isEmpty(serializedContactInvitee)) {
                            axfl axfl = (axfl) SendShareEndpoint$SendShareToContactsEndpoint.f.createBuilder();
                            axfl.a(asfa.f);
                            asev asev = (asev) ases.c.createBuilder();
                            asev.a(serializedContactInvitee);
                            axfl.a(asev);
                            SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = (SendShareEndpoint$SendShareToContactsEndpoint) ((anxl) axfl.build());
                            apxx = (apxx) apxu.d.createBuilder();
                            apxx.a(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, sendShareEndpoint$SendShareToContactsEndpoint);
                            ywk.d.a((apxu) ((anxl) apxx.build()), null);
                            break;
                        }
                    }
                    break;
                case 4:
                    ywk = this.l;
                    ykv = (ykv) ywk.b.a(this.j.a);
                    if (ykv != null) {
                        serializedContactInvitee = ykv.getExternalChannelId();
                        if (!TextUtils.isEmpty(serializedContactInvitee)) {
                            apgd apgd = (apgd) apge.j.createBuilder();
                            apgd.a(serializedContactInvitee);
                            apge apge = (apge) ((anxl) apgd.build());
                            apxx = (apxx) apxu.d.createBuilder();
                            apxx.a(BrowseEndpointOuterClass.browseEndpoint, apge);
                            ywk.d.a((apxu) ((anxl) apxx.build()), null);
                            break;
                        }
                    }
                    break;
                case 5:
                    ywk = this.l;
                    ywk.g.a(this.j.a, yvu.a, amuw.a(aqkt.CONTACT_STATUS_CONNECTED), 8);
                    break;
                case 6:
                    this.l.b(this.j.a);
                    break;
                case 7:
                    this.l.a(this.j.a);
                    break;
                case 8:
                    ywk = this.l;
                    ywk.g.a(this.j.a, yvs.a, amuw.a(aqkt.CONTACT_STATUS_BLOCKED), 7);
                    break;
            }
            this.f.a();
        }
    }
}
