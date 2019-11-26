package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;

/* renamed from: gxt */
public final class gxt extends nd implements xcp {
    private static final Pattern au = Pattern.compile("RD.*");
    public View Z;
    private TextView aA;
    private ImageView aB;
    private wxi aC;
    private aiqq aD;
    public View aa;
    public View ab;
    public airv ac;
    public akkq ad;
    public final gxy ae = new gxy(this);
    public adqf af;
    public aizy ag;
    public xci ah;
    public hfk ai;
    public aiuu aj;
    public String ak;
    public int al;
    public String am;
    public long an;
    public boolean ao = true;
    public CountDownLatch ap;
    public aakj aq;
    public xoi ar;
    public acvx as;
    public int at;
    private View av;
    private View aw;
    private TextView ax;
    private View ay;
    private View az;

    public static void a(airl airl, nt ntVar) {
        gxt gxt = new gxt();
        Bundle bundle = new Bundle();
        bundle.putParcelable("watch", airl);
        gxt.f(bundle);
        gxt.a(ntVar, null);
    }

    public final void J_() {
        super.J_();
        this.ai = null;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.remote_watch_dialog_fragment, viewGroup, false);
        this.Z = inflate.findViewById(R.id.loading);
        this.aa = inflate.findViewById(R.id.error);
        this.ab = inflate.findViewById(R.id.content);
        this.aw = inflate.findViewById(R.id.connecting);
        this.ax = (TextView) inflate.findViewById(R.id.connecting_textview);
        this.av = inflate.findViewById(R.id.remote_actions);
        this.ay = inflate.findViewById(R.id.play);
        this.aA = (TextView) inflate.findViewById(R.id.play_text);
        this.az = inflate.findViewById(R.id.queue);
        this.aB = (ImageView) inflate.findViewById(R.id.thumbnail);
        return inflate;
    }

    public final Dialog a(Bundle bundle) {
        Dialog a = super.a(bundle);
        a.getWindow().requestFeature(1);
        return a;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((gxw) xse.a(p())).a(this);
        this.as.a(acwl.J, aaax.a(this.j.getByteArray("navigation_endpoint")), null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e8  */
    public final void W_() {
        /*
        r10 = this;
        super.W_();
        r0 = r10.j;
        r1 = "watch";
        r0 = r0.containsKey(r1);
        defpackage.amqw.b(r0);
        r0 = r10.af;
        r0 = r0.c();
        r2 = r10.af;
        r2 = r2.g();
        r10.a(r0, r2);
        if (r0 == 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0023;
    L_0x0020:
        if (r2 != 0) goto L_0x0023;
    L_0x0022:
        return;
    L_0x0023:
        r0 = r10.ah;
        r0.a(r10);
        r0 = r10.j;
        r0 = r0.getParcelable(r1);
        r0 = (defpackage.airl) r0;
        r0 = r0.a;
        r10.aD = r0;
        r0 = r10.aD;
        r0 = r0.c();
        r10.ak = r0;
        r0 = r10.aD;
        r0 = r0.d();
        r10.al = r0;
        r0 = r10.aD;
        r0 = r0.g();
        r10.an = r0;
        r0 = r10.aD;
        r1 = r0.e;
        r0 = r0.f();
        r2 = 5;
        r3 = 0;
        r4 = 6;
        r5 = 3;
        r6 = 1;
        r7 = 4;
        r8 = 2;
        if (r0 == 0) goto L_0x0079;
    L_0x005d:
        r0 = r10.al;
        r0 = java.lang.Math.max(r3, r0);
        r10.al = r0;
        r0 = r10.aD;
        r0 = r0.f();
        r1 = r10.al;
        r0 = r0.get(r1);
        r0 = (java.lang.String) r0;
        r10.am = r0;
        r10.at = r8;
    L_0x0077:
        r2 = 2;
        goto L_0x00da;
    L_0x0079:
        r0 = r10.aD;
        r0 = r0.c();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x00c0;
    L_0x0085:
        r0 = r10.aD;
        r0 = r0.b();
        r10.am = r0;
        r0 = au;
        r9 = r10.ak;
        r0 = r0.matcher(r9);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x009e;
    L_0x009b:
        r10.at = r2;
        goto L_0x00da;
    L_0x009e:
        if (r1 != r5) goto L_0x00a3;
    L_0x00a0:
        r10.at = r8;
        goto L_0x0077;
    L_0x00a3:
        r0 = r10.ak;
        r2 = "PPSV";
        r0 = android.text.TextUtils.equals(r0, r2);
        if (r0 != 0) goto L_0x00bc;
    L_0x00ad:
        r0 = r10.al;
        if (r0 > 0) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00b8;
    L_0x00b2:
        if (r1 == r7) goto L_0x00b8;
    L_0x00b4:
        r10.at = r5;
        r2 = 3;
        goto L_0x00da;
    L_0x00b8:
        r10.at = r7;
        r2 = 4;
        goto L_0x00da;
    L_0x00bc:
        r10.at = r4;
        r2 = 6;
        goto L_0x00da;
    L_0x00c0:
        r0 = r10.aD;
        r0 = r0.b();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x00d7;
    L_0x00cc:
        r0 = r10.aD;
        r0 = r0.b();
        r10.am = r0;
        r10.at = r8;
        goto L_0x0077;
    L_0x00d7:
        r10.at = r6;
        r2 = 1;
    L_0x00da:
        if (r2 != r6) goto L_0x00e8;
    L_0x00dc:
        r0 = r10.ar;
        r1 = 2131952332; // 0x7f1302cc float:1.9541104E38 double:1.053324406E-314;
        r0.a(r1);
        r10.f();
        return;
    L_0x00e8:
        if (r2 != r8) goto L_0x00f2;
    L_0x00ea:
        r0 = "";
        r10.ak = r0;
        r0 = -1;
        r10.al = r0;
        goto L_0x00f9;
    L_0x00f2:
        if (r2 != r7) goto L_0x00f5;
    L_0x00f4:
        goto L_0x00f7;
    L_0x00f5:
        if (r2 != r4) goto L_0x00f9;
    L_0x00f7:
        r10.al = r3;
    L_0x00f9:
        r0 = r10.aa;
        r1 = 2131757406; // 0x7f10095e float:1.9145747E38 double:1.0532280996E-314;
        r0 = r0.findViewById(r1);
        r1 = new gxu;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
        r10.W();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxt.W_():void");
    }

    public final void W() {
        if (Z()) {
            X();
            return;
        }
        this.Z.setVisibility(0);
        this.aa.setVisibility(8);
        this.ab.setVisibility(8);
        this.aC = wxi.a(new gxx(this));
        a(this.am, wxc.a(p(), this.aC));
    }

    public final void N_() {
        super.N_();
        wxi wxi = this.aC;
        if (wxi != null) {
            wxi.a();
            this.aC = null;
        }
        if (this.ao) {
            this.ah.b(this);
        }
    }

    private final boolean Z() {
        return !TextUtils.isEmpty(this.ak) && TextUtils.isEmpty(this.am);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Missing block: B:14:0x0038, code skipped:
            if (r1 != 5) goto L_0x004c;
     */
    public final void X() {
        /*
        r4 = this;
        r0 = r4.Z;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r4.aa;
        r0.setVisibility(r1);
        r0 = r4.ab;
        r1 = 0;
        r0.setVisibility(r1);
        r0 = r4.af;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0060;
    L_0x001a:
        r0 = r0.d();
        if (r0 == 0) goto L_0x002b;
    L_0x0020:
        r0 = r4.af;
        r0 = r0.g();
        if (r0 != 0) goto L_0x002b;
    L_0x0028:
        r4.aa();
    L_0x002b:
        r0 = r4.at;
        r1 = r0 + -1;
        if (r0 == 0) goto L_0x005e;
    L_0x0031:
        r0 = 3;
        if (r1 == r0) goto L_0x0044;
    L_0x0034:
        r0 = 4;
        if (r1 == r0) goto L_0x003b;
    L_0x0037:
        r0 = 5;
        if (r1 == r0) goto L_0x0044;
    L_0x003a:
        goto L_0x004c;
    L_0x003b:
        r0 = r4.aA;
        r1 = 2131953132; // 0x7f1305ec float:1.9542726E38 double:1.053324801E-314;
        r0.setText(r1);
        goto L_0x004c;
    L_0x0044:
        r0 = r4.aA;
        r1 = 2131953130; // 0x7f1305ea float:1.9542722E38 double:1.0533248E-314;
        r0.setText(r1);
    L_0x004c:
        r0 = r4.aq;
        if (r0 == 0) goto L_0x005d;
    L_0x0050:
        r1 = r4.ad;
        r2 = r4.aB;
        r0 = r0.g();
        r3 = defpackage.akko.h;
        r1.a(r2, r0, r3);
    L_0x005d:
        return;
    L_0x005e:
        r0 = 0;
        throw r0;
    L_0x0060:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxt.X():void");
    }

    public final void a(String str, wxg wxg) {
        this.ac.a(str, this.aD.k(), this.aD.i(), "", -1, wxg);
    }

    private final void aa() {
        boolean z = this.ag.k() == null;
        this.av.setVisibility(0);
        this.ay.setOnClickListener(new gxs(this, z));
        int i = this.at;
        int i2 = i - 1;
        if (i != 0) {
            acwc acwc;
            if (i2 == 1 || i2 == 2) {
                acwc = !z ? acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_VIDEO_BUTTON : acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_VIDEO_BUTTON_EMPTY_QUEUE;
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        acwc = !z ? acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_MIX_BUTTON : acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_MIX_BUTTON_EMPTY_QUEUE;
                    } else if (i2 != 5) {
                        acwc = null;
                    }
                }
                acwc = !z ? acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_PLAYLIST_BUTTON : acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_PLAYLIST_BUTTON_EMPTY_QUEUE;
            }
            if (acwc != null) {
                this.as.b(acwc, null);
            }
            this.az.setOnClickListener(new gxv(this, z));
            i2 = this.at;
            int i3 = i2 - 1;
            if (i2 != 0) {
                acwc acwc2;
                if (i3 != 1 && i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                acwc2 = null;
                            }
                        } else if (z) {
                            acwc2 = acwc.MDX_REMOTE_WATCH_DIALOG_QUEUE_MIX_BUTTON_EMPTY_QUEUE;
                        } else {
                            acwc2 = acwc.MDX_REMOTE_WATCH_DIALOG_QUEUE_MIX_BUTTON;
                        }
                    }
                    if (z) {
                        acwc2 = acwc.MDX_REMOTE_WATCH_DIALOG_QUEUE_PLAYLIST_BUTTON_EMPTY_QUEUE;
                    } else {
                        acwc2 = acwc.MDX_REMOTE_WATCH_DIALOG_QUEUE_PLAYLIST_BUTTON;
                    }
                } else if (z) {
                    acwc2 = acwc.MDX_REMOTE_WATCH_DIALOG_QUEUE_VIDEO_BUTTON_EMPTY_QUEUE;
                } else {
                    acwc2 = acwc.MDX_REMOTE_WATCH_DIALOG_QUEUE_VIDEO_BUTTON;
                }
                if (acwc2 != null) {
                    this.as.b(acwc2, null);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void a(aakj aakj) {
        this.aj.a(aakj.l(), new gxz(this), this.am);
    }

    private final void a(adqe adqe, boolean z) {
        if (p() == null) {
            f();
        } else if (adqe == null && !z) {
            f();
        } else if (z) {
            this.ax.setText(p().getString(R.string.reconnecting));
            this.aw.setVisibility(0);
        } else {
            int d = adqe.d();
            if (d == 0) {
                if (adqe.e()) {
                    this.ax.setText(p().getString(R.string.reconnecting));
                } else {
                    this.ax.setText(p().getString(R.string.connecting));
                }
                this.aw.setVisibility(0);
            } else if (d == 1) {
                this.aw.setVisibility(8);
                if (Z() || this.aq != null) {
                    aa();
                }
            } else if (d == 2) {
                f();
            }
        }
    }

    public final void Y() {
        adqe c = this.af.c();
        if (c != null && c.d() == 1) {
            this.af.c().b(this.am);
        }
        xpr.a(p(), (int) R.string.video_added_to_tv_queue, 0);
        this.ah.b(this);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{adqk.class, afqf.class, ahkf.class};
        } else if (i == 0) {
            a(((adqk) obj).a, this.af.g());
        } else if (i != 1) {
            if (i != 2) {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (((ahkf) obj).e == 5) {
                CountDownLatch countDownLatch = this.ap;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    if (this.ap.getCount() == 0) {
                        Y();
                        return null;
                    }
                }
            }
        } else if (this.ag.k() != null) {
            this.ap = new CountDownLatch(2);
            return null;
        }
        return clsArr;
    }
}
