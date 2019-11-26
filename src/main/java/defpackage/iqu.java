package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.media.AudioRecord;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: iqu */
public final class iqu extends fja implements ejc {
    private static final acwc aO = acwc.VOICE_SEARCH_APPROVE_MICROPHONE_BUTTON;
    private static final acwc aP = acwc.VOICE_SEARCH_DENY_MICROPHONE_BUTTON;
    private static final acwc aQ = acwc.VOICE_SEARCH_PERMA_DENY_MICROPHONE_BUTTON;
    public static final acwc ae = acwc.VOICE_SEARCH_OPEN_APP_SETTINGS_DIALOG;
    public aamj aA;
    public final AtomicBoolean aB = new AtomicBoolean(true);
    public final AtomicBoolean aC = new AtomicBoolean(true);
    public isg aD;
    public anjv aE;
    public EditText aF;
    public View aG;
    public ListView aH;
    public View aI;
    public int aJ;
    public String aK;
    public String aL;
    public String aM;
    public int aN;
    private afsw aR;
    private anjv aS;
    private irm aT;
    private irp aU;
    private View aV;
    private View aW;
    private boolean aX;
    private String aY;
    private String aZ;
    public bcaa af;
    public bcaa ag;
    public bcaa ah;
    public aaas ai;
    public Executor aj;
    public Executor ak;
    public ixe al;
    public ebk am;
    public xci an;
    public acxw ao;
    public zyw ap;
    public SharedPreferences aq;
    public zzl ar;
    public eif as;
    public abnx at;
    public afpu au;
    public jpt av;
    public alcb aw;
    public isn ax;
    public iql ay;
    public iyw az;
    private String ba;
    private boolean bb;
    private boolean bc;
    private boolean bd;
    private boolean be;
    private boolean bf;
    private String bg;
    private AudioRecord bh;

    public static fiw a(String str, String str2, int i, boolean z, String str3) {
        Bundle b = fiw.b();
        b.putBoolean("no_history", true);
        b.putString("query", str);
        b.putString("parent_csn", str2);
        b.putInt("parent_ve_type", i);
        b.putBoolean("is_voice_search", z);
        if (str3 != null) {
            b.putString("conversation_id", str3);
        }
        b.putInt("network_connectivity_requirement", 2);
        return new fiw(iqu.class, b);
    }

    public static fiw b(String str) {
        Bundle b = fiw.b();
        b.putBoolean("no_history", true);
        b.putBoolean("no_search_history", true);
        b.putString("conversation_id", str);
        b.putInt("network_connectivity_requirement", 2);
        return new fiw(iqu.class, b);
    }

