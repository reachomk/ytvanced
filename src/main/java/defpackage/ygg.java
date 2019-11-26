package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.conversation.ui.ConversationRoundedLinearLayout;
import com.google.android.youtube.R;

/* renamed from: ygg */
public class ygg extends yde implements zcm, zcv {
    private final int A;
    private final Point B;
    private final akpd C;
    private final akpk D;
    private zcr E;
    private float F;
    private final aaas a;
    public akor b;
    public final Context f;
    public Object k;
    public final ygo m;
    public final ViewGroup n;
    public boolean o;
    private final zbe p;
    private final View q = a((int) R.layout.conversation_video_bubble);
    private final View r;
    private final View s;
    private final TextView t;
    private final TextView u;
    private final ImageView v = ((ImageView) this.q.findViewById(R.id.video_thumbnail));
    private final View w = this.q.findViewById(R.id.video_thumbnail_layout);
    private final akle x;
    private final TextView y;
    private final int z;

    public ygg(View view, akkl akkl, aaas aaas, akkq akkq, ygu ygu, akmx akmx, zbe zbe, yfg yfg, akpe akpe) {
        super(view, aaas, akkq, ygu, akmx);
        amqw.a((Object) view);
        this.f = (Context) amqw.a(view.getContext());
        this.a = (aaas) amqw.a((Object) aaas);
        this.p = (zbe) amqw.a((Object) zbe);
        this.v.setOnClickListener(new ygf(this));
        this.x = new akle(akkl, this.v);
        this.t = (TextView) this.q.findViewById(R.id.title);
        this.u = (TextView) this.q.findViewById(R.id.unplayable_video_text);
        this.r = this.q.findViewById(R.id.video_metadata_container);
        this.s = this.q.findViewById(R.id.timebar_space);
        view = this.q.findViewById(R.id.incept);
        if (view != null) {
            view.setOnClickListener(new ygk(this));
        }
        Pair k = xss.k(this.f);
        this.B = new Point(Math.min(((Integer) k.first).intValue(), ((Integer) k.second).intValue()), Math.max(((Integer) k.first).intValue(), ((Integer) k.second).intValue()));
        this.m = new ygo(this);
        this.y = (TextView) this.i.findViewById(R.id.chat_header_text_view);
        this.n = (ViewGroup) this.i.findViewById(R.id.player_reference);
        DisplayMetrics displayMetrics = this.f.getResources().getDisplayMetrics();
        xss.a(displayMetrics, 38);
        xss.a(displayMetrics, 27);
        this.z = this.f.getResources().getDimensionPixelSize(R.dimen.conversation_video_item_container_max_width);
        this.A = this.f.getResources().getDimensionPixelSize(R.dimen.conversation_timebar_space);
        yfg.a(awzr.class);
        this.C = akpe.a((akpb) yfg.get());
        this.D = new akpk();
        this.C.a(this.D);
        ViewGroup l = l();
        RecyclerView recyclerView = (RecyclerView) l.findViewById(R.id.related_video_replies_items);
        if (recyclerView != null) {
            recyclerView.a(this.C);
            recyclerView.a(null);
        }
        l.addOnLayoutChangeListener(new ygj(this, l));
    }

    private static float a(float f, float f2, float f3) {
        return ((1.0f - f) * f2) + (f * f3);
    }

