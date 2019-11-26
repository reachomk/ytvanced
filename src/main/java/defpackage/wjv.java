package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: wjv */
public final class wjv extends nd implements OnGlobalLayoutListener, whk, wlk {
    private static final ColorDrawable aB = new ColorDrawable(0);
    public akkq Z;
    public grf aA;
    private MenuItem aC;
    private View aD;
    private wle aE;
    private View aF;
    private View aG;
    private FrameLayout aH;
    private boolean aI;
    private akle aJ;
    private int aK;
    private int aL;
    private TextView aM;
    public aaas aa;
    public whd ab;
    public akvz ac;
    public afpu ad;
    public alyf ae;
    public acvx af;
    public akpe ag;
    public wjp ah;
    public akkl ai;
    public gri aj;
    public Executor ak;
    public ajrq al;
    public wks am;
    public String an;
    public String ao;
    public wkq ap;
    public EditText aq;
    public BackstagePollEditorView ar;
    public akpk as;
    public View at;
    public View au;
    public String av;
    public String aw;
    public String ax;
    public int ay;
    public OnDismissListener az;

    public static wjv a(ajrq ajrq) {
        amqw.a((Object) ajrq);
        wjv wjv = new wjv();
        Bundle bundle = new Bundle();
        bundle.putByteArray("renderer", aocf.toByteArray(ajrq));
        wjv.f(bundle);
        return wjv;
    }

