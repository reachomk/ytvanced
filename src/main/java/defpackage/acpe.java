package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.textfield.TextInputLayout;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.geo.EditLocation;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationSettingView;
import com.google.android.libraries.youtube.livecreation.ui.view.EditTextTitle;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupMoreOptionsRendererOuterClass;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: acpe */
public final class acpe extends alav implements acds, acfi, acfk, acfp, acqx, TextWatcher, OnClickListener, OnItemSelectedListener, OnCheckedChangeListener, zqj {
    private static final long aD = TimeUnit.MINUTES.toMillis(30);
    private static final Date aE = new Date(0);
    private static final alad aF = new alad(3, acwc.MOBILE_LIVE_APPROVE_LOCATION_BUTTON, acwc.MOBILE_LIVE_DENY_LOCATION_BUTTON);
    public zqm Z;
    public SharedPreferences a;
    public acjy aA;
    public acvx aB;
    private View aG;
    private ImageButton aH;
    private byte[] aI;
    private ImageButton aJ;
    private byte[] aK;
    private TextView aL;
    private ImageButton aM;
    private ViewGroup aN;
    private ImageView aO;
    private apxu aP;
    private TextInputLayout aQ;
    private Spinner aR;
    private ViewGroup aS;
    private ViewGroup aT;
    private TextView aU;
    private TextView aV;
    private View aW;
    private TextView aX;
    private SwitchCompat aY;
    private View aZ;
    public acqy aa;
    public EditTextTitle ab;
    public EditText ac;
    public EditLocation ad;
    public EditLocation ae;
    public LiveCreationSettingView af;
    public NetworkOperationView ag;
    public Boolean ah;
    public Boolean ai;
    public Boolean aj;
    public asjd ak;
    public avac al;
    public acjp am;
    public arog an;
    public Handler ao;
    public aaas ap;
    public akkq aq;
    public uud ar;
    public aclh as;
    public acfe at;
    public acpv au;
    public zqz av;
    public xsc aw;
    public zqs ax;
    public acfc ay;
    public albv az;
    public ViewAnimatorHelper b;
    private TextView ba;
    private View bb;
    private TextView bc;
    private acqz bd;
    private acrc be;
    private acrb bf;
    private Button bg;
    private boolean bh;
    private boolean bi;
    private boolean bj;
    private String bk;
    private String bl;
    private Date bm;
    private awnx bn;
    private boolean bo;
    private CharSequence bp;
    private zrb bq;
    private Boolean br;
    private asjf bs;
    private int bt;
    private boolean bu;
    private apxu bv;
    private apxu bw;
    public int c = -1;