    public void a_(akor akor, Object obj) {
        this.k = obj;
        super.a_(akor, obj);
        this.b = akor;
        this.y.setVisibility(8);
        boolean z = obj instanceof ycp;
        if (z) {
            ycp ycp = (ycp) obj;
            a(true);
            if (ycp.c) {
                ycp.a();
                this.m.start();
                this.p.a(this, true);
            } else {
                s();
            }
            a(ygg.a(akor), ygg.b(akor));
            ycy ycy = ycp.b;
            if (ycy != null) {
                ycy.d = ycp.c;
                b().a(this, this.D);
                b().a(ycy);
            }
        } else if (obj instanceof ycs) {
            s();
            ycs ycs = (ycs) obj;
            b().a(this, this.D);
            ycy ycy2 = ycs.b;
            if (ycy2 != null) {
                ycy2.d = false;
                b().a(ycy2);
            }
            a(true);
            a(ygg.a(akor), ygg.b(akor));
        } else if (obj instanceof ajtu) {
            a(false);
        }
        ajtu d = ygg.d(obj);
        if (this.l) {
            this.r.setVisibility(8);
        } else {
            aqnp aqnp = d.e;
            CharSequence charSequence = null;
            if (aqnp == null || (aqnp.a & 2) == 0) {
                this.x.a(null);
                this.v.setBackground(new ColorDrawable(xwe.a(this.f, R.attr.ytTextPrimary, 0)));
                xpr.a(this.u, ajqy.a(d.i));
                this.r.setVisibility(8);
                this.s.setVisibility(0);
            } else {
                if (z || (obj instanceof ycs)) {
                    this.v.setVisibility(4);
                    this.s.setVisibility(8);
                } else {
                    this.v.setVisibility(0);
                    this.s.setVisibility(0);
                    this.x.a(d instanceof ajtu ? d.d : null);
                }
                this.u.setVisibility(8);
                this.r.setVisibility(0);
                TextView textView = this.t;
                ajtu d2 = ygg.d(obj);
                if (d2 instanceof ajtu) {
                    aqnp aqnp2 = d2.e;
                    if (aqnp2 != null) {
                        aryi aryi = aqnp2.c;
                        if (aryi == null) {
                            aryi = aryi.o;
                        }
                        aryg aryg = aryi.f;
                        if (aryg == null) {
                            aryg = aryg.c;
                        }
                        if ((aryg.a & 1) != 0) {
                            arml arml;
                            aryi aryi2 = d2.e.c;
                            if (aryi2 == null) {
                                aryi2 = aryi.o;
                            }
                            aryg aryg2 = aryi2.f;
                            if (aryg2 == null) {
                                aryg2 = aryg.c;
                            }
                            arye arye = aryg2.b;
                            if (arye == null) {
                                arye = arye.u;
                            }
                            if ((arye.a & 1) != 0) {
                                arml = arye.b;
                                if (arml == null) {
                                    arml = arml.f;
                                }
                            }
                            charSequence = ajqy.a(arml);
                        }
                    }
                }
                xpr.a(textView, charSequence);
            }
        }
        ygs c = c();
        if ((this.k instanceof ycs) && c != null) {
            c.a(this);
        }
    }

    public void b(boolean z) {
        if (z) {
            this.m.reverse();
            b().a();
            return;
        }
        q();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aygk aygk) {
        int a;
        aqnl i = zcz.i(ygg.d(this.k));
        if (i != null) {
            a = atwm.a(i.b);
            if (a == 0) {
                a = 1;
            }
        } else {
            a = 2;
        }
        if (a == 2 && (this.k instanceof ajtu)) {
            super.a(aygk);
            return;
        }
        LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
        if (a == 2) {
            layoutParams.gravity = 8388659;
        } else {
            layoutParams.gravity = 8388661;
        }
        xpr.a(this.c, 1 ^ (this.k instanceof ajtu));
        this.c.setLayoutParams(layoutParams);
        b(aygk);
    }

    /* Access modifiers changed, original: protected|final */
    public final void m() {
        b().a();
        Object obj = this.k;
        if (obj instanceof ycp) {
            ((ycp) obj).b = null;
        } else if (obj instanceof ycs) {
            ((ycs) obj).b = null;
        }
    }

    public final void p() {
        ViewGroup l = l();
        if (l != null) {
            l.setVisibility(8);
        }
    }

