package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hfv */
public final class hfv implements aecb, lhu, xcp {
    public MediaRouteButton A;
    public aeby B;
    public final bdfu C = new bdfu();
    public AdProgressTextView D;
    public vzr E;
    public TextView F;
    public TextView G;
    public TextView H;
    public ImageView I;
    public Space J;
    public ImageView K;
    public TextView L;
    public ViewGroup M;
    public ImageView N;
    private final akvo O;
    private final auvn P;
    private boolean Q;
    public final Context a;
    public final xci b;
    public final bcaa c;
    public final hfm d;
    public final hfk e;
    public final lsl f;
    public final bcaa g;
    public final bcaa h;
    public final bcaa i;
    public final akvo j;
    public final hfs k;
    public final boolean l;
    public final heh m;
    public final adgp n;
    public final zyw o;
    public final ajam p;
    public final bcaa q;
    public ViewGroup r;
    public TextView s;
    public View t;
    public boolean u;
    public LoadingFrameLayout v;
    public View w;
    public ViewGroup x;
    public hfo y;
    public hef z;

    public hfv(Context context, xci xci, bcaa bcaa, hfm hfm, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, auvn auvn, hfs hfs, boolean z, heh heh, adgp adgp, akvo akvo, hfk hfk, lsl lsl, akvo akvo2, zyw zyw, ajam ajam, bcaa bcaa5) {
        this.a = context;
        this.b = xci;
        this.c = bcaa;
        this.d = hfm;
        this.e = hfk;
        this.f = lsl;
        this.g = bcaa2;
        this.h = bcaa3;
        this.i = bcaa4;
        this.O = akvo;
        this.j = akvo2;
        this.P = auvn;
        this.k = hfs;
        this.l = z;
        this.m = heh;
        this.n = adgp;
        this.o = zyw;
        this.p = ajam;
        this.q = bcaa5;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        ViewGroup viewGroup = this.M;
        int visibility = viewGroup != null ? viewGroup.getVisibility() : 0;
        TextView textView = this.L;
        CharSequence text = textView != null ? textView.getText() : "";
        this.x.removeAllViews();
        ((heb) this.g.get()).b();
        this.M = (ViewGroup) View.inflate(this.x.getContext(), R.layout.mdx_remote_queue_player, this.x);
        this.F = (TextView) this.M.findViewById(R.id.ad_badge);
        this.H = (TextView) this.M.findViewById(R.id.visit_advertiser);
        TextView textView2 = this.H;
        if (textView2 != null) {
            textView2.setOnClickListener(new hfz(this));
        }
        this.D = (AdProgressTextView) this.M.findViewById(R.id.ad_progress_text);
        if (this.D != null) {
            this.E = new vzr(0);
            this.E.a(this.D);
            this.E.a = true;
        }
        this.G = (TextView) this.M.findViewById(R.id.skip_ad_view);
        textView2 = this.G;
        if (textView2 != null) {
            textView2.setOnClickListener(new hfx(this));
        }
        this.J = (Space) this.M.findViewById(R.id.time_bar_extra_space);
        this.L = (TextView) amqw.a((TextView) this.M.findViewById(R.id.mdx_video_title));
        this.N = (ImageView) amqw.a((ImageView) this.M.findViewById(R.id.player_overflow));
        this.I = (ImageView) this.M.findViewById(R.id.ad_player_overflow);
        this.K = (ImageView) this.M.findViewById(R.id.ad_choices);
        ImageView imageView = this.K;
        if (imageView != null) {
            imageView.setOnClickListener(new hfu(this));
        }
        this.M.setVisibility(visibility);
        this.L.setText(text);
        this.L.setOnClickListener(new hfw(this));
        d();
        aecb aecb = (heb) this.g.get();
        Object obj = this.x;
        amqw.a(obj);
        if (!aecb.p) {
            aeca aeca = (aeca) aecb.b.get();
            aeca.a(aecb);
            aecb.q = aeca.g;
            aecb.e = (ImageView) amqw.a((ImageView) obj.findViewById(R.id.play_pause_replay_button));
            heg heg = new heg(aecb);
            aecb.e.setOnClickListener(heg);
            aecb.a.a(aecb.e);
            aecb.f = (ImageView) amqw.a((ImageView) obj.findViewById(R.id.previous_button));
            aecb.f.setOnClickListener(heg);
            aecb.g = (ImageView) amqw.a((ImageView) obj.findViewById(R.id.next_button));
            aecb.g.setOnClickListener(heg);
            if (aecb.d) {
                aecb.i = (ImageView) obj.findViewById(R.id.jump_backward_button);
                aecb.i.setVisibility(0);
                aecb.i.setOnClickListener(heg);
                aecb.h = (ImageView) obj.findViewById(R.id.jump_forward_button);
                aecb.h.setVisibility(0);
                aecb.h.setOnClickListener(heg);
            }
            aecb.t = (Space) obj.findViewById(R.id.ad_next_extra_space);
            aecb.u = (Space) obj.findViewById(R.id.ad_previous_extra_space);
            aecb.c();
            aecb.j = (ProgressBar) amqw.a((ProgressBar) obj.findViewById(R.id.progress_bar));
            aecb.k = (TimeBar) amqw.a((TimeBar) obj.findViewById(R.id.time_bar));
            aecb.k.a(aecb.l);
            aecb.k.a(new hed(aecb));
            if (aecb.o == null) {
                aecb.o = aich.a();
            }
            aecb.p = true;
            aecb.d();
            Map hashMap = new HashMap();
            hashMap.put(aecb.f, acwc.PLAYER_PREVIOUS_BUTTON);
            hashMap.put(aecb.g, acwc.PLAYER_NEXT_BUTTON);
            hashMap.put(aecb.e, acwc.PLAYER_PLAY_PAUSE_BUTTON);
            hashMap.put(aecb.k, acwc.PLAYER_TIME_BAR);
            if (aecb.d) {
                hashMap.put(aecb.i, acwc.PLAYER_JUMP_BACKWARD_BUTTON);
                hashMap.put(aecb.h, acwc.PLAYER_JUMP_FORWARD_BUTTON);
            }
            aecb.r = amur.a(hashMap);
            aecb.c.a(acwl.y, null, null);
            amxn amxn = (amxn) ((amuw) aecb.r.keySet()).e().listIterator();
            while (amxn.hasNext()) {
                aecb.c.b((acwc) aecb.r.get((View) amxn.next()), null);
            }
        }
    }

