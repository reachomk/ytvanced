package com.google.android.apps.youtube.app.search.voice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioRecord;
import android.media.SoundPool;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aamj;
import defpackage.abmu;
import defpackage.acvx;
import defpackage.acwc;
import defpackage.acwl;
import defpackage.acxw;
import defpackage.aej;
import defpackage.ahw;
import defpackage.alad;
import defpackage.alao;
import defpackage.alaq;
import defpackage.amqu;
import defpackage.amqw;
import defpackage.anxl;
import defpackage.apxu;
import defpackage.apxx;
import defpackage.avjd;
import defpackage.avjf;
import defpackage.avjh;
import defpackage.bauk;
import defpackage.fmv;
import defpackage.foh;
import defpackage.ixo;
import defpackage.ixp;
import defpackage.ixr;
import defpackage.iye;
import defpackage.iyf;
import defpackage.iyp;
import defpackage.iyq;
import defpackage.iyr;
import defpackage.iyt;
import defpackage.iyu;
import defpackage.iyw;
import defpackage.iyx;
import defpackage.nf;
import defpackage.nt;
import defpackage.or;
import defpackage.ra;
import defpackage.xev;
import defpackage.xfc;
import defpackage.xse;
import defpackage.xtl;
import defpackage.xvd;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.List;

