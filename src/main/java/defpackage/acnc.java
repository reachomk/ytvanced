package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.snackbar.Snackbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.livecreation.ui.view.DeveloperPanel;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.livecreation.ui.view.StreamStatusView;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.LogStreamEventsCommandOuterClass$LogStreamEventsCommand;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: acnc */
public final class acnc extends nf implements acat, acdr, acep, acmx, acrw, OnClickListener {
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    public static final long b = TimeUnit.SECONDS.toMillis(5);
    public acvx Z;
    public Snackbar aA;
    public TextView aB;
    public NetworkOperationView aC;
    public ImageView aD;
    public ImageView aE;
    public String aF;
    public boolean aG;
    public String aH;
    public String aI;
    public avbq aJ;
    public String aK;
    public String aL;
    public String aM;
    public int aN;
    public long aO;
    public int aP = -1;
    public boolean aQ;
    public String aR;
    public arml aS;
    public int aT = -1;
    public int aU = -1;
    public int aV = -1;
    public int aW = -1;
    public int aX = -1;
    public acao aY;
    public boolean aZ;
    public acek aa;
    public achf ab;
    public acfe ac;
    public acan ad;
    public acck ae;
    public acby af;
    public acov ag;
    public abza ah;
    public Handler ai;
    public acaq aj;
    public atlx ak;
    public acfc al;
    public xsc am;
    public aclh an;
    public SharedPreferences ao;
    public alwu ap;
    public final Runnable aq = new acne(this);
    public View ar;
    public View as;
    public TextView at;
    public TextView au;
    public StreamStatusView av;
    public Button aw;
    public ImageButton ax;
    public byte[] ay;
    public acsa az;
    private boolean bA;
    private String bB;
    private boolean bC;
    private boolean bD = true;
    private boolean bE;
    private boolean bF;
    private boolean bG;
    private boolean bH;
    private int bI;
    private int bJ;
    public acel ba = acel.GOOD;
    public boolean bb;
    public avaw bc;
    public boolean bd;
    public Runnable be;
    public boolean bf;
    public boolean bg;
    public long bh;
    public long bi;
    public long bj;
    public int bk = -1;
    private final Runnable bl = new acnb(this);
    private View bm;
    private WaitingIndicatorView bn;
    private LinearLayout bo;
    private int bp;
    private TextView bq;
    private acmw br;
    private LinearLayout bs;
    private View bt;
    private View bu;
    private ChooseFilterView bv;
    private boolean bw;
    private int bx;
    private boolean by;
    private boolean bz;
    public aaas c;

