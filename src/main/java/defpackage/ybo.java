package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ConversationEndpointOuterClass$ConversationEndpoint;
import com.google.protos.youtube.api.innertube.ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint;
import com.google.protos.youtube.api.innertube.SharedConversationEndpointOuterClass$SharedConversationEndpoint;
import java.util.List;

/* renamed from: ybo */
public abstract class ybo extends nf implements acwa, afxo, xcp, xyb, xyo, xza {
    private int a;
    public String aA;
    public String aB;
    public acvx ag;
    public afyb ah;
    public akmx ai;
    public akkq aj;
    public xci ak;
    public xzn al;
    public zcs am;
    public zda an;
    public xyz ao;
    public View ap;
    public RecyclerView aq;
    public View ar;
    public View as;
    public View at;
    public xxp au;
    public yfh av;
    public xzs aw;
    public ybt ax;
    public xyv ay;
    public zcq az;

    public abstract boolean Z();

    public void a(aats aats) {
        throw null;
    }

    public abstract void f();

    public final acvx t() {
        return this.ag;
    }

    public final boolean a(aouo aouo) {
        if ((aouo.a & 2) == 0 || Z()) {
            return false;
        }
        CharSequence charSequence;
        anxp anxp = aouo.e;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(ConversationEndpointOuterClass$ConversationEndpoint.conversationEndpoint);
        anxp.a(access$000);
        anxp anxp2;
        anxr access$0002;
        Object b;
        if (anxp.h.a(access$000.d)) {
            anxp2 = aouo.e;
            if (anxp2 == null) {
                anxp2 = apxu.d;
            }
            access$0002 = anxl.checkIsLite(ConversationEndpointOuterClass$ConversationEndpoint.conversationEndpoint);
            anxp2.a(access$0002);
            b = anxp2.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            charSequence = ((ConversationEndpointOuterClass$ConversationEndpoint) b).b;
        } else {
            anxp = aouo.e;
            if (anxp == null) {
                anxp = apxu.d;
            }
            access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp2 = aouo.e;
                if (anxp2 == null) {
                    anxp2 = apxu.d;
                }
                access$0002 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
                anxp2.a(access$0002);
                b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                charSequence = ((ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) b).b;
            } else {
                anxp = aouo.e;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                access$000 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    anxp2 = aouo.e;
                    if (anxp2 == null) {
                        anxp2 = apxu.d;
                    }
                    access$0002 = anxl.checkIsLite(SharedConversationEndpointOuterClass$SharedConversationEndpoint.sharedConversationEndpoint);
                    anxp2.a(access$0002);
                    b = anxp2.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    charSequence = ((SharedConversationEndpointOuterClass$SharedConversationEndpoint) b).b;
                } else {
                    charSequence = null;
                }
            }
        }
        return TextUtils.equals(this.aA, charSequence);
    }

    public final void aa() {
        Object obj;
        Uri a = ycq.a(this.aA);
        ycn ycn = new ycn((yco) this.ai.a(a));
        ycn.e = false;
        apxu b = aaax.b(this.j.getByteArray("NAV_ENDPOINT"));
        anxr access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
        b.a(access$000);
        Object b2 = b.h.b(access$000.d);
        if (b2 == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b2);
        }
        aqpr aqpr = ((ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) obj).d;
        if (aqpr == null) {
            aqpr = aqpr.c;
        }
        if ((aqpr.a & 1) != 0) {
            access$000 = anxl.checkIsLite(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint);
            b.a(access$000);
            Object b3 = b.h.b(access$000.d);
            if (b3 == null) {
                b3 = access$000.b;
            } else {
                b3 = access$000.a(b3);
            }
            aqpr aqpr2 = ((ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint) b3).d;
            if (aqpr2 == null) {
                aqpr2 = aqpr.c;
            }
            aqpp aqpp = aqpr2.b;
            if (aqpp == null) {
                aqpp = aqpp.d;
            }
            ycn.f = aqpp;
        }
        this.ai.a(a, ycn.a());
    }

    public final View z() {
        return this.aq;
    }

    public void B() {
        super.B();
        d(this.a);
        this.ah.a(this);
    }

    public final void j_(boolean z) {
        if (z) {
            this.au.g();
        } else {
            d(-1);
        }
    }

    public void ad_() {
        super.ad_();
        this.ak.b(this);
        this.av.b();
        this.av.a(true);
        this.au.g();
        this.ah.b(this);
    }

    public final void g() {
        f();
        ybt ybt = this.ax;
        if (ybt != null) {
            ybt.f();
        }
    }

    public final void d() {
        apa apa = this.aq.m;
        if (apa == null || apa.a() == 0) {
            this.as.setVisibility(0);
        }
    }

    public final void I_() {
        this.as.setVisibility(8);
        this.aq.setVisibility(8);
        if (this.ar == null) {
            ((ViewStub) this.ap.findViewById(R.id.load_error_stub)).inflate();
            this.ar = this.ap.findViewById(R.id.load_error);
            ((Button) this.ar.findViewById(R.id.error_retry_button)).setOnClickListener(new ybu(this));
        }
        this.ar.setVisibility(0);
    }

    public void i() {
        super.i();
        this.au.a();
        List list = this.aq.M;
        if (list != null) {
            list.clear();
        }
    }

    public final void a(ajtf ajtf, atur atur) {
        xzn xzn = this.au.y;
        if (atur != null && atur.a == 110577257) {
            anvu anvu = ((atut) atur.b).b;
            aqop aqop = null;
            if (!anvu.c()) {
                try {
                    aqop = (aqop) anxl.parseFrom(aqop.g, anvu, anxa.c());
                } catch (anyg unused) {
                }
            }
            if (aqop != null && xzn.f != null && xzn.h != null && (!xzn.d.containsKey(aqop.b) || aqop.d >= ((Long) xzn.d.get(aqop.b)).longValue())) {
                xzn.d.put(aqop.b, Long.valueOf(aqop.d));
                ycz ycz = (ycz) xzn.h.a.get(aqop.b);
                if (ycz == null && aqop.c && xzn.h.a.size() < xzn.f.e && !xzn.c.contains(aqop.b)) {
                    ycz = new ycz();
                    xzn.h.a.put(aqop.b, ycz);
                    akpk akpk = xzn.g;
                    if (akpk != null && akpk.isEmpty()) {
                        xxp xxp = xzn.e;
                        Object obj = null;
                        if (xxp != null && xxp.k()) {
                            obj = 1;
                        }
                        xzn.g.add(xzn.h);
                        if (obj != null) {
                            xzn.e.l();
                        }
                    }
                }
                if (!aqop.c) {
                    xzn.a(aqop.b, Long.MAX_VALUE);
                } else if (ycz != null) {
                    ycz.a = aqop;
                    ycz.b = true;
                    xzn.a.postDelayed(new xzq(xzn, aqop), (long) xzn.f.b);
                    xzn.a.postDelayed(new xzp(xzn, aqop), (long) xzn.f.c);
                    xzn.a();
                }
            }
        }
    }

    public final void d(int i) {
        if (u()) {
            akmz akmz = this.au;
            String str = this.aA;
            String str2 = this.aB;
            if (!TextUtils.equals(akmz.p, str)) {
                akmz.l = null;
            }
            akmz.p = str;
            akmz.g();
            akmz.n();
            if (!TextUtils.isEmpty(str)) {
                xyb xyb = akmz.m;
                if (xyb != null) {
                    xyb.d();
                }
                akmx akmx = akmz.t;
                if (akmx != null) {
                    akmx.a(akmz);
                    if (!TextUtils.isEmpty(str)) {
                        akmz.t.a(ycq.a(str), akmz);
                    }
                }
                if (!akmz.w) {
                    akmz.s.a(xxp.c, akmz.v, null);
                    akmz.w = true;
                }
                xxv xxv = new xxv(akmz, i);
                if (!TextUtils.isEmpty(str2)) {
                    xzm xzm = akmz.o;
                    if (xzm != null) {
                        ajvp ajvp;
                        Boolean valueOf = Boolean.valueOf(akmz.B.a(akmz.d));
                        if (TextUtils.isEmpty(str2)) {
                            ajvp = null;
                        } else {
                            xxm xxm = xzm.a;
                            xxm.a();
                            ajvp = (ajvp) xxm.a.get(str2);
                        }
                        if (ajvp != null) {
                            xxv.a(new aats(ajvp));
                            return;
                        }
                        xyn xyn = new xyn(xzm.c, xzm.d.c());
                        xyn.a = str2;
                        xyn.b = null;
                        xyn.d = true;
                        xyn.e = valueOf;
                        new xzl(xzm.b, xzm.e).b(xyn, xxv);
                        return;
                    }
                }
                aarh aarh = akmz.n;
                aatt aatt = new aatt(aarh.c, aarh.d.c());
                aatt.a = aali.b(str);
                new aasw(aarh).b(aatt, xxv);
            }
        }
    }

    public final void a(String str, Bundle bundle) {
        amqw.a((Object) str);
        if (str.equals(this.aA)) {
            a(bundle);
            return;
        }
        xxp xxp = this.au;
        if (xxp != null) {
            xxp.e();
        }
        this.aA = str;
        Bundle bundle2 = this.j;
        String str2 = "ID";
        if (bundle2 != null) {
            bundle2.putString(str2, str);
        } else {
            bundle2 = new Bundle();
            bundle2.putString(str2, str);
            f(bundle2);
        }
        a(bundle);
    }

    private final void a(Bundle bundle) {
        this.a = -1;
        if (bundle != null && TextUtils.equals(bundle.getString("CONVERSATION_ID_KEY"), this.aA)) {
            this.a = bundle.getInt("CONVERSATION_ITEM_POSITION_KEY", -1);
        }
    }

    public final void a(araq araq) {
        if ((araq.a & 1) != 0) {
            arao arao = araq.b;
            if (arao == null) {
                arao = arao.g;
            }
            ybv a = ybv.a(arao);
            a.aa = this.ay.h;
            a.a(this.v, "conversation_name_dialog");
        }
    }

    public final void a(String str) {
        ajts ajts = this.au.l;
        if (ajts != null) {
            ajts.a = ajqy.a(str);
        }
        g();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xzz.class, ybg.class};
        } else if (i == 0) {
            xzz xzz = (xzz) obj;
            if (TextUtils.equals(xzz.a, this.aA)) {
                a(xzz.b);
                return null;
            }
        } else if (i == 1) {
            d(-1);
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