    public final void b() {
        if (this.u) {
            this.f.a();
            this.s.setText(R.string.mdx_remote_queue_status_no_videos);
            this.O.b();
            this.w.setVisibility(0);
            this.r.setVisibility(8);
            this.v.setVisibility(8);
            this.t.setVisibility(8);
            this.N.setVisibility(8);
            this.M.setVisibility(8);
        }
    }

    public final void a(aafv aafv) {
        if (this.u) {
            auvn auvn = null;
            ajya ajya = aafv != null ? aafv.h : null;
            if (ajya != null) {
                this.w.setVisibility(8);
                boolean z = false;
                if (this.l) {
                    this.r.setVisibility(0);
                }
                this.v.setVisibility(0);
                this.M.setVisibility(0);
                this.t.setVisibility(0);
                xpr.a(this.N, this.Q ^ 1);
                this.f.a(aafv.h);
                hfo hfo = this.y;
                ajya ajya2 = aafv.h;
                if (ajya2 != null && aebk.a(ajya2.e)) {
                    z = true;
                }
                hfo.f = z;
                hfo.a();
                this.s.setText(ajqy.a(ajya.l));
                akvo akvo = this.O;
                View view = this.t;
                auvr auvr = ajya.n;
                if (!(auvr == null || (auvr.a & 1) == 0)) {
                    auvn = auvr.b;
                    if (auvn == null) {
                        auvn = auvn.l;
                    }
                }
                akvo.a(view, auvn, ajya, acvx.g);
                return;
            }
            this.f.a();
        }
    }

    public final void c() {
        CharSequence string;
        int a = this.B.a();
        if (a == 2) {
            this.Q = true;
            if (this.B.f().a() == null) {
                string = this.a.getResources().getString(R.string.advertisement_assurance);
            } else {
                string = this.B.f().a();
            }
        } else if (a != 4) {
            this.Q = false;
            string = this.B.b();
        } else {
            this.Q = false;
            string = this.a.getResources().getString(R.string.mdx_autonav_snackbar_message);
        }
        this.L.setText(string);
    }