    private final boolean ae() {
        return false;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static acpe a(ajuw ajuw, int i) {
        amqw.a((Object) ajuw);
        acpe acpe = new acpe();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_CAMERA_COUNT", i);
        bundle.putParcelable("ARG_GET_BROADCAST_RESPONSE", new akcl((aocf) ajuw));
        acpe.f(bundle);
        return acpe;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((acpw) xse.a(p())).a(this);
        bundle = this.j;
        if (bundle != null) {
            ajrb ajrb;
            String str = "ARG_TITLE";
            if (bundle.containsKey(str)) {
                this.bk = bundle.getString(str);
            }
            str = "ARG_DESCRIPTION";
            apxu apxu = null;
            if (bundle.containsKey(str)) {
                str = bundle.getString(str);
                this.bl = !TextUtils.isEmpty(str) ? str.trim() : null;
            }
            str = "ARG_STREAM_PRIVACY";
            if (bundle.containsKey(str)) {
                this.bn = awnx.a(bundle.getInt(str, 0));
            }
            str = "ARG_PLACE";
            if (bundle.containsKey(str)) {
                this.bq = (zrb) bundle.getParcelable(str);
            }
            str = "ARG_ENABLE_CHAT";
            if (bundle.containsKey(str)) {
                this.ah = Boolean.valueOf(bundle.getBoolean(str));
            }
            str = "ARG_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE";
            if (bundle.containsKey(str)) {
                this.ai = Boolean.valueOf(bundle.getBoolean(str));
            }
            str = "ARG_ENABLE_AGE_RESTRICTION";
            if (bundle.containsKey(str)) {
                this.aj = Boolean.valueOf(bundle.getBoolean(str));
            }
            str = "ARG_IS_SCREENCAST";
            if (bundle.containsKey(str)) {
                this.br = Boolean.valueOf(bundle.getBoolean(str));
            }
            str = "ARG_MONETIZATION_METADATA";
            if (bundle.containsKey(str)) {
                ajrb = (ajrb) bundle.getParcelable(str);
                if (ajrb != null) {
                    this.ak = (asjd) ajrb.a(asjd.h);
                }
            }
            str = "ARG_CAMERA_COUNT";
            if (bundle.containsKey(str)) {
                this.bt = bundle.getInt(str);
            }
            str = "ARG_BROADCAST_CREATED_ENDPOINT";
            if (bundle.containsKey(str)) {
                ajrb = (ajrb) bundle.getParcelable(str);
                if (ajrb != null) {
                    this.bv = (apxu) ajrb.a(apxu.d);
                }
            }
            str = "ARG_SCHEDULED_DATE";
            if (bundle.containsKey(str)) {
                this.bm = (Date) bundle.getSerializable(str);
            }
            str = "ARG_GAME_TITLE";
            if (bundle.containsKey(str)) {
                ajrb = (ajrb) bundle.getParcelable(str);
                if (ajrb != null) {
                    this.an = (arog) ajrb.a(arog.e);
                }
            }
            str = "ARG_GET_BROADCAST_RESPONSE";
            if (bundle.containsKey(str)) {
                akcl akcl = (akcl) bundle.getParcelable(str);
                if (akcl != null) {
                    auze auze = ((ajuw) akcl.a(new ajuw())).a.b;
                    if (auze == null) {
                        auze = auze.d;
                    }
                    auzg auzg = auze.b;
                    if (auzg == null) {
                        auzg = auzg.c;
                    }
                    avac avac = auzg.b;
                    if (avac == null) {
                        avac = avac.u;
                    }
                    this.al = avac;
                    this.bi = true;
                    auzs auzs = this.al.h;
                    if (auzs == null) {
                        auzs = auzs.c;
                    }
                    aphg aphg = auzs.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    if ((aphg.a & 2048) != 0) {
                        auzs = this.al.h;
                        if (auzs == null) {
                            auzs = auzs.c;
                        }
                        aphg = auzs.b;
                        if (aphg == null) {
                            aphg = aphg.s;
                        }
                        apxu = aphg.l;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                    }
                    this.bv = apxu;
                    this.br = Boolean.valueOf(this.al.s);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x031b  */
    public final android.view.View a(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
        r9 = this;
        r0 = 0;
        if (r12 == 0) goto L_0x013e;
    L_0x0003:
        r1 = "STATE_INTENT_ACTION_LOGGED";
        r1 = r12.getBoolean(r1, r0);
        r9.bh = r1;
        r1 = "STREAM_TITLE";
        r2 = r12.containsKey(r1);
        if (r2 == 0) goto L_0x0019;
    L_0x0013:
        r1 = r12.getString(r1);
        r9.bk = r1;
    L_0x0019:
        r1 = "STATE_MORE_OPTIONS_SHOWN";
        r2 = r12.containsKey(r1);
        if (r2 == 0) goto L_0x0027;
    L_0x0021:
        r1 = r12.getBoolean(r1);
        r9.bo = r1;
    L_0x0027:
        r1 = "STATE_STREAM_DESCRIPTION";
        r2 = r12.containsKey(r1);
        if (r2 == 0) goto L_0x0035;
    L_0x002f:
        r1 = r12.getString(r1);
        r9.bl = r1;
    L_0x0035:
        r1 = "STATE_ENABLE_CHAT";
        r2 = r12.containsKey(r1);
        if (r2 == 0) goto L_0x0047;
    L_0x003d:
        r1 = r12.getBoolean(r1);
        r1 = java.lang.Boolean.valueOf(r1);
        r9.ah = r1;
    L_0x0047:
        r1 = "STATE_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE";
        r2 = r12.containsKey(r1);
        if (r2 == 0) goto L_0x0059;
    L_0x004f:
        r1 = r12.getBoolean(r1);
        r1 = java.lang.Boolean.valueOf(r1);
        r9.ai = r1;
    L_0x0059:
        r1 = "STATE_STREAM_PRIVACY";
        r2 = r12.containsKey(r1);
        if (r2 == 0) goto L_0x006b;
    L_0x0061:
        r1 = r12.getInt(r1, r0);
        r1 = defpackage.awnx.a(r1);
        r9.bn = r1;
    L_0x006b:
        r1 = "STATE_PLACE";
        r2 = r12.containsKey(r1);
        if (r2 == 0) goto L_0x007b;
    L_0x0073:
        r1 = r12.getParcelable(r1);
        r1 = (defpackage.zrb) r1;
        r9.bq = r1;
    L_0x007b:
        r1 = "STATE_ENABLE_AGE_RESTRICTION";
        r2 = r12.containsKey(r1);
        if (r2 == 0) goto L_0x008d;
    L_0x0083:
        r1 = r12.getBoolean(r1);
        r1 = java.lang.Boolean.valueOf(r1);
        r9.aj = r1;
    L_0x008d:
        r1 = "STATE_IS_SCREENCAST";
        r2 = r12.containsKey(r1);
        if (r2 == 0) goto L_0x009f;
    L_0x0095:
        r1 = r12.getBoolean(r1);
        r1 = java.lang.Boolean.valueOf(r1);
        r9.br = r1;
    L_0x009f:
        r1 = "STATE_MONETIZATION_METADATA";
        r1 = r12.containsKey(r1);
        if (r1 == 0) goto L_0x00bc;
    L_0x00a7:
        r1 = "STATE_MONETIZATION_METADATA";
        r1 = r12.getParcelable(r1);
        r1 = (defpackage.ajrb) r1;
        if (r1 != 0) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00bc;
    L_0x00b2:
        r2 = defpackage.asjd.h;
        r1 = r1.a(r2);
        r1 = (defpackage.asjd) r1;
        r9.ak = r1;
    L_0x00bc:
        r1 = "STATE_SCHEDULED_DATE";
        r1 = r12.containsKey(r1);
        if (r1 == 0) goto L_0x00ce;
    L_0x00c4:
        r1 = "STATE_SCHEDULED_DATE";
        r1 = r12.getSerializable(r1);
        r1 = (java.util.Date) r1;
        r9.bm = r1;
    L_0x00ce:
        r1 = "STATE_TITLE_SCREEN_RENDERER";
        r1 = r12.containsKey(r1);
        if (r1 == 0) goto L_0x00eb;
    L_0x00d6:
        r1 = "STATE_TITLE_SCREEN_RENDERER";
        r1 = r12.getParcelable(r1);
        r1 = (defpackage.ajrb) r1;
        if (r1 != 0) goto L_0x00e1;
    L_0x00e0:
        goto L_0x00eb;
    L_0x00e1:
        r2 = defpackage.avac.u;
        r1 = r1.a(r2);
        r1 = (defpackage.avac) r1;
        r9.al = r1;
    L_0x00eb:
        r1 = "STATE_BROADCAST_CREATED_ENDPOINT";
        r2 = r12.containsKey(r1);
        if (r2 == 0) goto L_0x0106;
    L_0x00f3:
        r2 = r12.getParcelable(r1);
        r2 = (defpackage.ajrb) r2;
        if (r2 != 0) goto L_0x00fc;
    L_0x00fb:
        goto L_0x0106;
    L_0x00fc:
        r3 = defpackage.apxu.d;
        r2 = r2.a(r3);
        r2 = (defpackage.apxu) r2;
        r9.bv = r2;
    L_0x0106:
        r2 = "STATE_SCHEDULED_EVENTS_ENDPOINT";
        r2 = r12.containsKey(r2);
        if (r2 == 0) goto L_0x0121;
    L_0x010e:
        r1 = r12.getParcelable(r1);
        r1 = (defpackage.ajrb) r1;
        if (r1 != 0) goto L_0x0117;
    L_0x0116:
        goto L_0x0121;
    L_0x0117:
        r2 = defpackage.apxu.d;
        r1 = r1.a(r2);
        r1 = (defpackage.apxu) r1;
        r9.bw = r1;
    L_0x0121:
        r1 = "STATE_GAME_TITLE";
        r1 = r12.containsKey(r1);
        if (r1 == 0) goto L_0x013e;
    L_0x0129:
        r1 = "STATE_GAME_TITLE";
        r1 = r12.getParcelable(r1);
        r1 = (defpackage.ajrb) r1;
        if (r1 != 0) goto L_0x0134;
    L_0x0133:
        goto L_0x013e;
    L_0x0134:
        r2 = defpackage.arog.e;
        r1 = r1.a(r2);
        r1 = (defpackage.arog) r1;
        r9.an = r1;
    L_0x013e:
        r1 = 2131034761; // 0x7f050289 float:1.7680049E38 double:1.0528710655E-314;
        r10 = r10.inflate(r1, r11, r0);
        r11 = r9.p();
        r11 = defpackage.xly.a(r11);
        r9.a = r11;
        r11 = 2131757182; // 0x7f10087e float:1.9145293E38 double:1.053227989E-314;
        r11 = r10.findViewById(r11);
        r11 = (com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper) r11;
        r9.b = r11;
        r11 = r9.b;
        r0 = new acpd;
        r0.<init>(r9);
        r1 = 2131757183; // 0x7f10087f float:1.9145295E38 double:1.0532279894E-314;
        r11.a(r1, r0);
        r11 = r9.b;
        r0 = new acpg;
        r0.<init>(r9);
        r2 = 2131757206; // 0x7f100896 float:1.9145341E38 double:1.053228001E-314;
        r11.a(r2, r0);
        r11 = r9.b;
        r0 = new acpf;
        r0.<init>(r9);
        r2 = 2131757207; // 0x7f100897 float:1.9145343E38 double:1.0532280013E-314;
        r11.a(r2, r0);
        r11 = r9.b;
        r0 = new acpi;
        r0.<init>(r9);
        r2 = 2131757208; // 0x7f100898 float:1.9145345E38 double:1.0532280017E-314;
        r11.a(r2, r0);
        r11 = r10.findViewById(r1);
        r9.aG = r11;
        r11 = 2131757184; // 0x7f100880 float:1.9145297E38 double:1.05322799E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.ImageButton) r11;
        r9.aH = r11;
        r11 = 2131755517; // 0x7f1001fd float:1.9141916E38 double:1.0532271663E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.view.ViewGroup) r11;
        r9.aN = r11;
        r11 = 2131757187; // 0x7f100883 float:1.9145303E38 double:1.0532279914E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.ImageView) r11;
        r9.aO = r11;
        r11 = 2131757153; // 0x7f100861 float:1.9145234E38 double:1.0532279746E-314;
        r11 = r10.findViewById(r11);
        r11 = (com.google.android.libraries.youtube.livecreation.ui.view.EditTextTitle) r11;
        r9.ab = r11;
        r11 = 2131757190; // 0x7f100886 float:1.9145309E38 double:1.053227993E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.EditText) r11;
        r9.ac = r11;
        r11 = 2131757189; // 0x7f100885 float:1.9145307E38 double:1.0532279924E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.support.design.textfield.TextInputLayout) r11;
        r9.aQ = r11;
        r11 = 2131757191; // 0x7f100887 float:1.914531E38 double:1.0532279933E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.Spinner) r11;
        r9.aR = r11;
        r11 = 2131757193; // 0x7f100889 float:1.9145315E38 double:1.0532279943E-314;
        r11 = r10.findViewById(r11);
        r11 = (com.google.android.libraries.youtube.edit.geo.EditLocation) r11;
        r9.ad = r11;
        r11 = 2131757195; // 0x7f10088b float:1.9145319E38 double:1.0532279953E-314;
        r11 = r10.findViewById(r11);
        r9.aW = r11;
        r11 = 2131757196; // 0x7f10088c float:1.914532E38 double:1.053227996E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.TextView) r11;
        r9.aX = r11;
        r11 = 2131757197; // 0x7f10088d float:1.9145323E38 double:1.0532279963E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.support.v7.widget.SwitchCompat) r11;
        r9.aY = r11;
        r11 = 2131757202; // 0x7f100892 float:1.9145333E38 double:1.053227999E-314;
        r11 = r10.findViewById(r11);
        r9.aZ = r11;
        r11 = 2131757203; // 0x7f100893 float:1.9145335E38 double:1.0532279993E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.TextView) r11;
        r9.ba = r11;
        r11 = 2131757194; // 0x7f10088a float:1.9145317E38 double:1.053227995E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.view.ViewGroup) r11;
        r9.aS = r11;
        r11 = 2131757198; // 0x7f10088e float:1.9145325E38 double:1.053227997E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.view.ViewGroup) r11;
        r9.aT = r11;
        r11 = 2131757199; // 0x7f10088f float:1.9145327E38 double:1.0532279973E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.TextView) r11;
        r9.aU = r11;
        r11 = 2131757200; // 0x7f100890 float:1.914533E38 double:1.053227998E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.TextView) r11;
        r9.aV = r11;
        r11 = 2131757204; // 0x7f100894 float:1.9145337E38 double:1.053228E-314;
        r11 = r10.findViewById(r11);
        r9.bb = r11;
        r11 = 2131757205; // 0x7f100895 float:1.914534E38 double:1.0532280003E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.TextView) r11;
        r9.bc = r11;
        r11 = 2131757064; // 0x7f100808 float:1.9145053E38 double:1.0532279306E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.Button) r11;
        r9.bg = r11;
        r11 = 2131757209; // 0x7f100899 float:1.9145347E38 double:1.053228002E-314;
        r11 = r10.findViewById(r11);
        r11 = (com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView) r11;
        r9.ag = r11;
        r11 = 2131757192; // 0x7f100888 float:1.9145313E38 double:1.053227994E-314;
        r11 = r10.findViewById(r11);
        r11 = (com.google.android.libraries.youtube.livecreation.ui.LiveCreationSettingView) r11;
        r9.af = r11;
        r11 = 2131757201; // 0x7f100891 float:1.9145331E38 double:1.0532279983E-314;
        r11 = r10.findViewById(r11);
        r11 = (com.google.android.libraries.youtube.edit.geo.EditLocation) r11;
        r9.ae = r11;
        r10.setOnClickListener(r9);
        r11 = r9.aG;
        r11.setOnClickListener(r9);
        r11 = r9.aH;
        r11.setOnClickListener(r9);
        r11 = r9.bg;
        r11.setOnClickListener(r9);
        r11 = r9.af;
        r0 = new acpn;
        r0.<init>(r9);
        r11.a = r0;
        r11 = r9.ag;
        r0 = new acpq;
        r0.<init>(r9);
        r11.b(r0);
        r11 = r9.ab;
        r11.addTextChangedListener(r9);
        r11 = defpackage.atst.q;
        r11 = r11.createBuilder();
        r11 = (defpackage.atss) r11;
        r0 = r9.p();
        r0 = r0.getIntent();
        r2 = 0;
        if (r0 == 0) goto L_0x0367;
    L_0x02c8:
        r3 = r9.bh;
        if (r3 == 0) goto L_0x02ce;
    L_0x02cc:
        goto L_0x0367;
    L_0x02ce:
        r3 = defpackage.atsp.d;
        r3 = r3.createBuilder();
        r3 = (defpackage.atso) r3;
        r4 = 1;
        r9.bh = r4;
        r5 = defpackage.acjm.b(r0);
        if (r5 == 0) goto L_0x02fe;
    L_0x02df:
        r5 = r5.getPath();
        if (r5 != 0) goto L_0x02e6;
    L_0x02e5:
        goto L_0x02fe;
    L_0x02e6:
        r6 = r5.length();
        if (r6 <= r4) goto L_0x02f9;
    L_0x02ec:
        r6 = "/";
        r6 = r5.startsWith(r6);
        if (r6 == 0) goto L_0x02f9;
    L_0x02f4:
        r5 = r5.substring(r4);
        goto L_0x02e6;
    L_0x02f9:
        r5 = r5.trim();
        goto L_0x02ff;
    L_0x02fe:
        r5 = r2;
    L_0x02ff:
        if (r5 != 0) goto L_0x0302;
    L_0x0301:
        goto L_0x0311;
    L_0x0302:
        r3.copyOnWrite();
        r6 = r3.instance;
        r6 = (defpackage.atsp) r6;
        r7 = r6.a;
        r7 = r7 | 2;
        r6.a = r7;
        r6.c = r5;
    L_0x0311:
        r6 = r0.getAction();
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 != 0) goto L_0x0336;
    L_0x031b:
        r6 = r0.getAction();
        r3.copyOnWrite();
        r7 = r3.instance;
        r7 = (defpackage.atsp) r7;
        if (r6 == 0) goto L_0x0330;
    L_0x0328:
        r8 = r7.a;
        r4 = r4 | r8;
        r7.a = r4;
        r7.b = r6;
        goto L_0x0336;
    L_0x0330:
        r10 = new java.lang.NullPointerException;
        r10.<init>();
        throw r10;
    L_0x0336:
        r11.copyOnWrite();
        r4 = r11.instance;
        r4 = (defpackage.atst) r4;
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.atsp) r3;
        r4.i = r3;
        r3 = r4.a;
        r3 = r3 | 2048;
        r4.a = r3;
        r0 = r0.getAction();
        r0 = defpackage.xvd.f(r0);
        r3 = defpackage.xvd.f(r5);
        r0 = java.lang.String.valueOf(r0);
        r0.length();
        r0 = java.lang.String.valueOf(r3);
        r0.length();
    L_0x0367:
        r0 = r9.aB;
        r3 = defpackage.acwl.O;
        r11 = r11.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.atst) r11;
        r0.a(r3, r2, r11);
        r11 = r9.al;
        if (r11 == 0) goto L_0x038f;
    L_0x037a:
        r11 = r11.toBuilder();
        r11 = (defpackage.anxo) r11;
        r11 = (defpackage.avaf) r11;
        r9.a(r10, r11);
        r11 = r11.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.avac) r11;
        r9.al = r11;
    L_0x038f:
        if (r12 == 0) goto L_0x039b;
    L_0x0391:
        r11 = -1;
        r0 = "STATE_DISPLAYED_VIEW_ID";
        r12 = r12.getInt(r0, r11);
        if (r12 == r11) goto L_0x039b;
    L_0x039a:
        r1 = r12;
    L_0x039b:
        r11 = r9.b;
        r11.a(r1);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acpe.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x06fa  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0756  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x083b  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x079a  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0842  */
    /* JADX WARNING: Removed duplicated region for block: B:398:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0860  */
    /* JADX WARNING: Missing block: B:208:0x0538, code skipped:
            if (r10 != 0) goto L_0x053c;
     */
    public final void a(android.view.View r21, defpackage.avaf r22) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        defpackage.amqw.a(r21);
        defpackage.amqw.a(r22);
        r3 = r20.p();
        r3 = r3.getIntent();
        r4 = 2130839001; // 0x7f0205d9 float:1.7283E38 double:1.052774347E-314;
        r5 = 1;
        if (r3 == 0) goto L_0x002d;
    L_0x001a:
        r6 = "INTENT_EXTRA_REFERRER_NAME";
        r3 = r3.getStringExtra(r6);
        r6 = "REFERRER_NAME_GALLERY_FRAGMENT";
        r3 = r6.equals(r3);
        if (r3 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x002d;
    L_0x0029:
        r4 = 2130838933; // 0x7f020595 float:1.7282862E38 double:1.0527743136E-314;
        goto L_0x0073;
    L_0x002d:
        r3 = r22.g();
        r3 = r3.a;
        r3 = r3 & r5;
        if (r3 != 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0073;
    L_0x0037:
        r3 = r22.g();
        r3 = r3.b;
        if (r3 != 0) goto L_0x0041;
    L_0x003f:
        r3 = defpackage.aphg.s;
    L_0x0041:
        r6 = r3.a;
        r6 = r6 & 16;
        if (r6 == 0) goto L_0x0073;
    L_0x0047:
        r6 = r0.as;
        r7 = r3.e;
        if (r7 != 0) goto L_0x004f;
    L_0x004d:
        r7 = defpackage.arwf.c;
    L_0x004f:
        r7 = r7.b;
        r7 = defpackage.arwh.a(r7);
        if (r7 != 0) goto L_0x0059;
    L_0x0057:
        r7 = defpackage.arwh.UNKNOWN;
    L_0x0059:
        r6 = r6.a(r7);
        if (r6 == 0) goto L_0x0060;
    L_0x005f:
        r4 = r6;
    L_0x0060:
        r6 = r3.a;
        r6 = r6 & 16384;
        if (r6 == 0) goto L_0x0073;
    L_0x0066:
        r6 = r0.aH;
        r3 = r3.p;
        if (r3 != 0) goto L_0x006e;
    L_0x006c:
        r3 = defpackage.aodv.c;
    L_0x006e:
        r3 = r3.b;
        r6.setContentDescription(r3);
    L_0x0073:
        r3 = r0.aH;
        r6 = r20.M_();
        r4 = defpackage.ra.a(r6, r4);
        r3.setImageDrawable(r4);
        r3 = r22.a();
        r4 = com.google.protos.youtube.api.innertube.InputTextRendererOuterClass.inputTextRenderer;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r3 = r3.h;
        r4 = r4.d;
        r3 = r3.a(r4);
        r4 = 8;
        r6 = 0;
        if (r3 == 0) goto L_0x013c;
    L_0x009a:
        r3 = r22.a();
        r7 = com.google.protos.youtube.api.innertube.InputTextRendererOuterClass.inputTextRenderer;
        r7 = defpackage.anxl.checkIsLite(r7);
        r3.a(r7);
        r3 = r3.h;
        r8 = r7.d;
        r3 = r3.b(r8);
        if (r3 != 0) goto L_0x00b4;
    L_0x00b1:
        r3 = r7.b;
        goto L_0x00b8;
    L_0x00b4:
        r3 = r7.a(r3);
    L_0x00b8:
        r3 = (defpackage.atre) r3;
        r7 = r3.e;
        if (r7 != 0) goto L_0x00c0;
    L_0x00be:
        r7 = defpackage.aodx.c;
    L_0x00c0:
        r7 = r7.a;
        r7 = r7 & r5;
        if (r7 == 0) goto L_0x00d8;
    L_0x00c5:
        r7 = r0.aQ;
        r8 = r3.e;
        if (r8 != 0) goto L_0x00cd;
    L_0x00cb:
        r8 = defpackage.aodx.c;
    L_0x00cd:
        r8 = r8.b;
        if (r8 != 0) goto L_0x00d3;
    L_0x00d1:
        r8 = defpackage.aodv.c;
    L_0x00d3:
        r8 = r8.b;
        r7.setContentDescription(r8);
    L_0x00d8:
        r7 = r3.a;
        r7 = r7 & r4;
        if (r7 != 0) goto L_0x00de;
    L_0x00dd:
        goto L_0x00ed;
    L_0x00de:
        r7 = r0.aQ;
        r8 = r3.d;
        if (r8 != 0) goto L_0x00e6;
    L_0x00e4:
        r8 = defpackage.arml.f;
    L_0x00e6:
        r8 = defpackage.ajqy.a(r8);
        r7.a(r8);
    L_0x00ed:
        r7 = r3.f;
        if (r7 == 0) goto L_0x00ff;
    L_0x00f1:
        r8 = r0.ac;
        r9 = new android.text.InputFilter[r5];
        r10 = new android.text.InputFilter$LengthFilter;
        r10.<init>(r7);
        r9[r6] = r10;
        r8.setFilters(r9);
    L_0x00ff:
        r7 = r0.bl;
        if (r7 == 0) goto L_0x0109;
    L_0x0103:
        r3 = r0.ac;
        r3.setText(r7);
        goto L_0x0132;
    L_0x0109:
        r7 = r3.a;
        r8 = r7 & 2;
        if (r8 == 0) goto L_0x011f;
    L_0x010f:
        r7 = r0.ac;
        r3 = r3.b;
        if (r3 != 0) goto L_0x0117;
    L_0x0115:
        r3 = defpackage.arml.f;
    L_0x0117:
        r3 = defpackage.ajqy.a(r3);
        r7.setText(r3);
        goto L_0x0132;
    L_0x011f:
        r7 = r7 & 4;
        if (r7 == 0) goto L_0x0132;
    L_0x0123:
        r7 = r0.ac;
        r3 = r3.c;
        if (r3 != 0) goto L_0x012b;
    L_0x0129:
        r3 = defpackage.arml.f;
    L_0x012b:
        r3 = defpackage.ajqy.a(r3);
        r7.setText(r3);
    L_0x0132:
        r3 = r0.ac;
        r7 = new acph;
        r7.<init>(r0);
        r3.setOnFocusChangeListener(r7);
    L_0x013c:
        r3 = r22.b();
        r3 = r3.a;
        r3 = r3 & r5;
        if (r3 != 0) goto L_0x0146;
    L_0x0145:
        goto L_0x016e;
    L_0x0146:
        r3 = new acrb;
        r7 = r20.p();
        r8 = r0.as;
        r9 = r22.b();
        r9 = r9.b;
        if (r9 != 0) goto L_0x0158;
    L_0x0156:
        r9 = defpackage.atqy.e;
    L_0x0158:
        r3.<init>(r7, r8, r9);
        r0.bf = r3;
        r3 = r0.aR;
        r7 = r0.bf;
        r3.setAdapter(r7);
        r3 = r0.aR;
        r3.setOnItemSelectedListener(r0);
        r3 = r0.aR;
        r3.setVisibility(r6);
    L_0x016e:
        r0.bu = r6;
        r3 = r2.instance;
        r3 = (defpackage.avac) r3;
        r7 = r3.a;
        r7 = r7 & 8192;
        if (r7 == 0) goto L_0x01c8;
    L_0x017a:
        r0.bu = r5;
        r3 = r3.o;
        if (r3 == 0) goto L_0x0181;
    L_0x0180:
        goto L_0x0183;
    L_0x0181:
        r3 = defpackage.axak.a;
    L_0x0183:
        r7 = com.google.protos.youtube.api.innertube.LocationEditRendererOuterClass.locationEditRenderer;
        r7 = defpackage.anxl.checkIsLite(r7);
        r3.a(r7);
        r3 = r3.h;
        r8 = r7.d;
        r3 = r3.b(r8);
        if (r3 != 0) goto L_0x0199;
    L_0x0196:
        r3 = r7.b;
        goto L_0x019d;
    L_0x0199:
        r3 = r7.a(r3);
    L_0x019d:
        r3 = (defpackage.auka) r3;
        r7 = r0.ad;
        r7.setVisibility(r6);
        r7 = r0.ad;
        r7.a(r0);
        r7 = r0.ad;
        r7.a(r3);
        r7 = r0.ae;
        r7.a(r0);
        r7 = r0.ae;
        r7.a(r3);
        r3 = r0.bq;
        if (r3 == 0) goto L_0x01c8;
    L_0x01bc:
        r7 = r0.ad;
        r7.a(r3);
        r3 = r0.ae;
        r7 = r0.bq;
        r3.a(r7);
    L_0x01c8:
        r3 = r2.instance;
        r3 = (defpackage.avac) r3;
        r7 = r3.a;
        r8 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r7 = r7 & r8;
        if (r7 == 0) goto L_0x0224;
    L_0x01d3:
        r3 = r3.t;
        if (r3 == 0) goto L_0x01d8;
    L_0x01d7:
        goto L_0x01da;
    L_0x01d8:
        r3 = defpackage.axak.a;
    L_0x01da:
        r7 = com.google.protos.youtube.api.innertube.InputGameTitleRendererOuterClass.inputGameTitleRenderer;
        r7 = defpackage.anxl.checkIsLite(r7);
        r3.a(r7);
        r3 = r3.h;
        r9 = r7.d;
        r3 = r3.b(r9);
        if (r3 != 0) goto L_0x01f0;
    L_0x01ed:
        r3 = r7.b;
        goto L_0x01f4;
    L_0x01f0:
        r3 = r7.a(r3);
    L_0x01f4:
        r3 = (defpackage.atqx) r3;
        r7 = r3.a;
        r9 = r7 & 2;
        if (r9 != 0) goto L_0x01fd;
    L_0x01fc:
        goto L_0x0224;
    L_0x01fd:
        r7 = r7 & 4;
        if (r7 == 0) goto L_0x0224;
    L_0x0201:
        r7 = r0.af;
        r9 = r3.c;
        r7.a(r9);
        r7 = defpackage.arog.e;
        r7 = r7.createBuilder();
        r7 = (defpackage.aroj) r7;
        r9 = r3.c;
        r7.a(r9);
        r3 = r3.d;
        r7.b(r3);
        r3 = r7.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.arog) r3;
        r0.an = r3;
    L_0x0224:
        r3 = r22.h();
        r7 = com.google.protos.youtube.api.innertube.MobileBroadcastSetupMoreOptionsRendererOuterClass.mobileBroadcastSetupMoreOptionsRenderer;
        r7 = defpackage.anxl.checkIsLite(r7);
        r3.a(r7);
        r3 = r3.h;
        r7 = r7.d;
        r3 = r3.a(r7);
        r7 = 2;
        r9 = 0;
        if (r3 == 0) goto L_0x04f6;
    L_0x023d:
        r3 = r22.h();
        r10 = com.google.protos.youtube.api.innertube.MobileBroadcastSetupMoreOptionsRendererOuterClass.mobileBroadcastSetupMoreOptionsRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r3.a(r10);
        r3 = r3.h;
        r11 = r10.d;
        r3 = r3.b(r11);
        if (r3 != 0) goto L_0x0257;
    L_0x0254:
        r3 = r10.b;
        goto L_0x025b;
    L_0x0257:
        r3 = r10.a(r3);
    L_0x025b:
        r3 = (defpackage.auzb) r3;
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r3 = (defpackage.auzd) r3;
        r10 = r3.a();
        r11 = com.google.protos.youtube.api.innertube.InputBooleanRendererOuterClass.inputBooleanRenderer;
        r11 = defpackage.anxl.checkIsLite(r11);
        r10.a(r11);
        r10 = r10.h;
        r11 = r11.d;
        r10 = r10.a(r11);
        if (r10 == 0) goto L_0x02ed;
    L_0x027c:
        r10 = r3.a();
        r11 = com.google.protos.youtube.api.innertube.InputBooleanRendererOuterClass.inputBooleanRenderer;
        r11 = defpackage.anxl.checkIsLite(r11);
        r10.a(r11);
        r10 = r10.h;
        r12 = r11.d;
        r10 = r10.b(r12);
        if (r10 != 0) goto L_0x0296;
    L_0x0293:
        r10 = r11.b;
        goto L_0x029a;
    L_0x0296:
        r10 = r11.a(r10);
    L_0x029a:
        r10 = (defpackage.atqt) r10;
        r11 = r0.bo;
        if (r11 == 0) goto L_0x02a1;
    L_0x02a0:
        goto L_0x02c5;
    L_0x02a1:
        r11 = r10.f;
        if (r11 != 0) goto L_0x02c5;
    L_0x02a5:
        r11 = r0.bm;
        if (r11 != 0) goto L_0x02c5;
    L_0x02a9:
        r11 = r0.bc;
        r12 = r10.c;
        if (r12 != 0) goto L_0x02b1;
    L_0x02af:
        r12 = defpackage.arml.f;
    L_0x02b1:
        r12 = defpackage.ajqy.a(r12);
        r11.setText(r12);
        r11 = r0.aS;
        r11.setVisibility(r4);
        r0.bo = r6;
        r11 = r0.aQ;
        r11.setVisibility(r4);
        goto L_0x02de;
    L_0x02c5:
        r4 = r0.bc;
        r11 = r10.b;
        if (r11 != 0) goto L_0x02cd;
    L_0x02cb:
        r11 = defpackage.arml.f;
    L_0x02cd:
        r11 = defpackage.ajqy.a(r11);
        r4.setText(r11);
        r4 = r0.aS;
        r4.setVisibility(r6);
        r4 = r0.aQ;
        r4.setVisibility(r6);
    L_0x02de:
        r4 = r0.bb;
        r4.setTag(r10);
        r4 = r0.bb;
        r4.setOnClickListener(r0);
        r4 = r0.bb;
        r4.setVisibility(r6);
    L_0x02ed:
        r4 = r3.b();
        r10 = com.google.protos.youtube.api.innertube.InputBooleanRendererOuterClass.inputBooleanRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r4.a(r10);
        r4 = r4.h;
        r10 = r10.d;
        r4 = r4.a(r10);
        if (r4 == 0) goto L_0x041c;
    L_0x0304:
        r4 = r3.b();
        r10 = com.google.protos.youtube.api.innertube.InputBooleanRendererOuterClass.inputBooleanRenderer;
        r10 = defpackage.anxl.checkIsLite(r10);
        r4.a(r10);
        r4 = r4.h;
        r11 = r10.d;
        r4 = r4.b(r11);
        if (r4 != 0) goto L_0x031e;
    L_0x031b:
        r4 = r10.b;
        goto L_0x0322;
    L_0x031e:
        r4 = r10.a(r4);
    L_0x0322:
        r4 = (defpackage.atqt) r4;
        r4 = r4.toBuilder();
        r4 = (defpackage.anxo) r4;
        r4 = (defpackage.atqu) r4;
        r10 = r0.bm;
        if (r10 == 0) goto L_0x0348;
    L_0x0330:
        r11 = aE;
        r10 = r10.equals(r11);
        if (r10 == 0) goto L_0x0339;
    L_0x0338:
        goto L_0x0348;
    L_0x0339:
        r4.copyOnWrite();
        r10 = r4.instance;
        r10 = (defpackage.atqt) r10;
        r11 = r10.a;
        r11 = r11 | 32;
        r10.a = r11;
        r10.f = r5;
    L_0x0348:
        r10 = new acqz;
        r13 = r20.p();
        r14 = r0.as;
        r15 = r0.ap;
        r11 = r0.aW;
        r12 = r0.aX;
        r8 = r0.aY;
        r16 = r4.build();
        r16 = (defpackage.anxl) r16;
        r19 = r16;
        r19 = (defpackage.atqt) r19;
        r17 = r12;
        r12 = r10;
        r16 = r11;
        r18 = r8;
        r12.<init>(r13, r14, r15, r16, r17, r18, r19);
        r0.bd = r10;
        r8 = defpackage.axak.a;
        r8 = r8.createBuilder();
        r8 = (defpackage.axaj) r8;
        r10 = com.google.protos.youtube.api.innertube.InputBooleanRendererOuterClass.inputBooleanRenderer;
        r4 = r4.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.atqt) r4;
        r8.a(r10, r4);
        r3.copyOnWrite();
        r4 = r3.instance;
        r4 = (defpackage.auzb) r4;
        r8 = r8.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.axak) r8;
        r4.c = r8;
        r8 = r4.a;
        r8 = r8 | r7;
        r4.a = r8;
        r4 = r0.aW;
        r4.setVisibility(r6);
        r4 = r3.c();
        r8 = com.google.protos.youtube.api.innertube.InputDateTimeRendererOuterClass.inputDateTimeRenderer;
        r8 = defpackage.anxl.checkIsLite(r8);
        r4.a(r8);
        r4 = r4.h;
        r8 = r8.d;
        r4 = r4.a(r8);
        if (r4 == 0) goto L_0x041c;
    L_0x03b5:
        r4 = r3.c();
        r8 = com.google.protos.youtube.api.innertube.InputDateTimeRendererOuterClass.inputDateTimeRenderer;
        r8 = defpackage.anxl.checkIsLite(r8);
        r4.a(r8);
        r4 = r4.h;
        r10 = r8.d;
        r4 = r4.b(r10);
        if (r4 != 0) goto L_0x03cf;
    L_0x03cc:
        r4 = r8.b;
        goto L_0x03d3;
    L_0x03cf:
        r4 = r8.a(r4);
    L_0x03d3:
        r11 = r4;
        r11 = (defpackage.atqw) r11;
        r4 = new acrc;
        r12 = r0.aT;
        r13 = r0.aU;
        r14 = r0.aV;
        r15 = r20.p();
        r8 = r20.p();
        r16 = r8.f();
        r10 = r4;
        r10.<init>(r11, r12, r13, r14, r15, r16);
        r0.be = r4;
        r4 = r0.bm;
        if (r4 == 0) goto L_0x040a;
    L_0x03f4:
        r8 = aE;
        r4 = r4.equals(r8);
        if (r4 != 0) goto L_0x040a;
    L_0x03fc:
        r4 = java.util.Calendar.getInstance();
        r8 = r0.bm;
        r4.setTime(r8);
        r8 = r0.be;
        r8.a(r4);
    L_0x040a:
        r4 = r0.bd;
        r4 = r4.a();
        if (r4 == 0) goto L_0x0417;
    L_0x0412:
        r4 = r0.be;
        r4.a();
    L_0x0417:
        r4 = r0.bd;
        r4.a(r0);
    L_0x041c:
        r4 = r3.d();
        r8 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r8 = defpackage.anxl.checkIsLite(r8);
        r4.a(r8);
        r4 = r4.h;
        r8 = r8.d;
        r4 = r4.a(r8);
        if (r4 == 0) goto L_0x04c6;
    L_0x0433:
        r4 = r3.d();
        r8 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r8 = defpackage.anxl.checkIsLite(r8);
        r4.a(r8);
        r4 = r4.h;
        r10 = r8.d;
        r4 = r4.b(r10);
        if (r4 != 0) goto L_0x044d;
    L_0x044a:
        r4 = r8.b;
        goto L_0x0451;
    L_0x044d:
        r4 = r8.a(r4);
    L_0x0451:
        r4 = (defpackage.aphg) r4;
        r8 = r4.a;
        r8 = r8 & 128;
        if (r8 != 0) goto L_0x045a;
    L_0x0459:
        goto L_0x0469;
    L_0x045a:
        r8 = r0.ba;
        r10 = r4.g;
        if (r10 != 0) goto L_0x0462;
    L_0x0460:
        r10 = defpackage.arml.f;
    L_0x0462:
        r10 = defpackage.ajqy.a(r10);
        r8.setText(r10);
    L_0x0469:
        r8 = r4.a;
        r8 = r8 & 16;
        if (r8 == 0) goto L_0x0486;
    L_0x046f:
        r8 = r0.as;
        r10 = r4.e;
        if (r10 != 0) goto L_0x0477;
    L_0x0475:
        r10 = defpackage.arwf.c;
    L_0x0477:
        r10 = r10.b;
        r10 = defpackage.arwh.a(r10);
        if (r10 != 0) goto L_0x0481;
    L_0x047f:
        r10 = defpackage.arwh.UNKNOWN;
    L_0x0481:
        r8 = r8.a(r10);
        goto L_0x0487;
    L_0x0486:
        r8 = 0;
    L_0x0487:
        if (r8 == 0) goto L_0x0496;
    L_0x0489:
        r10 = r0.ba;
        r11 = r20.p();
        r8 = defpackage.ra.a(r11, r8);
        r10.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r9, r9, r9);
    L_0x0496:
        r8 = r4.a;
        r8 = r8 & 2048;
        if (r8 == 0) goto L_0x04bc;
    L_0x049c:
        r8 = r4.l;
        if (r8 != 0) goto L_0x04a2;
    L_0x04a0:
        r8 = defpackage.apxu.d;
    L_0x04a2:
        r8 = r8.a;
        r8 = r8 & r5;
        if (r8 != 0) goto L_0x04a9;
    L_0x04a7:
        r4 = r9;
        goto L_0x04b5;
    L_0x04a9:
        r4 = r4.l;
        if (r4 != 0) goto L_0x04af;
    L_0x04ad:
        r4 = defpackage.apxu.d;
    L_0x04af:
        r4 = r4.b;
        r4 = r4.d();
    L_0x04b5:
        r0.aI = r4;
        r4 = r0.aI;
        r0.a(r4);
    L_0x04bc:
        r4 = r0.aZ;
        r4.setOnClickListener(r0);
        r4 = r0.aZ;
        r4.setVisibility(r6);
    L_0x04c6:
        r4 = r22.h();
        r4 = r4.toBuilder();
        r4 = (defpackage.anxo) r4;
        r4 = (defpackage.axaj) r4;
        r8 = com.google.protos.youtube.api.innertube.MobileBroadcastSetupMoreOptionsRendererOuterClass.mobileBroadcastSetupMoreOptionsRenderer;
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.auzb) r3;
        r4.a(r8, r3);
        r22.copyOnWrite();
        r3 = r2.instance;
        r3 = (defpackage.avac) r3;
        r4 = r4.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.axak) r4;
        r3.n = r4;
        r4 = r3.a;
        r4 = r4 | 4096;
        r3.a = r4;
    L_0x04f6:
        r3 = r22.c();
        r3 = r3.a;
        r3 = r3 & r5;
        if (r3 != 0) goto L_0x0501;
    L_0x04ff:
        goto L_0x057f;
    L_0x0501:
        r3 = r22.c();
        r3 = r3.b;
        if (r3 != 0) goto L_0x050b;
    L_0x0509:
        r3 = defpackage.aphg.s;
    L_0x050b:
        r4 = r0.bg;
        r8 = r3.a;
        r8 = r8 & 128;
        if (r8 == 0) goto L_0x051a;
    L_0x0513:
        r8 = r3.g;
        if (r8 != 0) goto L_0x051b;
    L_0x0517:
        r8 = defpackage.arml.f;
        goto L_0x051b;
    L_0x051a:
        r8 = r9;
    L_0x051b:
        r8 = defpackage.ajqy.a(r8);
        r4.setText(r8);
        r4 = r20.M_();
        r8 = r0.bg;
        r10 = r3.b;
        if (r10 != r5) goto L_0x053b;
    L_0x052c:
        r10 = r3.c;
        r10 = (java.lang.Integer) r10;
        r10 = r10.intValue();
        r10 = defpackage.aphh.a(r10);
        if (r10 == 0) goto L_0x053b;
    L_0x053a:
        goto L_0x053c;
    L_0x053b:
        r10 = 1;
    L_0x053c:
        defpackage.acra.a(r4, r8, r10);
        r4 = r0.aB;
        r8 = r3.a;
        r10 = 262144; // 0x40000 float:3.67342E-40 double:1.295163E-318;
        r8 = r8 & r10;
        if (r8 == 0) goto L_0x054f;
    L_0x0548:
        r8 = r3.r;
        r8 = r8.d();
        goto L_0x0550;
    L_0x054f:
        r8 = r9;
    L_0x0550:
        r4.a(r8);
        r4 = r0.aB;
        r8 = r3.a;
        r8 = r8 & r10;
        if (r8 == 0) goto L_0x0561;
    L_0x055a:
        r8 = r3.r;
        r8 = r8.d();
        goto L_0x0562;
    L_0x0561:
        r8 = r9;
    L_0x0562:
        r4.a(r8, r9);
        r4 = r3.a;
        r4 = r4 & 2048;
        if (r4 == 0) goto L_0x0572;
    L_0x056b:
        r3 = r3.l;
        if (r3 != 0) goto L_0x0578;
    L_0x056f:
        r3 = defpackage.apxu.d;
        goto L_0x0578;
    L_0x0572:
        r3 = r3.m;
        if (r3 != 0) goto L_0x0578;
    L_0x0576:
        r3 = defpackage.apxu.d;
    L_0x0578:
        if (r3 == 0) goto L_0x057f;
    L_0x057a:
        r4 = r0.bg;
        r4.setTag(r3);
    L_0x057f:
        r3 = r22.j();
        r4 = com.google.protos.youtube.api.innertube.AccountsListRenderer.activeAccountHeaderRenderer;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r3 = r3.h;
        r4 = r4.d;
        r3 = r3.a(r4);
        if (r3 == 0) goto L_0x0624;
    L_0x0596:
        r3 = r22.j();
        r4 = com.google.protos.youtube.api.innertube.AccountsListRenderer.activeAccountHeaderRenderer;
        r4 = defpackage.anxl.checkIsLite(r4);
        r3.a(r4);
        r3 = r3.h;
        r8 = r4.d;
        r3 = r3.b(r8);
        if (r3 != 0) goto L_0x05b0;
    L_0x05ad:
        r3 = r4.b;
        goto L_0x05b4;
    L_0x05b0:
        r3 = r4.a(r3);
    L_0x05b4:
        r3 = (defpackage.aofj) r3;
        r4 = r3.d;
        if (r4 != 0) goto L_0x05bc;
    L_0x05ba:
        r4 = defpackage.aygk.f;
    L_0x05bc:
        r8 = r3.a;
        r8 = r8 & 128;
        if (r8 == 0) goto L_0x05c9;
    L_0x05c2:
        r8 = r3.i;
        if (r8 != 0) goto L_0x05ca;
    L_0x05c6:
        r8 = defpackage.apxu.d;
        goto L_0x05ca;
    L_0x05c9:
        r8 = r9;
    L_0x05ca:
        r0.aP = r8;
        r8 = r0.aP;
        if (r8 == 0) goto L_0x05d5;
    L_0x05d0:
        r8 = r0.aO;
        r8.setOnClickListener(r0);
    L_0x05d5:
        r8 = r3.a;
        r8 = r8 & r5;
        if (r8 == 0) goto L_0x05e1;
    L_0x05da:
        r8 = r3.b;
        if (r8 != 0) goto L_0x05e2;
    L_0x05de:
        r8 = defpackage.arml.f;
        goto L_0x05e2;
    L_0x05e1:
        r8 = r9;
    L_0x05e2:
        r8 = defpackage.ajqy.a(r8);
        r10 = r3.a;
        r10 = r10 & r7;
        if (r10 == 0) goto L_0x05f2;
    L_0x05eb:
        r3 = r3.c;
        if (r3 != 0) goto L_0x05f3;
    L_0x05ef:
        r3 = defpackage.arml.f;
        goto L_0x05f3;
    L_0x05f2:
        r3 = r9;
    L_0x05f3:
        r3 = defpackage.ajqy.a(r3);
        r10 = new java.lang.CharSequence[r7];
        r11 = "";
        if (r8 != 0) goto L_0x05fe;
    L_0x05fd:
        r8 = r11;
    L_0x05fe:
        r10[r6] = r8;
        if (r3 != 0) goto L_0x0603;
    L_0x0602:
        r3 = r11;
    L_0x0603:
        r10[r5] = r3;
        r3 = java.util.Arrays.asList(r10);
        r8 = " ";
        r3 = android.text.TextUtils.join(r8, r3);
        r8 = r0.aO;
        r10 = r20.M_();
        r11 = new java.lang.Object[r5];
        r11[r6] = r3;
        r3 = 2131951828; // 0x7f1300d4 float:1.9540082E38 double:1.053324157E-314;
        r3 = r10.getString(r3, r11);
        r8.setContentDescription(r3);
        goto L_0x064a;
    L_0x0624:
        r3 = r2.instance;
        r3 = (defpackage.avac) r3;
        r3 = r3.b;
        if (r3 != 0) goto L_0x062e;
    L_0x062c:
        r3 = defpackage.aygk.f;
    L_0x062e:
        r4 = r3;
        r3 = r0.ar;
        r3 = r3.d();
        if (r3 == 0) goto L_0x064a;
    L_0x0637:
        r3 = r0.ar;
        r3 = r3.d();
        r3 = r3.d;
        r8 = android.text.TextUtils.isEmpty(r3);
        if (r8 != 0) goto L_0x064a;
    L_0x0645:
        r8 = r0.aO;
        r8.setContentDescription(r3);
    L_0x064a:
        r3 = defpackage.aklb.a(r4);
        if (r3 == 0) goto L_0x0666;
    L_0x0650:
        r3 = defpackage.akko.h();
        r8 = 2130839196; // 0x7f02069c float:1.7283396E38 double:1.0527744436E-314;
        r3 = r3.a(r8);
        r3 = r3.a();
        r8 = r0.aq;
        r10 = r0.aO;
        r8.a(r10, r4, r3);
    L_0x0666:
        r3 = r2.instance;
        r3 = (defpackage.avac) r3;
        r4 = r3.a;
        r4 = r4 & r7;
        if (r4 == 0) goto L_0x06f0;
    L_0x066f:
        r3 = r3.c;
        if (r3 != 0) goto L_0x0675;
    L_0x0673:
        r3 = defpackage.avaa.c;
    L_0x0675:
        r3 = r3.b;
        if (r3 != 0) goto L_0x067b;
    L_0x0679:
        r3 = defpackage.atre.g;
    L_0x067b:
        r4 = r0.ab;
        r8 = r3.d;
        if (r8 != 0) goto L_0x0683;
    L_0x0681:
        r8 = defpackage.arml.f;
    L_0x0683:
        r8 = defpackage.ajqy.a(r8);
        r4.setHint(r8);
        r4 = r3.e;
        if (r4 != 0) goto L_0x0690;
    L_0x068e:
        r4 = defpackage.aodx.c;
    L_0x0690:
        r4 = r4.a;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x06a8;
    L_0x0695:
        r4 = r0.ab;
        r8 = r3.e;
        if (r8 != 0) goto L_0x069d;
    L_0x069b:
        r8 = defpackage.aodx.c;
    L_0x069d:
        r8 = r8.b;
        if (r8 != 0) goto L_0x06a3;
    L_0x06a1:
        r8 = defpackage.aodv.c;
    L_0x06a3:
        r8 = r8.b;
        r4.setContentDescription(r8);
    L_0x06a8:
        r4 = r0.bk;
        if (r4 == 0) goto L_0x06b2;
    L_0x06ac:
        r3 = r0.ab;
        r3.setText(r4);
        goto L_0x06db;
    L_0x06b2:
        r4 = r3.a;
        r8 = r4 & 2;
        if (r8 == 0) goto L_0x06c8;
    L_0x06b8:
        r4 = r0.ab;
        r3 = r3.b;
        if (r3 != 0) goto L_0x06c0;
    L_0x06be:
        r3 = defpackage.arml.f;
    L_0x06c0:
        r3 = defpackage.ajqy.a(r3);
        r4.setText(r3);
        goto L_0x06db;
    L_0x06c8:
        r4 = r4 & 4;
        if (r4 == 0) goto L_0x06db;
    L_0x06cc:
        r4 = r0.ab;
        r3 = r3.c;
        if (r3 != 0) goto L_0x06d4;
    L_0x06d2:
        r3 = defpackage.arml.f;
    L_0x06d4:
        r3 = defpackage.ajqy.a(r3);
        r4.setText(r3);
    L_0x06db:
        r3 = r0.bg;
        r4 = r0.ab;
        r4 = r4.getText();
        r4 = (android.text.Editable) r4;
        r4 = r4.toString();
        r4 = defpackage.acpe.b(r4);
        r3.setEnabled(r4);
    L_0x06f0:
        r3 = r0.aR;
        r3 = r3.getAdapter();
        r3 = (defpackage.acrb) r3;
        if (r3 == 0) goto L_0x0743;
    L_0x06fa:
        r4 = r0.bn;
        if (r4 != 0) goto L_0x0719;
    L_0x06fe:
        r4 = 0;
    L_0x06ff:
        r8 = r3.getCount();
        if (r4 < r8) goto L_0x0706;
    L_0x0705:
        goto L_0x0743;
    L_0x0706:
        r8 = r3.getItem(r4);
        r8 = (defpackage.atra) r8;
        r8 = r8.g;
        if (r8 != 0) goto L_0x0713;
    L_0x0710:
        r4 = r4 + 1;
        goto L_0x06ff;
    L_0x0713:
        r3 = r0.aR;
        r3.setSelection(r4, r6);
        goto L_0x0743;
    L_0x0719:
        r4 = 0;
    L_0x071a:
        r8 = r3.getCount();
        if (r4 >= r8) goto L_0x0743;
    L_0x0720:
        r8 = r3.getItem(r4);
        r8 = (defpackage.atra) r8;
        r10 = r8.b;
        r11 = 3;
        if (r10 != r11) goto L_0x0734;
    L_0x072b:
        r8 = r8.c;
        r8 = (java.lang.Integer) r8;
        r8 = r8.intValue();
        goto L_0x0735;
    L_0x0734:
        r8 = 0;
    L_0x0735:
        r10 = r0.bn;
        r10 = r10.d;
        if (r8 == r10) goto L_0x073e;
    L_0x073b:
        r4 = r4 + 1;
        goto L_0x071a;
    L_0x073e:
        r3 = r0.aR;
        r3.setSelection(r4, r6);
    L_0x0743:
        r3 = r0.aJ;
        if (r3 == 0) goto L_0x0750;
    L_0x0747:
        r3 = r0.aL;
        if (r3 == 0) goto L_0x0750;
    L_0x074b:
        r3 = r0.aM;
        if (r3 == 0) goto L_0x0750;
    L_0x074f:
        goto L_0x0794;
    L_0x0750:
        r3 = r22.e();
        if (r3 == 0) goto L_0x0759;
    L_0x0756:
        r22.d();
    L_0x0759:
        r3 = 2131757185; // 0x7f100881 float:1.9145299E38 double:1.0532279904E-314;
        r3 = r1.findViewById(r3);
        r3 = (android.view.ViewStub) r3;
        r4 = 2131034764; // 0x7f05028c float:1.7680055E38 double:1.052871067E-314;
        r3.setLayoutResource(r4);
        r3.inflate();
        r3 = 2131757211; // 0x7f10089b float:1.9145351E38 double:1.053228003E-314;
        r3 = r1.findViewById(r3);
        r3 = (android.widget.ImageButton) r3;
        r0.aJ = r3;
        r3 = 2131757212; // 0x7f10089c float:1.9145353E38 double:1.0532280037E-314;
        r3 = r1.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r0.aL = r3;
        r3 = 2131756795; // 0x7f1006fb float:1.9144508E38 double:1.0532277977E-314;
        r1 = r1.findViewById(r3);
        r1 = (android.widget.ImageButton) r1;
        r0.aM = r1;
        r1 = r0.aM;
        r1.setOnClickListener(r0);
        r20.af();
    L_0x0794:
        r1 = r20.ae();
        if (r1 == 0) goto L_0x083b;
    L_0x079a:
        r1 = r22.e();
        if (r1 == 0) goto L_0x07a5;
    L_0x07a0:
        r1 = r22.f();
        goto L_0x07a6;
    L_0x07a5:
        r1 = r9;
    L_0x07a6:
        r1 = defpackage.ajzv.a(r1);
        r0.a(r1, r9);
        r1 = r22.d();
        if (r1 != 0) goto L_0x07b5;
    L_0x07b3:
        r1 = r9;
        goto L_0x07bf;
    L_0x07b5:
        r1 = r2.instance;
        r1 = (defpackage.avac) r1;
        r1 = r1.k;
        if (r1 != 0) goto L_0x07bf;
    L_0x07bd:
        r1 = defpackage.axak.a;
    L_0x07bf:
        r1 = defpackage.ajzv.a(r1);
        r0.a(r1, r9);
        r1 = r22.e();
        if (r1 == 0) goto L_0x07d1;
    L_0x07cc:
        r1 = r22.f();
        goto L_0x07d2;
    L_0x07d1:
        r1 = r9;
    L_0x07d2:
        r1 = defpackage.ajzv.a(r1);
        r3 = defpackage.aphg.class;
        r1 = defpackage.ajzv.a(r1, r3);
        r1 = (defpackage.aphg) r1;
        r3 = r0.a;
        r4 = "HAS_SEEN_SCREENCAST_TOOLTIP";
        r3 = r3.getBoolean(r4, r6);
        r3 = r3 ^ r5;
        if (r1 != 0) goto L_0x07ea;
    L_0x07e9:
        goto L_0x0829;
    L_0x07ea:
        r4 = r1.i;
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x0829;
    L_0x07f2:
        if (r3 == 0) goto L_0x0829;
    L_0x07f4:
        r1 = r1.i;
        r3 = r0.az;
        r4 = r3.a();
        r1 = r4.c(r1);
        r1 = r1.e(r7);
        r1 = r1.d(r7);
        r4 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r1 = r1.a(r4);
        r1 = r1.a(r9);
        r1 = r1.f();
        r1 = (defpackage.albx) r1;
        r4 = new acpp;
        r4.<init>(r0);
        r1 = r1.a(r4);
        r1 = r1.b();
        r3.a(r1);
    L_0x0829:
        r1 = r0.br;
        if (r1 == 0) goto L_0x0837;
    L_0x082d:
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x0837;
    L_0x0833:
        r20.ac();
        goto L_0x083e;
    L_0x0837:
        r20.ad();
        goto L_0x083e;
    L_0x083b:
        r20.ad();
    L_0x083e:
        r1 = r0.an;
        if (r1 == 0) goto L_0x0849;
    L_0x0842:
        r3 = r0.af;
        r1 = r1.b;
        r3.a(r1);
    L_0x0849:
        r1 = r22.i();
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r1 = r1.h;
        r3 = r3.d;
        r1 = r1.a(r3);
        if (r1 == 0) goto L_0x08b7;
    L_0x0860:
        r1 = r22.i();
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r1 = r1.h;
        r4 = r3.d;
        r1 = r1.b(r4);
        if (r1 != 0) goto L_0x087a;
    L_0x0877:
        r1 = r3.b;
        goto L_0x087e;
    L_0x087a:
        r1 = r3.a(r1);
    L_0x087e:
        r1 = (defpackage.aphg) r1;
        r2 = r22.i();
        r2 = defpackage.ajzv.a(r2);
        r3 = r0.aJ;
        r0.a(r2, r3);
        r2 = r0.aJ;
        r2.setVisibility(r6);
        r2 = r0.aJ;
        r2.setTag(r1);
        r2 = r1.a;
        r2 = r2 & 4096;
        if (r2 == 0) goto L_0x08a3;
    L_0x089d:
        r9 = r1.m;
        if (r9 != 0) goto L_0x08a3;
    L_0x08a1:
        r9 = defpackage.apxu.d;
    L_0x08a3:
        r0.bw = r9;
        r1 = r0.bw;
        if (r1 != 0) goto L_0x08aa;
    L_0x08a9:
        goto L_0x08b7;
    L_0x08aa:
        r1 = r1.b;
        r1 = r1.d();
        r0.aK = r1;
        r1 = r0.aK;
        r0.a(r1);
    L_0x08b7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acpe.a(android.view.View, avaf):void");
    }

    public final boolean f() {
        return Boolean.TRUE.equals(this.br);
    }

    private final void ac() {
        this.au.e(true);
        this.br = Boolean.valueOf(true);
        acef.a().h = true;
        ImageButton imageButton = null;
        imageButton.setSelected(true);
        imageButton.setSelected(false);
        this.aM.setVisibility(8);
        imageButton.setVisibility(0);
        this.af.setVisibility(0);
        a(this.ae, this.ad);
    }

    private final void ad() {
        this.au.e(false);
        this.aM.setVisibility(this.bt > 1 ? 0 : 8);
        acef.a().h = false;
        if (ae()) {
            this.br = Boolean.valueOf(false);
            ImageButton imageButton = null;
            imageButton.setSelected(false);
            if (this.bt > 1) {
                imageButton.setVisibility(8);
            } else {
                imageButton.setSelected(true);
            }
        }
        this.af.setVisibility(8);
        a(this.ad, this.ae);
    }

    private final void a(EditLocation editLocation, EditLocation editLocation2) {
        if (this.bu) {
            zrb zrb = editLocation2.c;
            if (!(zrb == null && editLocation.c == null)) {
                editLocation.a(zrb);
            }
            editLocation2.setVisibility(8);
            editLocation.setVisibility(0);
        }
    }

    private final void a(ajzw ajzw, ImageView imageView) {
        aphg aphg = (aphg) ajzv.a(ajzw, aphg.class);
        if (aphg != null && imageView != null) {
            if ((aphg.a & 16384) != 0) {
                aodv aodv = aphg.p;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                imageView.setContentDescription(aodv.b);
            }
            if ((aphg.a & 16) != 0) {
                aclh aclh = this.as;
                arwf arwf = aphg.e;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                arwh a = arwh.a(arwf.b);
                if (a == null) {
                    a = arwh.UNKNOWN;
                }
                int a2 = aclh.a(a);
                if (a2 != 0) {
                    imageView.setImageResource(a2);
                }
            }
        }
    }

    private final void af() {
        if (this.aM != null && !TextUtils.isEmpty(this.bp)) {
            this.aM.setContentDescription(this.bp);
        }
    }

    public final void W() {
        apxu apxu = this.bw;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.getScheduledBroadcastsEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                ImageButton imageButton = this.aJ;
                if (imageButton != null && imageButton.getVisibility() == 0) {
                    this.ap.a(this.bw, amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
                }
            }
        }
    }

    public static auyi a(avac avac) {
        if (!(avac == null || (avac.a & 4096) == 0)) {
            anxp anxp = avac.n;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(MobileBroadcastSetupMoreOptionsRendererOuterClass.mobileBroadcastSetupMoreOptionsRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            auzb auzb = (auzb) b;
            if ((auzb.a & 8) != 0) {
                anxp = auzb.e;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                anxp.a(access$000);
                b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                anxp = ((aphg) b).l;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                access$000 = anxl.checkIsLite(MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.mobileBroadcastSetupShowAdvancedSettingsScreenEndpoint);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.mobileBroadcastSetupShowAdvancedSettingsScreenEndpoint);
                    anxp.a(access$000);
                    b = anxp.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint = (MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint) b;
                    if ((mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.a & 1) != 0) {
                        auzk auzk = mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.b;
                        if (auzk == null) {
                            auzk = auzk.c;
                        }
                        auyi auyi = auzk.b;
                        if (auyi == null) {
                            auyi = auyi.k;
                        }
                        return auyi;
                    }
                }
            }
        }
        return null;
    }

    public final void B() {
        super.B();
        X();
        aclo.b(p());
    }

    public final void X() {
        int i = this.ag.a;
        if (i == 1) {
            this.b.a(R.id.pre_stream_network_operation);
        } else if (i != 2) {
            this.b.a(R.id.pre_stream_network_operation);
            d(5);
            this.au.e(Boolean.TRUE.equals(this.br));
        } else {
            a(this.aI);
            a(this.aK);
            Y();
            W();
        }
    }

    private final void a(byte[] bArr) {
        this.aB.a(bArr);
    }

    public final void e(Bundle bundle) {
        bundle.putBoolean("STATE_INTENT_ACTION_LOGGED", this.bh);
        anze anze = this.al;
        if (anze != null) {
            bundle.putParcelable("STATE_TITLE_SCREEN_RENDERER", new ajrb(anze));
        }
        bundle.putInt("STATE_DISPLAYED_VIEW_ID", this.b.a());
        anze = this.bv;
        if (anze != null) {
            bundle.putParcelable("STATE_BROADCAST_CREATED_ENDPOINT", new ajrb(anze));
        }
        anze = this.bw;
        if (anze != null) {
            bundle.putParcelable("STATE_SCHEDULED_EVENTS_ENDPOINT", new ajrb(anze));
        }
        bundle.putBoolean("STATE_MORE_OPTIONS_SHOWN", this.bo);
        aa();
        String str = this.bk;
        if (str != null) {
            bundle.putString("STREAM_TITLE", str);
        }
        str = this.bl;
        if (str != null) {
            bundle.putString("STATE_STREAM_DESCRIPTION", str);
        }
        awnx awnx = this.bn;
        if (awnx != null) {
            bundle.putInt("STATE_STREAM_PRIVACY", awnx.d);
        }
        zrb zrb = this.bq;
        if (zrb != null) {
            bundle.putParcelable("STATE_PLACE", zrb);
        }
        Boolean bool = this.ah;
        if (bool != null) {
            bundle.putBoolean("STATE_ENABLE_CHAT", bool.booleanValue());
        }
        bool = this.ai;
        if (bool != null) {
            bundle.putBoolean("STATE_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE", bool.booleanValue());
        }
        bool = this.aj;
        if (bool != null) {
            bundle.putBoolean("STATE_ENABLE_AGE_RESTRICTION", bool.booleanValue());
        }
        bool = this.br;
        if (bool != null) {
            bundle.putBoolean("STATE_IS_SCREENCAST", bool.booleanValue());
        }
        anze = this.ak;
        if (anze != null) {
            bundle.putParcelable("STATE_MONETIZATION_METADATA", new ajrb(anze));
        }
        Date date = this.bm;
        if (date != null) {
            bundle.putSerializable("STATE_SCHEDULED_DATE", date);
        }
        anze = this.an;
        if (anze != null) {
            bundle.putParcelable("STATE_GAME_TITLE", new ajrb(anze));
        }
    }

    public final void i() {
        super.i();
        if (this.ab.isFocused()) {
            xpr.a(this.ab);
        }
    }

    private static boolean b(CharSequence charSequence) {
        return charSequence.length() > 0 && charSequence.length() <= 60;
    }

    public final void a(CharSequence charSequence) {
        this.bp = charSequence;
        af();
    }

    public final void a(String str, avag avag) {
        apxu apxu;
        this.bj = false;
        String valueOf = String.valueOf(str);
        String str2 = "Created broadcast with videoId: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            str2.concat(valueOf);
        }
        if ((avag.a & 2) != 0) {
            apxu = avag.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        this.bv = apxu;
        this.au.a(str, this.bv);
        ag();
        this.ap.a(this.bv, amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
    }

    public final void a(int i, String str, aqhy aqhy) {
        this.bj = false;
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("Create broadcast failed statusCode: ");
        stringBuilder.append(i);
        xtl.d(stringBuilder.toString());
        this.b.a(R.id.pre_stream_content);
        if (aqhy != null) {
            akcq.a(p(), aqhy, this.ap, this.aB, null, null);
        } else if (aclo.a((nf) this)) {
            CharSequence str2;
            if (str2 == null) {
                str2 = a((int) R.string.lc_error_create_broadcast);
            }
            Toast.makeText(p(), str2, 0).show();
        }
    }

    public final acgv e() {
        aa();
        acgv acgv = new acgv();
        acgv.a = this.bk;
        acgv.b = this.bl;
        acgv.c = this.ah;
        acgv.d = this.ai;
        acgv.e = this.aj;
        Boolean bool = this.br;
        acgv.f = bool;
        acgv.g = this.ak;
        acgv.h = this.bs;
        acgv.i = this.bn;
        acgv.j = this.bq;
        acgv.k = this.bm;
        arog arog = null;
        if (bool != null && bool.booleanValue()) {
            arog = this.an;
        }
        acgv.l = arog;
        return acgv;
    }

    public final void a(asqt asqt) {
        this.bj = false;
        if (aclo.a((nf) this)) {
            asqp asqp = asqt.c;
            if (asqp == null) {
                asqp = asqp.c;
            }
            if (asqp.a == 126007832) {
                asqp = asqt.c;
                if (asqp == null) {
                    asqp = asqp.c;
                }
                auyw auyw = asqp.a == 126007832 ? (auyw) asqp.b : auyw.y;
                if (this.bi) {
                    this.au.c(auyw);
                    this.ag.a(2);
                } else {
                    this.au.b(auyw);
                    this.au.b(e());
                    this.ag.a(2);
                }
                acpv acpv = this.au;
                azaj azaj = asqt.d;
                if (azaj == null) {
                    azaj = azaj.h;
                }
                acpv.a(azaj);
                return;
            }
            c();
        }
    }

    public final void c() {
        this.bj = false;
        xtl.d("Get confirm broadcast failed");
        if (aclo.a((nf) this)) {
            Toast.makeText(p(), R.string.lc_error_update_broadcast, 0).show();
            this.b.a(R.id.pre_stream_content);
        }
    }

    public final void a(auzi auzi) {
        if (aclo.a((nf) this) && auzi != null && this.aJ != null && this.aL != null) {
            TypedValue typedValue = new TypedValue();
            if (auzi.e > 0) {
                q().getValue(R.dimen.lc_button_active_opacity, typedValue, true);
                this.aJ.setOnClickListener(this);
                this.aJ.setClickable(true);
                this.aL.setVisibility(0);
            } else {
                q().getValue(R.dimen.lc_button_inactive_opacity, typedValue, true);
                this.aJ.setOnClickListener(null);
                this.aJ.setClickable(false);
                this.aL.setVisibility(8);
            }
            this.aJ.setAlpha(typedValue.getFloat());
            this.aL.setText(String.format("%d", new Object[]{Integer.valueOf(auzi.e)}));
        }
    }

    public final void a() {
        xtl.d("GetBroadcastsSchedule failed");
    }

    public final void b() {
        if (this.bv == null) {
            this.au.b(e());
            this.ag.a(2);
            return;
        }
        ag();
        this.ap.a(this.bv, amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", this));
    }

    public final void d() {
        ah();
    }

    public final void bo_() {
        if (this.ay.f()) {
            alad alad = aF;
            acpj acpj = new acpj(this);
            this.aC = new alak(alan.a((nf) this), this.aB, Arrays.asList(new alad[]{alad}), R.string.lc_permission_open_settings_location_description, R.string.lc_permissions_missing_location, acpj);
            this.aC.a();
            return;
        }
        this.b.a(R.id.pre_stream_location_search);
    }

    private final void ag() {
        this.ag.a(0);
        this.b.a(R.id.pre_stream_network_operation);
    }

    private final void ah() {
        this.ag.a(1);
        this.b.a(R.id.pre_stream_network_operation);
    }

    public final void Y() {
        int i = this.c;
        if (i == -1) {
            this.b.a(R.id.pre_stream_content);
        } else {
            this.b.a(i);
        }
    }

    public final void Z() {
        ag();
        d(5);
    }

    public final void d(int i) {
        if (this.bi) {
            this.ag.a(2);
            Y();
            return;
        }
        this.ag.a(new acps(this));
        if (i <= 0) {
            ah();
            return;
        }
        Context M_ = M_();
        if (this.ay.f() && M_ != null && alai.a(M_, 3)) {
            this.av.a(new acpm(this, i));
        } else {
            a(null, i);
        }
    }

    public final void a(aukf aukf, int i) {
        this.at.a(aukf, null, new acpr(this, i));
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        View view = this.K;
        nn p = p();
        if (!(view == null || p == null)) {
            charSequence = charSequence.toString().trim();
            TextView textView = (TextView) view.findViewById(R.id.char_count);
            this.bg.setEnabled(acpe.b(charSequence));
            if (charSequence.length() >= 50) {
                textView.setVisibility(0);
                textView.setText(q().getString(R.string.lc_character_counter_text, new Object[]{Integer.toString(charSequence.length()), Integer.toString(60)}));
            } else {
                textView.setVisibility(4);
            }
            if (charSequence.length() > 60) {
                this.ab.getBackground().setColorFilter(ra.c(p, R.color.lc_red), Mode.SRC_ATOP);
                textView.setTextColor(ra.c(p, R.color.lc_red));
                return;
            }
            this.ab.getBackground().setColorFilter(ra.c(p, R.color.lc_white), Mode.SRC_ATOP);
            textView.setTextColor(ra.c(p, R.color.lc_white_70));
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton != this.aY) {
            return;
        }
        if (z) {
            this.be.a();
        } else {
            this.be.a.setVisibility(8);
        }
    }

    public final void onClick(View view) {
        View view2 = view;
        View view3 = this.K;
        if (view3 != null) {
            byte[] bArr;
            if (view2 == view3 || view2 == this.aG) {
                if (this.ab.isFocused()) {
                    xpr.a(this.ab);
                }
            } else if (view2 == this.aH) {
                ab();
            } else if (view2 == this.aZ) {
                xpr.a(this.ab);
                bArr = this.aI;
                if (bArr != null) {
                    this.aB.a(3, new acvs(bArr), null);
                }
                this.b.a(R.id.pre_stream_advanced_settings);
            } else if (view2 == this.aJ) {
                xpr.a(this.ab);
                bArr = this.aK;
                if (bArr != null) {
                    this.aB.a(3, new acvs(bArr), null);
                }
                this.au.z();
            } else if (view2 == null) {
                ac();
            } else {
                view3 = this.aM;
                Object tag;
                if (view2 == view3) {
                    this.au.a(view3);
                } else if (view2 == this.bg) {
                    CharSequence charSequence = (Editable) this.ab.getText();
                    xpr.a(this.ab);
                    if (acpe.b(charSequence)) {
                        acqz acqz = this.bd;
                        if (acqz != null && acqz.a() && this.be.b().before(new Date(this.aw.a() - aD))) {
                            Toast.makeText(p(), R.string.lc_error_scheduled_date_in_past, 1).show();
                            return;
                        }
                        String str = "IS_FIRST_STREAM";
                        if (this.a.getBoolean(str, true)) {
                            this.a.edit().putBoolean(str, false).apply();
                        }
                        if (!this.bj) {
                            str = "com.google.android.libraries.youtube.innertube.endpoint.tag";
                            if (this.bv == null) {
                                tag = this.bg.getTag();
                                if (tag instanceof apxu) {
                                    apxu apxu = (apxu) tag;
                                    this.bj = true;
                                    this.aB.a(apxu.b.d());
                                    if ((1 & apxu.a) != 0) {
                                        this.aB.a(3, new acvs(apxu.b.d()), null);
                                    }
                                    this.ap.a(apxu, amur.a(str, this));
                                    ag();
                                    return;
                                }
                            }
                            asxv a;
                            acgv e = e();
                            if (this.bi) {
                                acff acff = acff.a;
                                if (Boolean.TRUE.equals(this.br)) {
                                    arog arog = e.l;
                                    if (arog == null || (arog.a & 4) == 0) {
                                        acff = acff.b;
                                    } else {
                                        acff = acff.a(arog.d);
                                    }
                                }
                                acff acff2 = acff;
                                acfe acfe = this.at;
                                apxu apxu2 = this.bv;
                                anxr access$000 = anxl.checkIsLite(MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.mobileBroadcastSetupShowGoLiveScreenEndpoint);
                                apxu2.a(access$000);
                                Object b = apxu2.h.b(access$000.d);
                                if (b == null) {
                                    b = access$000.b;
                                } else {
                                    b = access$000.a(b);
                                }
                                String str2 = ((MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint) b).b;
                                String str3 = e.a;
                                String str4 = e.b;
                                Boolean bool = e.c;
                                Boolean bool2 = e.d;
                                Boolean bool3 = e.e;
                                Boolean bool4 = e.f;
                                asjd asjd = e.g;
                                asjf asjf = e.h;
                                awnx awnx = e.i;
                                zrb zrb = e.j;
                                if (zrb != null) {
                                    acff = acff.a(zrb);
                                } else {
                                    acff = acff.b;
                                }
                                a = acfe.a(str2, str3, str4, bool, bool2, bool3, bool4, asjd, asjf, awnx, acff, e.k, acff2, null);
                            } else {
                                a = this.au.a(e);
                            }
                            if (a == null) {
                                ag();
                                this.ap.a(this.bv, amur.a(str, this));
                                return;
                            }
                            ag();
                            this.ag.a(new acpk(this, a));
                            this.at.a(a, this);
                        }
                    } else if (charSequence.length() == 0) {
                        Toast.makeText(p(), R.string.lc_must_add_title, 0).show();
                    } else {
                        Toast.makeText(p(), R.string.lc_title_too_long, 0).show();
                    }
                } else if (view2 == this.aO) {
                    this.ap.a(this.aP, null);
                } else {
                    view3 = this.bb;
                    if (view2 == view3) {
                        tag = view3.getTag();
                        if (tag instanceof atqt) {
                            atqt atqt = (atqt) tag;
                            TextView textView;
                            arml arml;
                            if (this.aS.getVisibility() == 8) {
                                textView = this.bc;
                                arml = atqt.b;
                                if (arml == null) {
                                    arml = arml.f;
                                }
                                textView.setText(ajqy.a(arml));
                                this.aS.setVisibility(0);
                                this.bo = true;
                                this.aQ.setVisibility(0);
                                return;
                            }
                            textView = this.bc;
                            arml = atqt.c;
                            if (arml == null) {
                                arml = arml.f;
                            }
                            textView.setText(ajqy.a(arml));
                            this.aS.setVisibility(8);
                            this.bo = false;
                            this.aQ.setVisibility(8);
                        }
                    }
                }
            }
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        acrb acrb = this.bf;
        if (acrb != null) {
            acrb.a = i;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        acrb acrb = this.bf;
        if (acrb != null) {
            acrb.a = -1;
        }
    }

    public final void aa() {
        atra atra;
        awnx a;
        acqz acqz;
        if (this.ab.getVisibility() == 0) {
            this.bk = ((Editable) this.ab.getText()).toString().trim();
        }
        boolean z = false;
        if (this.aR.getVisibility() == 0) {
            atra = (atra) this.aR.getSelectedItem();
            a = awnx.a(atra.b == 3 ? ((Integer) atra.c).intValue() : 0);
            if (a == null) {
                a = awnx.PRIVATE;
            }
        } else {
            a = awnx.UNLISTED;
        }
        this.bn = a;
        Boolean bool = this.br;
        if (bool == null || !bool.booleanValue()) {
            this.bq = this.ad.c;
        } else {
            this.bq = this.ae.c;
        }
        acqy acqy = this.aa;
        if (acqy != null) {
            String str;
            String str2;
            Object obj;
            Pair pair;
            acqz = acqy.e;
            this.ah = acqz != null ? Boolean.valueOf(acqz.a()) : null;
            acqz = this.aa.j;
            this.ai = acqz != null ? Boolean.valueOf(acqz.a()) : null;
            acqz = this.aa.d;
            this.aj = acqz != null ? Boolean.valueOf(acqz.a()) : null;
            acqy = this.aa;
            asje asje = (asje) asjf.h.createBuilder();
            acqz acqz2 = acqy.f;
            Boolean valueOf = acqz2 != null ? Boolean.valueOf(acqz2.a()) : null;
            acqz acqz3 = acqy.g;
            Boolean valueOf2 = acqz3 != null ? Boolean.valueOf(acqz3.a()) : null;
            acqz acqz4 = acqy.h;
            Boolean valueOf3 = acqz4 != null ? Boolean.valueOf(acqz4.a()) : null;
            Spinner spinner = acqy.b;
            String str3 = "";
            if (spinner == null || spinner.getVisibility() != 0) {
                str = null;
            } else {
                atra atra2 = (atra) acqy.b.getSelectedItem();
                str = atra2.b == 2 ? (String) atra2.c : str3;
            }
            acqz acqz5 = acqy.i;
            Boolean valueOf4 = acqz5 != null ? Boolean.valueOf(acqz5.a()) : null;
            Spinner spinner2 = acqy.c;
            if (spinner2 == null || spinner2.getVisibility() != 0) {
                str2 = null;
            } else {
                atra = (atra) acqy.c.getSelectedItem();
                str2 = atra.b == 2 ? (String) atra.c : str3;
            }
            asjc asjc = (asjc) asjd.h.createBuilder();
            if (valueOf == null) {
                obj = null;
            } else {
                asjc.a(valueOf.booleanValue());
                asje.a();
                if (valueOf.booleanValue() && valueOf2 != null) {
                    asjc.b(valueOf2.booleanValue());
                    asje.b();
                }
                obj = 1;
            }
            if (valueOf3 != null) {
                asjc.c(valueOf3.booleanValue());
                asje.c();
                obj = 1;
            }
            if (str != null) {
                asjc.a(str);
                asje.d();
                obj = 1;
            }
            if (valueOf4 != null) {
                asjc.d(valueOf4.booleanValue());
                asje.e();
                if (valueOf4.booleanValue() && str2 != null) {
                    asjc.b(str2);
                    asje.f();
                }
            } else if (obj == null) {
                pair = null;
                this.ak = (asjd) pair.first;
                this.bs = (asjf) pair.second;
            }
            pair = new Pair((asjd) ((anxl) asjc.build()), (asjf) ((anxl) asje.build()));
            this.ak = (asjd) pair.first;
            this.bs = (asjf) pair.second;
        }
        if (this.aQ.getVisibility() == 0) {
            this.bl = this.ac.getText().toString().trim();
        }
        acqz = this.bd;
        if (acqz != null) {
            if (acqz.a()) {
                acrc acrc = this.be;
                if (acrc != null) {
                    this.bm = acrc.b();
                }
            }
            this.bm = aE;
        } else {
            this.bm = null;
        }
        acef a2 = acef.a();
        Date date = this.bm;
        if (date != null && date.getTime() > 0) {
            z = true;
        }
        a2.g = z;
    }

    public final void ab() {
        if (this.b.a() == R.id.pre_stream_content || this.b.a() == R.id.pre_stream_network_operation) {
            this.au.y();
            return;
        }
        this.b.a(R.id.pre_stream_content);
        aa();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.K;
        if (view != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.aN.getLayoutParams();
            marginLayoutParams.topMargin = view.getResources().getDimensionPixelOffset(R.dimen.lc_pre_stream_first_input_field_top_margin);
            this.aN.setLayoutParams(marginLayoutParams);
        }
    }
}
