package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.youtube.R;

/* renamed from: hdy */
public abstract class hdy implements aecb {
    public final bcaa a;
    private final Context b;
    private final xci c;
    private final bcaa d;
    private final bcaa e;
    private final aigw f;
    private final vvz g;
    private final ajam h;
    private final adqf i;
    private final zyw j;
    private final bdfu k = new bdfu();
    private final hdx l;
    private ViewGroup m;
    private TextView n;
    private TextView o;
    private TextView p;
    private aigo q;
    private vvs r;
    private boolean s;
    private aicd t;
    private aeby u;
    private aeby v;

    protected hdy(Context context, xci xci, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, aigw aigw, vvz vvz, ajam ajam, adqf adqf, zyw zyw) {
        this.b = context;
        this.c = xci;
        this.a = bcaa;
        this.d = bcaa2;
        this.e = bcaa3;
        this.f = aigw;
        this.g = vvz;
        this.h = ajam;
        this.i = adqf;
        this.j = zyw;
        this.l = new hdx();
    }

    public abstract void a(boolean z);

    public abstract void a(boolean z, boolean z2);

    public abstract void b(boolean z);

    public abstract void c(boolean z);

    public void a(ViewGroup viewGroup) {
        if (!this.s) {
            this.m = (ViewGroup) amqw.a((Object) viewGroup);
            this.n = (TextView) amqw.a((TextView) viewGroup.findViewById(R.id.skip_ad_view));
            this.o = (TextView) amqw.a((TextView) viewGroup.findViewById(R.id.minibar_title));
            this.p = (TextView) amqw.a((TextView) viewGroup.findViewById(R.id.minibar_subtitle));
            aigp aigp = (aigp) amqw.a((aigp) viewGroup.findViewById(R.id.ad_thumbnail));
            this.q = this.f.a((aigp) amqw.a((aigp) viewGroup.findViewById(R.id.thumbnail)));
            this.r = new vvs((aigp) vvz.a(aigp, 1), (akkq) vvz.a((akkq) this.g.a.get(), 2));
            this.k.a(this.r.a(this.h));
            aecb aecb = (hea) this.d.get();
            amqw.a((Object) viewGroup);
            if (!aecb.d) {
                aeca aeca = (aeca) aecb.b.get();
                aeca.a(aecb);
                aecb.k = aeca.g;
                aecb.e = (TimeBar) amqw.a((TimeBar) viewGroup.findViewById(R.id.mdx_minibar_time_bar));
                aecb.e.a(aecb.f);
                aecb.g = (ImageView) amqw.a((ImageView) viewGroup.findViewById(R.id.play_pause));
                aecb.g.setOnClickListener(new hdz(aecb));
                aecb.a.a(aecb.g);
                aecb.h = (TextView) amqw.a((TextView) viewGroup.findViewById(R.id.skip_ad_view));
                aecb.h.setOnClickListener(new hec(aecb));
                if (aecb.i == null) {
                    aecb.a(aich.a());
                }
                aecb.d = true;
            }
            aeca aeca2 = (aeca) this.a.get();
            aeca2.a((aecb) this);
            this.v = aeca2.g;
            this.c.a(((aibd) this.e.get()).B);
            if (aipo.a(this.j, 2097152)) {
                this.k.a(this.q.a(this.h));
            } else {
                this.c.a(this.q);
            }
            zyw zyw = this.j;
            this.e.get();
            if (aipo.a(zyw, 8192)) {
                this.k.a(((aibd) this.e.get()).A.a(this.h));
            } else {
                this.c.a(((aibd) this.e.get()).A);
            }
            this.t = aicd.m;
            int i = this.v.i();
            if (i == 0) {
                e();
            } else if (i == 1) {
                b();
            }
            d();
            this.s = true;
        }
    }

    public void a() {
        this.s = false;
        ((aeca) this.a.get()).b((aecb) this);
        this.k.a();
        if (!(this.q == null || aipo.a(this.j, 2097152))) {
            this.c.b(this.q);
        }
        if (((aibd) this.e.get()).A != null) {
            zyw zyw = this.j;
            this.e.get();
            if (!aipo.a(zyw, 8192)) {
                this.c.b(((aibd) this.e.get()).A);
            }
        }
        this.c.b(((aibd) this.e.get()).B);
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        aecb aecb = (hea) this.d.get();
        ((aeca) aecb.b.get()).b(aecb);
        aecb.e = null;
        aecb.g.setOnClickListener(null);
        aecb.g = null;
        aecb.h.setOnClickListener(null);
        aecb.h = null;
        aecb.i = null;
        aecb.d = false;
    }