    public final void d(boolean z) {
        if (z) {
            akor akor = this.b;
            if (akor != null) {
                int a = akor.a("position", -1);
                ygs c = c();
                if (a != -1 && c != null) {
                    this.i.post(new ygh(this, c, a));
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Parcelable parcelable) {
        Object obj = this.k;
        ycy ycy = obj instanceof ycp ? ((ycp) obj).b : obj instanceof ycs ? ((ycs) obj).b : null;
        if (ycy != null) {
            ycy.c = parcelable;
        }
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        if (this.k instanceof ycp) {
            this.p.a(this);
        }
        this.F = 0.0f;
    }

    public Object d() {
        return this.k;
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView f() {
        return this.t;
    }

    public final void a(float f) {
        ViewGroup l = l();
        if (l != null) {
            ygi ygi = new ygi(this, l, f);
            if (this.o) {
                ygi.run();
                return;
            }
            this.i.post(ygi);
        }
    }

    public final void a(ycy ycy) {
        Object obj = this.k;
        if (obj instanceof ycp) {
            ((ycp) obj).b = ycy;
        } else if (obj instanceof ycs) {
            ((ycs) obj).b = ycy;
        }
        if (ycy != null) {
            ViewGroup l = l();
            if (l != null) {
                TextView textView = (TextView) l.findViewById(R.id.title_text);
                if (textView != null) {
                    textView.setText(ycy.a);
                    l.setVisibility(0);
                }
                RecyclerView recyclerView = (RecyclerView) l.findViewById(R.id.related_video_replies_items);
                obj = this.k;
                Parcelable parcelable = null;
                if (obj instanceof ycp) {
                    ycy ycy2 = ((ycp) obj).b;
                    if (ycy2 != null) {
                        parcelable = ycy2.c;
                        if (recyclerView != null && parcelable != null) {
                            recyclerView.n.a(parcelable);
                            return;
                        }
                    }
                }
                if (obj instanceof ycs) {
                    ycy ycy3 = ((ycs) obj).b;
                    if (ycy3 != null) {
                        parcelable = ycy3.c;
                    }
                }
                if (recyclerView != null) {
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void q() {
        if (this.k instanceof ycp) {
            akor akor = this.b;
            ygr ygr = akor != null ? (ygr) akor.a("CONVERSATION_VIDEO_PLAYBACK_CONTROLLER_TAG") : null;
            if (ygr != null) {
                ygr.b((ycp) this.k);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void k() {
        LayoutParams layoutParams = new LayoutParams(-1, -2);
        if (this.l) {
            a(layoutParams);
            return;
        }
        layoutParams.topMargin = (int) ygg.a(this.F, (float) this.d, (float) this.e);
        layoutParams.width = (int) ygg.a(this.F, (float) Math.min((this.B.x - h()) - i(), this.z), (float) this.B.x);
        if (j()) {
            if (e()) {
                layoutParams.rightMargin = (int) ygg.a(this.F, (float) i(), 0.0f);
            } else {
                layoutParams.leftMargin = (int) ygg.a(this.F, (float) h(), 0.0f);
            }
        } else if (e()) {
            layoutParams.leftMargin = (int) ygg.a(this.F, (float) h(), 0.0f);
        } else {
            layoutParams.rightMargin = (int) ygg.a(this.F, (float) i(), 0.0f);
        }
        a(layoutParams);
        ConversationRoundedLinearLayout conversationRoundedLinearLayout = (ConversationRoundedLinearLayout) this.j;
        float f = 1.0f - this.F;
        if (conversationRoundedLinearLayout.a != f) {
            conversationRoundedLinearLayout.a = f;
            conversationRoundedLinearLayout.a(conversationRoundedLinearLayout.getMeasuredWidth(), conversationRoundedLinearLayout.getMeasuredHeight());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(float f) {
        if (this.F != f) {
            this.F = f;
            k();
        }
    }

    /* Access modifiers changed, original: protected */
    public void c(boolean z) {
        if (z) {
            b().a(this, this.D);
        }
        Object obj = this.k;
        if (obj instanceof ycp) {
            ycp ycp = (ycp) obj;
            if (ycp.b == null && z) {
                b().a(ycp);
            }
        }
    }

    private final zcr b() {
        if (this.E == null) {
            akor akor = this.b;
            if (akor != null) {
                this.E = (zcr) akor.a("RELATED_VIDEO_REPLIES_TAG");
            }
        }
        return this.E;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    public final void r() {
        /*
        r3 = this;
        r0 = r3.k;
        r0 = defpackage.ygg.d(r0);
        r1 = r0 instanceof defpackage.ajtu;
        r2 = 0;
        if (r1 == 0) goto L_0x002c;
    L_0x000b:
        r1 = r0.e;
        if (r1 != 0) goto L_0x0010;
    L_0x000f:
        goto L_0x002c;
    L_0x0010:
        r1 = r1.c;
        if (r1 != 0) goto L_0x0016;
    L_0x0014:
        r1 = defpackage.aryi.o;
    L_0x0016:
        r1 = r1.a;
        r1 = r1 & 64;
        if (r1 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x002c;
    L_0x001d:
        r0 = r0.e;
        r0 = r0.c;
        if (r0 != 0) goto L_0x0025;
    L_0x0023:
        r0 = defpackage.aryi.o;
    L_0x0025:
        r0 = r0.h;
        if (r0 != 0) goto L_0x002d;
    L_0x0029:
        r0 = defpackage.apxu.d;
        goto L_0x002d;
    L_0x002c:
        r0 = r2;
    L_0x002d:
        if (r0 == 0) goto L_0x0034;
    L_0x002f:
        r1 = r3.a;
        r1.a(r0, r2);
    L_0x0034:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygg.r():void");
    }

    private final void a(String str, zco zco) {
        if (!TextUtils.isEmpty(str)) {
            this.C.a(new ygl(str, n(), b().a));
        }
        if (zco != null) {
            this.C.a(new zcn(zco));
        }
    }

    private final ygs c() {
        akor akor = this.b;
        return akor != null ? (ygs) akor.a("VIDEOS_LISTENER_KEY") : null;
    }

    private final void s() {
        b(1.0f);
        if (this.k instanceof ycp) {
            this.p.a(this, false);
        }
    }

    private final void a(boolean z) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams.bottomMargin = z ? this.A : 0;
        this.w.setLayoutParams(layoutParams);
    }

    private static ajtu d(Object obj) {
        if (obj instanceof ycp) {
            return ((ycp) obj).a;
        }
        if (obj instanceof ycs) {
            return ((ycs) obj).a;
        }
        return (ajtu) obj;
    }

    private static String a(akor akor) {
        return akor.b("conversation_id");
    }

    private static zco b(akor akor) {
        return (zco) akor.a("ATTACHMENT_PRESENTER_KEY");
    }
}