    public static acnc a(String str, int i, boolean z, int i2, boolean z2, String str2, String str3, avbq avbq, long j, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i3) {
        xvd.a(str);
        acnc acnc = new acnc();
        Bundle bundle = new Bundle();
        String str4 = str;
        bundle.putString("ARG_VIDEO_ID", str);
        int i4 = i;
        bundle.putInt("ARG_QUALITY_LEVEL", i);
        boolean z8 = z3;
        bundle.putBoolean("ARG_USE_CBR_MODE", z3);
        bundle.putBoolean("ARG_USE_BITRATE_BOUNCE_MODE", z4);
        bundle.putBoolean("ARG_ALLOW_240P", z5);
        bundle.putBoolean("ARG_ALLOW_360P", z6);
        bundle.putInt("ARG_SEND_BUFFER_CHUNK_COUNT", i3);
        z8 = z;
        bundle.putBoolean("ARG_IS_MIC_SUPPORTED", z);
        i4 = i2;
        bundle.putInt("ARG_CAMERA_COUNT", i2);
        z8 = z2;
        bundle.putBoolean("ARG_LIVE_STREAM_IS_PORTRAIT", z2);
        z8 = false;
        if (!(TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3))) {
            z8 = true;
        }
        bundle.putBoolean("ARG_RESUME_PREVIOUS_STREAM", z8);
        bundle.putBoolean("ARG_USE_WEBRTC", z7);
        if (z8) {
            str4 = str2;
            bundle.putString("ARG_STREAM_URL", str2);
            str4 = str3;
            bundle.putString("ARG_STREAM_KEY", str3);
            avbq avbq2 = avbq;
            aobp.a(bundle, "ARG_STREAM_RENDERER", (anze) avbq);
            long j2 = j;
            bundle.putLong("ARG_TIMER_START_STREAM", j);
        }
        acnc.f(bundle);
        return acnc;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle = this.j;
        this.aF = bundle.getString("ARG_VIDEO_ID");
        this.aP = bundle.getInt("ARG_QUALITY_LEVEL");
        String str = "ARG_IS_MIC_SUPPORTED";
        this.aG = bundle.getBoolean(str, false);
        this.bw = bundle.getBoolean(str, false);
        this.bx = bundle.getInt("ARG_CAMERA_COUNT");
        this.by = bundle.getBoolean("ARG_LIVE_STREAM_IS_PORTRAIT");
        this.bz = bundle.getBoolean("IS_FLASH_TORCH_ENABLED", false);
        this.bf = bundle.getBoolean("ARG_ALLOW_240P", false);
        this.bg = bundle.getBoolean("ARG_ALLOW_360P", false);
        this.bH = bundle.getBoolean("ARG_USE_WEBRTC", false);
        acaw.a().a = this.bH;
        ((acor) xse.a(p())).a(this);
        boolean z = bundle.getBoolean("ARG_RESUME_PREVIOUS_STREAM");
        this.bF = z;
        if (z) {
            this.aH = bundle.getString("ARG_STREAM_URL");
            this.aI = bundle.getString("ARG_STREAM_KEY");
            str = "ARG_STREAM_RENDERER";
            if (bundle.containsKey(str)) {
                this.aJ = (avbq) aobp.b(bundle, str, avbq.g, anxa.c());
            }
            this.aO = bundle.getLong("ARG_TIMER_START_STREAM");
        }
        if (this.al.i()) {
            this.ah.a(this.aj.f());
        }
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (this.al.i()) {
            this.ag.a(this.aj.e());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0265  */
    public final android.view.View a(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
        r10 = this;
        r0 = r10.Z;
        r1 = defpackage.acwl.Q;
        r2 = 0;
        r0.a(r1, r2, r2);
        r0 = 0;
        r1 = 2131034754; // 0x7f050282 float:1.7680034E38 double:1.052871062E-314;
        r11 = r11.inflate(r1, r12, r0);
        r12 = r10.p();
        r1 = r10.aa;
        if (r13 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x0069;
    L_0x0019:
        r3 = "state_machine_state";
        r3 = r13.getInt(r3);
        r1.a = r3;
        r3 = "state_machine_retry_state";
        r3 = r13.getInt(r3);
        r1.c = r3;
        r3 = "state_machine_state_flow";
        r3 = r13.getInt(r3);
        r1.b = r3;
        r3 = "state_machine_stream_occurred";
        r3 = r13.getBoolean(r3);
        r1.h = r3;
        r3 = "state_machine_stop_requested";
        r3 = r13.getBoolean(r3);
        r1.f = r3;
        r3 = "state_machine_stop_request_completed";
        r3 = r13.getBoolean(r3);
        r1.e = r3;
        r3 = "state_machine_error_code";
        r3 = r13.getInt(r3);
        r1.d = r3;
        r3 = "state_machine_ingestion_failed";
        r3 = r13.getBoolean(r3);
        r1.g = r3;
        r3 = "state_machine_stream_went_live";
        r3 = r13.getBoolean(r3);
        r1.i = r3;
        r3 = "state_machine_bandwidth_check_pending";
        r3 = r13.getBoolean(r3);
        r1.j = r3;
    L_0x0069:
        r3 = r1.a;
        r3 = defpackage.acek.a(r3);
        r1.a = r3;
        r1 = new android.util.TypedValue;
        r1.<init>();
        r1 = r1.data;
        r3 = 1;
        r4 = new int[r3];
        r5 = 2130772515; // 0x7f010223 float:1.714815E38 double:1.052741499E-314;
        r4[r0] = r5;
        r12 = r12.obtainStyledAttributes(r1, r4);
        r1 = r12.getColor(r0, r0);
        r10.bp = r1;
        r12.recycle();
        r12 = r10.s();
        r1 = "live_chat_fragment";
        r4 = r12.a(r1);
        r4 = (defpackage.acmw) r4;
        r10.br = r4;
        r4 = r10.br;
        if (r4 != 0) goto L_0x00b5;
    L_0x009f:
        r4 = new acmw;
        r4.<init>();
        r10.br = r4;
        r12 = r12.a();
        r4 = 2131757115; // 0x7f10083b float:1.9145157E38 double:1.053227956E-314;
        r5 = r10.br;
        r12.a(r4, r5, r1);
        r12.a();
    L_0x00b5:
        r12 = r10.br;
        r12.ad = r10;
        r12 = 2131757112; // 0x7f100838 float:1.914515E38 double:1.0532279543E-314;
        r12 = r11.findViewById(r12);
        r10.ar = r12;
        r12 = 2131757129; // 0x7f100849 float:1.9145185E38 double:1.0532279627E-314;
        r12 = r11.findViewById(r12);
        r10.as = r12;
        r12 = 2131757130; // 0x7f10084a float:1.9145187E38 double:1.053227963E-314;
        r12 = r11.findViewById(r12);
        r12 = (android.widget.TextView) r12;
        r10.at = r12;
        r12 = 2131757131; // 0x7f10084b float:1.914519E38 double:1.0532279637E-314;
        r12 = r11.findViewById(r12);
        r12 = (android.widget.TextView) r12;
        r10.au = r12;
        r12 = 2131757122; // 0x7f100842 float:1.914517E38 double:1.0532279593E-314;
        r12 = r11.findViewById(r12);
        r10.bm = r12;
        r12 = 2131757123; // 0x7f100843 float:1.9145173E38 double:1.0532279598E-314;
        r12 = r11.findViewById(r12);
        r12 = (com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView) r12;
        r10.bn = r12;
        r12 = 2131757124; // 0x7f100844 float:1.9145175E38 double:1.05322796E-314;
        r12 = r11.findViewById(r12);
        r12 = (android.widget.TextView) r12;
        r10.bq = r12;
        r12 = 2131757133; // 0x7f10084d float:1.9145193E38 double:1.0532279647E-314;
        r12 = r11.findViewById(r12);
        r12 = (com.google.android.libraries.youtube.livecreation.ui.view.StreamStatusView) r12;
        r10.av = r12;
        r12 = 2131755512; // 0x7f1001f8 float:1.9141905E38 double:1.053227164E-314;
        r12 = r11.findViewById(r12);
        r12 = (android.widget.Button) r12;
        r10.aw = r12;
        r12 = 2131757134; // 0x7f10084e float:1.9145195E38 double:1.053227965E-314;
        r12 = r11.findViewById(r12);
        r12 = (android.widget.ImageButton) r12;
        r10.ax = r12;
        r12 = 2131757121; // 0x7f100841 float:1.9145169E38 double:1.053227959E-314;
        r12 = r11.findViewById(r12);
        r12 = (android.widget.LinearLayout) r12;
        r10.bo = r12;
        r12 = 2131757125; // 0x7f100845 float:1.9145177E38 double:1.0532279607E-314;
        r12 = r11.findViewById(r12);
        r12 = (com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView) r12;
        r10.aC = r12;
        r12 = 2131757236; // 0x7f1008b4 float:1.9145402E38 double:1.0532280156E-314;
        r12 = r11.findViewById(r12);
        r12 = (android.widget.LinearLayout) r12;
        r10.bs = r12;
        r12 = 2131757117; // 0x7f10083d float:1.914516E38 double:1.053227957E-314;
        r12 = r11.findViewById(r12);
        r10.bt = r12;
        r12 = 2131757118; // 0x7f10083e float:1.9145163E38 double:1.0532279573E-314;
        r12 = r11.findViewById(r12);
        r10.bu = r12;
        r12 = 2131757120; // 0x7f100840 float:1.9145167E38 double:1.0532279583E-314;
        r12 = r11.findViewById(r12);
        r12 = (com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView) r12;
        r10.bv = r12;
        r12 = defpackage.zld.a;
        if (r12 == 0) goto L_0x019a;
    L_0x0163:
        r12 = r10.ak;
        r12 = r12.A;
        if (r12 != 0) goto L_0x016a;
    L_0x0169:
        goto L_0x019a;
    L_0x016a:
        r12 = r10.ag;
        r5 = r12.K();
        if (r5 == 0) goto L_0x019a;
    L_0x0172:
        r12 = r5.isEmpty();
        if (r12 != 0) goto L_0x019a;
    L_0x0178:
        r12 = r5.size();
        if (r12 != r3) goto L_0x018e;
    L_0x017e:
        r12 = r5.get(r0);
        r12 = (defpackage.zjt) r12;
        r12 = r12.a;
        r1 = "NORMAL";
        r12 = r12.equals(r1);
        if (r12 != 0) goto L_0x019a;
    L_0x018e:
        r4 = r10.bv;
        r6 = 0;
        r7 = 0;
        r8 = 1;
        r9 = r10.ao;
        r4.a(r5, r6, r7, r8, r9);
        r12 = 1;
        goto L_0x019b;
    L_0x019a:
        r12 = 0;
    L_0x019b:
        r10.bE = r12;
        r12 = 2131755760; // 0x7f1002f0 float:1.9142408E38 double:1.0532272863E-314;
        r12 = r11.findViewById(r12);
        r12 = (android.widget.ImageView) r12;
        r10.aD = r12;
        r12 = 2131755759; // 0x7f1002ef float:1.9142406E38 double:1.053227286E-314;
        r12 = r11.findViewById(r12);
        r12 = (android.widget.ImageView) r12;
        r10.aE = r12;
        r12 = r10.bE;
        if (r12 == 0) goto L_0x01e4;
    L_0x01b7:
        r12 = r10.bv;
        r12.setVisibility(r0);
        r12 = r10.bv;
        r1 = r10.Z;
        r4 = new zrd;
        r4.<init>(r1);
        r12.a(r1, r4);
        r12 = r10.ap;
        r1 = r10.M_();
        r1 = defpackage.xrn.c(r1);
        r4 = "LIVE";
        r12.a(r1, r4);
        r12 = r10.ag;
        r1 = r10.bv;
        r1 = r1.c();
        r4 = r10.aF;
        r12.a(r1, r4);
    L_0x01e4:
        r12 = r10.q();
        r1 = "status_bar_height";
        r4 = "dimen";
        r5 = "android";
        r12 = r12.getIdentifier(r1, r4, r5);
        if (r12 <= 0) goto L_0x0213;
    L_0x01f4:
        r1 = 2131757113; // 0x7f100839 float:1.9145153E38 double:1.053227955E-314;
        r1 = r11.findViewById(r1);
        r4 = r1.getLayoutParams();
        r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams;
        if (r5 == 0) goto L_0x0213;
    L_0x0203:
        r5 = r4;
        r5 = (android.view.ViewGroup.MarginLayoutParams) r5;
        r6 = r10.q();
        r12 = r6.getDimensionPixelSize(r12);
        r5.topMargin = r12;
        r1.setLayoutParams(r4);
    L_0x0213:
        r12 = r10.aC;
        r12.a(r3);
        r12 = r10.aw;
        r12.setOnClickListener(r10);
        r12 = r10.ax;
        r12.setOnClickListener(r10);
        r12 = r10.aC;
        r1 = new acoa;
        r1.<init>(r10);
        r12.a(r1);
        r12 = r10.aC;
        r1 = new acoh;
        r1.<init>(r10);
        r12.b(r1);
        r12 = 2131757114; // 0x7f10083a float:1.9145155E38 double:1.0532279553E-314;
        r12 = r11.findViewById(r12);
        r1 = -2;
        r4 = "";
        r12 = android.support.design.snackbar.Snackbar.a(r12, r4, r1);
        r10.aA = r12;
        r12 = r10.aA;
        r12 = r12.e;
        r1 = 2131755160; // 0x7f100098 float:1.9141191E38 double:1.05322699E-314;
        r12 = r12.findViewById(r1);
        r12 = (android.widget.TextView) r12;
        r10.aB = r12;
        r12 = r10.aB;
        r1 = android.text.method.LinkMovementMethod.getInstance();
        r12.setMovementMethod(r1);
        r10.g(r3);
        if (r13 != 0) goto L_0x0265;
    L_0x0263:
        goto L_0x02fe;
    L_0x0265:
        r12 = "STATE_STREAM_URL";
        r12 = r13.getString(r12, r2);
        r10.aH = r12;
        r12 = "STATE_STREAM_KEY";
        r12 = r13.getString(r12, r2);
        r10.aI = r12;
        r12 = "STATE_STREAM_RENDERER";
        r1 = r13.containsKey(r12);
        if (r1 != 0) goto L_0x027e;
    L_0x027d:
        goto L_0x028c;
    L_0x027e:
        r1 = defpackage.avbq.g;
        r3 = defpackage.anxa.c();
        r12 = defpackage.aobp.b(r13, r12, r1, r3);
        r12 = (defpackage.avbq) r12;
        r10.aJ = r12;
    L_0x028c:
        r12 = "ERROR_MESSAGE_FORMATTED_STRING";
        r1 = r13.containsKey(r12);
        if (r1 != 0) goto L_0x0295;
    L_0x0294:
        goto L_0x02a3;
    L_0x0295:
        r1 = defpackage.arml.f;
        r3 = defpackage.anxa.c();
        r12 = defpackage.aobp.b(r13, r12, r1, r3);
        r12 = (defpackage.arml) r12;
        r10.aS = r12;
    L_0x02a3:
        r12 = "STATE_VIEWERS_COUNT_STRING";
        r12 = r13.getString(r12, r2);
        r10.aK = r12;
        r12 = "STATE_THUMBSUP_COUNT_STRING";
        r12 = r13.getString(r12, r2);
        r10.aL = r12;
        r12 = -1;
        r1 = "STATE_THUMBSUP_COUNT";
        r1 = r13.getInt(r1, r12);
        r10.aN = r1;
        r1 = 0;
        r3 = "STATE_TIMER_BASE";
        r1 = r13.getLong(r3, r1);
        r10.aO = r1;
        r1 = "STATE_QUALITY_LEVEL";
        r12 = r13.getInt(r1, r12);
        r10.aP = r12;
        r12 = "STATE_SPEED_TEST_BITRATE";
        r1 = r13.getLong(r12);
        r10.bj = r1;
        r12 = "STATE_WEBRTC_LAST_VIDEO_WIDTH";
        r12 = r13.getInt(r12);
        r10.bI = r12;
        r12 = "STATE_WEBRTC_LAST_VIDEO_HEIGHT";
        r12 = r13.getInt(r12);
        r10.bJ = r12;
        r12 = "STATE_DID_STREAM";
        r12 = r13.getBoolean(r12, r0);
        r10.aQ = r12;
        r12 = "STATE_LIVESTREAM_DONE_ERROR_MESSAGE";
        r12 = r13.getString(r12);
        r10.aR = r12;
        r12 = "IS_FLASH_TORCH_ENABLED";
        r12 = r13.getBoolean(r12, r0);
        r10.bz = r12;
    L_0x02fe:
        r12 = r10.aJ;
        r10.a(r12);
        r12 = r10.av;
        r13 = r10.aK;
        r12.a(r13);
        r12 = r10.av;
        r13 = r10.aL;
        r12.b(r13);
        r12 = r10.av;
        r13 = r10.aM;
        r12.c(r13);
        r12 = r10.aK;
        r13 = r10.aL;
        r0 = r10.aN;
        r10.a(r12, r13, r0);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acnc.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void a(avbq avbq) {
        if (avbq != null) {
            if ((avbq.a & 16) != 0) {
                Object obj;
                apxu apxu = avbq.f;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                anxr access$000 = anxl.checkIsLite(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                if ((((LiveChatEndpointOuterClass$LiveChatEndpoint) obj).a & 2) != 0) {
                    access$000 = anxl.checkIsLite(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
                    apxu.a(access$000);
                    Object b2 = apxu.h.b(access$000.d);
                    if (b2 == null) {
                        b2 = access$000.b;
                    } else {
                        b2 = access$000.a(b2);
                    }
                    aufw aufw = ((LiveChatEndpointOuterClass$LiveChatEndpoint) b2).c;
                    if (aufw == null) {
                        aufw = aufw.g;
                    }
                    a(aufw);
                } else {
                    a(apxu);
                }
            }
            if ((avbq.a & 1) != 0) {
                TextView textView = this.au;
                arml arml = avbq.b;
                if (arml == null) {
                    arml = arml.f;
                }
                textView.setText(ajqy.a(arml));
            }
            avbm avbm = avbq.c;
            if (avbm == null) {
                avbm = avbm.c;
            }
            if ((avbm.a & 1) != 0) {
                aphg aphg = avbm.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                this.ay = aphg.r.d();
                this.Z.a(this.ay);
                arwf arwf = aphg.e;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                if (a != arwh.UNKNOWN) {
                    ImageButton imageButton = this.ax;
                    arwf arwf2 = aphg.e;
                    if (arwf2 == null) {
                        arwf2 = arwf.c;
                    }
                    arwh a2 = arwh.a(arwf2.b);
                    if (a2 == null) {
                        a2 = arwh.UNKNOWN;
                    }
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    int[] iArr = new int[]{-16842910};
                    int[] iArr2 = new int[0];
                    int a3 = this.an.a(a2);
                    if (a3 != 0) {
                        Drawable a4 = ra.a(M_(), a3);
                        a4.setAlpha(q().getInteger(R.integer.lc_close_icon_inactive_alpha));
                        stateListDrawable.addState(iArr, a4);
                        Drawable a5 = ra.a(M_(), a3);
                        a5.setAlpha(q().getInteger(R.integer.lc_close_icon_active_alpha));
                        stateListDrawable.addState(iArr2, a5);
                    }
                    imageButton.setImageDrawable(stateListDrawable);
                    this.ax.setVisibility(0);
                    if ((aphg.a & 16384) != 0) {
                        ImageButton imageButton2 = this.ax;
                        aodv aodv = aphg.p;
                        if (aodv == null) {
                            aodv = aodv.c;
                        }
                        imageButton2.setContentDescription(aodv.b);
                    }
                } else if ((aphg.a & 128) != 0) {
                    Button button = this.aw;
                    arml arml2 = aphg.g;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                    button.setText(ajqy.a(arml2));
                    this.aw.setVisibility(0);
                }
            }
            avby avby = avbq.e;
            if (avby == null) {
                avby = avby.c;
            }
            avbw avbw = avby.b;
            if (avbw == null) {
                avbw = avbw.b;
            }
            if (avbw.a.size() != 0) {
                Context M_ = M_();
                avby avby2 = avbq.e;
                if (avby2 == null) {
                    avby2 = avby.c;
                }
                avbw avbw2 = avby2.b;
                if (avbw2 == null) {
                    avbw2 = avbw.b;
                }
                this.az = new acsa(M_, this, avbw2, this.bo, this.an, this.c, this.Z);
            }
        }
    }

    public final boolean W() {
        return this.bw;
    }

    public final boolean X() {
        return this.aG;
    }

    public final boolean Y() {
        return this.ag.c("torch");
    }

    public final boolean Z() {
        return this.bz;
    }

    public final boolean aa() {
        return this.bx > 1;
    }

    public final boolean ab() {
        avbq avbq = this.aJ;
        return (avbq == null || (avbq.a & 16) == 0) ? false : true;
    }

    public final boolean ac() {
        return this.bD;
    }

    public final boolean ad() {
        return this.bE;
    }

    public final void ae() {
        this.bv.a();
    }

    public final void c() {
        this.ag.d(this.K);
        this.bz = false;
    }

    public final void a(boolean z) {
        this.bD = z;
        View view = this.br.K;
        if (view != null) {
            view.setAlpha(!z ? 0.0f : 1.0f);
            xpr.a(this.bt, z ^ 1);
        }
    }

    public final void a(apxu apxu) {
        a(true);
        acmw acmw = this.br;
        acmw.ah = apxu;
        acmw.ai = null;
        if (acmw.u()) {
            acmw.a.k();
            acmw.f();
        }
    }

    public final void a(aufw aufw) {
        a(true);
        acmw acmw = this.br;
        acmw.ai = aufw;
        acmw.ah = null;
        if (acmw.u()) {
            acmw.a.k();
            acmw.f();
        }
    }

    public final void b(boolean z) {
        if (this.ag.b(!z ? "off" : "torch")) {
            this.bz = z;
        }
    }

    public final void c(boolean z) {
        boolean z2 = z ^ 1;
        if (this.bb && this.aa.e()) {
            String str = !z2 ? "DISABLED" : "ENABLED";
            String str2 = "Setting mic for live capture to ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str2.concat(str);
            }
            this.aj.a(z2, new acof(this));
        } else {
            xtl.c("Cannot update mic state when stream not active");
        }
        xpr.a(this.bu, z);
    }

    public final void e(Bundle bundle) {
        bundle.putString("STATE_STREAM_URL", this.aH);
        bundle.putString("STATE_STREAM_KEY", this.aI);
        anze anze = this.aJ;
        if (anze != null) {
            aobp.a(bundle, "STATE_STREAM_RENDERER", anze);
        }
        anze = this.aS;
        if (anze != null) {
            aobp.a(bundle, "ERROR_MESSAGE_FORMATTED_STRING", anze);
        }
        bundle.putString("STATE_VIEWERS_COUNT_STRING", this.aK);
        bundle.putString("STATE_THUMBSUP_COUNT_STRING", this.aL);
        bundle.putString("STATE_SUPER_CHAT_TOTAL_STRING", this.aM);
        bundle.putInt("STATE_THUMBSUP_COUNT", this.aN);
        bundle.putLong("STATE_TIMER_BASE", this.aO);
        bundle.putInt("STATE_QUALITY_LEVEL", this.aP);
        bundle.putLong("STATE_SPEED_TEST_BITRATE", this.bj);
        bundle.putInt("STATE_WEBRTC_LAST_VIDEO_WIDTH", this.bI);
        bundle.putInt("STATE_WEBRTC_LAST_VIDEO_HEIGHT", this.bJ);
        bundle.putBoolean("STATE_DID_STREAM", this.aQ);
        bundle.putString("STATE_LIVESTREAM_DONE_ERROR_MESSAGE", this.aR);
        bundle.putBoolean("IS_FLASH_TORCH_ENABLED", this.bz);
        acek acek = this.aa;
        bundle.putInt("state_machine_state", acek.a);
        bundle.putInt("state_machine_retry_state", acek.c);
        bundle.putInt("state_machine_state_flow", acek.b);
        bundle.putInt("state_machine_error_code", acek.d);
        bundle.putBoolean("state_machine_stream_occurred", acek.h);
        bundle.putBoolean("state_machine_stop_requested", acek.f);
        bundle.putBoolean("state_machine_stop_request_completed", acek.e);
        bundle.putBoolean("state_machine_ingestion_failed", acek.g);
        bundle.putBoolean("state_machine_stream_went_live", acek.i);
        bundle.putBoolean("state_machine_bandwidth_check_pending", acek.j);
    }

    public final void W_() {
        super.W_();
        this.bb = true;
        f(true);
        g(true);
        if (!this.bF) {
            acek acek = this.aa;
            int a = acek.a(acek.a);
            acek.a = a;
            acek.k = false;
            acek.d(a);
        } else if (this.bH || an()) {
            acek acek2 = this.aa;
            int a2 = acek.a(acek2.a);
            acek2.a = a2;
            acek2.m = true;
            acek2.d(a2);
        } else {
            return;
        }
        aceh acou = new acou(this);
        acef.a().a(auhl.class, acou.class, acou);
        acef.a().a(auhp.class, acou.class, acou);
    }

    public final void d(boolean z) {
        if (aclo.a((nf) this)) {
            if (z) {
                h((int) R.string.lc_reconnecting);
                this.ag.b(!this.bz ? "off" : "torch");
            } else {
                h((int) R.string.lc_going_live);
            }
            this.ag.H();
        }
    }

    public final void d() {
        if (aclo.a((nf) this)) {
            if (this.bH) {
                this.aa.a();
                return;
            }
            d(5);
        }
    }

    public final void e() {
        if (!aclo.a((nf) this)) {
            return;
        }
        if (this.bH || an()) {
            MediaFormat mediaFormat;
            Object obj;
            if (this.bH) {
                mediaFormat = null;
            } else {
                mediaFormat = this.ab.a(this.aP, this.by);
                amqw.a((Object) mediaFormat);
            }
            this.aI = null;
            this.aH = null;
            if (this.bH) {
                obj = "WebRTC";
            } else {
                String valueOf = String.valueOf(mediaFormat);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 5);
                stringBuilder.append("RTMP:");
                stringBuilder.append(valueOf);
                obj = stringBuilder.toString();
            }
            String.valueOf(this.aF).length();
            String.valueOf(obj).length();
            acfe acfe = this.ac;
            String str = this.aF;
            boolean z = this.bH;
            acfe.a(str, z, this.by, !z ? mediaFormat : null, new acoj(this));
        }
    }

    public final void f_(int i) {
        if (aclo.a((nf) this)) {
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("Create ingestion failure: ");
            stringBuilder.append(i);
            xtl.c(stringBuilder.toString());
            if (aclo.a((nf) this)) {
                as();
                this.ag.a(i, null, null, null, this.aQ);
                return;
            }
            as();
        }
    }

    public final void B() {
        super.B();
        aq();
        if (this.au.getVisibility() == 0) {
            this.au.setVisibility(8);
        }
    }

    public final void ad_() {
        super.ad_();
        int i = 0;
        int i2 = (ar() == null || ar().a() == null) ? 0 : ar().a().a;
        this.bI = i2;
        if (!(ar() == null || ar().a() == null)) {
            i = ar().a().b;
        }
        this.bJ = i;
    }

    public final void N_() {
        super.N_();
        ao();
        al();
        a(false, true);
        f(false);
        g(false);
        this.bb = false;
        acef.a().a(auhl.class, acou.class, null);
        acef.a().a(auhp.class, acou.class, null);
    }

    private final boolean an() {
        if (this.aP != -1) {
            return true;
        }
        if (this.ab.a(2)) {
            this.aP = 2;
            return true;
        } else if (this.ab.a(3)) {
            this.aP = 3;
            return true;
        } else if (this.bg && this.ab.a(4)) {
            this.aP = 4;
            return true;
        } else if (this.bf && this.ab.a(5)) {
            this.aP = 5;
            return true;
        } else {
            acef.a().a(15, 1, null);
            this.aa.b(3);
            return false;
        }
    }

    public final void j() {
        if (aclo.a((nf) this)) {
            this.as.setVisibility(8);
            this.at.setVisibility(8);
            at();
        }
    }

    public final void g_(int i) {
        if (aclo.a((nf) this)) {
            this.ag.a(i, this.bc, this.aR, this.aS, this.aQ);
        }
    }

    public final void l() {
        if (aclo.a((nf) this)) {
            ao();
            h(true);
        }
    }

    private final void h(boolean z) {
        acef.a().b(auhl.class);
        this.aj.a(new acnn(this, z));
    }

    private final void a(boolean z, boolean z2) {
        acav acav = null;
        if (z2) {
            this.ai.removeCallbacksAndMessages(null);
        }
        acef.a().b(auhl.class);
        ap();
        if (z) {
            acav = new acok(this);
            acek acek = this.aa;
            acek.l = true;
            acek.f();
        }
        this.aj.b(acav);
    }

    public final void d(int i) {
        if (this.bb && an()) {
            String str = this.aH;
            String str2 = this.aI;
            String.valueOf(str).length();
            String.valueOf(str2).length();
            MediaFormat a = this.ab.a(this.aP, this.by);
            if (a == null) {
                xtl.c("Could not find any supported encoders");
                f(7);
                return;
            }
            Object bundle = new Bundle();
            acii.a(bundle);
            amqw.a(bundle);
            bundle.putBoolean("KEY_ENABLE_THROUGHPUT_MEASUREMENT", true);
            int integer = a.getInteger("bitrate");
            acak.a(bundle, 2);
            this.aj.a(this.aG, a, this.ab.a(), this.aH, this.aI, this.ag.J(), bundle, new acnr(this, i, integer));
        }
    }

    public final boolean a(int i, long j, int i2) {
        if (this.ab.a(i)) {
            achf.a(this.ab.a(i, this.by));
            if (j >= ((long) i2)) {
                return true;
            }
        }
        return false;
    }

    public final void af() {
        e(0);
    }

    public final void e(int i) {
        this.aj.b(new acnv(this, i));
    }

    public final void a(int i, boolean z, boolean z2, int i2) {
        if (this.bb) {
            MediaFormat mediaFormat;
            MediaFormat mediaFormat2;
            String str = this.aH;
            String str2 = this.aI;
            String.valueOf(str).length();
            String.valueOf(str2).length();
            Object bundle = new Bundle();
            int i3;
            if (this.bH) {
                z2 = this.al.a().x;
                amqw.a(bundle);
                bundle.putBoolean("KEY_WEBRTC_RECONNECT_RESET", z2);
                i3 = this.bI;
                amqw.a(bundle);
                bundle.putInt("KEY_WEBRTC_LAST_VIDEO_WIDTH", i3);
                i3 = this.bJ;
                amqw.a(bundle);
                bundle.putInt("KEY_WEBRTC_LAST_VIDEO_HEIGHT", i3);
                mediaFormat = null;
                mediaFormat2 = mediaFormat;
            } else {
                MediaFormat a = this.ab.a(this.aP, this.by);
                MediaFormat a2 = this.ab.a();
                if (a2 == null || a == null) {
                    xtl.c("Could not find supported encoders");
                    f(7);
                } else {
                    if (z) {
                        acii.a(bundle);
                    }
                    if (z2) {
                        amqw.a(bundle);
                        bundle.putBoolean("extras-key-enable-bitrate-bounce", true);
                    }
                    amqw.a(bundle);
                    amqw.a(i2 >= 0);
                    bundle.putInt("extras-key-send-buffer-chunk-count", i2);
                    int i4 = 3;
                    if (this.al.a() != null) {
                        aujp a3 = this.al.a();
                        int i5 = this.aP;
                        if (i5 == 0 || i5 == 1 || i5 == 2) {
                            i5 = a3.g;
                            if (i5 > 0) {
                                acii.a(bundle, i5 * 1000);
                            }
                        } else {
                            i5 = a3.f;
                            if (i5 > 0) {
                                acii.a(bundle, i5 * 1000);
                            }
                        }
                        i5 = aujs.a(a3.i);
                        if (!(i5 == 0 || i5 == 1)) {
                            i3 = aujs.a(a3.i);
                            i4 = i3 != 0 ? i3 : 1;
                        }
                    }
                    acak.a(bundle, i4);
                    long j = this.bj;
                    amqw.a(bundle);
                    bundle.putLong("KEY_SPEED_TEST_BITRATE", j);
                    mediaFormat = a;
                    mediaFormat2 = a2;
                }
            }
            this.aj.a(this.aG, mediaFormat, mediaFormat2, this.aH, this.aI, this.ag.J(), bundle, new acny(this, i, z, i2));
        }
    }

    private final void ao() {
        this.ai.removeCallbacks(this.bl);
    }

    public final void f(int i) {
        a(i, null, false);
    }

    public final void a(int i, String str, boolean z) {
        if (!(i == 26 || i == 0)) {
            StringBuilder stringBuilder = new StringBuilder(72);
            stringBuilder.append("Error during live stream: status=");
            stringBuilder.append(i);
            stringBuilder.append(", attemptStopBroadcast=");
            stringBuilder.append(z);
            xtl.c(stringBuilder.toString());
        }
        ao();
        if (z) {
            acfm acom = new acom(this, i, str);
            at();
            this.ac.a(this.aF, acom);
            return;
        }
        a(i, str);
    }

    public final void a(int i, String str) {
        a(true, true);
        as();
        if (aclo.a((nf) this)) {
            this.ag.g(true);
            this.ag.a(i, this.bc, str, this.aS, this.aQ);
        }
    }

    public final void ag() {
        if (this.bb) {
            if (!this.aZ) {
                long F = this.ag.F();
                if (F > 0) {
                    this.aZ = true;
                    this.ai.postDelayed(new acnx(this), F);
                    return;
                }
            }
            this.aj.a((acat) this, new acnd(this));
        }
    }

    public final void f() {
        if (aclo.a((nf) this)) {
            a(5, this.j.getBoolean("ARG_USE_CBR_MODE", false), ah(), this.j.getInt("ARG_SEND_BUFFER_CHUNK_COUNT", 0));
        }
    }

    public final boolean ah() {
        return this.j.getBoolean("ARG_USE_BITRATE_BOUNCE_MODE", false);
    }

    public final void g() {
        if (aclo.a((nf) this)) {
            g(20);
        }
    }

    public final void g(int i) {
        if (this.bb) {
            acek acek = this.aa;
            acek.h = true;
            acek.f();
            this.ac.a(this.aF, new acol(this, i));
        }
    }

    private final void ap() {
        acby acby = this.af;
        acby.d = null;
        if (acby.e) {
            acby.b.unregisterReceiver(acby.n);
            acby.b.unregisterReceiver(acby.o);
            acby.c.removeCallbacks(acby.j);
            acby.c.removeCallbacks(acby.m);
            acef.a().a(auhp.class, acby.class, null);
            acby.e = false;
        } else {
            Log.w("CaptureRsrcMonitor", "Resource monitor already stopped.");
        }
        acck acck = this.ae;
        acck.j = null;
        if (acck.i) {
            acck.i = false;
            acck.a.post(new accr(acck));
            synchronized (acck) {
                acck.c.removeCallbacksAndMessages(acck);
                acck.h++;
                acck.a.removeCallbacks(acck.d);
            }
        }
        ai();
    }

    public final void ai() {
        acao acao = this.aY;
        if (acao != null) {
            this.ad.a.remove(acao);
            this.aY = null;
        }
        this.ad.a();
    }

    public final void a(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && i >= 0) {
            this.bs.setContentDescription(q().getQuantityString(R.plurals.lc_stream_status_cd, i, new Object[]{str, str2}));
        }
    }

    public final void a(CharSequence charSequence) {
        TextView textView = this.aB;
        if (textView != null) {
            textView.setText(charSequence);
            this.aB.post(new acnf(this));
            acnc.a(this.aA);
        }
    }

    /* JADX WARNING: Missing block: B:26:0x008d, code skipped:
            return;
     */
    public final void h_(int r6) {
        /*
        r5 = this;
        r0 = r5.bb;
        if (r0 == 0) goto L_0x00cd;
    L_0x0004:
        r0 = r5.aa;
        r0 = r0.e();
        if (r0 == 0) goto L_0x00cd;
    L_0x000c:
        if (r6 == 0) goto L_0x00c8;
    L_0x000e:
        r0 = 7;
        r1 = 1;
        if (r6 == r0) goto L_0x00ab;
    L_0x0012:
        r0 = 9;
        if (r6 == r0) goto L_0x00ab;
    L_0x0016:
        r0 = 2131952579; // 0x7f1303c3 float:1.9541605E38 double:1.053324528E-314;
        r2 = 2131952577; // 0x7f1303c1 float:1.95416E38 double:1.053324527E-314;
        r3 = 2;
        r4 = 0;
        switch(r6) {
            case 12: goto L_0x00ab;
            case 13: goto L_0x009f;
            case 14: goto L_0x008e;
            case 15: goto L_0x009f;
            case 16: goto L_0x007b;
            case 17: goto L_0x005b;
            case 18: goto L_0x007b;
            case 19: goto L_0x00ab;
            default: goto L_0x0021;
        };
    L_0x0021:
        switch(r6) {
            case 28: goto L_0x004f;
            case 29: goto L_0x003e;
            case 30: goto L_0x004f;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = new java.lang.StringBuilder;
        r1 = 26;
        r0.<init>(r1);
        r1 = "Capture error: ";
        r0.append(r1);
        r0.append(r6);
        r0 = r0.toString();
        defpackage.xtl.c(r0);
        r5.f(r6);
        goto L_0x008d;
    L_0x003e:
        r6 = "ABR controller video quality is poor. Video is likely unusable.";
        defpackage.xtl.c(r6);
        r6 = r5.ad;
        r1 = r5.aX;
        r0 = r5.a(r0);
        r6.a(r3, r1, r0, r4);
        return;
    L_0x004f:
        r6 = r5.ad;
        r0 = r5.aX;
        r2 = r5.a(r2);
        r6.a(r4, r0, r2, r1);
        return;
    L_0x005b:
        r6 = "Capture audio frame rate is poor. Audio is likely unusable.";
        defpackage.xtl.c(r6);
        r6 = r5.aG;
        if (r6 == 0) goto L_0x008d;
    L_0x0064:
        r6 = r5.aa;
        r6 = r6.d();
        if (r6 == 0) goto L_0x008d;
    L_0x006c:
        r6 = r5.ad;
        r0 = r5.aV;
        r1 = 2131952556; // 0x7f1303ac float:1.9541558E38 double:1.0533245165E-314;
        r1 = r5.a(r1);
        r6.a(r3, r0, r1, r4);
        return;
    L_0x007b:
        r6 = r5.aG;
        if (r6 == 0) goto L_0x008d;
    L_0x007f:
        r6 = r5.ad;
        r0 = r5.aV;
        r2 = 2131952554; // 0x7f1303aa float:1.9541554E38 double:1.0533245155E-314;
        r2 = r5.a(r2);
        r6.a(r4, r0, r2, r1);
    L_0x008d:
        return;
    L_0x008e:
        r6 = "Capture video quality is poor. Video is likely unusable.";
        defpackage.xtl.c(r6);
        r6 = r5.ad;
        r1 = r5.aW;
        r0 = r5.a(r0);
        r6.a(r3, r1, r0, r4);
        return;
    L_0x009f:
        r6 = r5.ad;
        r0 = r5.aW;
        r2 = r5.a(r2);
        r6.a(r4, r0, r2, r1);
        return;
    L_0x00ab:
        r5.a(r1, r1);
        r6 = "Codec or communication error during capture. Offering retry.";
        defpackage.xtl.c(r6);
        r6 = r5.aa;
        r6 = r6.d();
        if (r6 == 0) goto L_0x00c2;
    L_0x00bb:
        r6 = r5.aa;
        r0 = 5;
        r6.e(r0);
        return;
    L_0x00c2:
        r6 = r5.aa;
        r6.c();
        return;
    L_0x00c8:
        r6 = "Capture error returned success code.";
        defpackage.xtl.c(r6);
    L_0x00cd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acnc.h_(int):void");
    }

    public final void f(boolean z) {
        this.bA = z;
        aq();
    }

    public final void a(acel acel, String str) {
        if (this.ba != acel) {
            acef.a().a(auhp.class);
        }
        this.ba = acel;
        this.bB = str;
        aq();
    }

    private final void aq() {
        nn p = p();
        if (p != null) {
            Object obj;
            int i = 0;
            if (this.ba != null) {
                if (VERSION.SDK_INT >= 21) {
                    int ordinal = this.ba.ordinal();
                    obj = 1;
                    if (ordinal == 1) {
                        ordinal = ra.c(p, R.color.lc_poor_connection_bg);
                    } else if (ordinal != 2) {
                        ordinal = this.bp;
                        obj = null;
                    } else {
                        ordinal = ra.c(p, R.color.lc_bad_connection_bg);
                    }
                    p.getWindow().setStatusBarColor(ordinal);
                } else {
                    obj = null;
                }
                StreamStatusView streamStatusView = this.av;
                if (streamStatusView != null) {
                    streamStatusView.a(this.ba, this.bB);
                }
            } else {
                obj = null;
            }
            boolean z = this.bA;
            Window window = p.getWindow();
            if (z) {
                i = obj == null ? 5894 : 5890;
                window.addFlags(134217728);
            } else {
                window.clearFlags(134217728);
            }
            window.getDecorView().setSystemUiVisibility(i);
        }
    }

    public final void onClick(View view) {
        if (this.K != null) {
            if (view == this.aw || view == this.ax) {
                aj();
            } else if (view == this.av) {
                DeveloperPanel developerPanel = null;
                developerPanel.setVisibility(0);
            }
        }
    }

    private final accy ar() {
        return this.aj.b();
    }

    public final void aj() {
        if (!this.bC) {
            this.bC = true;
            aeg aeg = new aeg(p(), R.style.f494Theme.AppCompat.Dialog);
            aeg.b(R.string.lc_confirm_stop_streaming);
            aeg.a(17039370, new acoc(this));
            aeg.b(17039360, new acnz(this));
            aeg.a(new acos(this));
            aeg.b();
        }
    }

    public final void ak() {
        this.bC = false;
        f(true);
        g(true);
    }

    public final void m() {
        if (aclo.a((nf) this)) {
            a(true, false);
            al();
            this.ar.setAlpha(0.0f);
            this.bd = false;
            this.as.setVisibility(8);
            this.at.setVisibility(8);
            this.aC.setVisibility(0);
            this.ag.i(true);
        }
    }

    public final void bn_() {
        if (aclo.a((nf) this)) {
            this.aQ = true;
            this.aw.setEnabled(true);
            this.ax.setEnabled(true);
        }
    }

    public final void a(List list) {
        if (list != null) {
            for (apxu apxu : list) {
                anxr access$000 = anxl.checkIsLite(LogStreamEventsCommandOuterClass$LogStreamEventsCommand.logStreamEventsCommand);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    anxr access$0002 = anxl.checkIsLite(LogStreamEventsCommandOuterClass$LogStreamEventsCommand.logStreamEventsCommand);
                    apxu.a(access$0002);
                    Object b = apxu.h.b(access$0002.d);
                    if (b != null) {
                        access$0002.a(b);
                    }
                    this.aj.d();
                    return;
                }
            }
        }
    }

    public final void k() {
        if (aclo.a((nf) this)) {
            int i = this.al.a().B;
            if (i > 0) {
                this.ai.postDelayed(this.bl, (long) i);
            }
            this.ag.H();
            if (this.bb) {
                this.aj.a(new acoi(this));
            } else {
                xtl.c("Cannot pause capture stream not active");
            }
            ap();
            this.ac.a(this.aF, new acob(this));
        }
    }

    private final void as() {
        al();
        this.ar.setAlpha(0.0f);
        this.aC.setVisibility(8);
    }

    public final void al() {
        this.bn.b();
        this.bm.setVisibility(8);
    }

    public final void h(int i) {
        this.bq.setText(i);
        au();
        this.ar.setAlpha(0.0f);
        this.aC.setVisibility(8);
    }

    private final void at() {
        au();
        this.bq.setText("");
        this.ar.setAlpha(0.0f);
        this.aC.setVisibility(8);
    }

    private final void au() {
        if (!this.bm.isShown()) {
            this.bn.a();
            this.bm.setVisibility(0);
        }
    }

    public final void g(boolean z) {
        if (z) {
            p().getWindow().addFlags(128);
        } else {
            p().getWindow().clearFlags(128);
        }
    }

    public static void a(Snackbar snackbar) {
        if (snackbar != null) {
            jg jgVar = snackbar.e;
            jgVar.getViewTreeObserver().addOnGlobalLayoutListener(new acod(jgVar));
            snackbar.c();
        }
    }

    public final void a(float f) {
        this.ag.a(f);
    }

    public final void a(float f, float f2) {
        if (this.al.a().w) {
            this.ag.a(f, f2, new acni(this));
        }
    }

    public final void a(boolean z, int i) {
        if (this.ar.isShown()) {
            this.be = new acnh(this, z, i);
            if (this.bd) {
                if (z != this.by || aclo.a(p())) {
                    this.as.setVisibility(8);
                    this.at.setVisibility(8);
                } else {
                    int rotation = p().getWindowManager().getDefaultDisplay().getRotation();
                    int i2 = -1;
                    if (i != -1) {
                        i2 = i * 90;
                    }
                    rotation = ((4 - rotation) % 4) * 90;
                    this.at.setCompoundDrawablesRelativeWithIntrinsicBounds(0, !this.by ? R.drawable.quantum_ic_screen_lock_landscape_white_48 : R.drawable.quantum_ic_screen_lock_portrait_white_48, 0, 0);
                    this.at.setRotation((float) (rotation - i2));
                    this.as.setVisibility(0);
                    this.at.setVisibility(0);
                }
            }
        }
    }

    public final void am() {
        if (this.bG || TextUtils.isEmpty(this.au.getText())) {
            this.bd = true;
            Runnable runnable = this.be;
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        this.au.setVisibility(0);
        this.au.postDelayed(new acnk(this), TimeUnit.MILLISECONDS.convert(3, TimeUnit.SECONDS));
        this.bG = true;
    }
}