    public static boolean a(fiw fiw) {
        return fiw.a == iqu.class;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((iro) xse.a(this.a)).a(this);
        String str = "";
        this.aK = this.j.getString("query", str);
        this.aM = this.j.getString("parent_csn");
        this.aN = this.j.getInt("parent_ve_type");
        this.aZ = this.j.getString("search_params");
        this.ba = this.j.getString("conversation_id");
        this.bd = this.j.getBoolean("is_voice_search");
        this.bb = this.j.getBoolean("no_search_history", false);
        this.aT = new irm(this);
        this.aU = new irp(this);
        this.bc = false;
        this.as.a(this);
        a(this.aM, this.aN, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0183  */
    public final android.view.View a(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
        r10 = this;
        r13 = r10.bb;
        if (r13 == 0) goto L_0x000c;
    L_0x0004:
        r13 = r10.ai;
        r13 = defpackage.ftm.b(r13);
        r10.ai = r13;
    L_0x000c:
        r13 = 2131035285; // 0x7f050495 float:1.7681111E38 double:1.0528713244E-314;
        r0 = 0;
        r12 = r11.inflate(r13, r12, r0);
        r13 = 2131758261; // 0x7f100cb5 float:1.914748E38 double:1.053228522E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.ListView) r13;
        r10.aH = r13;
        r13 = 2131758260; // 0x7f100cb4 float:1.9147479E38 double:1.0532285215E-314;
        r13 = r12.findViewById(r13);
        r10.aI = r13;
        r13 = r10.au;
        r13 = r13.g();
        if (r13 == 0) goto L_0x0038;
    L_0x0030:
        r13 = r10.aK;
        r13 = android.text.TextUtils.isEmpty(r13);
        if (r13 != 0) goto L_0x003f;
    L_0x0038:
        r13 = r10.aI;
        r1 = 8;
        r13.setVisibility(r1);
    L_0x003f:
        r13 = new isg;
        r1 = r10.a;
        r2 = r10.ap;
        r13.<init>(r1, r2);
        r10.aD = r13;
        r13 = r10.aD;
        r1 = new iqx;
        r1.<init>(r10);
        r13.c = r1;
        r13 = r10.aH;
        r1 = r10.aD;
        r13.setAdapter(r1);
        r13 = r10.aH;
        r1 = new iqw;
        r1.<init>(r10);
        r13.setOnItemClickListener(r1);
        r13 = r10.aH;
        r1 = new iqz;
        r1.<init>(r10);
        r13.setOnItemLongClickListener(r1);
        r13 = r10.aH;
        r1 = new irh;
        r1.<init>(r10);
        r13.setOnScrollListener(r1);
        r13 = r10.av;
        r11 = r13.b(r11);
        r10.aV = r11;
        r11 = r10.aV;
        r13 = 2131755493; // 0x7f1001e5 float:1.9141867E38 double:1.0532271544E-314;
        r11 = r11.findViewById(r13);
        r11 = (android.widget.EditText) r11;
        r10.aF = r11;
        r11 = r10.aV;
        r13 = 2131755491; // 0x7f1001e3 float:1.9141863E38 double:1.0532271534E-314;
        r11 = r11.findViewById(r13);
        r10.aG = r11;
        r11 = r10.aG;
        if (r11 == 0) goto L_0x00b5;
    L_0x009c:
        r11 = r10.ar;
        r11 = defpackage.foh.h(r11);
        if (r11 != 0) goto L_0x00ac;
    L_0x00a4:
        r11 = r10.ar;
        r11 = defpackage.foh.l(r11);
        if (r11 == 0) goto L_0x00b5;
    L_0x00ac:
        r11 = r10.aw;
        r13 = r10.aG;
        r1 = "voz-target-id";
        r11.a(r1, r13);
    L_0x00b5:
        r11 = r10.aV;
        r13 = 2131755489; // 0x7f1001e1 float:1.9141859E38 double:1.0532271524E-314;
        r11 = r11.findViewById(r13);
        r10.aW = r11;
        r11 = r10.aF;
        r13 = r10.aK;
        r11.setText(r13);
        r11 = r10.am;
        r11 = r11.a;
        r13 = -1;
        r1 = 1;
        if (r11 == 0) goto L_0x00e1;
    L_0x00cf:
        r11 = r10.aF;
        r2 = r10.M_();
        r3 = 2131953604; // 0x7f1307c4 float:1.9543684E38 double:1.0533250343E-314;
        r2 = r2.getString(r3);
        r11.setHint(r2);
        goto L_0x019e;
    L_0x00e1:
        r11 = r10.ap;
        r2 = 2131953580; // 0x7f1307ac float:1.9543635E38 double:1.0533250224E-314;
        r3 = 2131953600; // 0x7f1307c0 float:1.9543676E38 double:1.0533250323E-314;
        r4 = 2;
        if (r11 == 0) goto L_0x0127;
    L_0x00ec:
        r11 = defpackage.isr.a(r11);
        if (r11 != 0) goto L_0x00f3;
    L_0x00f2:
        goto L_0x0127;
    L_0x00f3:
        r11 = r10.aq;
        r5 = "searchbox_hint_rotation_state";
        r11 = r11.getInt(r5, r0);
        if (r11 == 0) goto L_0x0119;
    L_0x00fd:
        if (r11 == r1) goto L_0x010e;
    L_0x00ff:
        if (r11 == r4) goto L_0x0103;
    L_0x0101:
        goto L_0x019e;
    L_0x0103:
        r11 = r10.aF;
        r2 = r10.a(r2);
        r11.setHint(r2);
        goto L_0x019e;
    L_0x010e:
        r11 = r10.aF;
        r2 = r10.a(r3);
        r11.setHint(r2);
        goto L_0x019e;
    L_0x0119:
        r11 = r10.aF;
        r2 = 2131953606; // 0x7f1307c6 float:1.9543688E38 double:1.0533250353E-314;
        r2 = r10.a(r2);
        r11.setHint(r2);
        goto L_0x019e;
    L_0x0127:
        r11 = r10.aF;
        r5 = r10.ap;
        r6 = r10.M_();
        r5 = r5.a();
        r7 = 2131953601; // 0x7f1307c1 float:1.9543678E38 double:1.053325033E-314;
        if (r5 != 0) goto L_0x0139;
    L_0x0138:
        goto L_0x0197;
    L_0x0139:
        r8 = r5.e;
        if (r8 != 0) goto L_0x013f;
    L_0x013d:
        r8 = defpackage.aulu.bw;
    L_0x013f:
        r8 = r8.b;
        r9 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r8 = r8 & r9;
        if (r8 == 0) goto L_0x0197;
    L_0x0146:
        r5 = r5.e;
        if (r5 != 0) goto L_0x014c;
    L_0x014a:
        r5 = defpackage.aulu.bw;
    L_0x014c:
        r5 = r5.B;
        r8 = r5.hashCode();
        r9 = -1742256820; // 0xffffffff9827454c float:-2.161923E-24 double:NaN;
        if (r8 == r9) goto L_0x0176;
    L_0x0157:
        r9 = -836694132; // 0xffffffffce210f8c float:-6.7553766E8 double:NaN;
        if (r8 == r9) goto L_0x016c;
    L_0x015c:
        r9 = 1434660001; // 0x55832ca1 float:1.80284629E13 double:7.0881622E-315;
        if (r8 == r9) goto L_0x0162;
    L_0x0161:
        goto L_0x0180;
    L_0x0162:
        r8 = "search_360_videos";
        r5 = r5.equals(r8);
        if (r5 == 0) goto L_0x0180;
    L_0x016a:
        r5 = 2;
        goto L_0x0181;
    L_0x016c:
        r8 = "search_youtube";
        r5 = r5.equals(r8);
        if (r5 == 0) goto L_0x0180;
    L_0x0174:
        r5 = 0;
        goto L_0x0181;
    L_0x0176:
        r8 = "search_for_an_artist";
        r5 = r5.equals(r8);
        if (r5 == 0) goto L_0x0180;
    L_0x017e:
        r5 = 1;
        goto L_0x0181;
    L_0x0180:
        r5 = -1;
    L_0x0181:
        if (r5 == 0) goto L_0x0192;
    L_0x0183:
        if (r5 == r1) goto L_0x018d;
    L_0x0185:
        if (r5 == r4) goto L_0x0188;
    L_0x0187:
        goto L_0x0197;
    L_0x0188:
        r2 = r6.getString(r2);
        goto L_0x019b;
    L_0x018d:
        r2 = r6.getString(r3);
        goto L_0x019b;
    L_0x0192:
        r2 = r6.getString(r7);
        goto L_0x019b;
    L_0x0197:
        r2 = r6.getString(r7);
    L_0x019b:
        r11.setHint(r2);
    L_0x019e:
        r11 = r10.aF;
        r2 = "nm";
        r11.setPrivateImeOptions(r2);
        r11 = r10.aF;
        r2 = new irg;
        r2.<init>(r10);
        r11.addTextChangedListener(r2);
        r11 = r10.aF;
        r2 = new iqy;
        r2.<init>(r10);
        r11.setOnEditorActionListener(r2);
        r11 = r10.aF;
        r2 = new irj;
        r2.<init>();
        r11.setCustomSelectionActionModeCallback(r2);
        r11 = r10.a;
        r11 = r11.getPackageManager();
        r2 = r10.an();
        r11 = r2.resolveActivity(r11);
        if (r11 == 0) goto L_0x01d5;
    L_0x01d3:
        r11 = 1;
        goto L_0x01d6;
    L_0x01d5:
        r11 = 0;
    L_0x01d6:
        r10.aX = r11;
        if (r11 == 0) goto L_0x01e4;
    L_0x01da:
        r11 = r10.aG;
        r2 = new irb;
        r2.<init>(r10);
        r11.setOnClickListener(r2);
    L_0x01e4:
        r11 = r10.aW;
        r2 = new ira;
        r2.<init>(r10);
        r11.setOnClickListener(r2);
        r11 = r10.aK;
        r10.c(r11);
        r11 = r10.at;
        r11.e = r0;
        r11.f = r0;
        r2 = r11.p;
        r2 = r2.b();
        r11.a = r2;
        r11.b = r13;
        r11.c = r13;
        r11.t = r1;
        r2 = defpackage.athc.class;
        r2 = java.util.EnumSet.noneOf(r2);
        r11.d = r2;
        r11.i = r13;
        r11.j = r13;
        r11.k = r0;
        r11.l = r0;
        r13 = defpackage.abnx.r;
        r13 = r13 + r1;
        r13 = new int[r13];
        r11.m = r13;
        r11.n = r0;
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqu.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void f() {
        xpr.a(this.aF);
        t().a(3, new acvs(acwc.SEARCH_BAR_MIC_BUTTON), null);
        if (foh.k(this.ar)) {
            this.ao.a(atyw.LATENCY_ACTION_VOICE_ASSISTANT, "");
        }
        if (foh.l(this.ar)) {
            if (!foh.n(this.ar) || ap()) {
                if (ra.a(p(), "android.permission.RECORD_AUDIO") != 0) {
                    if (ap()) {
                        if (foh.m(this.ar)) {
                            t().b(aO, null);
                            t().b(aP, null);
                            t().b(aQ, null);
                        }
                        a(new String[]{r1}, 1);
                        return;
                    }
                    if (foh.m(this.ar)) {
                        azfa a = t().a((Object) this, ae);
                        if (a != null) {
                            t().a(a, null);
                            t().b(a);
                        }
                    }
                    ird ird = new ird(this);
                    akzy d = akzy.d(R.string.enable_microphone_permissions);
                    d.Z = ird;
                    d.a(this.v, "openSettingsDialog");
                    return;
                }
            }
            ao();
            return;
        }
        ao();
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (this.bd) {
            f();
        }
    }

    public final void B() {
        super.B();
        aq();
        aayi aayi = (aayi) this.af.get();
        aayj a = aayi.a();
        a.g();
        xan.a(aayi.a(a), this.ak, irc.a, new irf(this));
        ak();
        this.bc = false;
        String str = "sr_ui";
        String str2 = "";
        if (foh.k(this.ar) && this.ao.b(atyw.LATENCY_ACTION_VOICE_ASSISTANT, str2)) {
            this.ao.a(str, atyw.LATENCY_ACTION_VOICE_ASSISTANT, str2);
            return;
        }
        this.ao.a(atyw.LATENCY_ACTION_SEARCH_UI, str2);
        this.ao.a(str, atyw.LATENCY_ACTION_SEARCH_UI, str2);
    }

    public final void ad_() {
        super.ad_();
        this.aw.a("voz-target-id");
        xpr.a(this.aF);
        if (!this.bc) {
            String str = "";
            if (!foh.k(this.ar) || !this.ao.b(atyw.LATENCY_ACTION_VOICE_ASSISTANT, str)) {
                this.ao.a("sf_i", atyw.LATENCY_ACTION_SEARCH_UI, str);
            }
        }
    }

    public final void X_() {
        super.X_();
        this.as.b(this);
    }

    public final ezz W() {
        if (this.c == null) {
            faf i = this.ab.i();
            i.b = this.aV;
            i.a(amwp.a);
            this.c = i.a();
        }
        return this.c;
    }

    public final void a(ejd ejd, ejd ejd2) {
        boolean z = true;
        if (!(ejd2.a() || ejd2.c())) {
            z = false;
        }
        this.bf = z;
        if (z) {
            xpr.a(this.aF);
        }
    }

    public final void a(int i, String[] strArr, int[] iArr) {
        boolean z = true;
        if (i == 1) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                z = false;
            }
            this.aq.edit().putBoolean("pref_voice_search_permitted", z).apply();
            if (z) {
                if (foh.m(this.ar)) {
                    t().a(3, new acvs(aO), null);
                }
                ao();
            } else if (foh.m(this.ar) && strArr.length > 0 && !a_(strArr[0])) {
                t().a(3, new acvs(aQ), null);
            } else if (foh.m(this.ar)) {
                t().a(3, new acvs(aP), null);
            }
        }
    }

    public final void c(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        int i = 0;
        this.aW.setVisibility(!isEmpty ? 0 : 8);
        if (this.aX) {
            View view = this.aG;
            if (!isEmpty) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void d(String str) {
        a(str, -1);
    }

    public final void a(String str, int i) {
        String str2 = "sr_pa";
        String str3 = "";
        if (foh.k(this.ar) && this.ao.b(atyw.LATENCY_ACTION_VOICE_ASSISTANT, str3)) {
            this.ao.a(str2, atyw.LATENCY_ACTION_VOICE_ASSISTANT, str3);
        } else {
            this.ao.a(str2, atyw.LATENCY_ACTION_SEARCH_UI, str3);
        }
        byte[] toByteArray = d(i).toByteArray();
        axcx axcx = (axcx) axcv.g.createBuilder();
        axcx.copyOnWrite();
        axcv axcv = (axcv) axcx.instance;
        if (str != null) {
            axcv axcv2;
            axcv.a |= 1;
            axcv.b = str;
            axcv axcv3 = (axcv) ((anxl) axcx.build());
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(SearchEndpointOuterClass.searchEndpoint, axcv3);
            apxx apxx2 = (apxx) ((anxo) ((apxu) ((anxl) apxx.build())).toBuilder());
            avjh avjh = (avjh) avjf.h.createBuilder();
            str2 = this.aM;
            if (str2 == null) {
                str2 = str3;
            }
            avjh.a(str2);
            avjh.a(this.aN);
            apxx2.a(avjd.b, (avjf) ((anxl) avjh.build()));
            axcx = (axcx) ((anxo) ((axcv) apxx2.b(SearchEndpointOuterClass.searchEndpoint)).toBuilder());
            if (!TextUtils.isEmpty(this.aZ)) {
                str2 = this.aZ;
                axcx.copyOnWrite();
                axcv2 = (axcv) axcx.instance;
                if (str2 != null) {
                    axcv2.a |= 2;
                    axcv2.c = str2;
                } else {
                    throw new NullPointerException();
                }
            }
            if (!TextUtils.isEmpty(this.ba)) {
                str2 = this.ba;
                axcx.copyOnWrite();
                axcv2 = (axcv) axcx.instance;
                if (str2 != null) {
                    axcv2.a |= 8;
                    axcv2.e = str2;
                } else {
                    throw new NullPointerException();
                }
            }
            apxx2.a(SearchEndpointOuterClass.searchEndpoint, (axcv) ((anxl) axcx.build()));
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", toByteArray);
            this.ai.a((apxu) ((anxl) apxx2.build()), hashMap);
            this.bc = true;
            return;
        }
        throw new NullPointerException();
    }

    private final atgy d(int i) {
        int i2;
        int i3 = i;
        isg isg = this.aD;
        ArrayList arrayList = new ArrayList(isg.getCount());
        int i4 = 0;
        for (i2 = 0; i2 < isg.getCount(); i2++) {
            Object item = isg.getItem(i2);
            if (item instanceof abnv) {
                arrayList.add((abnv) item);
            }
        }
        int min = Math.min(arrayList.size() - 1, Math.max(this.aJ, this.aH.getLastVisiblePosition()));
        isg isg2 = this.aD;
        if (i3 >= 0 && i3 < isg2.b.size()) {
            i3 = isg2.b.get(i3);
        } else {
            i3 = -1;
        }
        abnx abnx = this.at;
        abnx.i = min;
        abnx.j = i3;
        abol a = this.al.a();
        this.at.n = a.a.d();
        this.at.o = a.i.get();
        abnx abnx2 = this.at;
        String a2 = a.a.a();
        abmv abmv = new abmv();
        abmv.a(-1);
        abmv.b(-1);
        abmv.c(0);
        abmv.d(-1);
        abmv.e(-1);
        abmv.f(0);
        abmv.g(0);
        abmv.j(1);
        abmv.a(amwp.a);
        abmv.a(false);
        abmv.h(0);
        abmv.i(0);
        abmv.o = null;
        if (a2 != null) {
            abmv.a = a2;
            abmv.b = abnx2.g;
            abmv.a(abnx2.a(abnx2.j));
            abmv.b(abnx2.a(abnx2.i));
            i3 = abnx2.f ? abnx2.e <= 1 ? 1 : 3 : abnx2.e <= 0 ? 0 : 2;
            abmv.c(i3);
            abmv.e = abnx2.h;
            abmv.d(abnx2.b);
            abmv.e(abnx2.c);
            abmv.f((int) (abnx2.p.b() - abnx2.a));
            abmv.j(abnx2.t);
            abmv.a(abnx2.d);
            abmv.h(abnx2.l);
            abmv.i(abnx2.k);
            StringBuilder stringBuilder = new StringBuilder();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr = abnx2.m;
                if (i5 >= iArr.length) {
                    break;
                }
                long j = (long) iArr[i5];
                if (j == 0) {
                    i6++;
                } else {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append("j");
                    }
                    if (i6 == 1) {
                        stringBuilder.append("0j");
                    } else if (i6 > 1) {
                        stringBuilder.append(i5);
                        stringBuilder.append("-");
                    }
                    stringBuilder.append(j);
                    i6 = 0;
                }
                i5++;
            }
            abmv.o = stringBuilder.toString();
            abmv.a(abnx2.n);
            abmv.g(abnx2.o);
            a2 = "";
            if (abmv.a == null) {
                a2 = a2.concat(" clientName");
            }
            if (abmv.c == null) {
                a2 = String.valueOf(a2).concat(" assistedQueryIndex");
            }
            if (abmv.d == null) {
                a2 = String.valueOf(a2).concat(" lastVisibleSuggestionIndex");
            }
            if (abmv.f == null) {
                a2 = String.valueOf(a2).concat(" experimentTriggered");
            }
            if (abmv.g == null) {
                a2 = String.valueOf(a2).concat(" firstEditTimeMillis");
            }
            if (abmv.h == null) {
                a2 = String.valueOf(a2).concat(" lastEditTimeMillis");
            }
            if (abmv.i == null) {
                a2 = String.valueOf(a2).concat(" sessionDurationMillis");
            }
            if (abmv.j == null) {
                a2 = String.valueOf(a2).concat(" zeroPrefixSuggestionsEnabled");
            }
            if (abmv.k == null) {
                a2 = String.valueOf(a2).concat(" numZeroPrefixSuggestionsShown");
            }
            if (abmv.p == 0) {
                a2 = String.valueOf(a2).concat(" searchMethod");
            }
            if (abmv.l == null) {
                a2 = String.valueOf(a2).concat(" inputMethods");
            }
            if (abmv.m == null) {
                a2 = String.valueOf(a2).concat(" maxRoundTripTimeMsec");
            }
            if (abmv.n == null) {
                a2 = String.valueOf(a2).concat(" totalRoundTripTimeMsec");
            }
            if (a2.isEmpty()) {
                abms abms = new abms(abmv.a, abmv.b, abmv.c.intValue(), abmv.d.intValue(), abmv.e, abmv.f.intValue(), abmv.g.intValue(), abmv.h.intValue(), abmv.i.intValue(), abmv.j.booleanValue(), abmv.k.intValue(), abmv.p, abmv.l, abmv.m.intValue(), abmv.n.intValue(), abmv.o);
                xvd.a(abms.a());
                atgx atgx = (atgx) atgy.s.createBuilder();
                String a3 = abms.a();
                atgx.copyOnWrite();
                atgy atgy = (atgy) atgx.instance;
                if (a3 != null) {
                    atgy atgy2;
                    atgy.a |= 4;
                    atgy.d = a3;
                    a3 = abms.b();
                    if (a3 != null) {
                        atgx.copyOnWrite();
                        atgy = (atgy) atgx.instance;
                        atgy.a |= 64;
                        atgy.h = a3;
                    }
                    if (!(abms.e() == null || abms.e().isEmpty())) {
                        athg a4;
                        if (abms.c() >= 0) {
                            a4 = abnw.a((abnv) abms.e().get(abms.c()), abms.c());
                            atgx.copyOnWrite();
                            atgy = (atgy) atgx.instance;
                            if (a4 != null) {
                                atgy.i = a4;
                                atgy.a |= 256;
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        if (abms.d() >= 0) {
                            while (i4 <= abms.d()) {
                                a4 = abnw.a((abnv) abms.e().get(i4), i4);
                                atgx.copyOnWrite();
                                atgy = (atgy) atgx.instance;
                                if (a4 != null) {
                                    if (!atgy.j.a()) {
                                        atgy.j = anxl.mutableCopy(atgy.j);
                                    }
                                    atgy.j.add(a4);
                                    i4++;
                                } else {
                                    throw new NullPointerException();
                                }
                            }
                        }
                    }
                    if (abms.f() != 0) {
                        atgz atgz = (atgz) atha.c.createBuilder();
                        i2 = abms.f();
                        atgz.copyOnWrite();
                        atha atha = (atha) atgz.instance;
                        atha.a |= 4;
                        atha.b = i2;
                        atgx.copyOnWrite();
                        atgy2 = (atgy) atgx.instance;
                        atgy2.g = (atha) ((anxl) atgz.build());
                        atgy2.a |= 32;
                    }
                    if (abms.g() >= 0) {
                        i4 = abms.g();
                        atgx.copyOnWrite();
                        atgy2 = (atgy) atgx.instance;
                        atgy2.a |= 16384;
                        atgy2.n = i4;
                    }
                    if (abms.h() >= 0) {
                        i4 = abms.h();
                        atgx.copyOnWrite();
                        atgy2 = (atgy) atgx.instance;
                        atgy2.a |= 32768;
                        atgy2.o = i4;
                    }
                    i4 = abms.i();
                    atgx.copyOnWrite();
                    atgy2 = (atgy) atgx.instance;
                    atgy2.a |= 8192;
                    atgy2.m = i4;
                    boolean j2 = abms.j();
                    atgx.copyOnWrite();
                    atgy2 = (atgy) atgx.instance;
                    atgy2.a |= 512;
                    atgy2.k = j2;
                    i4 = abms.k();
                    atgx.copyOnWrite();
                    atgy2 = (atgy) atgx.instance;
                    atgy2.a |= 1024;
                    atgy2.l = i4;
                    atgx.copyOnWrite();
                    atgy atgy3 = (atgy) atgx.instance;
                    atgy3.a |= 1;
                    atgy3.b = 4;
                    atgx.copyOnWrite();
                    atgy3 = (atgy) atgx.instance;
                    atgy3.a |= 2;
                    atgy3.c = 1;
                    i4 = abms.p();
                    atgx.copyOnWrite();
                    atgy2 = (atgy) atgx.instance;
                    if (i4 != 0) {
                        atgy2.a |= 16;
                        atgy2.e = i4 - 1;
                        Set<athc> l = abms.l();
                        atgx.copyOnWrite();
                        atgy3 = (atgy) atgx.instance;
                        if (!atgy3.f.a()) {
                            atgy3.f = anxl.mutableCopy(atgy3.f);
                        }
                        for (athc athc : l) {
                            atgy3.f.d(athc.d);
                        }
                        int m = abms.m();
                        atgx.copyOnWrite();
                        atgy3 = (atgy) atgx.instance;
                        atgy3.a |= 262144;
                        atgy3.p = m;
                        m = abms.n();
                        atgx.copyOnWrite();
                        atgy3 = (atgy) atgx.instance;
                        atgy3.a |= 524288;
                        atgy3.q = m;
                        a2 = abms.o();
                        if (a2 != null) {
                            atgx.copyOnWrite();
                            atgy atgy4 = (atgy) atgx.instance;
                            atgy4.a |= 1048576;
                            atgy4.r = a2;
                        }
                        return (atgy) ((anxl) atgx.build());
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            String str = "Missing required properties:";
            throw new IllegalStateException(a2.length() == 0 ? new String(str) : str.concat(a2));
        }
        throw new NullPointerException("Null clientName");
    }

    private final boolean am() {
        boolean z = false;
        if (!(!foh.l(this.ar) || this.be || this.am.a || xrn.b(M_()))) {
            if (this.bh != null) {
                z = true;
            } else if (foh.n(this.ar)) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    private final Intent an() {
        Intent intent;
        if (foh.l(this.ar)) {
            this.bh = this.az.a();
        }
        if (am()) {
            intent = new Intent(p(), VoiceSearchActivity.class);
            intent.addFlags(131072);
        } else {
            intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        }
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        intent.addFlags(262144);
        return intent;
    }

    private final void ao() {
        if (foh.k(this.ar)) {
            String str = "";
            if (this.ao.b(atyw.LATENCY_ACTION_VOICE_ASSISTANT, str)) {
                this.ao.a("voz_ms", atyw.LATENCY_ACTION_VOICE_ASSISTANT, str);
            }
        }
        Intent an = an();
        if (am()) {
            this.at.a();
            if (d(-1) != null) {
                an.putExtra("SearchboxStats", d(-1).toByteArray());
                an.putExtra("ParentCSN", this.aM);
                an.putExtra("ParentVeType", this.aN);
            }
            AudioRecord audioRecord = this.bh;
            if (audioRecord != null) {
                an.putExtra("MicSampleRate", audioRecord.getSampleRate());
                an.putExtra("MicAudioFormatEncoding", this.bh.getAudioFormat());
                an.putExtra("MicChannelConfig", this.bh.getChannelConfiguration());
            }
        }
        startActivityForResult(an, 1000);
        if (foh.i(this.ar) && !foh.l(this.ar)) {
            isn isn = this.ax;
            if (foh.i(isn.d)) {
                isn.e.w();
                if (!isn.b()) {
                    isn.c.removeCallbacks(isn.b);
                    isn.c.post(isn.b);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d6 A:{Catch:{ anyg -> 0x0248 }} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d6 A:{Catch:{ anyg -> 0x0248 }} */
    /* JADX WARNING: Missing block: B:76:0x0249, code skipped:
            if (r1 == 1000) goto L_0x024b;
     */
    public final void a(int r21, int r22, android.content.Intent r23) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r3 = r23;
        r4 = "AssistantCsn";
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = 1;
        r7 = "";
        if (r1 != r5) goto L_0x0249;
    L_0x0011:
        r1 = -1;
        if (r2 != r1) goto L_0x024b;
    L_0x0014:
        r2 = "android.speech.extra.RESULTS";
        r2 = r3.getStringArrayListExtra(r2);
        r5 = "RecognizedText";
        r5 = r3.getByteArrayExtra(r5);
        r8 = 0;
        r9 = "RegularVoiceSearch";
        r9 = r3.getBooleanExtra(r9, r8);
        r0.be = r9;
        r3 = r3.getStringExtra(r4);
        if (r2 == 0) goto L_0x0146;
    L_0x002f:
        r4 = r2.isEmpty();
        if (r4 != 0) goto L_0x0146;
    L_0x0035:
        r3 = r0.at;
        r3.a();
        r3 = r0.ar;
        r3 = defpackage.foh.k(r3);
        if (r3 == 0) goto L_0x0055;
    L_0x0042:
        r3 = r0.ao;
        r4 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r3 = r3.b(r4, r7);
        if (r3 == 0) goto L_0x0055;
    L_0x004c:
        r3 = r0.ao;
        r4 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r5 = "voz_mf";
        r3.a(r5, r4, r7);
    L_0x0055:
        r3 = r0.ar;
        r3 = defpackage.foh.h(r3);
        if (r3 == 0) goto L_0x013c;
    L_0x005d:
        r2 = r2.get(r8);
        r12 = r2;
        r12 = (java.lang.String) r12;
        r2 = r0.ag;
        r2 = r2.get();
        r2 = (defpackage.abkn) r2;
        r3 = r0.ah;
        r3 = r3.get();
        r3 = (defpackage.ixg) r3;
        r13 = r3.f();
        r1 = r0.d(r1);
        r3 = new abkp;
        r10 = r2.c;
        r4 = r2.d;
        r11 = r4.c();
        r9 = r3;
        r14 = r1;
        r9.<init>(r10, r11, r12, r13, r14);
        r4 = new xfp;
        r15 = r2.b;
        r16 = new aaah;
        r16.<init>();
        r17 = new aaae;
        r17.<init>();
        r18 = 0;
        r19 = 0;
        r14 = r4;
        r14.<init>(r15, r16, r17, r18, r19);
        r3.n = r4;
        r4 = new iri;
        r4.<init>(r0, r1);
        r0.aR = r4;
        r1 = r0.ar;
        r1 = defpackage.foh.i(r1);
        if (r1 == 0) goto L_0x0119;
    L_0x00b2:
        r1 = r0.ar;
        r1 = defpackage.foh.l(r1);
        if (r1 != 0) goto L_0x0119;
    L_0x00ba:
        r1 = r0.ax;
        r4 = r1.b();
        if (r4 == 0) goto L_0x0119;
    L_0x00c2:
        r1 = r1.a;
        r1 = r1.getFragmentManager();
        r4 = "VOZ_DIALOG";
        r1 = r1.findFragmentByTag(r4);
        r1 = (defpackage.isp) r1;
        r4 = new android.util.TypedValue;
        r4.<init>();
        r5 = r1.a;
        r5 = r5.getTheme();
        r9 = 2130772257; // 0x7f010121 float:1.7147627E38 double:1.0527413713E-314;
        r5.resolveAttribute(r9, r4, r6);
        r4 = r4.data;
        r5 = new tst;
        r9 = r1.getActivity();
        r9 = r9.getResources();
        r10 = 2131624217; // 0x7f0e0119 float:1.8875607E38 double:1.0531622955E-314;
        r9 = r9.getDimensionPixelSize(r10);
        r10 = r1.getActivity();
        r10 = r10.getResources();
        r11 = 2131624214; // 0x7f0e0116 float:1.8875601E38 double:1.053162294E-314;
        r10 = r10.getDimensionPixelSize(r11);
        r6 = new int[r6];
        r6[r8] = r4;
        r5.<init>(r9, r10, r6);
        r4 = r1.b;
        r4.setIndeterminateDrawable(r5);
        r4 = r1.b;
        r4.setVisibility(r8);
        r1 = r1.c;
        r1.setVisibility(r8);
    L_0x0119:
        r1 = r0.ar;
        r1 = defpackage.foh.k(r1);
        if (r1 == 0) goto L_0x0134;
    L_0x0121:
        r1 = r0.ao;
        r4 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r1 = r1.b(r4, r7);
        if (r1 == 0) goto L_0x0134;
    L_0x012b:
        r1 = r0.ao;
        r4 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r5 = "voz_rqs";
        r1.a(r5, r4, r7);
    L_0x0134:
        r1 = r0.aR;
        r2 = r2.a;
        r2.a(r3, r1);
        goto L_0x016c;
    L_0x013c:
        r1 = r2.get(r8);
        r1 = (java.lang.String) r1;
        r0.d(r1);
        return;
    L_0x0146:
        if (r5 != 0) goto L_0x016d;
    L_0x0148:
        r1 = r0.be;
        if (r1 == 0) goto L_0x0150;
    L_0x014c:
        r20.ao();
        return;
    L_0x0150:
        r1 = r0.ao;
        r2 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r1.c(r2, r7);
        r1 = r0.ar;
        r1 = defpackage.foh.i(r1);
        if (r1 == 0) goto L_0x016c;
    L_0x015f:
        r1 = r0.ar;
        r1 = defpackage.foh.l(r1);
        if (r1 != 0) goto L_0x016c;
    L_0x0167:
        r1 = r0.ax;
        r1.a();
    L_0x016c:
        return;
    L_0x016d:
        r2 = defpackage.azyd.c;	 Catch:{ anyg -> 0x0248 }
        r2 = defpackage.anxl.parseFrom(r2, r5);	 Catch:{ anyg -> 0x0248 }
        r2 = (defpackage.azyd) r2;	 Catch:{ anyg -> 0x0248 }
        r4 = r0.aA;	 Catch:{ anyg -> 0x0248 }
        r5 = r2.a;	 Catch:{ anyg -> 0x0248 }
        if (r5 != r6) goto L_0x0180;
    L_0x017b:
        r2 = r2.b;	 Catch:{ anyg -> 0x0248 }
        r2 = (defpackage.anvu) r2;	 Catch:{ anyg -> 0x0248 }
        goto L_0x0182;
    L_0x0180:
        r2 = defpackage.anvu.a;	 Catch:{ anyg -> 0x0248 }
    L_0x0182:
        r2 = r2.d();	 Catch:{ anyg -> 0x0248 }
        r5 = defpackage.akcj.class;
        r2 = r4.a(r2, r5);	 Catch:{ anyg -> 0x0248 }
        r2 = (defpackage.akcj) r2;	 Catch:{ anyg -> 0x0248 }
        if (r2 == 0) goto L_0x0248;
    L_0x0190:
        r4 = r2.d;	 Catch:{ anyg -> 0x0248 }
        if (r4 != 0) goto L_0x021b;
    L_0x0194:
        r2 = r2.b;	 Catch:{ anyg -> 0x0248 }
        r4 = new java.util.HashMap;	 Catch:{ anyg -> 0x0248 }
        r4.<init>();	 Catch:{ anyg -> 0x0248 }
        r5 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        if (r2 == 0) goto L_0x01c5;
    L_0x019f:
        r6 = com.google.protos.youtube.api.innertube.SearchEndpointOuterClass.searchEndpoint;	 Catch:{ anyg -> 0x0248 }
        r6 = defpackage.anxl.checkIsLite(r6);	 Catch:{ anyg -> 0x0248 }
        r2.a(r6);	 Catch:{ anyg -> 0x0248 }
        r8 = r2.h;	 Catch:{ anyg -> 0x0248 }
        r6 = r6.d;	 Catch:{ anyg -> 0x0248 }
        r6 = r8.a(r6);	 Catch:{ anyg -> 0x0248 }
        if (r6 != 0) goto L_0x01b3;
    L_0x01b2:
        goto L_0x01c5;
    L_0x01b3:
        r6 = defpackage.iql.b(r2);	 Catch:{ anyg -> 0x0248 }
        if (r6 != 0) goto L_0x01cc;
    L_0x01b9:
        r1 = r0.d(r1);	 Catch:{ anyg -> 0x0248 }
        r1 = r1.toByteArray();	 Catch:{ anyg -> 0x0248 }
        r4.put(r5, r1);	 Catch:{ anyg -> 0x0248 }
        goto L_0x01d4;
    L_0x01c5:
        r1 = r0.ao;	 Catch:{ anyg -> 0x0248 }
        r6 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;	 Catch:{ anyg -> 0x0248 }
        r1.c(r6, r7);	 Catch:{ anyg -> 0x0248 }
    L_0x01cc:
        r1 = new android.os.Bundle;	 Catch:{ anyg -> 0x0248 }
        r1.<init>();	 Catch:{ anyg -> 0x0248 }
        r4.put(r5, r1);	 Catch:{ anyg -> 0x0248 }
    L_0x01d4:
        if (r2 == 0) goto L_0x0215;
    L_0x01d6:
        r1 = defpackage.avjd.b;	 Catch:{ anyg -> 0x0248 }
        r1 = defpackage.anxl.checkIsLite(r1);	 Catch:{ anyg -> 0x0248 }
        r2.a(r1);	 Catch:{ anyg -> 0x0248 }
        r5 = r2.h;	 Catch:{ anyg -> 0x0248 }
        r1 = r1.d;	 Catch:{ anyg -> 0x0248 }
        r1 = r5.a(r1);	 Catch:{ anyg -> 0x0248 }
        if (r1 == 0) goto L_0x01ea;
    L_0x01e9:
        goto L_0x0215;
    L_0x01ea:
        if (r3 == 0) goto L_0x0215;
    L_0x01ec:
        r1 = defpackage.avjf.h;	 Catch:{ anyg -> 0x0248 }
        r1 = r1.createBuilder();	 Catch:{ anyg -> 0x0248 }
        r1 = (defpackage.avjh) r1;	 Catch:{ anyg -> 0x0248 }
        r1.a(r3);	 Catch:{ anyg -> 0x0248 }
        r1 = r1.build();	 Catch:{ anyg -> 0x0248 }
        r1 = (defpackage.anxl) r1;	 Catch:{ anyg -> 0x0248 }
        r1 = (defpackage.avjf) r1;	 Catch:{ anyg -> 0x0248 }
        r2 = r2.toBuilder();	 Catch:{ anyg -> 0x0248 }
        r2 = (defpackage.anxo) r2;	 Catch:{ anyg -> 0x0248 }
        r2 = (defpackage.apxx) r2;	 Catch:{ anyg -> 0x0248 }
        r3 = defpackage.avjd.b;	 Catch:{ anyg -> 0x0248 }
        r2.a(r3, r1);	 Catch:{ anyg -> 0x0248 }
        r1 = r2.build();	 Catch:{ anyg -> 0x0248 }
        r1 = (defpackage.anxl) r1;	 Catch:{ anyg -> 0x0248 }
        r2 = r1;
        r2 = (defpackage.apxu) r2;	 Catch:{ anyg -> 0x0248 }
    L_0x0215:
        r1 = r0.ai;	 Catch:{ anyg -> 0x0248 }
        r1.a(r2, r4);	 Catch:{ anyg -> 0x0248 }
        return;
    L_0x021b:
        r1 = defpackage.avls.g;	 Catch:{ anyg -> 0x0248 }
        r1 = r1.createBuilder();	 Catch:{ anyg -> 0x0248 }
        r1 = (defpackage.avlv) r1;	 Catch:{ anyg -> 0x0248 }
        r2 = r2.d;	 Catch:{ anyg -> 0x0248 }
        r2 = r2.b;	 Catch:{ anyg -> 0x0248 }
        if (r2 != 0) goto L_0x022b;
    L_0x0229:
        r2 = defpackage.arml.f;	 Catch:{ anyg -> 0x0248 }
    L_0x022b:
        r1.a(r2);	 Catch:{ anyg -> 0x0248 }
        r1 = r1.build();	 Catch:{ anyg -> 0x0248 }
        r1 = (defpackage.anxl) r1;	 Catch:{ anyg -> 0x0248 }
        r1 = (defpackage.avls) r1;	 Catch:{ anyg -> 0x0248 }
        r2 = r0.ao;	 Catch:{ anyg -> 0x0248 }
        r3 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;	 Catch:{ anyg -> 0x0248 }
        r2.c(r3, r7);	 Catch:{ anyg -> 0x0248 }
        r2 = r0.an;	 Catch:{ anyg -> 0x0248 }
        r3 = new zye;	 Catch:{ anyg -> 0x0248 }
        r4 = 0;
        r3.<init>(r4, r1);	 Catch:{ anyg -> 0x0248 }
        r2.d(r3);	 Catch:{ anyg -> 0x0248 }
    L_0x0248:
        return;
    L_0x0249:
        if (r1 != r5) goto L_0x0262;
    L_0x024b:
        if (r2 != r6) goto L_0x0262;
    L_0x024d:
        r1 = r0.ar;
        r1 = defpackage.foh.l(r1);
        if (r1 == 0) goto L_0x0262;
    L_0x0255:
        r1 = r3.getStringExtra(r4);
        r2 = defpackage.acwc.MOBILE_BACK_BUTTON;
        r2 = r2.dU;
        r3 = r0.aY;
        r0.a(r1, r2, r3);
    L_0x0262:
        r1 = r0.ao;
        r2 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r1.c(r2, r7);
        r1 = r0.ar;
        r1 = defpackage.foh.i(r1);
        if (r1 == 0) goto L_0x027e;
    L_0x0271:
        r1 = r0.ar;
        r1 = defpackage.foh.l(r1);
        if (r1 != 0) goto L_0x027e;
    L_0x0279:
        r1 = r0.ax;
        r1.a();
    L_0x027e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqu.a(int, int, android.content.Intent):void");
    }

    private final void a(String str, int i, String str2) {
        avjh avjh = (avjh) avjf.h.createBuilder();
        avjh.a(i);
        if (str != null) {
            avjh.a(str);
        }
        if (!str2.isEmpty()) {
            avjh.b(str2);
        }
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
        t().a(acwl.al, (apxu) ((anxl) apxx.build()), null);
        t().b(acwc.MOBILE_BACK_BUTTON, null);
        t().b(acwc.SEARCH_BAR_MIC_BUTTON, null);
        this.aM = t().d();
        this.aN = acwl.al.aH;
        this.aY = t().d();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int selectionStart = this.aF.getSelectionStart();
        int selectionEnd = this.aF.getSelectionEnd();
        aq();
        EditText editText = this.aF;
        editText.setText(editText.getText());
        this.aF.setSelection(selectionStart, selectionEnd);
    }

    private final boolean ap() {
        String str = "pref_voice_search_permitted";
        if (!this.aq.contains(str) || this.aq.getBoolean(str, false) || mp.a(p(), "android.permission.RECORD_AUDIO")) {
            return true;
        }
        return false;
    }

    private final void aq() {
        if (!this.bf) {
            this.aF.requestFocus();
            if (this.bd) {
                this.bd = false;
            } else {
                xpr.b(this.aF);
            }
        }
    }

    public final void ak() {
        anjv anjv = this.aE;
        if (anjv != null) {
            anjv.cancel(true);
        }
        if (!TextUtils.isEmpty(this.bg)) {
            anjv = this.aS;
            if (anjv != null) {
                anjv.cancel(true);
            }
        }
        this.bg = this.aK;
        ixg ixg = (ixg) this.ah.get();
        String f = ixg.f();
        String g = ixg.g();
        long h = ixg.h();
        this.aL = this.aK.toLowerCase(this.a.getResources().getConfiguration().locale);
        int selectionStart = this.aF.getSelectionStart();
        abol a = this.al.a();
        if (!this.al.b() && this.aL.isEmpty()) {
            this.aE = a.e.a(new abon(a));
            anjf.a(this.aE, this.aT, this.ak);
        }
        String str = this.aL;
        int i = this.aB.get() ^ 1;
        int i2 = this.aC.get() ^ 1;
        long m = (long) a.a.m();
        long j = 0;
        if (m > 0) {
            j = Math.max(0, m - (a.f.c() - a.j.get()));
        }
        this.aS = a.e.a(new abok(a, str, i, selectionStart, f, i2, g, h), j, TimeUnit.MILLISECONDS);
        anjf.a(this.aS, this.aU, this.ak);
    }

    public final void a(aboc aboc) {
        int i;
        xak.a();
        this.aJ = -1;
        abnx abnx = this.at;
        abnx.h = new ArrayList(aboc.c);
        abof abof = aboc.b;
        if (abof != null) {
            Boolean bool = abof.a;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                abnx.f = booleanValue;
                if (booleanValue) {
                    abnx.e++;
                }
            }
            if (!aboc.a.isEmpty()) {
                i = abof.b;
                abnx.k += i;
                if (i > abnx.l) {
                    abnx.l = i;
                }
                if (abnx.m != null) {
                    int[] iArr;
                    if (i <= abnx.s) {
                        i = abnx.q[i / 100];
                        iArr = abnx.m;
                        iArr[i] = iArr[i] + 1;
                    } else {
                        iArr = abnx.m;
                        i = abnx.r;
                        iArr[i] = iArr[i] + 1;
                    }
                }
            }
        }
        isg isg = this.aD;
        isg.a.clear();
        isg.b.clear();
        isg.notifyDataSetChanged();
        isg = this.aD;
        Collection<abnv> collection = aboc.c;
        isg.b.clear();
        i = 0;
        int i2 = 0;
        for (abnv abnv : collection) {
            int i3 = abnv.f;
            if (i3 != i) {
                if (i3 != 0) {
                    isg.b.put(isg.a.size(), i2);
                    isg.a.add(new ixl(abnv.g));
                }
                i = i3;
            }
            i3 = i2 + 1;
            isg.b.put(isg.a.size(), i2);
            isg.a.add(abnv);
            i2 = i3;
        }
        isg.notifyDataSetChanged();
    }

    public final void al() {
        this.aH.smoothScrollToPosition(0);
    }
}