    public final void a(int i, aeby aeby) {
        this.B = aeby;
        if (this.u) {
            if (i == 0 || i == 1) {
                c();
            } else if (i == 5) {
                i = this.B.l();
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                } else if (i2 == 0) {
                    this.w.setVisibility(8);
                    if (this.l) {
                        this.r.setVisibility(0);
                    }
                    this.v.setVisibility(0);
                    this.t.setVisibility(8);
                    this.N.setVisibility(8);
                    this.M.setVisibility(0);
                } else if (i2 == 4) {
                    a(this.B.g());
                }
            }
            d();
        }
    }

    /* JADX WARNING: Missing block: B:41:0x00d3, code skipped:
            if (r1 == null) goto L_0x00d5;
     */
    private final void d() {
        /*
        r7 = this;
        r0 = r7.D;
        r1 = 1;
        if (r0 == 0) goto L_0x00c3;
    L_0x0005:
        r0 = r7.c;
        r0 = r0.get();
        r0 = (defpackage.aeca) r0;
        r2 = r7.F;
        r3 = r7.Q;
        defpackage.xpr.a(r2, r3);
        r2 = r7.J;
        r3 = r7.Q;
        r3 = r3 ^ r1;
        defpackage.xpr.a(r2, r3);
        r2 = r7.I;
        r3 = r7.Q;
        defpackage.xpr.a(r2, r3);
        r2 = r7.Q;
        r3 = 4;
        r4 = 8;
        r5 = 2;
        if (r2 != 0) goto L_0x0031;
    L_0x002b:
        r2 = r7.H;
        r2.setVisibility(r4);
        goto L_0x0048;
    L_0x0031:
        r2 = r0.g;
        r2 = r2.a();
        if (r2 != r5) goto L_0x0043;
    L_0x0039:
        r2 = r0.b;
        if (r2 == 0) goto L_0x0043;
    L_0x003d:
        r2 = r7.H;
        defpackage.xpr.a(r2, r1);
        goto L_0x0048;
    L_0x0043:
        r2 = r7.H;
        r2.setVisibility(r3);
    L_0x0048:
        r2 = r7.Q;
        if (r2 != 0) goto L_0x0052;
    L_0x004c:
        r2 = r7.K;
        r2.setVisibility(r4);
        goto L_0x0069;
    L_0x0052:
        r2 = r0.g;
        r2 = r2.a();
        if (r2 != r5) goto L_0x0064;
    L_0x005a:
        r2 = r0.c;
        if (r2 == 0) goto L_0x0064;
    L_0x005e:
        r2 = r7.K;
        defpackage.xpr.a(r2, r1);
        goto L_0x0069;
    L_0x0064:
        r2 = r7.K;
        r2.setVisibility(r3);
    L_0x0069:
        r2 = r7.Q;
        if (r2 != 0) goto L_0x0073;
    L_0x006d:
        r2 = r7.G;
        r2.setVisibility(r4);
        goto L_0x009c;
    L_0x0073:
        r2 = r7.B;
        r2 = r2.f();
        r2 = r2.d();
        if (r2 == 0) goto L_0x0096;
    L_0x007f:
        if (r2 == r1) goto L_0x0090;
    L_0x0081:
        if (r2 == r5) goto L_0x0084;
    L_0x0083:
        goto L_0x009c;
    L_0x0084:
        r2 = r7.G;
        r6 = r7.Q;
        if (r6 != 0) goto L_0x008c;
    L_0x008a:
        r3 = 8;
    L_0x008c:
        r2.setVisibility(r3);
        goto L_0x009c;
    L_0x0090:
        r2 = r7.Q;
        r7.a(r1, r2);
        goto L_0x009c;
    L_0x0096:
        r2 = 0;
        r3 = r7.Q;
        r7.a(r2, r3);
    L_0x009c:
        r2 = r7.E;
        r3 = defpackage.vxe.a();
        r4 = r0.g;
        r4 = r4.a();
        if (r4 != r5) goto L_0x00b5;
    L_0x00aa:
        r0 = r0.g;
        r0 = r0.f();
        r0 = r0.c();
        goto L_0x00b6;
    L_0x00b5:
        r0 = -1;
    L_0x00b6:
        r0 = r3.a(r0);
        r0 = r0.a();
        r3 = r7.Q;
        r2.b(r0, r3);
    L_0x00c3:
        r0 = r7.N;
        r2 = r7.Q;
        r1 = r1 ^ r2;
        defpackage.xpr.a(r0, r1);
        r0 = r7.j;
        r1 = r7.Q;
        if (r1 == 0) goto L_0x00d5;
    L_0x00d1:
        r1 = r7.I;
        if (r1 != 0) goto L_0x00d7;
    L_0x00d5:
        r1 = r7.N;
    L_0x00d7:
        r2 = r7.P;
        r3 = defpackage.acvx.g;
        r0.a(r1, r2, r7, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfv.d():void");
    }

    private final void a(boolean z, boolean z2) {
        this.G.setTextColor(this.a.getResources().getColor(!z ? R.color.quantum_grey600 : R.color.quantum_googblue500));
        this.G.setCompoundDrawablesWithIntrinsicBounds(0, 0, !z ? R.drawable.quantum_ic_skip_next_grey600_24 : R.drawable.quantum_ic_skip_next_googblue_24, 0);
        this.G.setEnabled(z);
        xpr.a(this.G, z2);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{adng.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((adng) obj).ordinal() == 2) {
            b();
            return null;
        }
        return clsArr;
    }
}