    public final void b(Bundle bundle) {
        aocf mergeFrom;
        super.b(bundle);
        ((wkp) xse.a(p())).a(this);
        bundle = this.j;
        String str = "renderer";
        try {
            mergeFrom = aocf.mergeFrom(new ajrq(), bundle.getByteArray(str));
        } catch (aocg unused) {
            String str2;
            String str3 = "Failed to merge proto for ";
            if (str.length() == 0) {
                str2 = new String(str3);
            } else {
                str2 = str3.concat(str);
            }
            xtl.c(str2);
            mergeFrom = null;
        }
        this.al = (ajrq) mergeFrom;
        this.aE = new wle(p(), (akpb) this.ac.get());
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04e3  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05b2  */
    public final android.view.View a(android.view.LayoutInflater r24, android.view.ViewGroup r25, android.os.Bundle r26) {
        /*
        r23 = this;
        r0 = r23;
        r1 = r0.c;
        r1 = r1.getWindow();
        r2 = 1;
        r1.requestFeature(r2);
        r1 = 0;
        r3 = 2131034225; // 0x7f050071 float:1.7678962E38 double:1.0528708007E-314;
        r4 = r24;
        r5 = r25;
        r3 = r4.inflate(r3, r5, r1);
        r4 = 2131755689; // 0x7f1002a9 float:1.9142264E38 double:1.0532272513E-314;
        r4 = r3.findViewById(r4);
        r0.aD = r4;
        r4 = 2131755445; // 0x7f1001b5 float:1.914177E38 double:1.0532271307E-314;
        r4 = r3.findViewById(r4);
        r4 = (android.widget.EditText) r4;
        r0.aq = r4;
        r4 = 2131755694; // 0x7f1002ae float:1.9142275E38 double:1.0532272537E-314;
        r4 = r3.findViewById(r4);
        r4 = (com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView) r4;
        r0.ar = r4;
        r4 = 2131755685; // 0x7f1002a5 float:1.9142256E38 double:1.0532272493E-314;
        r4 = r3.findViewById(r4);
        r0.at = r4;
        r4 = 2131755701; // 0x7f1002b5 float:1.9142289E38 double:1.053227257E-314;
        r4 = r3.findViewById(r4);
        r0.au = r4;
        r4 = 2131755686; // 0x7f1002a6 float:1.9142258E38 double:1.05322725E-314;
        r4 = r3.findViewById(r4);
        r4 = (android.widget.FrameLayout) r4;
        r0.aH = r4;
        r4 = 2131755695; // 0x7f1002af float:1.9142277E38 double:1.053227254E-314;
        r4 = r3.findViewById(r4);
        r0.aF = r4;
        r4 = 2131755669; // 0x7f100295 float:1.9142224E38 double:1.0532272414E-314;
        r4 = r3.findViewById(r4);
        r0.aG = r4;
        r4 = 2131755683; // 0x7f1002a3 float:1.9142252E38 double:1.0532272483E-314;
        r4 = r3.findViewById(r4);
        r4 = (android.widget.TextView) r4;
        r0.aM = r4;
        r4 = r0.al;
        r4 = r4.s;
        r5 = 3;
        r6 = 4;
        r7 = 2;
        if (r4 == 0) goto L_0x00f4;
    L_0x007a:
        r8 = 2131755666; // 0x7f100292 float:1.9142218E38 double:1.05322724E-314;
        r8 = r3.findViewById(r8);
        r8 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r8;
        r9 = 2131755668; // 0x7f100294 float:1.9142222E38 double:1.053227241E-314;
        r9 = r3.findViewById(r9);
        r9 = (android.view.ViewGroup) r9;
        r10 = r0.aj;
        r11 = r0.aq;
        r12 = r0.af;
        r13 = defpackage.ayvv.USER_MENTION_AUTO_COMPLETE_SOURCE_BACKSTAGE_POST;
        r15 = new grf;
        r14 = r10.a;
        r14 = r14.get();
        r14 = (android.content.Context) r14;
        r14 = defpackage.gri.a(r14, r2);
        r16 = r14;
        r16 = (android.content.Context) r16;
        r10 = r10.b;
        r10 = r10.get();
        r10 = (defpackage.grq) r10;
        r10 = defpackage.gri.a(r10, r7);
        r10 = (defpackage.grq) r10;
        r8 = defpackage.gri.a(r8, r5);
        r17 = r8;
        r17 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r17;
        r8 = defpackage.gri.a(r11, r6);
        r18 = r8;
        r18 = (android.widget.EditText) r18;
        r8 = 5;
        r8 = defpackage.gri.a(r9, r8);
        r19 = r8;
        r19 = (android.view.ViewGroup) r19;
        r8 = 6;
        r4 = defpackage.gri.a(r4, r8);
        r20 = r4;
        r20 = (defpackage.apxu) r20;
        r4 = 7;
        r4 = defpackage.gri.a(r12, r4);
        r21 = r4;
        r21 = (defpackage.acvx) r21;
        r4 = 8;
        r4 = defpackage.gri.a(r13, r4);
        r22 = r4;
        r22 = (defpackage.ayvv) r22;
        r14 = r15;
        r4 = r15;
        r15 = r16;
        r16 = r10;
        r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22);
        r0.aA = r4;
    L_0x00f4:
        r4 = r23.ah();
        if (r4 == 0) goto L_0x010c;
    L_0x00fa:
        r4 = new wkh;
        r4.<init>(r0);
        r8 = r0.ar;
        r8.a = r4;
        r4 = r0.al;
        r4 = r4.l;
        defpackage.amqw.a(r4);
        r8.b = r4;
    L_0x010c:
        r4 = r23.ag();
        r8 = 2131755678; // 0x7f10029e float:1.9142242E38 double:1.053227246E-314;
        r8 = r3.findViewById(r8);
        defpackage.xpr.a(r8, r4);
        r8 = 2131755677; // 0x7f10029d float:1.914224E38 double:1.0532272453E-314;
        r8 = r3.findViewById(r8);
        r8 = (android.widget.ImageView) r8;
        r9 = r4 ^ 1;
        defpackage.xpr.a(r8, r9);
        r9 = 2131755679; // 0x7f10029f float:1.9142244E38 double:1.0532272463E-314;
        r9 = r3.findViewById(r9);
        r9 = (android.widget.ImageView) r9;
        defpackage.xpr.a(r9, r4);
        r10 = r0.Z;
        if (r4 != 0) goto L_0x0139;
    L_0x0138:
        goto L_0x013a;
    L_0x0139:
        r8 = r9;
    L_0x013a:
        r9 = r0.al;
        r9 = r9.a;
        r10.a(r8, r9);
        r8 = 2131755693; // 0x7f1002ad float:1.9142272E38 double:1.053227253E-314;
        if (r4 == 0) goto L_0x014d;
    L_0x0146:
        r9 = r3.findViewById(r8);
        defpackage.xpr.a(r9, r1);
    L_0x014d:
        if (r4 != 0) goto L_0x0150;
    L_0x014f:
        goto L_0x0153;
    L_0x0150:
        r8 = 2131755681; // 0x7f1002a1 float:1.9142248E38 double:1.0532272473E-314;
    L_0x0153:
        r8 = r3.findViewById(r8);
        r8 = (android.widget.Spinner) r8;
        r9 = r0.al;
        r9 = r9.m;
        if (r9 == 0) goto L_0x01ad;
    L_0x015f:
        r9 = r9.a;
        if (r9 != 0) goto L_0x0164;
    L_0x0163:
        goto L_0x01ad;
    L_0x0164:
        defpackage.xpr.a(r8, r2);
        r9 = r0.al;
        r9 = r9.m;
        r9 = r9.a;
        r10 = r0.ah;
        r9 = r9.b;
        r11 = r10.a;
        r11.clear();
        r9 = r9.iterator();
    L_0x017a:
        r11 = r9.hasNext();
        if (r11 == 0) goto L_0x0198;
    L_0x0180:
        r11 = r9.next();
        r11 = (defpackage.aqyb) r11;
        r11 = r11.f;
        if (r11 != 0) goto L_0x018c;
    L_0x018a:
        r11 = defpackage.aqyl.h;
    L_0x018c:
        r12 = r10.a;
        r12.add(r11);
        r12 = r11.g;
        if (r12 == 0) goto L_0x017a;
    L_0x0195:
        r10.b = r11;
        goto L_0x017a;
    L_0x0198:
        r10.notifyDataSetChanged();
        r9 = r0.ah;
        r9.c = r4;
        r9 = new wkn;
        r9.<init>(r0);
        r8.setOnItemSelectedListener(r9);
        r9 = r0.ah;
        r8.setAdapter(r9);
        goto L_0x01b0;
    L_0x01ad:
        defpackage.xpr.a(r8, r1);
    L_0x01b0:
        if (r4 == 0) goto L_0x01f5;
    L_0x01b2:
        r4 = r0.aM;
        r8 = r0.al;
        r8 = r8.u;
        r8 = defpackage.ajqy.a(r8);
        r4.setText(r8);
        r4 = r0.al;
        r4 = r4.m;
        r8 = 2131755682; // 0x7f1002a2 float:1.914225E38 double:1.053227248E-314;
        r8 = r3.findViewById(r8);
        r8 = (android.widget.TextView) r8;
        if (r4 == 0) goto L_0x01e1;
    L_0x01ce:
        r4 = r4.b;
        if (r4 != 0) goto L_0x01d3;
    L_0x01d2:
        goto L_0x01e1;
    L_0x01d3:
        r4 = r4.b;
        if (r4 != 0) goto L_0x01d9;
    L_0x01d7:
        r4 = defpackage.arml.f;
    L_0x01d9:
        r4 = defpackage.ajqy.a(r4);
        defpackage.xpr.a(r8, r4);
        goto L_0x01e4;
    L_0x01e1:
        defpackage.xpr.a(r8, r1);
    L_0x01e4:
        r4 = r0.aM;
        r4 = r4.getViewTreeObserver();
        r4.addOnGlobalLayoutListener(r0);
        r4 = r0.aq;
        r8 = 2132017920; // 0x7f140300 float:1.9674132E38 double:1.0533568106E-314;
        defpackage.adl.a(r4, r8);
    L_0x01f5:
        r4 = r0.al;
        r4 = r4.e;
        if (r4 == 0) goto L_0x0215;
    L_0x01fb:
        r8 = r0.aa;
        r4 = defpackage.aabb.a(r4, r8, r1);
        r8 = r0.aA;
        if (r8 == 0) goto L_0x0210;
    L_0x0205:
        r8 = r0.aq;
        r9 = new wjy;
        r9.<init>(r0, r4);
        r8.post(r9);
        goto L_0x0215;
    L_0x0210:
        r8 = r0.aq;
        r8.append(r4);
    L_0x0215:
        r4 = r0.aq;
        r8 = new wkb;
        r8.<init>(r0);
        r4.addTextChangedListener(r8);
        r4 = 2131755676; // 0x7f10029c float:1.9142238E38 double:1.053227245E-314;
        r4 = r3.findViewById(r4);
        r8 = new wki;
        r8.<init>(r0);
        r4.setOnClickListener(r8);
        r4 = r0.al;
        r8 = r4.f;
        r9 = 0;
        if (r8 != 0) goto L_0x0239;
    L_0x0235:
        r10 = r4.t;
        if (r10 == 0) goto L_0x035d;
    L_0x0239:
        r10 = r4.t;
        r11 = r4.v;
        r12 = r11 + -1;
        if (r11 == 0) goto L_0x0789;
    L_0x0241:
        if (r12 == r2) goto L_0x02bb;
    L_0x0243:
        if (r12 == r7) goto L_0x0274;
    L_0x0245:
        if (r11 != 0) goto L_0x024a;
    L_0x0247:
        r4 = "null";
        goto L_0x0252;
    L_0x024a:
        if (r11 == 0) goto L_0x0273;
    L_0x024c:
        if (r11 == 0) goto L_0x0272;
    L_0x024e:
        r4 = java.lang.Integer.toString(r12);
    L_0x0252:
        r4 = java.lang.String.valueOf(r4);
        r8 = r4.length();
        r10 = new java.lang.StringBuilder;
        r8 = r8 + 21;
        r10.<init>(r8);
        r8 = "Unsupported purpose: ";
        r10.append(r8);
        r10.append(r4);
        r4 = r10.toString();
        defpackage.xtl.c(r4);
        goto L_0x035d;
    L_0x0272:
        throw r9;
    L_0x0273:
        throw r9;
    L_0x0274:
        r4 = r8.e;
        if (r4 == 0) goto L_0x02b2;
    L_0x0278:
        r4 = new akpk;
        r4.<init>();
        r0.as = r4;
        r4 = r0.ag;
        r10 = r0.ac;
        r10 = r10.get();
        r10 = (defpackage.akpb) r10;
        r4 = r4.a(r10);
        r10 = r0.as;
        r4.a(r10);
        r10 = 2131755705; // 0x7f1002b9 float:1.9142297E38 double:1.053227259E-314;
        r10 = r3.findViewById(r10);
        r10 = (android.support.v7.widget.RecyclerView) r10;
        r11 = new ans;
        r11.<init>();
        r10.a(r11);
        r10.a(r4);
        r4 = r0.as;
        r8 = r8.e;
        r4.add(r8);
        defpackage.xpr.a(r10, r2);
        goto L_0x035d;
    L_0x02b2:
        r4 = r8.a;
        if (r4 == 0) goto L_0x035d;
    L_0x02b6:
        r0.a(r3, r4, r1);
        goto L_0x035d;
    L_0x02bb:
        if (r8 == 0) goto L_0x0335;
    L_0x02bd:
        r11 = r8.e;
        if (r11 != 0) goto L_0x02c2;
    L_0x02c1:
        goto L_0x0335;
    L_0x02c2:
        r4 = r4.p;
        if (r4 != 0) goto L_0x02c7;
    L_0x02c6:
        goto L_0x032f;
    L_0x02c7:
        r4 = r4.b;
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x032f;
    L_0x02cf:
        r4 = r8.e;
        r8 = r0.au;
        defpackage.xpr.a(r8, r2);
        r8 = new akpk;
        r8.<init>();
        r0.as = r8;
        r8 = r0.ag;
        r10 = r0.ac;
        r10 = r10.get();
        r10 = (defpackage.akpb) r10;
        r8 = r8.a(r10);
        r10 = r0.as;
        r8.a(r10);
        r10 = 2131755703; // 0x7f1002b7 float:1.9142293E38 double:1.053227258E-314;
        r10 = r3.findViewById(r10);
        r10 = (android.widget.ImageView) r10;
        r11 = 2131755702; // 0x7f1002b6 float:1.914229E38 double:1.0532272577E-314;
        r11 = r3.findViewById(r11);
        r11 = (android.support.v7.widget.RecyclerView) r11;
        r12 = new wjx;
        r12.<init>(r4, r10);
        r11.addOnLayoutChangeListener(r12);
        r12 = new ans;
        r12.<init>();
        r11.a(r12);
        r11.a(r8);
        r8 = r0.as;
        r8.add(r4);
        r4 = r0.al;
        r4 = r4.p;
        r8 = r4.b;
        r0.an = r8;
        r4 = r4.c;
        r0.ao = r4;
        r4 = new wka;
        r4.<init>(r0);
        r10.setOnClickListener(r4);
        goto L_0x035d;
    L_0x032f:
        r4 = "prefilled image post missed encryptedBlobId";
        defpackage.xtl.c(r4);
        goto L_0x035d;
    L_0x0335:
        if (r8 == 0) goto L_0x033f;
    L_0x0337:
        r4 = r8.a;
        if (r4 == 0) goto L_0x033f;
    L_0x033b:
        r0.a(r3, r4, r2);
        goto L_0x035d;
    L_0x033f:
        if (r10 == 0) goto L_0x035d;
    L_0x0341:
        r4 = r10.a;
        r8 = 34;
        if (r4 != r8) goto L_0x035d;
    L_0x0347:
        r4 = r23.ah();
        if (r4 == 0) goto L_0x035d;
    L_0x034d:
        r4 = r10.a;
        if (r4 != r8) goto L_0x0356;
    L_0x0351:
        r4 = r10.b;
        r4 = (defpackage.apct) r4;
        goto L_0x0358;
    L_0x0356:
        r4 = defpackage.apct.b;
    L_0x0358:
        r4 = r4.a;
        r0.a(r4);
    L_0x035d:
        r4 = 2131755706; // 0x7f1002ba float:1.9142299E38 double:1.0532272597E-314;
        r4 = r3.findViewById(r4);
        r11 = r4;
        r11 = (android.widget.ImageView) r11;
        r4 = 2131755704; // 0x7f1002b8 float:1.9142295E38 double:1.0532272587E-314;
        r4 = r3.findViewById(r4);
        r4 = (android.widget.ImageView) r4;
        r8 = 2131755707; // 0x7f1002bb float:1.91423E38 double:1.05322726E-314;
        r8 = r3.findViewById(r8);
        r13 = r8;
        r13 = (android.widget.ProgressBar) r13;
        r8 = 2131755708; // 0x7f1002bc float:1.9142303E38 double:1.0532272606E-314;
        r8 = r3.findViewById(r8);
        r15 = new wkq;
        r10 = r23.p();
        r10 = r10.getResources();
        r12 = 2131559031; // 0x7f0d0277 float:1.8743395E38 double:1.0531300893E-314;
        r16 = r10.getColor(r12);
        r10 = r15;
        r12 = r4;
        r14 = r8;
        r5 = r15;
        r15 = r16;
        r10.<init>(r11, r12, r13, r14, r15);
        r0.ap = r5;
        r5 = new wke;
        r5.<init>(r0);
        r4.setOnClickListener(r5);
        r4 = new wkd;
        r4.<init>(r0);
        r8.setOnClickListener(r4);
        r4 = r0.ab;
        r4.a = r0;
        r4 = r0.al;
        r4 = r4.k;
        if (r4 == 0) goto L_0x03be;
    L_0x03b7:
        r4 = r4.b;
        if (r4 != 0) goto L_0x03bf;
    L_0x03bb:
        r4 = defpackage.aphg.s;
        goto L_0x03bf;
    L_0x03be:
        r4 = r9;
    L_0x03bf:
        if (r4 != 0) goto L_0x03c2;
    L_0x03c1:
        goto L_0x03ed;
    L_0x03c2:
        r5 = r23.ah();
        if (r5 == 0) goto L_0x03ed;
    L_0x03c8:
        r5 = 2131755690; // 0x7f1002aa float:1.9142266E38 double:1.053227252E-314;
        r5 = r3.findViewById(r5);
        r5 = (android.widget.ImageView) r5;
        r5.setVisibility(r1);
        r8 = r4.a;
        r8 = r8 & 16384;
        if (r8 == 0) goto L_0x03e5;
    L_0x03da:
        r4 = r4.p;
        if (r4 != 0) goto L_0x03e0;
    L_0x03de:
        r4 = defpackage.aodv.c;
    L_0x03e0:
        r4 = r4.b;
        r5.setContentDescription(r4);
    L_0x03e5:
        r4 = new wkk;
        r4.<init>(r0);
        r5.setOnClickListener(r4);
    L_0x03ed:
        r4 = r23.aj();
        if (r4 == 0) goto L_0x0416;
    L_0x03f3:
        r5 = 2131755691; // 0x7f1002ab float:1.9142268E38 double:1.0532272522E-314;
        r5 = r3.findViewById(r5);
        r5 = (android.widget.ImageView) r5;
        r5.setVisibility(r1);
        r8 = r0.al;
        r8 = r8.c;
        r8 = r8.b;
        if (r8 != 0) goto L_0x0409;
    L_0x0407:
        r8 = defpackage.aphg.s;
    L_0x0409:
        r8 = r8.i;
        r5.setContentDescription(r8);
        r8 = new wkj;
        r8.<init>(r0, r4);
        r5.setOnClickListener(r8);
    L_0x0416:
        r4 = r0.al;
        r4 = r4.i;
        if (r4 != 0) goto L_0x041e;
    L_0x041c:
        r4 = r9;
        goto L_0x043f;
    L_0x041e:
        r5 = r4.a;
        r5 = r5 & r2;
        if (r5 == 0) goto L_0x041c;
    L_0x0423:
        r4 = r4.b;
        if (r4 != 0) goto L_0x0429;
    L_0x0427:
        r4 = defpackage.aphg.s;
    L_0x0429:
        r4 = r4.a;
        r4 = r4 & 4096;
        if (r4 == 0) goto L_0x041c;
    L_0x042f:
        r4 = r0.al;
        r4 = r4.i;
        r4 = r4.b;
        if (r4 != 0) goto L_0x0439;
    L_0x0437:
        r4 = defpackage.aphg.s;
    L_0x0439:
        r4 = r4.m;
        if (r4 != 0) goto L_0x043f;
    L_0x043d:
        r4 = defpackage.apxu.d;
    L_0x043f:
        if (r4 != 0) goto L_0x0442;
    L_0x0441:
        goto L_0x0477;
    L_0x0442:
        r5 = 2131755692; // 0x7f1002ac float:1.914227E38 double:1.0532272527E-314;
        r5 = r3.findViewById(r5);
        r5 = (android.widget.ImageView) r5;
        r5.setVisibility(r1);
        r8 = r0.al;
        r8 = r8.i;
        r8 = r8.b;
        if (r8 != 0) goto L_0x0458;
    L_0x0456:
        r8 = defpackage.aphg.s;
    L_0x0458:
        r10 = r8.p;
        if (r10 != 0) goto L_0x045e;
    L_0x045c:
        r10 = defpackage.aodv.c;
    L_0x045e:
        r10 = r10.a;
        r10 = r10 & r7;
        if (r10 != 0) goto L_0x0464;
    L_0x0463:
        goto L_0x046f;
    L_0x0464:
        r8 = r8.p;
        if (r8 != 0) goto L_0x046a;
    L_0x0468:
        r8 = defpackage.aodv.c;
    L_0x046a:
        r8 = r8.b;
        r5.setContentDescription(r8);
    L_0x046f:
        r8 = new wkm;
        r8.<init>(r0, r4);
        r5.setOnClickListener(r8);
    L_0x0477:
        r4 = 2131755541; // 0x7f100215 float:1.9141964E38 double:1.053227178E-314;
        r4 = r3.findViewById(r4);
        r4 = (android.support.v7.widget.Toolbar) r4;
        r5 = new xoe;
        r8 = r23.M_();
        r5.<init>(r8);
        r5 = r4.e();
        r8 = r23.M_();
        r10 = 2130772285; // 0x7f01013d float:1.7147684E38 double:1.052741385E-314;
        r8 = defpackage.xwe.a(r8, r10, r1);
        r5 = defpackage.xoe.a(r5, r8);
        r4.b(r5);
        r5 = 2132082688; // 0x7f150000 float:1.9805497E38 double:1.05338881E-314;
        r4.d(r5);
        r5 = r0.al;
        r5 = r5.g;
        r5 = defpackage.ajqy.a(r5);
        r4.a(r5);
        r5 = 2131951671; // 0x7f130037 float:1.9539763E38 double:1.053324079E-314;
        r4.c(r5);
        r5 = new wkl;
        r5.<init>(r0);
        r4.q = r5;
        r5 = new wko;
        r5.<init>(r0);
        r4.a(r5);
        r4 = r4.f();
        r5 = 2131755716; // 0x7f1002c4 float:1.914232E38 double:1.0532272646E-314;
        r4 = r4.findItem(r5);
        r0.aC = r4;
        r4 = r0.aC;
        r5 = r0.al;
        r5 = r5.b;
        r5 = r5.b;
        if (r5 != 0) goto L_0x04dd;
    L_0x04db:
        r5 = defpackage.aphg.s;
    L_0x04dd:
        r5 = r5.a;
        r5 = r5 & 128;
        if (r5 != 0) goto L_0x04e5;
    L_0x04e3:
        r5 = r9;
        goto L_0x04f5;
    L_0x04e5:
        r5 = r0.al;
        r5 = r5.b;
        r5 = r5.b;
        if (r5 != 0) goto L_0x04ef;
    L_0x04ed:
        r5 = defpackage.aphg.s;
    L_0x04ef:
        r5 = r5.g;
        if (r5 != 0) goto L_0x04f5;
    L_0x04f3:
        r5 = defpackage.arml.f;
    L_0x04f5:
        r5 = defpackage.ajqy.a(r5);
        r4.setTitle(r5);
        r4 = r0.al;
        r4 = r4.n;
        if (r4 == 0) goto L_0x05ac;
    L_0x0502:
        r5 = com.google.protos.youtube.api.innertube.BackstagePostDialogCreatorOnboardingPromoRendererOuterClass.backstagePostDialogCreatorOnboardingPromoRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r4.a(r5);
        r4 = r4.h;
        r5 = r5.d;
        r4 = r4.a(r5);
        if (r4 == 0) goto L_0x05ac;
    L_0x0515:
        r4 = r23.ai();
        if (r4 == 0) goto L_0x05ac;
    L_0x051b:
        r4 = r0.al;
        r4 = r4.n;
        r5 = com.google.protos.youtube.api.innertube.BackstagePostDialogCreatorOnboardingPromoRendererOuterClass.backstagePostDialogCreatorOnboardingPromoRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r4.a(r5);
        r4 = r4.h;
        r8 = r5.d;
        r4 = r4.b(r8);
        if (r4 != 0) goto L_0x0535;
    L_0x0532:
        r4 = r5.b;
        goto L_0x0539;
    L_0x0535:
        r4 = r5.a(r4);
    L_0x0539:
        r4 = (defpackage.apch) r4;
        r5 = r0.aF;
        defpackage.xpr.a(r5, r2);
        r5 = 2131755698; // 0x7f1002b2 float:1.9142283E38 double:1.0532272557E-314;
        r5 = r3.findViewById(r5);
        r5 = (android.widget.ImageView) r5;
        r8 = r0.Z;
        r10 = r4.c;
        if (r10 != 0) goto L_0x0551;
    L_0x054f:
        r10 = defpackage.aygk.f;
    L_0x0551:
        r8.a(r5, r10);
        r5 = 2131755697; // 0x7f1002b1 float:1.914228E38 double:1.053227255E-314;
        r5 = r3.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r8 = r4.b;
        if (r8 != 0) goto L_0x0563;
    L_0x0561:
        r8 = defpackage.arml.f;
    L_0x0563:
        r8 = defpackage.ajqy.a(r8);
        r5.setText(r8);
        r5 = 2131755699; // 0x7f1002b3 float:1.9142285E38 double:1.053227256E-314;
        r5 = r3.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r8 = r4.a;
        r8 = r8 & r6;
        if (r8 == 0) goto L_0x057f;
    L_0x0578:
        r8 = r4.d;
        if (r8 != 0) goto L_0x0580;
    L_0x057c:
        r8 = defpackage.arml.f;
        goto L_0x0580;
    L_0x057f:
        r8 = r9;
    L_0x0580:
        r10 = r0.aa;
        r8 = defpackage.aabb.a(r8, r10, r1);
        r5.setText(r8);
        r8 = r4.a;
        r6 = r6 & r8;
        if (r6 == 0) goto L_0x059d;
    L_0x058e:
        r4 = r4.d;
        if (r4 != 0) goto L_0x0594;
    L_0x0592:
        r4 = defpackage.arml.f;
    L_0x0594:
        r4 = defpackage.ajqy.b(r4);
        if (r4 == 0) goto L_0x059d;
    L_0x059a:
        r5.setContentDescription(r4);
    L_0x059d:
        r4 = 2131755700; // 0x7f1002b4 float:1.9142287E38 double:1.0532272567E-314;
        r4 = r3.findViewById(r4);
        r5 = new wkc;
        r5.<init>(r0);
        r4.setOnClickListener(r5);
    L_0x05ac:
        r4 = r0.al;
        r4 = r4.r;
        if (r4 == 0) goto L_0x0718;
    L_0x05b2:
        r5 = com.google.protos.youtube.api.innertube.BackstagePrefilledPostDialogHeaderRendererOuterClass.backstagePrefilledPostDialogHeaderRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r4.a(r5);
        r4 = r4.h;
        r5 = r5.d;
        r4 = r4.a(r5);
        if (r4 == 0) goto L_0x0718;
    L_0x05c5:
        r4 = r23.ai();
        if (r4 != 0) goto L_0x05cd;
    L_0x05cb:
        goto L_0x0718;
    L_0x05cd:
        r4 = r0.al;
        r4 = r4.r;
        r5 = com.google.protos.youtube.api.innertube.BackstagePrefilledPostDialogHeaderRendererOuterClass.backstagePrefilledPostDialogHeaderRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r4.a(r5);
        r4 = r4.h;
        r6 = r5.d;
        r4 = r4.b(r6);
        if (r4 != 0) goto L_0x05e7;
    L_0x05e4:
        r4 = r5.b;
        goto L_0x05eb;
    L_0x05e7:
        r4 = r5.a(r4);
    L_0x05eb:
        r4 = (defpackage.apcx) r4;
        r5 = r0.aG;
        defpackage.xpr.a(r5, r2);
        r5 = 2131755671; // 0x7f100297 float:1.9142228E38 double:1.0532272424E-314;
        r5 = r3.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r6 = r4.b;
        if (r6 != 0) goto L_0x0601;
    L_0x05ff:
        r6 = defpackage.arml.f;
    L_0x0601:
        r6 = defpackage.ajqy.a(r6);
        defpackage.xpr.a(r5, r6);
        r5 = 2131755672; // 0x7f100298 float:1.914223E38 double:1.053227243E-314;
        r5 = r3.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r6 = r4.c;
        if (r6 != 0) goto L_0x0617;
    L_0x0615:
        r6 = defpackage.arml.f;
    L_0x0617:
        r6 = defpackage.ajqy.a(r6);
        defpackage.xpr.a(r5, r6);
        r5 = r4.e;
        if (r5 != 0) goto L_0x0624;
    L_0x0622:
        r5 = defpackage.axak.a;
    L_0x0624:
        r6 = com.google.protos.youtube.api.innertube.BackstagePrefilledPostDialogHeaderRendererOuterClass.backstagePrefilledPostDialogHeaderFooterRenderer;
        r6 = defpackage.anxl.checkIsLite(r6);
        r5.a(r6);
        r5 = r5.h;
        r8 = r6.d;
        r5 = r5.b(r8);
        if (r5 != 0) goto L_0x063a;
    L_0x0637:
        r5 = r6.b;
        goto L_0x063e;
    L_0x063a:
        r5 = r6.a(r5);
    L_0x063e:
        r5 = (defpackage.apcw) r5;
        r6 = 2131755673; // 0x7f100299 float:1.9142232E38 double:1.0532272434E-314;
        r6 = r3.findViewById(r6);
        defpackage.xpr.a(r6, r1);
        if (r5 == 0) goto L_0x0689;
    L_0x064c:
        r8 = r5.b;
        if (r8 != 0) goto L_0x0652;
    L_0x0650:
        r8 = defpackage.arml.f;
    L_0x0652:
        r8 = defpackage.ajqy.a(r8);
        r5 = r5.c;
        if (r5 != 0) goto L_0x065c;
    L_0x065a:
        r5 = defpackage.arml.f;
    L_0x065c:
        r10 = r0.aa;
        r5 = defpackage.aabb.a(r5, r10, r1);
        r10 = android.text.TextUtils.isEmpty(r8);
        if (r10 == 0) goto L_0x066e;
    L_0x0668:
        r10 = android.text.TextUtils.isEmpty(r5);
        if (r10 != 0) goto L_0x0689;
    L_0x066e:
        defpackage.xpr.a(r6, r2);
        r6 = 2131755674; // 0x7f10029a float:1.9142234E38 double:1.053227244E-314;
        r6 = r3.findViewById(r6);
        r6 = (android.widget.TextView) r6;
        r10 = 2131755675; // 0x7f10029b float:1.9142236E38 double:1.0532272443E-314;
        r10 = r3.findViewById(r10);
        r10 = (android.widget.TextView) r10;
        defpackage.xpr.a(r6, r8);
        defpackage.xpr.a(r10, r5);
    L_0x0689:
        r4 = r4.d;
        if (r4 != 0) goto L_0x068f;
    L_0x068d:
        r4 = defpackage.aygk.f;
    L_0x068f:
        r5 = r0.aK;
        if (r5 != 0) goto L_0x06b8;
    L_0x0693:
        r5 = new android.util.DisplayMetrics;
        r5.<init>();
        r6 = r23.p();
        r6 = r6.getWindowManager();
        r6 = r6.getDefaultDisplay();
        r6.getMetrics(r5);
        r5 = r5.widthPixels;
        r0.aK = r5;
        r5 = r23.q();
        r6 = 2131626118; // 0x7f0e0886 float:1.8879463E38 double:1.0531632347E-314;
        r5 = r5.getDimensionPixelSize(r6);
        r0.aL = r5;
    L_0x06b8:
        r5 = r0.aK;
        r6 = r0.aL;
        r4 = defpackage.aklb.c(r4, r5, r6);
        r5 = 2131755670; // 0x7f100296 float:1.9142226E38 double:1.053227242E-314;
        r5 = r3.findViewById(r5);
        r5 = (android.widget.ImageView) r5;
        defpackage.xpr.a(r5, r1);
        if (r4 == 0) goto L_0x071b;
    L_0x06ce:
        defpackage.xpr.a(r5, r2);
        r6 = r5.getLayoutParams();
        r8 = -1;
        r6.width = r8;
        r6 = r5.getLayoutParams();
        r6.height = r1;
        r5.requestLayout();
        r5.setBackground(r9);
        r6 = r0.aJ;
        if (r6 != 0) goto L_0x070d;
    L_0x06e8:
        r6 = r0.aK;
        r8 = r0.aL;
        r10 = new wlb;
        r10.<init>(r6, r8);
        r6 = r0.ai;
        r8 = new akle;
        r2 = defpackage.aklf.a(r6, r2);
        r2 = (defpackage.xnk) r2;
        r6 = defpackage.aklf.a(r10, r7);
        r6 = (defpackage.xnh) r6;
        r7 = 3;
        r5 = defpackage.aklf.a(r5, r7);
        r5 = (android.widget.ImageView) r5;
        r8.<init>(r2, r6, r5, r1);
        r0.aJ = r8;
    L_0x070d:
        r1 = r0.aJ;
        r1.b();
        r1 = r0.aJ;
        r1.a(r4, r9);
        goto L_0x071b;
    L_0x0718:
        r23.X();
    L_0x071b:
        r23.ac();
        r1 = r0.aq;
        r1.requestFocus();
        r1 = defpackage.apxu.d;
        r1 = r1.createBuilder();
        r1 = (defpackage.apxx) r1;
        r2 = defpackage.avjf.h;
        r2 = r2.createBuilder();
        r2 = (defpackage.avjh) r2;
        r4 = r23.p();
        r4 = (defpackage.acwa) r4;
        r4 = r4.t();
        r5 = r4.d();
        r2.a(r5);
        r5 = r4.c();
        if (r5 == 0) goto L_0x075e;
    L_0x074a:
        r5 = r4.c();
        r5 = r5.e;
        if (r5 != 0) goto L_0x0753;
    L_0x0752:
        goto L_0x075e;
    L_0x0753:
        r4 = r4.c();
        r4 = r4.e;
        r4 = r4.aH;
        r2.a(r4);
    L_0x075e:
        r4 = defpackage.avjd.b;
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.avjf) r2;
        r1.a(r4, r2);
        r2 = r0.af;
        r4 = defpackage.acwl.c;
        r1 = r1.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.apxu) r1;
        r2.a(r4, r1, r9);
        r1 = r0.af;
        r2 = defpackage.acwc.BACKSTAGE_POST_DIALOG_CANCEL_BUTTON;
        r1.b(r2, r9);
        r1 = r0.af;
        r2 = defpackage.acwc.BACKSTAGE_POST_DIALOG_SUBMIT_BUTTON;
        r1.b(r2, r9);
        return r3;
    L_0x0789:
        goto L_0x078b;
    L_0x078a:
        throw r9;
    L_0x078b:
        goto L_0x078a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjv.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    private final boolean ag() {
        ajrq ajrq = this.al;
        return (ajrq == null || ajrq.u == null) ? false : true;
    }

    public final void onGlobalLayout() {
        if (ag()) {
            TextView textView = this.aM;
            if (textView != null) {
                textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Layout layout = this.aM.getLayout();
                if (layout == null || layout.getLineCount() != 1 || layout.getEllipsisCount(0) <= 0) {
                    xpr.a(this.aM, true);
                } else {
                    xpr.a(this.aM, false);
                }
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        OnDismissListener onDismissListener = this.az;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.af.a();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!ai()) {
            W();
            X();
        }
        if (ag()) {
            TextView textView = this.aM;
            if (textView != null) {
                textView.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }
    }

    private final boolean ah() {
        apcn apcn = this.al.l;
        if (apcn != null) {
            aphj aphj = apcn.b;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void a(List list) {
        arml arml;
        BackstagePollEditorView backstagePollEditorView = this.ar;
        backstagePollEditorView.b();
        aphj aphj = backstagePollEditorView.b.b;
        if (aphj == null) {
            aphj = aphj.d;
        }
        boolean z = true;
        amqw.b((aphj.a & 1) != 0);
        if (backstagePollEditorView.c != null) {
            z = false;
        }
        amqw.b(z, (Object) "Create option button can be added only once.");
        backstagePollEditorView.c = (TextView) LayoutInflater.from(backstagePollEditorView.getContext()).inflate(R.layout.backstage_poll_editor_create_option, backstagePollEditorView, false);
        TextView textView = backstagePollEditorView.c;
        aphj aphj2 = backstagePollEditorView.b.b;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        aphg aphg = aphj2.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        if ((aphg.a & 128) == 0) {
            arml = null;
        } else {
            aphj2 = backstagePollEditorView.b.b;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            aphg = aphj2.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
        }
        textView.setText(ajqy.a(arml));
        backstagePollEditorView.c.setOnClickListener(new wjs(backstagePollEditorView));
        View view = backstagePollEditorView.c;
        xpr.a(view, view.getBackground());
        backstagePollEditorView.addView(backstagePollEditorView.c);
        for (String a : list) {
            backstagePollEditorView.a(a);
        }
        for (int size = backstagePollEditorView.a().size(); size < backstagePollEditorView.b.d; size++) {
            backstagePollEditorView.a("");
        }
        this.ar.setVisibility(0);
        ac();
    }

    private final void a(View view, azdt azdt, boolean z) {
        view = view.findViewById(R.id.video_removal_button);
        xpr.a(view, z);
        view.setOnClickListener(new wjz(this));
        akor akor = new akor();
        akor.a(this.af);
        view = this.aE.a(akor, azdt);
        xpr.a(this.at, true);
        this.aH.addView(view);
        this.av = azdt.e;
    }

    private final boolean ai() {
        return q().getConfiguration().orientation == 1;
    }

    public final void W() {
        xpr.a(this.aF, false);
    }

    public final void X() {
        xpr.a(this.aG, false);
    }

    public final void W_() {
        super.W_();
        Dialog dialog = this.c;
        if (dialog != null) {
            Window window = dialog.getWindow();
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(aB);
            window.setSoftInputMode(5);
        }
    }

    public final void i() {
        super.i();
        this.ab.a = null;
        akpk akpk = this.as;
        if (akpk != null) {
            akpk.clear();
        }
        this.aE.a(this.aH);
    }

    /* JADX WARNING: Missing block: B:31:0x00e0, code skipped:
            if (r0 > r6) goto L_0x00e2;
     */
    public final void a(android.graphics.drawable.Drawable r6, int r7) {
        /*
        r5 = this;
        r0 = 0;
        r5.an = r0;
        r0 = r5.ap;
        r1 = 2;
        if (r0 == 0) goto L_0x0081;
    L_0x0008:
        r2 = r5.aq;
        r2 = r2.getWidth();
        r0.c = r7;
        r7 = r6.getIntrinsicWidth();
        if (r7 >= r2) goto L_0x0063;
    L_0x0016:
        r7 = r0.a;
        r7 = r7.getResources();
        r7 = r7.getDisplayMetrics();
        r3 = r6.getIntrinsicWidth();
        r3 = defpackage.xss.a(r7, r3);
        r4 = r6.getIntrinsicHeight();
        r7 = defpackage.xss.a(r7, r4);
        if (r3 >= r2) goto L_0x0043;
    L_0x0032:
        r2 = r0.a;
        r2 = r2.getLayoutParams();
        r2.width = r3;
        r2 = r0.a;
        r2 = r2.getLayoutParams();
        r2.height = r7;
        goto L_0x0074;
    L_0x0043:
        r7 = r0.a;
        r7 = r7.getLayoutParams();
        r7.width = r2;
        r7 = r0.a;
        r7 = r7.getLayoutParams();
        r2 = (float) r2;
        r3 = r6.getIntrinsicHeight();
        r3 = (float) r3;
        r4 = r6.getIntrinsicWidth();
        r4 = (float) r4;
        r3 = r3 / r4;
        r2 = r2 * r3;
        r2 = (int) r2;
        r7.height = r2;
        goto L_0x0074;
    L_0x0063:
        r7 = r0.a;
        r7 = r7.getLayoutParams();
        r2 = -2;
        r7.width = r2;
        r7 = r0.a;
        r7 = r7.getLayoutParams();
        r7.height = r2;
    L_0x0074:
        r7 = r0.a;
        r7.requestLayout();
        r7 = r0.a;
        r7.setImageDrawable(r6);
        r0.a(r1);
    L_0x0081:
        r7 = r5.aj();
        if (r7 == 0) goto L_0x0104;
    L_0x0087:
        r0 = com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r7.a(r0);
        r2 = r7.h;
        r0 = r0.d;
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x009b;
    L_0x009a:
        goto L_0x0104;
    L_0x009b:
        r0 = com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint;
        r0 = defpackage.anxl.checkIsLite(r0);
        r7.a(r0);
        r7 = r7.h;
        r2 = r0.d;
        r7 = r7.b(r2);
        if (r7 != 0) goto L_0x00b1;
    L_0x00ae:
        r7 = r0.b;
        goto L_0x00b5;
    L_0x00b1:
        r7 = r0.a(r7);
    L_0x00b5:
        r7 = (com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) r7;
        r7 = r7.d;
        if (r7 != 0) goto L_0x00bd;
    L_0x00bb:
        r7 = defpackage.apbi.e;
    L_0x00bd:
        r0 = r6.getIntrinsicWidth();
        r6 = r6.getIntrinsicHeight();
        if (r0 == 0) goto L_0x0104;
    L_0x00c7:
        if (r6 == 0) goto L_0x0104;
    L_0x00c9:
        r0 = (float) r0;
        r6 = (float) r6;
        r0 = r0 / r6;
        r6 = r7.b;
        r2 = 0;
        r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r3 > 0) goto L_0x00d4;
    L_0x00d3:
        goto L_0x00d8;
    L_0x00d4:
        r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r6 < 0) goto L_0x00e2;
    L_0x00d8:
        r6 = r7.c;
        r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r7 <= 0) goto L_0x0104;
    L_0x00de:
        r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x0104;
    L_0x00e2:
        r6 = r5.K;
        r7 = 2131952348; // 0x7f1302dc float:1.9541136E38 double:1.0533244137E-314;
        r6 = android.support.design.snackbar.Snackbar.a(r6, r7);
        if (r6 == 0) goto L_0x0104;
    L_0x00ed:
        r7 = r6.e;
        r0 = 2131755160; // 0x7f100098 float:1.9141191E38 double:1.05322699E-314;
        r7 = r7.findViewById(r0);
        r7 = (android.widget.TextView) r7;
        r0 = 1067869798; // 0x3fa66666 float:1.3 double:5.275977814E-315;
        r7.setLineSpacing(r2, r0);
        r7.setMaxLines(r1);
        r6.c();
    L_0x0104:
        r5.ac();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjv.a(android.graphics.drawable.Drawable, int):void");
    }

    public final void a(String str) {
        this.an = str;
        wkq wkq = this.ap;
        if (wkq != null) {
            wkq.a(4);
        }
        ac();
    }

    public final void a() {
        wkq wkq = this.ap;
        if (wkq != null) {
            wkq.a(3);
        }
        ac();
    }

    public final apbv Y() {
        apby apby = (apby) apbv.f.createBuilder();
        String obj = this.aq.getText().toString();
        int i = 0;
        while (Patterns.WEB_URL.matcher(obj).find()) {
            i++;
        }
        int trimmedLength = TextUtils.getTrimmedLength(obj);
        apby.copyOnWrite();
        apbv apbv = (apbv) apby.instance;
        apbv.a |= 1;
        apbv.b = trimmedLength;
        trimmedLength = this.aq.getLineCount();
        apby.copyOnWrite();
        apbv = (apbv) apby.instance;
        apbv.a |= 8;
        apbv.d = trimmedLength;
        apby.copyOnWrite();
        apbv apbv2 = (apbv) apby.instance;
        apbv2.a |= 4;
        apbv2.c = i;
        trimmedLength = this.ay;
        apby.copyOnWrite();
        apbv = (apbv) apby.instance;
        apbv.a |= 16;
        apbv.e = trimmedLength;
        return (apbv) ((anxl) apby.build());
    }

    public final apbr Z() {
        int i;
        apbr apbr;
        wkq wkq = this.ap;
        if (wkq == null || !wkq.b()) {
            akpk akpk = this.as;
            if (akpk == null || akpk.isEmpty()) {
                return null;
            }
        }
        apbu apbu = (apbu) apbr.g.createBuilder();
        wkq wkq2 = this.ap;
        int i2 = 3;
        if (wkq2 != null && wkq2.b()) {
            wkq2 = this.ap;
            i = wkq2.b != 3 ? !wkq2.a() ? 2 : 4 : 3;
            wkq wkq3 = this.ap;
            int i3 = 0;
            int intrinsicWidth = wkq3.a.getDrawable() != null ? wkq3.a.getDrawable().getIntrinsicWidth() : 0;
            apbu.copyOnWrite();
            apbr apbr2 = (apbr) apbu.instance;
            apbr2.a |= 8;
            apbr2.e = intrinsicWidth;
            wkq3 = this.ap;
            if (wkq3.a.getDrawable() != null) {
                i3 = wkq3.a.getDrawable().getIntrinsicHeight();
            }
            apbu.copyOnWrite();
            apbr = (apbr) apbu.instance;
            apbr.a |= 16;
            apbr.f = i3;
            intrinsicWidth = this.ap.c;
            apbu.copyOnWrite();
            apbr2 = (apbr) apbu.instance;
            apbr2.a = 4 | apbr2.a;
            apbr2.d = (long) intrinsicWidth;
        } else {
            i = 2;
            i2 = 2;
        }
        apbu.copyOnWrite();
        apbr = (apbr) apbu.instance;
        apbr.a |= 1;
        apbr.b = i - 1;
        apbu.copyOnWrite();
        apbr apbr3 = (apbr) apbu.instance;
        apbr3.a = 2 | apbr3.a;
        apbr3.c = i2 - 1;
        return (apbr) ((anxl) apbu.build());
    }

    public final apbx aa() {
        if (this.at.getVisibility() != 0) {
            return null;
        }
        apca apca = (apca) apbx.d.createBuilder();
        apca.copyOnWrite();
        apbx apbx = (apbx) apca.instance;
        apbx.a |= 2;
        apbx.c = 1;
        String str = this.av;
        apca.copyOnWrite();
        apbx apbx2 = (apbx) apca.instance;
        if (str != null) {
            apbx2.a = 1 | apbx2.a;
            apbx2.b = str;
            return (apbx) ((anxl) apca.build());
        }
        throw new NullPointerException();
    }

    public final apbt ab() {
        if (this.ar.getVisibility() != 0) {
            return null;
        }
        apbw apbw = (apbw) apbt.d.createBuilder();
        int i = 0;
        int i2 = 0;
        for (String isEmpty : this.ar.a()) {
            if (TextUtils.isEmpty(isEmpty)) {
                i++;
            } else {
                i2++;
            }
        }
        apbw.copyOnWrite();
        apbt apbt = (apbt) apbw.instance;
        apbt.a |= 2;
        apbt.c = i;
        apbw.copyOnWrite();
        apbt = (apbt) apbw.instance;
        apbt.a |= 1;
        apbt.b = i2;
        return (apbt) ((anxl) apbw.build());
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARNING: Missing block: B:45:0x00ac, code skipped:
            if (r10.au.getVisibility() == 0) goto L_0x00b5;
     */
    /* JADX WARNING: Missing block: B:46:0x00af, code skipped:
            if (r2 == 2) goto L_0x00b1;
     */
    /* JADX WARNING: Missing block: B:48:0x00b3, code skipped:
            if (r1.e != null) goto L_0x00b5;
     */
    /* JADX WARNING: Missing block: B:50:0x00c1, code skipped:
            if (android.text.TextUtils.isEmpty(defpackage.ajqy.a(r10.al.o)) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Missing block: B:51:0x00c3, code skipped:
            r0 = defpackage.ajqy.a(r10.al.o);
     */
    public final void ac() {
        /*
        r10 = this;
        r0 = r10.ae();
        r1 = r10.ad();
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x000e;
    L_0x000c:
        r1 = 1;
        goto L_0x0012;
    L_0x000e:
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        goto L_0x000c;
    L_0x0011:
        r1 = 0;
    L_0x0012:
        r4 = r10.ap;
        if (r4 == 0) goto L_0x001f;
    L_0x0016:
        r4 = r4.a();
        if (r4 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r4 = 1;
        goto L_0x0020;
    L_0x001f:
        r4 = 0;
    L_0x0020:
        r5 = r10.ar;
        r5 = r5.getVisibility();
        if (r5 != 0) goto L_0x0072;
    L_0x0028:
        r5 = r10.ar;
        r6 = r5.b;
        defpackage.amqw.a(r6);
        r6 = r5.a();
        r7 = r6.size();
        r8 = r5.b;
        r8 = r8.d;
        if (r7 >= r8) goto L_0x003f;
    L_0x003d:
        r5 = 1;
        goto L_0x0073;
    L_0x003f:
        r7 = r6.size();
        r8 = r5.b;
        r8 = r8.e;
        if (r7 <= r8) goto L_0x004a;
    L_0x0049:
        goto L_0x003d;
    L_0x004a:
        r6 = r6.iterator();
    L_0x004e:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x0072;
    L_0x0054:
        r7 = r6.next();
        r7 = (java.lang.String) r7;
        if (r7 == 0) goto L_0x003d;
    L_0x005c:
        r8 = r7.length();
        r9 = r5.b;
        r9 = r9.f;
        if (r8 >= r9) goto L_0x0067;
    L_0x0066:
        goto L_0x003d;
    L_0x0067:
        r7 = r7.length();
        r8 = r5.b;
        r8 = r8.g;
        if (r7 <= r8) goto L_0x004e;
    L_0x0071:
        goto L_0x003d;
    L_0x0072:
        r5 = 0;
    L_0x0073:
        if (r1 != 0) goto L_0x0076;
    L_0x0075:
        goto L_0x0084;
    L_0x0076:
        if (r5 != 0) goto L_0x0084;
    L_0x0078:
        if (r4 != 0) goto L_0x0084;
    L_0x007a:
        r1 = r10.ax;
        if (r1 == 0) goto L_0x0083;
    L_0x007e:
        r1 = r10.aw;
        if (r1 != 0) goto L_0x0083;
    L_0x0082:
        goto L_0x0084;
    L_0x0083:
        r2 = 1;
    L_0x0084:
        r10.f(r2);
        r1 = r10.aD;
        r2 = r10.af();
        r2 = r2 ^ r3;
        defpackage.xpr.a(r1, r2);
        r1 = r10.aI;
        if (r1 == 0) goto L_0x0096;
    L_0x0095:
        goto L_0x00cc;
    L_0x0096:
        r1 = r10.al;
        r2 = r1.v;
        r3 = 2;
        if (r2 != r3) goto L_0x00af;
    L_0x009d:
        r2 = r1.f;
        if (r2 == 0) goto L_0x00b1;
    L_0x00a1:
        r2 = r2.e;
        if (r2 != 0) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00b1;
    L_0x00a6:
        r1 = r10.au;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x00cc;
    L_0x00ae:
        goto L_0x00b5;
    L_0x00af:
        if (r2 != r3) goto L_0x00cc;
    L_0x00b1:
        r1 = r1.e;
        if (r1 == 0) goto L_0x00cc;
    L_0x00b5:
        r1 = r10.al;
        r1 = r1.o;
        r1 = defpackage.ajqy.a(r1);
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x00cc;
    L_0x00c3:
        r0 = r10.al;
        r0 = r0.o;
        r0 = defpackage.ajqy.a(r0);
        goto L_0x00f0;
    L_0x00cc:
        if (r0 == 0) goto L_0x00d7;
    L_0x00ce:
        r0 = r10.al;
        r0 = r0.h;
        r0 = defpackage.ajqy.a(r0);
        goto L_0x00f0;
    L_0x00d7:
        r0 = r10.ar;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x00e8;
    L_0x00df:
        r0 = r10.al;
        r0 = r0.j;
        r0 = defpackage.ajqy.a(r0);
        goto L_0x00f0;
    L_0x00e8:
        r0 = r10.al;
        r0 = r0.d;
        r0 = defpackage.ajqy.a(r0);
    L_0x00f0:
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x00fb;
    L_0x00f6:
        r1 = r10.aq;
        r1.setHint(r0);
    L_0x00fb:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjv.ac():void");
    }

    public final void f(boolean z) {
        MenuItem menuItem = this.aC;
        if (menuItem != null) {
            menuItem.setEnabled(z);
        }
    }

    public final boolean ad() {
        return TextUtils.getTrimmedLength(this.aq.getText()) > 0;
    }

    public final boolean ae() {
        boolean z = true;
        if (TextUtils.isEmpty(this.an)) {
            akpk akpk = this.as;
            if (akpk == null) {
                z = false;
            } else if (akpk.isEmpty()) {
                return false;
            } else {
                return z;
            }
        }
        return z;
    }

    public final boolean af() {
        wkq wkq = this.ap;
        if (wkq == null || !wkq.b()) {
            akpk akpk = this.as;
            if (!((akpk != null && !akpk.isEmpty()) || this.at.getVisibility() == 0 || this.ar.getVisibility() == 0)) {
                return false;
            }
        }
        return true;
    }

    private final apxu aj() {
        apbz apbz = this.al.c;
        if (!(apbz == null || (apbz.a & 1) == 0)) {
            aphg aphg = apbz.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 4096) != 0) {
                aphg = this.al.c.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                apxu apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                return apxu;
            }
        }
        return null;
    }

    public final void b(Dialog dialog, int i) {
        new Builder(p()).setMessage(i).setNegativeButton(R.string.comments_discard_negative_button, new wkf()).setPositiveButton(R.string.comments_discard_positive_button, new wkg(this, dialog)).setCancelable(false).create().show();
    }
}
