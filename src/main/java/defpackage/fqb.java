package defpackage;

import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ConversationEndpointOuterClass$ConversationEndpoint;
import com.google.protos.youtube.api.innertube.ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint;
import com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint;

/* renamed from: fqb */
public final class fqb extends fja implements xcp, yab, ybt {
    public fqo ae;
    public xci af;
    public akmx ag;
    public aaas ah;
    public hdk ai;
    public ezq aj;
    private String ak;
    private String al;
    private Bundle am;
    private TextView an;
    private ImageView ao;

    public static boolean a(fiw fiw) {
        return fiw.a == fqb.class;
    }

    public static fiw a(apxu apxu) {
        fiw a = fiw.a(fqb.class, apxu);
        a.c = fqa.a;
        return a;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((fqc) xse.a(p())).a(this);
        Object b = aaax.b(this.j.getByteArray("navigation_endpoint"));
        amqw.a(b);
        Bundle bundle2 = null;
        this.ak = null;
        this.al = null;
        anxr access$000 = anxl.checkIsLite(ConversationEndpointOuterClass$ConversationEndpoint.conversationEndpoint);
        b.a(access$000);
        boolean z = true;
        if (b.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ConversationEndpointOuterClass$ConversationEndpoint.conversationEndpoint);
            b.a(access$000);
            b = b.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ConversationEndpointOuterClass$ConversationEndpoint conversationEndpointOuterClass$ConversationEndpoint = (ConversationEndpointOuterClass$ConversationEndpoint) b;
            if ((conversationEndpointOuterClass$ConversationEndpoint.a & 1) == 0) {
                z = false;
            }
            amqw.b(z);
            this.ak = conversationEndpointOuterClass$ConversationEndpoint.b;
        } else {
            access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
            b.a(access$000);
            if (b.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
                b.a(access$000);
                Object b2 = b.h.b(access$000.d);
                if (b2 == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b2);
                }
                ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint = (ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) obj;
                amqw.b((conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.a & 1) != 0);
                this.ak = conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.b;
                this.al = conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.c;
                String str = this.ak;
                anxr access$0002 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
                b.a(access$0002);
                if (b.h.a(access$0002.d) && !TextUtils.isEmpty(str)) {
                    Uri a = ycq.a(str);
                    yco yco = (yco) this.ag.a(a);
                    ycn ycn = new ycn(yco);
                    anxr access$0003 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
                    b.a(access$0003);
                    b = b.h.b(access$0003.d);
                    if (b == null) {
                        b = access$0003.b;
                    } else {
                        b = access$0003.a(b);
                    }
                    ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint2 = (ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) b;
                    if ((conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint2.a & 4) != 0) {
                        aqpr aqpr = conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint2.d;
                        if (aqpr == null) {
                            aqpr = aqpr.c;
                        }
                        b = aqpr.b;
                        if (b == null) {
                            b = aqpp.d;
                        }
                    } else {
                        b = null;
                    }
                    anxl anxl = yco != null ? yco.f : null;
                    if ((yco == null || !yco.e) && (anxl == null || !anxl.equals(b))) {
                        ycn.b = b;
                    }
                    ycn.e = true;
                    ycn.a = null;
                    this.ag.b(a, ycn.a());
                }
            } else {
                access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
                b.a(access$000);
                if (b.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
                    b.a(access$000);
                    b = b.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    SharedConversationEndpointOuterClass$SharedConversationEndpoint sharedConversationEndpointOuterClass$SharedConversationEndpoint = (SharedConversationEndpointOuterClass$SharedConversationEndpoint) b;
                    this.ak = sharedConversationEndpointOuterClass$SharedConversationEndpoint.b;
                    this.al = sharedConversationEndpointOuterClass$SharedConversationEndpoint.c;
                }
            }
        }
        if (bundle != null) {
            bundle2 = bundle.getBundle("CONVERSATION_VIEW_STATE_BUNDLE_KEY");
        }
        this.am = bundle2;
        return (FrameLayout) layoutInflater.inflate(R.layout.fragment_container, viewGroup, false);
    }

    public final void W_() {
        this.ae = (fqo) s().a((int) R.id.container);
        fqo fqo = this.ae;
        if (fqo == null) {
            String str = this.ak;
            String str2 = this.al;
            Bundle bundle = this.am;
            apxu aa = aa();
            fqo fqo2 = new fqo();
            Bundle bundle2 = new Bundle();
            if (aa != null) {
                bundle2.putByteArray("NAV_ENDPOINT", aa.toByteArray());
            }
            bundle2.putString("CONVERSATION_PARAM_TAG", str2);
            fqo2.f(bundle2);
            this.ae = fqo2;
            this.ae.a(str, bundle);
            this.ae.ax = this;
            s().a().b(R.id.container, this.ae).a();
            s().b();
        } else {
            fqo.a(this.ak, this.am);
            fqo = this.ae;
            fqo.ax = this;
            TextView textView = this.an;
            if (textView != null) {
                textView.setText(fqo.X());
            }
        }
        super.W_();
        this.af.a((Object) this);
    }

    public final void N_() {
        super.N_();
        if (this.ae != null) {
            s().a().a(this.ae).b();
        }
        this.af.b(this);
    }

    public final void ad_() {
        TextView textView = this.an;
        if (textView != null) {
            textView.setText(null);
        }
        ((InputMethodManager) p().getSystemService("input_method")).hideSoftInputFromWindow(this.K.getWindowToken(), 0);
        super.ad_();
    }

    public final void e(Bundle bundle) {
        aqls aqls = (aqls) ConversationEndpointOuterClass$ConversationEndpoint.c.createBuilder();
        String str = this.ae.aA;
        aqls.copyOnWrite();
        ConversationEndpointOuterClass$ConversationEndpoint conversationEndpointOuterClass$ConversationEndpoint = (ConversationEndpointOuterClass$ConversationEndpoint) aqls.instance;
        if (str != null) {
            conversationEndpointOuterClass$ConversationEndpoint.a |= 1;
            conversationEndpointOuterClass$ConversationEndpoint.b = str;
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(ConversationEndpointOuterClass$ConversationEndpoint.conversationEndpoint, (ConversationEndpointOuterClass$ConversationEndpoint) ((anxl) aqls.build()));
            bundle.putByteArray("navigation_endpoint", ((apxu) ((anxl) apxx.build())).toByteArray());
            fqo fqo = this.ae;
            if (fqo != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("CONVERSATION_ID_KEY", fqo.aA);
                bundle2.putInt("CONVERSATION_ITEM_POSITION_KEY", ((ans) fqo.aq.n).q());
                bundle.putBundle("CONVERSATION_VIEW_STATE_BUNDLE_KEY", bundle2);
                this.ae.ax = null;
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    public final boolean ab() {
        fqo fqo = this.ae;
        if (fqo == null) {
            return false;
        }
        xxp xxp = fqo.au;
        if (!(xxp instanceof fsj)) {
            return false;
        }
        fso fso = ((fsj) xxp).b;
        fsk fsk = fso.l;
        if (fsk != null) {
            fso.d.b(fsk.a);
            fso.b.g();
            fso.l = null;
            fso.c(1);
        } else if (fso.n != 5 || fso.o == 2) {
            return false;
        } else {
            ygg ygg = fso.j;
            if (ygg == null || ygg.d() == null) {
                ycs ycs;
                int d = fso.i.d();
                do {
                    d--;
                    if (d < 0) {
                        ycs = null;
                        break;
                    }
                } while (!(fso.i.c(d) instanceof ycs));
                ycs = (ycs) fso.i.c(d);
                if (ycs != null) {
                    fso.d.a(ycs, false);
                }
            } else {
                fso.d.a((ycs) fso.j.d(), false);
            }
            fso.j = null;
            fso.c(1);
            fso.b.g();
            fso.a.a(null, true);
            fso.h.c();
            fso.h.d();
        }
        return true;
    }

    public final void f() {
        this.an.setText(this.ae.X());
        this.ao.setVisibility(!this.ae.Y() ? 8 : 0);
        this.aj.b();
    }

    public final acvx t() {
        fqo fqo = this.ae;
        if (fqo == null) {
            return acvx.g;
        }
        return fqo.ag;
    }

    public final ezz W() {
        amuv i = amuw.i();
        faf i2 = this.ab.i();
        i.c(this.ai);
        auvn auvn = null;
        View inflate = View.inflate(p(), R.layout.conversation_header, null);
        this.an = (TextView) inflate.findViewById(R.id.conversation_name);
        this.an.setText(this.ae.X());
        this.an.setOnClickListener(new fqd(this));
        this.an.setTextColor(this.ab.b.d().a(this.a));
        this.ao = (ImageView) inflate.findViewById(R.id.notifications_muted);
        this.ao.setImageDrawable(xoe.a(q().getDrawable(R.drawable.quantum_ic_notifications_off_white_18), this.ab.b.g().a(this.a), Mode.SRC_IN));
        int i3 = 0;
        this.ao.setVisibility(!this.ae.Y() ? 8 : 0);
        i2.b = inflate;
        fqo fqo = this.ae;
        if (fqo != null) {
            xxp xxp = fqo.au;
            if (xxp != null) {
                ajts ajts = xxp.l;
                if (ajts != null) {
                    auvr auvr = ajts.d;
                    if (!(auvr == null || (auvr.a & 1) == 0)) {
                        auvn = auvr.b;
                        if (auvn == null) {
                            auvn = auvn.l;
                        }
                    }
                }
            }
        }
        if (auvn != null) {
            for (auvj jpd : auvn.b) {
                int i4 = i3 + 1;
                i.c(new jpd(this.ah, jpd, i3, this));
                i3 = i4;
            }
        }
        i2.a(i.a());
        return i2.a();
    }

    public final void a(araq araq) {
        boolean z = true;
        if ((araq.a & 1) == 0) {
            z = false;
        }
        amqw.a(z);
        arao arao = araq.b;
        if (arao == null) {
            arao = arao.g;
        }
        ybv.a(arao).a(this.v, "conversation_name_dialog");
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ybh.class};
        } else if (i == 0) {
            ybh ybh = (ybh) obj;
            fqo fqo = this.ae;
            if (fqo != null && TextUtils.equals(ybh.a, fqo.aA)) {
                this.ac.a(false);
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
