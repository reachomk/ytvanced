package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.design.textfield.TextInputLayout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.edit.geo.EditLocation;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.youtube.R;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: gso */
public final class gso implements ezu, vam {
    public final amjp A;
    public final amro B;
    public LinearLayout C;
    public ViewGroup D;
    public ImageView E;
    public akko F;
    public YouTubeTextView G;
    public YouTubeTextView H;
    public ImageView I;
    public ViewAnimatorHelper J;
    public ScrollView K;
    public ImageView L;
    public PrivacySpinner M;
    public TextView N;
    public EditText O;
    public EditText P;
    public EditText Q;
    public TextInputLayout R;
    public EditLocation S;
    public zrr T;
    public String U;
    public String V;
    public String W;
    public fpa X;
    public final List Y;
    public final ambw Z;
    public final dvg a;
    public final alyd aa;
    public long ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public String af;
    public int ag;
    public MenuItem ah;
    public List ai;
    public boolean aj;
    public final String ak;
    public aytx al = aytx.UPLOAD_FLOW_SOURCE_UNKNOWN;
    public alak am;
    private final Executor an;
    private final Executor ao;
    private final akkq ap;
    private final SharedPreferences aq;
    private afpt ar;
    private final fpa as;
    private final alyf at;
    private int au;
    public final atlx b;
    public final ambh c;
    public final zsc d;
    public final znv e;
    public final zqz f;
    public acvx g;
    public final alwu h;
    public boolean i = false;
    public boolean j;
    public aysp k;
    public azaj l;
    public auka m;
    public boolean n;
    public boolean o;
    public avxz p;
    public vap q;
    public boolean r;
    public long s;
    public long t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public gts y;
    public OnClickListener z;

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5  */
    public gso(defpackage.dvg r8, java.util.concurrent.Executor r9, java.util.concurrent.Executor r10, defpackage.akkq r11, defpackage.xhv r12, defpackage.atlx r13, defpackage.zzl r14, defpackage.ambh r15, defpackage.znv r16, defpackage.zqz r17, defpackage.zqs r18, defpackage.alwu r19, defpackage.alyf r20, defpackage.ambw r21, defpackage.alyd r22) {
        /*
        r7 = this;
        r0 = r7;
        r1 = r8;
        r2 = r13;
        r7.<init>();
        r3 = 0;
        r0.i = r3;
        r4 = defpackage.aytx.UPLOAD_FLOW_SOURCE_UNKNOWN;
        r0.al = r4;
        r0.a = r1;
        r4 = r9;
        r0.an = r4;
        r4 = r10;
        r0.ao = r4;
        r0.b = r2;
        r4 = r15;
        r0.c = r4;
        r4 = r11;
        r0.ap = r4;
        r4 = r16;
        r0.e = r4;
        r4 = r17;
        r0.f = r4;
        r4 = r19;
        r0.h = r4;
        r4 = r20;
        r0.at = r4;
        r4 = r21;
        r0.Z = r4;
        r4 = r22;
        r0.aa = r4;
        r7.j();
        r4 = new gsr;
        r5 = r18;
        r4.<init>(r7, r5);
        r4 = defpackage.amrn.a(r4);
        r0.B = r4;
        r4 = r8.getIntent();
        if (r4 == 0) goto L_0x0052;
    L_0x004b:
        r5 = "com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id";
        r4 = r4.getStringExtra(r5);
        goto L_0x0053;
    L_0x0052:
        r4 = 0;
    L_0x0053:
        r0.ak = r4;
        r4 = "youtube";
        r4 = r8.getSharedPreferences(r4, r3);
        r0.aq = r4;
        r4 = r0.aq;
        r5 = defpackage.fpa.PUBLIC;
        r5 = r5.name();
        r6 = "upload_privacy";
        r4 = r4.getString(r6, r5);
        r4 = defpackage.fpa.a(r4);
        r0.X = r4;
        r4 = r0.X;
        r0.as = r4;
        r4 = r0.aq;
        r5 = "enable_upload_video_editing";
        r4 = r4.getBoolean(r5, r3);
        r5 = 1;
        if (r4 != 0) goto L_0x0087;
    L_0x0080:
        r4 = r2.w;
        if (r4 == 0) goto L_0x0085;
    L_0x0084:
        goto L_0x0087;
    L_0x0085:
        r4 = 0;
        goto L_0x0088;
    L_0x0087:
        r4 = 1;
    L_0x0088:
        r0.u = r4;
        r4 = r0.aq;
        r6 = "enable_upload_audio_swap";
        r4 = r4.getBoolean(r6, r3);
        if (r4 != 0) goto L_0x009b;
    L_0x0094:
        r4 = r2.y;
        if (r4 == 0) goto L_0x0099;
    L_0x0098:
        goto L_0x009b;
    L_0x0099:
        r4 = 0;
        goto L_0x009c;
    L_0x009b:
        r4 = 1;
    L_0x009c:
        r0.v = r4;
        r4 = r0.aq;
        r6 = "enable_upload_filters";
        r4 = r4.getBoolean(r6, r3);
        if (r4 == 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00ae;
    L_0x00a9:
        r4 = r2.z;
        if (r4 != 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00b2;
    L_0x00ae:
        r4 = r0.u;
        if (r4 != 0) goto L_0x00b4;
    L_0x00b2:
        r4 = 0;
        goto L_0x00b5;
    L_0x00b4:
        r4 = 1;
    L_0x00b5:
        r0.w = r4;
        r4 = r14.b();
        if (r4 == 0) goto L_0x00ce;
    L_0x00bd:
        r4 = r14.b();
        r4 = r4.c;
        if (r4 != 0) goto L_0x00c7;
    L_0x00c5:
        r4 = defpackage.aujp.C;
    L_0x00c7:
        r4 = r4.l;
        if (r4 != 0) goto L_0x00cc;
    L_0x00cb:
        goto L_0x00ce;
    L_0x00cc:
        r4 = 1;
        goto L_0x00cf;
    L_0x00ce:
        r4 = 0;
    L_0x00cf:
        r0.o = r4;
        r2 = r2.C;
        if (r2 != 0) goto L_0x00d9;
    L_0x00d5:
        r8.getApplicationContext();
        goto L_0x00da;
    L_0x00d9:
        r3 = 1;
    L_0x00da:
        r0.x = r3;
        r2 = r0.aq;
        r3 = new gtm;
        r3.<init>(r7);
        r4 = new zsc;
        r6 = r12;
        r4.<init>(r8, r2, r12, r3);
        r0.d = r4;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0.Y = r2;
        r2 = new amjp;
        r2.<init>(r8);
        r0.A = r2;
        r0.ac = r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gso.<init>(dvg, java.util.concurrent.Executor, java.util.concurrent.Executor, akkq, xhv, atlx, zzl, ambh, znv, zqz, zqs, alwu, alyf, ambw, alyd):void");
    }

    public final int a() {
        return R.id.menu_upload_activity_done;
    }

    public final boolean b() {
        return false;
    }

    public final int c() {
        return R.menu.upload_menu_send;
    }

    public final ezx d() {
        return null;
    }

    public static void a(Context context, DialogInterface.OnClickListener onClickListener) {
        new Builder(context).setTitle(R.string.stop_upload_dialog_title).setMessage(R.string.stop_upload_dialog_body).setPositiveButton(R.string.stop_upload_dialog_positive, onClickListener).setNegativeButton(R.string.stop_upload_dialog_negative, gsq.a).setOnCancelListener(gtd.a).show();
    }

    public final atst e() {
        return alyc.a(this.Y, this.ak);
    }

    private final void t() {
        this.ao.execute(new gth(this));
    }

    public final void a(afpt afpt) {
        this.ar = (afpt) amqw.a((Object) afpt);
        amqw.a(this.ar);
        xvd.a(this.ar.a());
        if (this.k == null || (this.w && this.l == null)) {
            t();
        } else if (this.ar.a().equals(this.af)) {
            a(this.k);
            if (this.w) {
                a(this.l);
            }
            auka auka = this.m;
            if (auka != null) {
                a(auka);
            }
        } else {
            t();
        }
    }

    public final void o_() {
        this.g.a(acwl.aw, null, alyc.a(this.Y, this.ak));
        m();
    }

    public final void p_() {
        this.g.a(acwl.aw, null, alyc.a(this.Y, this.ak));
        m();
    }

    public final void q_() {
        this.g.a(acwl.aw, null, alyc.a(this.Y, this.ak));
        nt f = this.a.f();
        this.q = (vap) f.a("verificationFragmentTag");
        f.a().a(this.q).a();
        f.b();
        this.J.a(R.id.scroll_container);
    }

    public final void a(aysp aysp) {
        amqw.a((Object) aysp);
        this.af = this.ar.a();
        this.E.setBackgroundResource(R.color.upload_activity_account_header_thumbnail_background);
        aygk aygk = aysp.d;
        if (aygk == null) {
            aygk = aygk.f;
        }
        if (aklb.a(aygk)) {
            akkq akkq = this.ap;
            ImageView imageView = this.E;
            aygk aygk2 = aysp.d;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            akkq.a(imageView, aygk2, this.F);
        }
        YouTubeTextView youTubeTextView = this.G;
        arml arml = aysp.b;
        if (arml == null) {
            arml = arml.f;
        }
        youTubeTextView.setText(ajqy.a(arml));
        youTubeTextView = this.H;
        arml = aysp.c;
        if (arml == null) {
            arml = arml.f;
        }
        youTubeTextView.setText(ajqy.a(arml));
        boolean z = aysp.e;
        this.D.setClickable(z);
        if (z) {
            this.I.setVisibility(0);
            this.D.setOnClickListener(this.z);
            View view = this.D;
            xpr.a(view, view.getBackground());
            arml arml2 = aysp.b;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            Spanned a = ajqy.a(arml2);
            arml arml3 = aysp.c;
            if (arml3 == null) {
                arml3 = arml.f;
            }
            Spanned a2 = ajqy.a(arml3);
            CharSequence[] charSequenceArr = new CharSequence[2];
            String str = "";
            if (a == null) {
                a = str;
            }
            charSequenceArr[0] = a;
            if (a2 == null) {
                a2 = str;
            }
            charSequenceArr[1] = a2;
            String join = TextUtils.join(" ", Arrays.asList(charSequenceArr));
            this.D.setContentDescription(this.a.getString(R.string.account_switcher_accessibility_label, new Object[]{join}));
        } else {
            this.I.setVisibility(8);
            this.D.setOnClickListener(null);
            this.D.setBackgroundResource(0);
            this.D.setContentDescription(null);
        }
        this.C.setVisibility(0);
    }

    public final void a(azaj azaj) {
        if (!this.T.aC()) {
            this.e.a(azaj);
            this.T.a(this.e);
            this.T.a(this.e);
            this.T.a(this.e.b(), this.e.b);
        }
    }

    public final void a(auka auka) {
        this.S.setVisibility(0);
        this.S.a(new gtp(this));
        this.S.a(auka);
    }

    public final void i() {
        this.q = (vap) this.a.f().a("verificationFragmentTag");
        vap vap = this.q;
        if (vap != null && vap.v()) {
            this.q.W();
        } else if (this.J.a() == R.id.location_search_view) {
            this.J.a(R.id.scroll_container);
        } else {
            v();
            Object obj = (TextUtils.isEmpty(this.U) && TextUtils.isEmpty(this.V) && this.X == this.as && TextUtils.isEmpty(this.W)) ? null : 1;
            zrr zrr = this.T;
            ujf az = zrr != null ? zrr.az() : null;
            if (!(az == null || az.c())) {
                obj = 1;
            }
            if (this.S.c == null && obj == null) {
                l();
            } else {
                gso.a(this.a, new gto(this));
            }
        }
    }

    public final void j() {
        this.au = 0;
        this.ac = false;
        this.ae = false;
        this.ag = 0;
        u();
    }

    public final boolean a(alya alya) {
        afpf afpf;
        String valueOf;
        String str = "youtubeUploadEditParse::";
        if (this.u) {
            Object obj = Math.floor(Math.random() * 10.0d) != 0.0d ? null : 1;
            try {
                zrr zrr = this.T;
                atst a = alyc.a(alya.b, alya.c);
                zrr.aE = a;
                zrd zrd = zrr.av;
                if (zrd != null) {
                    if (a != null) {
                        zrd.a = a;
                    }
                }
                this.T.a(alya.a);
                return true;
            } catch (IOException e) {
                xtl.a("Failed to read the video file", e);
                if (obj != null) {
                    afpf = afpf.media;
                    valueOf = String.valueOf(zjf.a(e));
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    afpc.a(1, afpf, valueOf, e);
                }
            } catch (RuntimeException e2) {
                xtl.a("Failed to start the edit mode", e2);
                if (obj != null) {
                    afpf = afpf.media;
                    valueOf = String.valueOf(zjf.a(e2));
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    afpc.a(1, afpf, valueOf, e2);
                }
            } catch (Error e22) {
                xtl.a("Failed to parse the video file", e22);
                if (obj != null) {
                    afpf = afpf.media;
                    valueOf = String.valueOf(zjf.a(e22));
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    afpc.a(1, afpf, valueOf, e22);
                }
            }
        }
        return false;
    }

    public final void a(MenuItem menuItem) {
        this.ah = menuItem;
        n();
    }

    private final void u() {
        this.a.runOnUiThread(new gtj(this));
    }

    public final boolean b(MenuItem menuItem) {
        return k();
    }

    public final boolean k() {
        zrr zrr = this.T;
        ujf az = zrr != null ? zrr.az() : null;
        if (az != null) {
            this.s = az.m() - az.k();
        }
        if (!this.r || TimeUnit.MILLISECONDS.toSeconds(this.s) < this.t) {
            m();
        } else {
            long toSeconds = TimeUnit.MILLISECONDS.toSeconds(this.s);
            ambh ambh = this.c;
            afsw gtn = new gtn(this);
            aang aang = ambh.h;
            atbf atbf = (atbf) atbg.d.createBuilder();
            atbf.copyOnWrite();
            atbg atbg = (atbg) atbf.instance;
            atbg.a |= 2;
            atbg.c = (float) toSeconds;
            aaml amas = new amas(ambh.c, ambh.d.c(), (atbg) ((anxl) atbf.build()));
            amas.a(zzp.b);
            aang.a(amas, gtn);
        }
        return true;
    }

    private final void v() {
        this.U = this.O.getText().toString().trim();
        this.V = this.P.getText().toString().trim();
        this.W = this.Q.getText().toString().trim();
        this.X = this.M.a();
    }

    public final void l() {
        this.g.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_CANCEL_BUTTON), alyc.a(this.Y, this.ak));
        this.a.finish();
    }

    public final void m() {
        this.ag = 2;
        u();
        v();
        zrr zrr = this.T;
        ujf az = zrr != null ? zrr.az() : null;
        int i = 1;
        if (TextUtils.isEmpty(this.U)) {
            this.U = DateFormat.getDateInstance(1).format(new Date());
        }
        String[] strArr = new String[this.Y.size()];
        Iterator it = this.Y.iterator();
        int i2 = 0;
        while (true) {
            int i3 = 3;
            if (it.hasNext()) {
                Uri uri;
                Uri uri2;
                alya alya = (alya) it.next();
                if (this.Y.size() > i) {
                    String str = this.U;
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
                    stringBuilder.append(str);
                    stringBuilder.append("(");
                    stringBuilder.append(i2 + 1);
                    stringBuilder.append(")");
                    alya.k = stringBuilder.toString();
                } else {
                    alya.k = this.U;
                }
                Uri uri3 = alya.a;
                if (az == null || az.c()) {
                    uri = uri3;
                    uri2 = uri;
                } else {
                    uri = zsa.b(az);
                    uri2 = zsa.a(az);
                }
                alyf alyf = this.at;
                String str2 = alya.b;
                int ordinal = this.X.ordinal();
                if (ordinal == 0) {
                    i3 = 2;
                } else if (ordinal != i) {
                    if (ordinal == 2) {
                        i3 = 1;
                    } else {
                        String valueOf = String.valueOf(this.X);
                        StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 16);
                        stringBuilder2.append("Unhandled enum: ");
                        stringBuilder2.append(valueOf);
                        throw new AssertionError(stringBuilder2.toString());
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (String trim : this.W.split(",")) {
                    String trim2 = trim.trim();
                    if (!trim2.isEmpty()) {
                        arrayList.add(trim2);
                    }
                }
                amen amen = (amen) ameo.g.createBuilder();
                amen.a(xvd.b(alya.k));
                String b = xvd.b(this.V);
                amen.copyOnWrite();
                ameo ameo = (ameo) amen.instance;
                if (b != null) {
                    ameo.a |= 2;
                    ameo.c = b;
                    amen.a(i3);
                    amen.copyOnWrite();
                    ameo ameo2 = (ameo) amen.instance;
                    if (!ameo2.e.a()) {
                        ameo2.e = anxl.mutableCopy(ameo2.e);
                    }
                    anvf.addAll(arrayList, ameo2.e);
                    zrb zrb = this.S.c;
                    if (zrb != null) {
                        amep amep = (amep) ameq.f.createBuilder();
                        b = zrb.a;
                        amep.copyOnWrite();
                        ameq ameq = (ameq) amep.instance;
                        if (b != null) {
                            ameq.a |= 4;
                            ameq.d = b;
                            String str3 = zrb.b;
                            amep.copyOnWrite();
                            ameq ameq2 = (ameq) amep.instance;
                            if (str3 != null) {
                                ameq2.a |= 8;
                                ameq2.e = str3;
                                amen.copyOnWrite();
                                ameo2 = (ameo) amen.instance;
                                ameo2.f = (ameq) ((anxl) amep.build());
                                ameo2.a |= 8;
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        throw new NullPointerException();
                    }
                    anjf.a(anjf.a(new alye(alyf, str2, this.ar, (ameo) ((anxl) amen.build()), uri, uri2, this.al, alya.e), alyf.b), new alyn(alyf), alyf.b);
                    strArr[i2] = alya.b;
                    i2++;
                    i = 1;
                } else {
                    throw new NullPointerException();
                }
            }
            acvx acvx = this.g;
            acxf acvs = new acvs(acwc.UPLOAD_VIDEO_EDITING_COMPLETED_BUTTON);
            List list = this.Y;
            String str4 = this.ak;
            zsc zsc = this.d;
            boolean z = !zsc.a.i() || zsc.a();
            atss atss = (atss) ((anxo) alyc.a(list, str4).toBuilder());
            if (!(az == null || list.isEmpty())) {
                atte atte = (atte) attf.m.createBuilder();
                if (az.e()) {
                    atte.a();
                    atte.a(az.j());
                    atte.b(az.l());
                }
                if (az.g()) {
                    atte.b();
                    atte.a(az.t().toString());
                    atte.c(az.u());
                    atte.a(az.v());
                }
                if (az.f()) {
                    atte.b(az.d());
                }
                atte.copyOnWrite();
                attf attf = (attf) atte.instance;
                attf.a |= 1024;
                attf.j = z;
                attc attc = (attc) ((anxo) ((attd) ((atst) atss.instance).d.get(0)).toBuilder());
                attc.a(atte);
                attd attd = (attd) ((anxl) attc.build());
                atss.copyOnWrite();
                atst atst = (atst) atss.instance;
                if (attd != null) {
                    atst.a();
                    atst.d.set(0, attd);
                } else {
                    throw new NullPointerException();
                }
            }
            acvx.a(3, acvs, (atst) ((anxl) atss.build()));
            this.aq.edit().putString(ebn.UPLOAD_PRIVACY, this.X.name()).apply();
            gts gts = this.y;
            if (gts != null) {
                gts.a(strArr);
                return;
            }
            return;
        }
    }

    public final void a(acwc acwc, atst atst) {
        acxf acvs = new acvs(acwc);
        this.g.a(acvs);
        this.g.b(acvs, atst);
    }

    public final void n() {
        this.a.runOnUiThread(new gti(this));
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void a(int i) {
        if (this.au != i) {
            this.au = i;
        }
        n();
    }

    /* JADX WARNING: Missing block: B:71:0x0108, code skipped:
            return;
     */
    public final synchronized void o() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.au;	 Catch:{ all -> 0x0109 }
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x00d4;
    L_0x0007:
        r3 = 2;
        if (r0 == r2) goto L_0x00cb;
    L_0x000a:
        r4 = 6;
        if (r0 == r3) goto L_0x00ac;
    L_0x000d:
        r3 = 3;
        if (r0 == r3) goto L_0x007c;
    L_0x0010:
        r3 = 4;
        r5 = 5;
        if (r0 == r3) goto L_0x0037;
    L_0x0014:
        if (r0 == r5) goto L_0x0018;
    L_0x0016:
        goto L_0x0107;
    L_0x0018:
        r6.a(r4);	 Catch:{ all -> 0x0109 }
        r0 = new gsz;	 Catch:{ all -> 0x0109 }
        r0.<init>(r6);	 Catch:{ all -> 0x0109 }
        r1 = r6.ao;	 Catch:{ all -> 0x0109 }
        r0 = defpackage.anjf.a(r0, r1);	 Catch:{ all -> 0x0109 }
        r1 = r6.an;	 Catch:{ all -> 0x0109 }
        r2 = new gsy;	 Catch:{ all -> 0x0109 }
        r2.<init>(r6);	 Catch:{ all -> 0x0109 }
        r3 = new gtb;	 Catch:{ all -> 0x0109 }
        r3.<init>(r6);	 Catch:{ all -> 0x0109 }
        defpackage.xan.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0109 }
        monitor-exit(r6);
        return;
    L_0x0037:
        r0 = r6.Y;	 Catch:{ all -> 0x0109 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0109 }
        if (r0 != 0) goto L_0x0048;
    L_0x003f:
        r0 = r6.Y;	 Catch:{ all -> 0x0109 }
        r0 = r0.get(r1);	 Catch:{ all -> 0x0109 }
        r0 = (defpackage.alya) r0;	 Catch:{ all -> 0x0109 }
        goto L_0x0049;
    L_0x0048:
        r0 = 0;
    L_0x0049:
        if (r0 == 0) goto L_0x0077;
    L_0x004b:
        r6.a(r4);	 Catch:{ all -> 0x0109 }
        r3 = new amjr;	 Catch:{ all -> 0x0109 }
        r4 = r0.a;	 Catch:{ all -> 0x0109 }
        r5 = r0.d;	 Catch:{ all -> 0x0109 }
        r3.<init>(r4, r5);	 Catch:{ all -> 0x0109 }
        r4 = r6.A;	 Catch:{ all -> 0x0109 }
        r5 = new gtr;	 Catch:{ all -> 0x0109 }
        r5.<init>(r6, r0);	 Catch:{ all -> 0x0109 }
        r0 = r4.b;	 Catch:{ all -> 0x0109 }
        if (r0 == 0) goto L_0x0067;
    L_0x0062:
        r5.a(r0);	 Catch:{ all -> 0x0109 }
        monitor-exit(r6);
        return;
    L_0x0067:
        r0 = new amjt;	 Catch:{ all -> 0x0109 }
        r4 = r4.a;	 Catch:{ all -> 0x0109 }
        r0.<init>(r4, r5);	 Catch:{ all -> 0x0109 }
        r2 = new defpackage.amjr[r2];	 Catch:{ all -> 0x0109 }
        r2[r1] = r3;	 Catch:{ all -> 0x0109 }
        r0.execute(r2);	 Catch:{ all -> 0x0109 }
        monitor-exit(r6);
        return;
    L_0x0077:
        r6.a(r5);	 Catch:{ all -> 0x0109 }
        monitor-exit(r6);
        return;
    L_0x007c:
        r0 = r6.ah;	 Catch:{ all -> 0x0109 }
        if (r0 == 0) goto L_0x0107;
    L_0x0080:
        r0 = r6.Y;	 Catch:{ all -> 0x0109 }
        r0 = r0.size();	 Catch:{ all -> 0x0109 }
        if (r0 <= 0) goto L_0x0107;
    L_0x0088:
        r6.a(r4);	 Catch:{ all -> 0x0109 }
        r6.ag = r2;	 Catch:{ all -> 0x0109 }
        r6.u();	 Catch:{ all -> 0x0109 }
        r0 = new gsu;	 Catch:{ all -> 0x0109 }
        r0.<init>(r6);	 Catch:{ all -> 0x0109 }
        r1 = r6.ao;	 Catch:{ all -> 0x0109 }
        r0 = defpackage.anjf.a(r0, r1);	 Catch:{ all -> 0x0109 }
        r1 = r6.an;	 Catch:{ all -> 0x0109 }
        r2 = new gsx;	 Catch:{ all -> 0x0109 }
        r2.<init>(r6);	 Catch:{ all -> 0x0109 }
        r3 = new gsw;	 Catch:{ all -> 0x0109 }
        r3.<init>(r6);	 Catch:{ all -> 0x0109 }
        defpackage.xan.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0109 }
        monitor-exit(r6);
        return;
    L_0x00ac:
        r6.a(r4);	 Catch:{ all -> 0x0109 }
        r0 = new gst;	 Catch:{ all -> 0x0109 }
        r0.<init>(r6);	 Catch:{ all -> 0x0109 }
        r1 = r6.ao;	 Catch:{ all -> 0x0109 }
        r0 = defpackage.anjf.a(r0, r1);	 Catch:{ all -> 0x0109 }
        r1 = r6.an;	 Catch:{ all -> 0x0109 }
        r2 = new gss;	 Catch:{ all -> 0x0109 }
        r2.<init>(r6);	 Catch:{ all -> 0x0109 }
        r3 = new gsv;	 Catch:{ all -> 0x0109 }
        r3.<init>(r6);	 Catch:{ all -> 0x0109 }
        defpackage.xan.a(r0, r1, r2, r3);	 Catch:{ all -> 0x0109 }
        monitor-exit(r6);
        return;
    L_0x00cb:
        r0 = r6.ae;	 Catch:{ all -> 0x0109 }
        if (r0 == 0) goto L_0x0107;
    L_0x00cf:
        r6.a(r3);	 Catch:{ all -> 0x0109 }
        monitor-exit(r6);
        return;
    L_0x00d4:
        r0 = r6.d;	 Catch:{ all -> 0x0109 }
        r3 = r0.b;	 Catch:{ all -> 0x0109 }
        r4 = "cellular_upload_dialog_do_not_show_again";
        r1 = r3.getBoolean(r4, r1);	 Catch:{ all -> 0x0109 }
        r3 = r0.a();	 Catch:{ all -> 0x0109 }
        if (r3 == 0) goto L_0x0104;
    L_0x00e4:
        r3 = r0.a;	 Catch:{ all -> 0x0109 }
        r3 = r3.i();	 Catch:{ all -> 0x0109 }
        if (r3 == 0) goto L_0x0104;
    L_0x00ec:
        r0 = r0.a;	 Catch:{ all -> 0x0109 }
        r0 = r0.e();	 Catch:{ all -> 0x0109 }
        if (r0 == 0) goto L_0x00f5;
    L_0x00f4:
        goto L_0x0104;
    L_0x00f5:
        if (r1 != 0) goto L_0x0104;
    L_0x00f7:
        r0 = r6.n;	 Catch:{ all -> 0x0109 }
        if (r0 != 0) goto L_0x0104;
    L_0x00fb:
        r0 = r6.a;	 Catch:{ all -> 0x0109 }
        r1 = 1021; // 0x3fd float:1.431E-42 double:5.044E-321;
        r0.showDialog(r1);	 Catch:{ all -> 0x0109 }
        monitor-exit(r6);
        return;
    L_0x0104:
        r6.a(r2);	 Catch:{ all -> 0x0109 }
    L_0x0107:
        monitor-exit(r6);
        return;
    L_0x0109:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gso.o():void");
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void p() {
        a(7);
    }

    /* Access modifiers changed, original: final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0006 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e A:{Catch:{ IOException -> 0x00a9, Error | Exception -> 0x00ae, all -> 0x00a4, Error | Exception -> 0x00ae }} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e A:{Catch:{ IOException -> 0x00a9, Error | Exception -> 0x00ae, all -> 0x00a4, Error | Exception -> 0x00ae }} */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0006 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A:{SYNTHETIC, Splitter:B:9:0x001d, ExcHandler: Error | Exception (unused java.lang.Throwable)} */
    public final /* synthetic */ defpackage.anjv q() {
        /*
        r8 = this;
        r0 = r8.Y;
        r0 = r0.iterator();
    L_0x0006:
        r1 = r0.hasNext();
        r2 = 0;
        if (r1 == 0) goto L_0x00b1;
    L_0x000d:
        r1 = r0.next();
        r1 = (defpackage.alya) r1;
        if (r1 == 0) goto L_0x0006;
    L_0x0015:
        r3 = r1.i;
        if (r3 == 0) goto L_0x001d;
    L_0x0019:
        r3 = r1.j;
        if (r3 != 0) goto L_0x0006;
    L_0x001d:
        r3 = r8.a;	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        r4 = r1.a;	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        r3 = defpackage.ujn.a(r3, r4);	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        r4 = new cil;	 Catch:{ IOException -> 0x00a9 }
        r5 = defpackage.ukc.a;	 Catch:{ IOException -> 0x00a9 }
        r4.<init>(r3, r5);	 Catch:{ IOException -> 0x00a9 }
        r3 = r4.a();	 Catch:{ all -> 0x00a4 }
        if (r3 == 0) goto L_0x0089;
    L_0x0032:
        r5 = defpackage.ckk.class;
        r3 = r3.a(r5);	 Catch:{ all -> 0x00a4 }
        r3 = r3.iterator();	 Catch:{ all -> 0x00a4 }
    L_0x003c:
        r5 = r3.hasNext();	 Catch:{ all -> 0x00a4 }
        if (r5 == 0) goto L_0x0089;
    L_0x0042:
        r5 = r3.next();	 Catch:{ all -> 0x00a4 }
        r5 = (defpackage.ckk) r5;	 Catch:{ all -> 0x00a4 }
        r6 = defpackage.ulg.class;
        r5 = r5.a(r6);	 Catch:{ all -> 0x00a4 }
        r5 = r5.iterator();	 Catch:{ all -> 0x00a4 }
        r6 = r5.hasNext();	 Catch:{ all -> 0x00a4 }
        if (r6 == 0) goto L_0x003c;
    L_0x0058:
        r3 = r5.next();	 Catch:{ all -> 0x00a4 }
        r3 = (defpackage.ulg) r3;	 Catch:{ all -> 0x00a4 }
        r5 = new android.location.Location;	 Catch:{ all -> 0x00a4 }
        r6 = "video";
        r5.<init>(r6);	 Catch:{ all -> 0x00a4 }
        r6 = r3.a;	 Catch:{ all -> 0x00a4 }
        r6 = java.lang.Double.isNaN(r6);	 Catch:{ all -> 0x00a4 }
        if (r6 == 0) goto L_0x006e;
    L_0x006d:
        goto L_0x0085;
    L_0x006e:
        r6 = r3.b;	 Catch:{ all -> 0x00a4 }
        r6 = java.lang.Double.isNaN(r6);	 Catch:{ all -> 0x00a4 }
        if (r6 != 0) goto L_0x0085;
    L_0x0076:
        r6 = r3.a;	 Catch:{ all -> 0x00a4 }
        r5.setLongitude(r6);	 Catch:{ all -> 0x00a4 }
        r2 = r3.b;	 Catch:{ all -> 0x00a4 }
        r5.setLatitude(r2);	 Catch:{ all -> 0x00a4 }
        r4.close();	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        r2 = r5;
        goto L_0x008c;
    L_0x0085:
        r4.close();	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        goto L_0x008c;
    L_0x0089:
        r4.close();	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
    L_0x008c:
        if (r2 == 0) goto L_0x0006;
    L_0x008e:
        r3 = r2.getLatitude();	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        r3 = java.lang.Double.toString(r3);	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        r1.i = r3;	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        r2 = r2.getLongitude();	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        r2 = java.lang.Double.toString(r2);	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        r1.j = r2;	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        goto L_0x0006;
    L_0x00a4:
        r1 = move-exception;
        r4.close();	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        throw r1;	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
    L_0x00a9:
        r1 = move-exception;
        r3.close();	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        throw r1;	 Catch:{ Error | Exception -> 0x00ae, Error | Exception -> 0x00ae }
        goto L_0x0006;
    L_0x00b1:
        r0 = defpackage.anjf.a(r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gso.q():anjv");
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void r() {
        a(4);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void s() {
        a(3);
    }
}