    /* JADX WARNING: Missing block: B:8:0x0013, code skipped:
            if (r2 != 3) goto L_0x0024;
     */
    public final void a(int r2, defpackage.aeby r3) {
        /*
        r1 = this;
        r0 = r1.v;
        r1.u = r0;
        r1.v = r3;
        r3 = r1.s;
        if (r3 == 0) goto L_0x0024;
    L_0x000a:
        if (r2 == 0) goto L_0x001e;
    L_0x000c:
        r3 = 1;
        if (r2 == r3) goto L_0x001a;
    L_0x000f:
        r3 = 2;
        if (r2 == r3) goto L_0x0016;
    L_0x0012:
        r3 = 3;
        if (r2 == r3) goto L_0x001a;
    L_0x0015:
        goto L_0x0024;
    L_0x0016:
        r1.e();
        return;
    L_0x001a:
        r1.b();
        return;
    L_0x001e:
        r1.b();
        r1.d();
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hdy.a(int, aeby):void");
    }

    private final void b() {
        if (this.v.i() == 1) {
            int a = this.v.a();
            boolean z = false;
            hdx hdx;
            if (a == 0) {
                if (this.v.d() == 0) {
                    this.l.a = this.b.getString(R.string.mdx_connected_to, new Object[]{this.v.c()});
                } else {
                    aeby aeby = this.u;
                    if (aeby != null && aeby.a() == 4) {
                        this.l.a = this.v.b();
                    }
                }
                this.l.b = d(false);
                hdx = this.l;
                hdx.h = hdx.a;
                hdx.f = false;
                hdx.d = false;
                hdx.e = false;
                hdx.g = false;
            } else if (a != 1) {
                String str = "";
                if (a == 2) {
                    hdx hdx2;
                    aebu f = this.v.f();
                    if (TextUtils.isEmpty(f.a())) {
                        hdx2 = this.l;
                        hdx2.d = true;
                        hdx2.a = str;
                        hdx2.b = str;
                        hdx2.h = str;
                        hdx2.e = false;
                    } else {
                        hdx2 = this.l;
                        hdx2.d = false;
                        hdx2.a = f.a();
                        this.l.b = f.b();
                        hdx2 = this.l;
                        hdx2.h = hdx2.a;
                        hdx2.e = true;
                    }
                    hdx2 = this.l;
                    hdx2.f = false;
                    if (f.d() == 1) {
                        z = true;
                    }
                    hdx2.c = z;
                    this.r.a(f.e());
                    this.l.g = true;
                } else if (a == 4) {
                    this.l.a = this.o.getResources().getString(R.string.mdx_autonav_snackbar_message);
                    hdx = this.l;
                    hdx.b = str;
                    hdx.f = true;
                    hdx.e = false;
                    hdx.d = false;
                    hdx.h = this.b.getString(R.string.mdx_minibar_description);
                    hdx = this.l;
                    hdx.c = false;
                    hdx.g = true;
                }
            } else {
                String b = this.v.b();
                int isEmpty = TextUtils.isEmpty(b) ^ 1;
                if (isEmpty != 0) {
                    this.l.a = b;
                }
                this.l.b = d(isEmpty);
                this.l.h = this.b.getString(R.string.mdx_minibar_accessibility_queue_status, new Object[]{this.v.b(), this.v.c()});
                hdx = this.l;
                hdx.e = false;
                hdx.f = false;
                hdx.d = false;
                hdx.c = false;
                hdx.g = false;
            }
            c();
        }
    }

    private final void c() {
        boolean z = this.l.c;
        xpr.a(this.n, z);
        c(z);
        aigo aigo = this.q;
        hdx hdx = this.l;
        aigo.c = hdx.g;
        this.o.setText(hdx.a);
        this.p.setText(this.l.b);
        z = this.l.f;
        if (z) {
            this.o.setGravity(8388627);
        } else {
            this.o.setGravity(8388691);
        }
        xpr.a(this.p, z ^ 1);
        b(z);
        z = this.l.d;
        xpr.a(this.o, z ^ 1);
        View view = this.p;
        boolean z2 = false;
        if (!(z || this.l.f)) {
            z2 = true;
        }
        xpr.a(view, z2);
        a(z, this.l.f);
        this.m.setContentDescription(this.l.h);
        a(this.l.e);
    }

    private final String d(boolean z) {
        if (this.v.d() != 0) {
            return this.b.getString(R.string.mdx_minibar_queue_status, new Object[]{String.valueOf(this.v.e() + 1), String.valueOf(this.v.d())});
        } else if (!z) {
            return this.b.getString(R.string.mdx_minibar_queue_status_no_videos);
        } else {
            Context context = this.b;
            r0 = new Object[2];
            String str = "1";
            r0[0] = str;
            r0[1] = str;
            return context.getString(R.string.mdx_minibar_queue_status, r0);
        }
    }

    private final void d() {
        aicd aicd = aicd.m;
        int a = this.v.a();
        if (a == 1) {
            aicd = aicd.a;
        } else if (a == 2) {
            aicd = aicd.i;
        }
        if (this.t != aicd) {
            this.t = aicd;
            ((hea) this.d.get()).a(aicd);
        }
    }

    private final void e() {
        int d;
        int i;
        CharSequence charSequence;
        adqe c = this.i.c();
        if (c != null) {
            d = c.d();
        } else {
            d = 2;
        }
        if (d == 0) {
            i = !c.e() ? R.string.mdx_connecting_to_screen : R.string.reconnecting_to_screen;
            charSequence = null;
        } else if (d != 1) {
            if (d != 2) {
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("invalid connection state: ");
                stringBuilder.append(d);
                amqw.b(false, stringBuilder.toString());
            }
            return;
        } else {
            charSequence = d(false);
            i = R.string.mdx_connected_to;
        }
        this.l.a = this.b.getString(i, new Object[]{this.v.c()});
        hdx hdx = this.l;
        hdx.b = charSequence;
        hdx.h = hdx.a;
        hdx.f = TextUtils.isEmpty(charSequence);
        hdx hdx2 = this.l;
        hdx2.d = false;
        hdx2.e = false;
        hdx2.g = false;
        c();
    }
}