public class VoiceSearchActivity extends aej implements alaq, xfc {
    private static final alad[] G = new alad[]{new alad(2, acwc.VOICE_SEARCH_APPROVE_MICROPHONE_BUTTON, acwc.VOICE_SEARCH_DENY_MICROPHONE_BUTTON)};
    public TextView A;
    public TextView B;
    public TextView C;
    public boolean D;
    public boolean E;
    public String[] F;
    private final List H = new ArrayList();
    private boolean I;
    private ImageView J;
    private boolean K;
    private SoundPool L;
    private int M;
    private int N;
    private String O;
    private iyf P;
    private boolean Q;
    private boolean R;
    private RelativeLayout S;
    private int T;
    private String U;
    private View V;
    private iyu W;
    private AudioRecord X;
    private int Y;
    private int Z;
    private int aa;
    public Handler g;
    public MicrophoneView h;
    public TextView i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public ixp n;
    public nt o;
    public alao p;
    public abmu q;
    public SharedPreferences r;
    public acxw s;
    public zzl t;
    public acvx u;
    public iye v;
    public iyw w;
    public aamj x;
    public TextView y;
    public TextView z;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.L = new SoundPool(5, 3, 0);
        this.M = this.L.load(this, R.raw.open, 0);
        this.j = this.L.load(this, R.raw.success, 0);
        this.k = this.L.load(this, R.raw.no_input, 0);
        this.l = this.L.load(this, R.raw.failure, 0);
        u().a(this);
        int a = fmv.a(this.r);
        this.N = a;
        if (a != 2) {
            setTheme(R.style.f528Theme.YouTube.Home);
        } else {
            setTheme(R.style.f521Theme.YouTube.Dark.Home);
        }
        setContentView((int) R.layout.voice_search_activity);
        this.o = f();
        if (foh.n(this.t) && bundle != null) {
            this.p = (alao) this.o.a(bundle, "permission_request_fragment");
            if (!(this.p == null || (TextUtils.equals(this.O, "PERMISSION_REQUEST_FRAGMENT") && alao.a((Context) this, G)))) {
                or a2 = this.o.a();
                a2.b(this.p);
                a2.a();
            }
        }
        this.V = findViewById(R.id.fragment_container);
        this.J = (ImageView) findViewById(R.id.back_button);
        this.J.setOnClickListener(new iyp(this));
        this.h = (MicrophoneView) findViewById(R.id.microphone_container);
        this.h.setOnClickListener(new iyr(this));
        this.z = (TextView) findViewById(R.id.state_text_view);
        this.i = (TextView) findViewById(R.id.stable_recognized_text);
        this.y = (TextView) findViewById(R.id.unstable_recognized_text);
        this.A = (TextView) findViewById(R.id.error_text);
        this.B = (TextView) findViewById(R.id.error_voice_tips);
        this.C = (TextView) findViewById(R.id.listening_voice_tips_text);
        this.S = (RelativeLayout) findViewById(R.id.microphone_view_layout);
        this.aa = getIntent().getIntExtra("MicSampleRate", 16000);
        this.Y = getIntent().getIntExtra("MicAudioFormatEncoding", 2);
        this.Z = getIntent().getIntExtra("MicChannelConfig", 16);
        t();
        q();
        this.T = getIntent().getIntExtra("ParentVeType", 0);
        this.U = getIntent().getStringExtra("ParentCSN");
        apxx apxx = (apxx) apxu.d.createBuilder();
        avjh avjh = (avjh) avjf.h.createBuilder();
        avjh.a(this.T);
        String str = this.U;
        if (str != null) {
            avjh.a(str);
        }
        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
        this.u.a(acwl.aB, (apxu) ((anxl) apxx.build()), null);
        this.u.b(acwc.MOBILE_BACK_BUTTON, null);
        this.K = true;
    }

    public final void onRestart() {
        super.onRestart();
        if (this.N != fmv.a(this.r)) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new iyq(this));
        }
    }

    public final void onResume() {
        super.onResume();
        if (ra.a((Context) this, "android.permission.RECORD_AUDIO") != 0) {
            if (VERSION.SDK_INT >= 23 && foh.n(this.t)) {
                boolean a = alao.a((Context) this, G);
                alad[] aladArr = (alad[]) this.H.toArray(new alad[0]);
                Object obj = (alao.a((Activity) this, aladArr) && alao.a((Context) this, aladArr)) ? 1 : null;
                if (a || obj != null) {
                    if (!this.I) {
                        if (this.p == null) {
                            this.p = alao.a(G, (alad[]) this.H.toArray(new alad[0]), acwl.aC, acwc.VOICE_SEARCH_ALLOW_ACCESS_BUTTON, acwc.VOICE_SEARCH_PERMISSION_REQUEST_CANCEL_BUTTON, acwc.VOICE_SEARCH_OPEN_APP_SETTINGS_BUTTON, R.string.vs_permission_allow_access_description, R.string.vs_permission_open_settings_description, R.string.permission_fragment_title);
                        }
                        this.p.a = this;
                        ahw ahw = new ahw((Context) this, (int) R.style.f521Theme.YouTube.Dark.Home);
                        obj = this.p;
                        obj.Z = ahw;
                        nf a2 = this.o.a(this.O);
                        amqw.a(obj);
                        String str = "PERMISSION_REQUEST_FRAGMENT";
                        xvd.a(str);
                        or a3 = this.o.a();
                        if (!(a2 == null || !a2.F_() || a2.equals(obj))) {
                            a3.b(a2);
                        }
                        this.V.setVisibility(0);
                        if (!obj.F_()) {
                            a3.a(R.id.fragment_container, obj, str);
                        } else if (obj.C) {
                            a3.c(obj);
                        }
                        a3.i = 4099;
                        a3.a();
                        this.O = str;
                        this.I = true;
                    }
                }
            }
            p();
        } else if (foh.n(this.t)) {
            this.X = this.w.a();
            AudioRecord audioRecord = this.X;
            if (audioRecord != null) {
                this.Y = audioRecord.getAudioFormat();
                this.Z = this.X.getChannelConfiguration();
                this.aa = this.X.getSampleRate();
                r();
            } else {
                s();
            }
        } else {
            r();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0120  */
    private final void r() {
        /*
        r31 = this;
        r0 = r31;
        r1 = r0.u;
        r2 = defpackage.acwc.VOICE_SEARCH_MIC_BUTTON;
        r3 = 0;
        r1.b(r2, r3);
        r1 = r0.t;
        r1 = defpackage.foh.k(r1);
        if (r1 == 0) goto L_0x0027;
    L_0x0012:
        r1 = r0.s;
        r2 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r3 = "";
        r1 = r1.b(r2, r3);
        if (r1 == 0) goto L_0x0027;
    L_0x001e:
        r1 = r0.s;
        r2 = defpackage.atyw.LATENCY_ACTION_VOICE_ASSISTANT;
        r4 = "voz_vp";
        r1.a(r4, r2, r3);
    L_0x0027:
        r1 = r0.P;
        if (r1 != 0) goto L_0x0032;
    L_0x002b:
        r1 = new iyv;
        r1.<init>(r0);
        r0.P = r1;
    L_0x0032:
        r1 = new iys;
        r1.<init>(r0);
        r2 = r0.n;
        if (r2 != 0) goto L_0x0232;
    L_0x003b:
        r2 = r0.v;
        r4 = r0.P;
        r15 = r0.aa;
        r5 = r0.q;
        r5 = r5.b();
        r6 = r0.q;
        r6 = r6.a();
        r7 = r5.isEmpty();
        r8 = 1;
        if (r7 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x007a;
    L_0x0055:
        r7 = r6.isEmpty();
        if (r7 != 0) goto L_0x007a;
    L_0x005b:
        r7 = r5.length();
        r9 = r6.length();
        r10 = new java.lang.StringBuilder;
        r7 = r7 + r8;
        r7 = r7 + r9;
        r10.<init>(r7);
        r10.append(r5);
        r5 = "-";
        r10.append(r5);
        r10.append(r6);
        r5 = r10.toString();
        goto L_0x007c;
    L_0x007a:
        r5 = "en-US";
    L_0x007c:
        r14 = r5;
        r5 = r31.getIntent();
        r6 = "SearchboxStats";
        r13 = r5.getByteArrayExtra(r6);
        r5 = r0.t;
        r5 = r5.b();
        if (r5 != 0) goto L_0x0090;
    L_0x008f:
        goto L_0x00a7;
    L_0x0090:
        r6 = r5.a;
        r6 = r6 & 64;
        if (r6 == 0) goto L_0x00a7;
    L_0x0096:
        r5 = r5.e;
        if (r5 != 0) goto L_0x009c;
    L_0x009a:
        r5 = defpackage.aume.af;
    L_0x009c:
        r5 = r5.K;
        r5 = defpackage.arzx.a(r5);
        if (r5 != 0) goto L_0x00a9;
    L_0x00a4:
        r5 = defpackage.arzx.YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_UNKNOWN;
        goto L_0x00a9;
    L_0x00a7:
        r5 = defpackage.arzx.YOUTUBE_ASSISTANT_VOICE_TIP_TYPE_CURATED;
    L_0x00a9:
        r12 = r5;
        r5 = r0.t;
        r5 = r5.b();
        if (r5 != 0) goto L_0x00b3;
    L_0x00b2:
        goto L_0x00ca;
    L_0x00b3:
        r6 = r5.a;
        r6 = r6 & 64;
        if (r6 == 0) goto L_0x00ca;
    L_0x00b9:
        r5 = r5.e;
        if (r5 != 0) goto L_0x00bf;
    L_0x00bd:
        r5 = defpackage.aume.af;
    L_0x00bf:
        r5 = r5.L;
        r5 = defpackage.arzv.a(r5);
        if (r5 != 0) goto L_0x00cc;
    L_0x00c7:
        r5 = defpackage.arzv.YOUTUBE_ASSISTANT_AUDIO_ENCODING_UNKNOWN;
        goto L_0x00cc;
    L_0x00ca:
        r5 = defpackage.arzv.YOUTUBE_ASSISTANT_AUDIO_ENCODING_LINEAR16;
    L_0x00cc:
        r11 = r5;
        r5 = r0.t;
        r5 = r5.b();
        if (r5 == 0) goto L_0x00e3;
    L_0x00d5:
        r5 = r5.e;
        if (r5 != 0) goto L_0x00db;
    L_0x00d9:
        r5 = defpackage.aume.af;
    L_0x00db:
        r5 = r5.M;
        if (r5 != 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00e3;
    L_0x00e0:
        r23 = 1;
        goto L_0x00e5;
    L_0x00e3:
        r23 = 0;
    L_0x00e5:
        r5 = r0.t;
        r5 = r5.b();
        r6 = 1060320051; // 0x3f333333 float:0.7 double:5.23867711E-315;
        if (r5 == 0) goto L_0x0101;
    L_0x00f0:
        r7 = r5.a;
        r7 = r7 & 64;
        if (r7 == 0) goto L_0x0101;
    L_0x00f6:
        r5 = r5.e;
        if (r5 != 0) goto L_0x00fc;
    L_0x00fa:
        r5 = defpackage.aume.af;
    L_0x00fc:
        r5 = r5.N;
        r24 = r5;
        goto L_0x0104;
    L_0x0101:
        r24 = 1060320051; // 0x3f333333 float:0.7 double:5.23867711E-315;
    L_0x0104:
        r5 = r0.t;
        r5 = r5.b();
        r6 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r5 == 0) goto L_0x012b;
    L_0x010e:
        r7 = r5.a;
        r7 = r7 & 64;
        if (r7 == 0) goto L_0x012b;
    L_0x0114:
        r7 = r5.e;
        if (r7 != 0) goto L_0x011a;
    L_0x0118:
        r7 = defpackage.aume.af;
    L_0x011a:
        r7 = r7.f;
        r7 = r7 & r8;
        if (r7 != 0) goto L_0x0120;
    L_0x011f:
        goto L_0x012b;
    L_0x0120:
        r5 = r5.e;
        if (r5 != 0) goto L_0x0126;
    L_0x0124:
        r5 = defpackage.aume.af;
    L_0x0126:
        r5 = r5.S;
        r25 = r5;
        goto L_0x012d;
    L_0x012b:
        r25 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
    L_0x012d:
        r5 = r0.Y;
        r26 = r5;
        r5 = r0.Z;
        r27 = r5;
        r10 = new ixp;
        r5 = r10;
        r6 = r2.a;
        r6 = r6.get();
        r6 = (defpackage.bciz) r6;
        r6 = defpackage.iye.a(r6, r8);
        r6 = (defpackage.bciz) r6;
        r7 = r2.b;
        r7 = r7.get();
        r7 = (defpackage.utc) r7;
        r8 = 2;
        r7 = defpackage.iye.a(r7, r8);
        r7 = (defpackage.utc) r7;
        r8 = r2.c;
        r8 = r8.get();
        r8 = (defpackage.aamd) r8;
        r9 = 3;
        r8 = defpackage.iye.a(r8, r9);
        r8 = (defpackage.aamd) r8;
        r9 = r2.d;
        r9 = r9.get();
        r9 = (defpackage.afpu) r9;
        r3 = 4;
        r3 = defpackage.iye.a(r9, r3);
        r9 = r3;
        r9 = (defpackage.afpu) r9;
        r3 = r2.e;
        r3 = r3.get();
        r3 = (java.util.concurrent.Executor) r3;
        r16 = r10;
        r10 = 5;
        r3 = defpackage.iye.a(r3, r10);
        r10 = r3;
        r10 = (java.util.concurrent.Executor) r10;
        r3 = r16;
        r16 = r11;
        r11 = r2.f;
        r11 = r11.get();
        r11 = (android.os.Handler) r11;
        r17 = r12;
        r12 = 6;
        r11 = defpackage.iye.a(r11, r12);
        r11 = (android.os.Handler) r11;
        r12 = r16;
        r12 = r2.g;
        r12 = r12.get();
        r12 = (android.content.SharedPreferences) r12;
        r18 = r13;
        r13 = 7;
        r12 = defpackage.iye.a(r12, r13);
        r12 = (android.content.SharedPreferences) r12;
        r0 = r16;
        r13 = r17;
        r2 = r2.h;
        r2 = r2.get();
        r2 = (java.lang.String) r2;
        r13 = 8;
        r2 = defpackage.iye.a(r2, r13);
        r13 = r2;
        r13 = (java.lang.String) r13;
        r28 = r3;
        r3 = r17;
        r2 = r18;
        r16 = r14;
        r14 = 9;
        r4 = defpackage.iye.a(r4, r14);
        r14 = r4;
        r14 = (defpackage.iyf) r14;
        r4 = r16;
        r16 = r15;
        r15 = 10;
        r1 = defpackage.iye.a(r1, r15);
        r15 = r1;
        r15 = (defpackage.iyc) r15;
        r1 = r16;
        r29 = r5;
        r5 = 12;
        r30 = r6;
        r6 = "PLACEHOLDER";
        r5 = defpackage.iye.a(r6, r5);
        r17 = r5;
        r17 = (java.lang.String) r17;
        r5 = 13;
        r5 = defpackage.iye.a(r6, r5);
        r18 = r5;
        r18 = (java.lang.String) r18;
        r5 = 14;
        r4 = defpackage.iye.a(r4, r5);
        r19 = r4;
        r19 = (java.lang.String) r19;
        r4 = 15;
        r2 = defpackage.iye.a(r2, r4);
        r20 = r2;
        r20 = (byte[]) r20;
        r2 = 16;
        r2 = defpackage.iye.a(r3, r2);
        r21 = r2;
        r21 = (defpackage.arzx) r21;
        r2 = 17;
        r0 = defpackage.iye.a(r0, r2);
        r22 = r0;
        r22 = (defpackage.arzv) r22;
        r5 = r29;
        r6 = r30;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
        r0 = r31;
        r1 = r28;
        r0.n = r1;
    L_0x0232:
        r1 = r0.K;
        if (r1 == 0) goto L_0x023c;
    L_0x0236:
        r1 = 0;
        r0.K = r1;
        r31.l();
    L_0x023c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity.r():void");
    }

    public final void onBackPressed() {
        Intent intent = getIntent();
        intent.putExtra("AssistantCsn", this.u.d());
        setResult(1, intent);
        super.onBackPressed();
    }

    public final void onDestroy() {
        this.m = false;
        this.L.release();
        ixp ixp = this.n;
        if (ixp != null) {
            AudioRecord audioRecord = ixp.b;
            if (audioRecord != null) {
                audioRecord.release();
            }
            bauk bauk = ixp.x;
            if (bauk != null) {
                bauk.d();
            }
            this.n = null;
        }
        this.P = null;
        this.h.setOnClickListener(null);
        this.J.setOnClickListener(null);
        this.u.a();
        super.onDestroy();
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.Q = z;
    }

    public final void onStop() {
        super.onStop();
        if (!this.Q) {
            p();
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.R) {
            overridePendingTransition(0, 0);
            this.R = false;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t();
        q();
    }

    public final void l() {
        c(this.M);
        this.m = true;
        this.E = false;
        this.i.setVisibility(8);
        String str = "";
        this.i.setText(str);
        this.y.setText(str);
        this.h.setEnabled(true);
        this.z.setText(getResources().getText(R.string.listening));
        this.z.setVisibility(0);
        ixp ixp = this.n;
        if (ixp != null) {
            AudioRecord audioRecord = ixp.b;
            if (audioRecord != null && audioRecord.getState() == 1) {
                if (!ixp.E) {
                    ixp.E = ixp.a(ixp.D);
                }
                ixp.b.startRecording();
                ixp.c.post(new ixo(ixp));
                ixp.g.execute(new ixr(ixp));
                MicrophoneView microphoneView = this.h;
                microphoneView.c = 3;
                microphoneView.b();
                return;
            }
            xtl.c("AudioRecord is null or not initialized");
        }
        s();
    }

    public final void m() {
        this.m = false;
        this.D = false;
        ixp ixp = this.n;
        if (ixp != null) {
            ixp.b();
        }
        o();
    }

    public final void o() {
        this.A.setVisibility(0);
        this.i.setVisibility(8);
        this.y.setVisibility(8);
        if (amqu.a(this.B.getText().toString())) {
            this.z.setText(getResources().getText(R.string.try_again_text));
        } else {
            this.z.setText(getResources().getText(R.string.try_saying_text));
        }
        this.z.setVisibility(0);
        this.C.setVisibility(8);
        this.B.setVisibility(0);
        MicrophoneView microphoneView = this.h;
        microphoneView.c = 1;
        microphoneView.b();
        this.h.setEnabled(true);
    }

    private final void s() {
        setVisible(false);
        this.R = true;
        Intent intent = getIntent();
        intent.putExtra("RegularVoiceSearch", true);
        setResult(-1, intent);
        p();
    }

    public final void c(int i) {
        this.L.play(i, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public final void p() {
        if (!isFinishing()) {
            finish();
        }
    }

    private final void t() {
        int dimension;
        float dimension2;
        Resources resources = getResources();
        LayoutParams layoutParams = (LayoutParams) this.h.getLayoutParams();
        if (resources.getConfiguration().orientation == 2) {
            dimension = (int) resources.getDimension(R.dimen.microphone_view_padding_land);
            dimension2 = resources.getDimension(R.dimen.microphone_layout_margin_land);
        } else {
            dimension = (int) resources.getDimension(R.dimen.microphone_view_padding);
            dimension2 = resources.getDimension(R.dimen.microphone_layout_margin);
        }
        int i = (int) dimension2;
        layoutParams.setMargins(0, 0, 0, dimension);
        this.h.setLayoutParams(layoutParams);
        this.h.requestLayout();
        layoutParams = (LayoutParams) this.S.getLayoutParams();
        layoutParams.setMargins(0, i, 0, 0);
        this.S.setLayoutParams(layoutParams);
        this.S.requestLayout();
    }

    public final void q() {
        String[] strArr = this.F;
        if (strArr != null && strArr.length > 0) {
            StringBuilder stringBuilder = new StringBuilder(getResources().getString(R.string.try_saying_text));
            if (getResources().getConfiguration().orientation == 2) {
                stringBuilder.append("\n''");
            } else {
                stringBuilder.append("\n\n''");
            }
            int i = 0;
            stringBuilder.append(this.F[0]);
            String str = "''";
            stringBuilder.append(str);
            this.C.setText(stringBuilder);
            stringBuilder = new StringBuilder();
            String[] strArr2 = this.F;
            int length = strArr2.length;
            int i2 = 0;
            while (i < length) {
                String str2 = strArr2[i];
                i2++;
                stringBuilder.append(str);
                stringBuilder.append(str2);
                stringBuilder.append(str);
                if (i2 >= 3) {
                    break;
                }
                stringBuilder.append("\n\n");
                i++;
            }
            this.B.setText(stringBuilder);
        }
    }

    public final void s_() {
        this.I = false;
        this.V.setVisibility(8);
        this.g.post(new iyt(this));
    }

    public final void W() {
        p();
    }

    private final iyu u() {
        if (this.W == null) {
            this.W = ((iyx) xse.a(getApplication())).f(new xev(this));
        }
        return this.W;
    }

    public final /* synthetic */ Object n() {
        return u();
    }
}
