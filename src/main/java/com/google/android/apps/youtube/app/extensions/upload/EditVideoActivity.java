package com.google.android.apps.youtube.app.extensions.upload;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.textfield.TextInputLayout;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.edit.geo.EditLocation;
import com.google.android.libraries.youtube.edit.geo.LocationSearchView;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.youtube.R;
import defpackage.aaas;
import defpackage.abdj;
import defpackage.acvx;
import defpackage.acwc;
import defpackage.ads;
import defpackage.afpu;
import defpackage.afqh;
import defpackage.ajqy;
import defpackage.ajvk;
import defpackage.ajxd;
import defpackage.ajxe;
import defpackage.akab;
import defpackage.akad;
import defpackage.akaz;
import defpackage.akba;
import defpackage.akcl;
import defpackage.akkq;
import defpackage.alad;
import defpackage.alai;
import defpackage.alak;
import defpackage.alan;
import defpackage.alyf;
import defpackage.amqw;
import defpackage.aocf;
import defpackage.arml;
import defpackage.aswl;
import defpackage.aswo;
import defpackage.aujp;
import defpackage.auka;
import defpackage.aukf;
import defpackage.auol;
import defpackage.auoz;
import defpackage.aupd;
import defpackage.auph;
import defpackage.aupj;
import defpackage.auxf;
import defpackage.awnx;
import defpackage.aygk;
import defpackage.bapu;
import defpackage.dvg;
import defpackage.dvk;
import defpackage.fbp;
import defpackage.fda;
import defpackage.fde;
import defpackage.fpa;
import defpackage.gsd;
import defpackage.gse;
import defpackage.gsf;
import defpackage.gsi;
import defpackage.gsj;
import defpackage.gsk;
import defpackage.gsm;
import defpackage.nn;
import defpackage.ra;
import defpackage.xci;
import defpackage.xcp;
import defpackage.xfc;
import defpackage.xpr;
import defpackage.xtl;
import defpackage.xvd;
import defpackage.zqj;
import defpackage.zqm;
import defpackage.zqs;
import defpackage.zqz;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EditVideoActivity extends dvg implements xcp, xfc, zqj {
    public fde A;
    public EditLocation B;
    public gsm C;
    private ViewAnimatorHelper D;
    private LoadingFrameLayout E;
    private ImageView F;
    private TextView G;
    private TextInputLayout H;
    private TextInputLayout I;
    private TextInputLayout J;
    private EditText K;
    private EditText L;
    private YouTubeTextView M;
    private PrivacySpinner N;
    private EditText O;
    private LocationSearchView P;
    private zqm Q;
    private alak R;
    private String S;
    private String T;
    private fpa U;
    private ArrayList V;
    private byte[] W;
    private boolean X = true;
    private boolean Y = true;
    public afpu l;
    public zzl m;
    public abdj n;
    public xci o;
    public bapu p;
    public acvx q;
    public zqs r;
    public zqz s;
    public alyf t;
    public aaas u;
    public fbp v;
    public fda w;
    public String x;
    public ajvk y;
    public boolean z;

    private final gsk y() {
        return ((gsj) ((xfc) getApplication()).n()).b(new dvk(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.edit_activity);
        if (bundle != null) {
            akcl akcl = (akcl) bundle.getParcelable("get_metadata_editor_response_key");
            if (akcl != null) {
                this.y = (ajvk) akcl.a(new ajvk());
            }
        }
        this.C = new gsm(this);
        p().a(this.C);
        ads g = g();
        g.a((int) R.string.edit_video_form_title);
        g.b(true);
        g.a(ra.a((Context) this, (int) R.drawable.ic_arrow_back_black));
        g.i();
        this.D = (ViewAnimatorHelper) findViewById(R.id.view_animator);
        this.E = (LoadingFrameLayout) findViewById(R.id.edit_activity_layout);
        this.F = (ImageView) findViewById(R.id.thumbnail);
        this.G = (TextView) findViewById(R.id.duration);
        this.H = (TextInputLayout) findViewById(R.id.title_edit_wrapper);
        this.I = (TextInputLayout) findViewById(R.id.description_edit_wrapper);
        this.J = (TextInputLayout) findViewById(R.id.tags_edit_wrapper);
        this.K = (EditText) findViewById(R.id.title_edit);
        this.L = (EditText) findViewById(R.id.description_edit);
        this.M = (YouTubeTextView) findViewById(R.id.privacy_label);
        this.N = (PrivacySpinner) findViewById(R.id.privacy);
        this.O = (EditText) findViewById(R.id.tags_edit);
        this.B = (EditLocation) findViewById(R.id.location_editor);
        this.P = (LocationSearchView) findViewById(R.id.location_search_view);
        this.v.a((BottomUiContainer) findViewById(R.id.bottom_ui_container));
    }

    /* Access modifiers changed, original: protected|final */
    public final void b_(int i) {
        if (i == 2) {
            setTheme(R.style.f524Theme.YouTube.EditVideoActivity.Dark);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        y().a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        if (this.l.a()) {
            Intent intent = getIntent();
            if ("android.intent.action.EDIT".equals(intent.getAction())) {
                this.x = intent.getStringExtra("video_id");
                if (this.x == null) {
                    xtl.c("VideoId not provided.");
                    finish();
                    return;
                }
                this.W = intent.getByteArrayExtra("click_tracking_params");
                if (this.y != null) {
                    a(false);
                    return;
                }
                xvd.a(this.x);
                this.E.b();
                this.E.a();
                if (B() && alai.a((Context) this, 3)) {
                    this.s.a(new gse(this));
                    return;
                } else {
                    a(null);
                    return;
                }
            }
            String valueOf = String.valueOf(intent.getAction());
            String str = "Unsupported action: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            xtl.c(valueOf);
            finish();
            return;
        }
        finish();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        if (this.l.a()) {
            this.o.a((Object) this);
        } else {
            finish();
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        alak alak = this.R;
        if (alak == null || !alak.a(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        super.onPause();
        this.o.b(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        super.onStop();
        this.s.d();
        z();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        aocf aocf = this.y;
        if (aocf != null) {
            bundle.putParcelable("get_metadata_editor_response_key", new akcl(aocf));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDestroy() {
        super.onDestroy();
        this.z = true;
    }

    /* JADX WARNING: Missing block: B:11:0x003a, code skipped:
            if (android.text.TextUtils.isEmpty(r2.S) == false) goto L_0x00a9;
     */
    /* JADX WARNING: Missing block: B:19:0x0066, code skipped:
            if (android.text.TextUtils.isEmpty(r2.T) == false) goto L_0x00a9;
     */
    /* JADX WARNING: Missing block: B:31:0x0096, code skipped:
            if (r2.V != null) goto L_0x00a9;
     */
    public final void onBackPressed() {
        /*
        r2 = this;
        r0 = r2.D;
        r0 = r0.a();
        r1 = 2131756651; // 0x7f10066b float:1.9144216E38 double:1.0532277266E-314;
        if (r0 != r1) goto L_0x0010;
    L_0x000b:
        r0 = 0;
        r2.a(r0);
        return;
    L_0x0010:
        r0 = r2.K;
        r0 = r0.isShown();
        if (r0 == 0) goto L_0x003c;
    L_0x0018:
        r0 = r2.K;
        r0 = r0.getText();
        r0 = r0.toString();
        r0 = r0.trim();
        r1 = r2.S;
        r1 = android.text.TextUtils.equals(r0, r1);
        if (r1 != 0) goto L_0x003c;
    L_0x002e:
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00a9;
    L_0x0034:
        r0 = r2.S;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00a9;
    L_0x003c:
        r0 = r2.L;
        r0 = r0.isShown();
        if (r0 == 0) goto L_0x0068;
    L_0x0044:
        r0 = r2.L;
        r0 = r0.getText();
        r0 = r0.toString();
        r0 = r0.trim();
        r1 = r2.T;
        r1 = android.text.TextUtils.equals(r0, r1);
        if (r1 != 0) goto L_0x0068;
    L_0x005a:
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00a9;
    L_0x0060:
        r0 = r2.T;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00a9;
    L_0x0068:
        r0 = r2.N;
        r0 = r0.isShown();
        if (r0 == 0) goto L_0x007a;
    L_0x0070:
        r0 = r2.N;
        r0 = r0.a();
        r1 = r2.U;
        if (r0 != r1) goto L_0x00a9;
    L_0x007a:
        r0 = r2.O;
        r0 = r0.isShown();
        if (r0 == 0) goto L_0x0098;
    L_0x0082:
        r0 = r2.A();
        r1 = r2.V;
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x0098;
    L_0x008e:
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00a9;
    L_0x0094:
        r0 = r2.V;
        if (r0 != 0) goto L_0x00a9;
    L_0x0098:
        r0 = r2.B;
        r0 = r0.isShown();
        if (r0 == 0) goto L_0x00b2;
    L_0x00a0:
        r0 = r2.B;
        r0 = r0.a();
        if (r0 != 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00b2;
    L_0x00a9:
        r0 = new gsc;
        r0.<init>(r2);
        defpackage.gso.a(r2, r0);
        return;
    L_0x00b2:
        super.onBackPressed();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity.onBackPressed():void");
    }

    public final boolean o() {
        onBackPressed();
        return true;
    }

    public final void bo_() {
        if (!B() || alai.a((Context) this, 3)) {
            v();
            return;
        }
        this.R = new alak(alan.a((nn) this), this.q, Arrays.asList(new alad[]{new alad(3, acwc.EDIT_VIDEO_APPROVE_LOCATION_BUTTON, acwc.EDIT_VIDEO_DENY_LOCATION_BUTTON)}), R.string.permission_open_settings_location, R.string.permissions_missing_location, new gsd(this));
        this.R.a();
    }

    public final void a(aukf aukf) {
        aswo aswo = (aswo) aswl.e.createBuilder();
        aswo.a(this.x);
        if (aukf != null) {
            aswo.copyOnWrite();
            aswl aswl = (aswl) aswo.instance;
            aswl.d = aukf;
            aswl.a |= 4;
        }
        this.n.a(aswo, new gsf(this), this.W);
    }

    public final void a(boolean z) {
        amqw.a(this.y);
        g().e();
        this.D.a(R.id.scroll_container);
        this.H.setVisibility(8);
        this.I.setVisibility(8);
        this.M.setVisibility(8);
        this.N.setVisibility(8);
        this.J.setVisibility(8);
        ajxd[] ajxdArr = this.y.a;
        int length = ajxdArr.length;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i < length) {
                akba akba = ajxdArr[i].b;
                if (akba != null) {
                    akaz akaz = akba.a;
                    if (akaz != null) {
                        akab akab = akaz.a;
                        if (akab != null) {
                            akad[] akadArr = akab.b;
                            int length2 = akadArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                ajxe ajxe = akadArr[i3].k;
                                if (ajxe != null) {
                                    auxf[] auxfArr = ajxe.a;
                                    int length3 = auxfArr.length;
                                    int i4 = 0;
                                    while (i4 < length3) {
                                        auxf auxf = auxfArr[i4];
                                        int i5 = auxf.a;
                                        if ((i5 & 64) != 0) {
                                            aupj aupj = auxf.h;
                                            if (aupj == null) {
                                                aupj = aupj.f;
                                            }
                                            this.S = aupj.b;
                                            if (z) {
                                                this.K.setText(this.S);
                                            }
                                            i5 = aupj.d;
                                            if (i5 > 0) {
                                                EditText editText = this.K;
                                                InputFilter[] inputFilterArr = new InputFilter[i2];
                                                inputFilterArr[0] = new LengthFilter(i5);
                                                editText.setFilters(inputFilterArr);
                                            }
                                            this.X = aupj.c;
                                            this.H.setVisibility(0);
                                        } else if ((i5 & 128) != 0) {
                                            auol auol = auxf.i;
                                            if (auol == null) {
                                                auol = auol.f;
                                            }
                                            this.T = auol.b;
                                            if (z) {
                                                this.L.setText(this.T);
                                            }
                                            if (auol.e > 0) {
                                                this.L.setFilters(new InputFilter[]{new LengthFilter(r12)});
                                            }
                                            this.Y = auol.d;
                                            this.I.setVisibility(0);
                                        } else if ((i5 & 256) != 0) {
                                            awnx a;
                                            auoz auoz = auxf.j;
                                            if (auoz == null) {
                                                auoz = auoz.h;
                                            }
                                            this.U = fpa.PRIVATE;
                                            if (auoz.b == 1) {
                                                a = awnx.a(((Integer) auoz.c).intValue());
                                                if (a == null) {
                                                    a = awnx.PRIVATE;
                                                }
                                            } else {
                                                a = awnx.PRIVATE;
                                            }
                                            i2 = a.ordinal();
                                            if (i2 == 1) {
                                                this.U = fpa.PUBLIC;
                                            } else if (i2 == 2) {
                                                this.U = fpa.UNLISTED;
                                            }
                                            if (z) {
                                                this.N.a(this.U);
                                            }
                                            this.M.setVisibility(0);
                                            this.N.setVisibility(0);
                                        } else if ((i5 & 1024) != 0) {
                                            aupd aupd = auxf.l;
                                            if (aupd == null) {
                                                aupd = aupd.b;
                                            }
                                            this.V = new ArrayList();
                                            this.V.addAll(aupd.a);
                                            if (z) {
                                                this.O.setText(TextUtils.join(", ", aupd.a));
                                            }
                                            this.J.setVisibility(0);
                                        } else if ((i5 & 8) != 0) {
                                            arml arml;
                                            auph auph = auxf.e;
                                            if (auph == null) {
                                                auph = auph.d;
                                            }
                                            this.G.setVisibility(0);
                                            TextView textView = this.G;
                                            if ((auph.a & 2) != 0) {
                                                arml = auph.c;
                                                if (arml == null) {
                                                    arml = arml.f;
                                                }
                                            } else {
                                                arml = null;
                                            }
                                            textView.setText(ajqy.a(arml));
                                            this.F.setVisibility(0);
                                            if ((auph.a & 1) != 0) {
                                                akkq akkq = (akkq) this.p.get();
                                                ImageView imageView = this.F;
                                                aygk aygk = auph.b;
                                                if (aygk == null) {
                                                    aygk = aygk.f;
                                                }
                                                akkq.a(imageView, aygk);
                                            }
                                        } else if ((2097152 & i5) != 0) {
                                            auka auka = auxf.v;
                                            if (auka == null) {
                                                auka = auka.i;
                                            }
                                            this.B.setVisibility(0);
                                            this.B.a(this);
                                            if (z) {
                                                this.B.a(auka);
                                            }
                                        }
                                        i4++;
                                        i2 = 1;
                                    }
                                }
                                i3++;
                                i2 = 1;
                            }
                        }
                    }
                }
                i++;
            } else {
                this.E.b();
                this.C.a(true);
                return;
            }
        }
    }

    public final void v() {
        g().f();
        this.D.a(R.id.location_search_view);
        if (this.Q == null) {
            this.Q = this.r.a(this.P, new gsi(this));
        }
        this.Q.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A:{SYNTHETIC, RETURN} */
    public final void w() {
        /*
        r7 = this;
        r0 = defpackage.asxw.u;
        r0 = r0.createBuilder();
        r0 = (defpackage.asxv) r0;
        r1 = r7.x;
        r0.a(r1);
        r1 = r7.K;
        r1 = r1.getVisibility();
        r2 = 0;
        r3 = 0;
        if (r1 != 0) goto L_0x0046;
    L_0x0017:
        r1 = r7.K;
        r1 = r1.getText();
        r1 = r1.toString();
        r1 = r1.trim();
        r4 = r7.X;
        if (r4 != 0) goto L_0x0038;
    L_0x0029:
        r4 = android.text.TextUtils.isEmpty(r1);
        if (r4 == 0) goto L_0x0038;
    L_0x002f:
        r0 = 2131952310; // 0x7f1302b6 float:1.954106E38 double:1.053324395E-314;
        defpackage.xpr.a(r7, r0, r3);
    L_0x0035:
        r0 = r2;
        goto L_0x011d;
    L_0x0038:
        r4 = defpackage.asxn.c;
        r4 = r4.createBuilder();
        r4 = (defpackage.asxq) r4;
        r4.a(r1);
        r0.a(r4);
    L_0x0046:
        r1 = r7.L;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x007b;
    L_0x004e:
        r1 = r7.L;
        r1 = r1.getText();
        r1 = r1.toString();
        r1 = r1.trim();
        r4 = r7.Y;
        if (r4 != 0) goto L_0x006d;
    L_0x0060:
        r4 = android.text.TextUtils.isEmpty(r1);
        if (r4 == 0) goto L_0x006d;
    L_0x0066:
        r0 = 2131952309; // 0x7f1302b5 float:1.9541057E38 double:1.0533243944E-314;
        defpackage.xpr.a(r7, r0, r3);
        goto L_0x0035;
    L_0x006d:
        r4 = defpackage.aswr.c;
        r4 = r4.createBuilder();
        r4 = (defpackage.aswu) r4;
        r4.a(r1);
        r0.a(r4);
    L_0x007b:
        r1 = r7.N;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x00d2;
    L_0x0083:
        r1 = r7.N;
        r1 = r1.a();
        r4 = defpackage.asxf.c;
        r4 = r4.createBuilder();
        r4 = (defpackage.asxi) r4;
        r5 = r1.ordinal();
        if (r5 == 0) goto L_0x00ca;
    L_0x0097:
        r6 = 1;
        if (r5 == r6) goto L_0x00c4;
    L_0x009a:
        r6 = 2;
        if (r5 != r6) goto L_0x00a3;
    L_0x009d:
        r1 = defpackage.awnx.PRIVATE;
        r4.a(r1);
        goto L_0x00cf;
    L_0x00a3:
        r0 = new java.lang.IllegalArgumentException;
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 24;
        r3.<init>(r2);
        r2 = "Unknown privacy status: ";
        r3.append(r2);
        r3.append(r1);
        r1 = r3.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00c4:
        r1 = defpackage.awnx.UNLISTED;
        r4.a(r1);
        goto L_0x00cf;
    L_0x00ca:
        r1 = defpackage.awnx.PUBLIC;
        r4.a(r1);
    L_0x00cf:
        r0.a(r4);
    L_0x00d2:
        r1 = r7.O;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x00ec;
    L_0x00da:
        r1 = r7.A();
        r4 = defpackage.asxl.b;
        r4 = r4.createBuilder();
        r4 = (defpackage.asxo) r4;
        r4.a(r1);
        r0.a(r4);
    L_0x00ec:
        r1 = r7.B;
        r1 = r1.getVisibility();
        if (r1 != 0) goto L_0x011d;
    L_0x00f4:
        r1 = r7.B;
        r1 = r1.a();
        if (r1 != 0) goto L_0x00fd;
    L_0x00fc:
        goto L_0x011d;
    L_0x00fd:
        r1 = defpackage.aswz.g;
        r1 = r1.createBuilder();
        r1 = (defpackage.asxc) r1;
        r4 = r7.B;
        r4 = r4.c;
        if (r4 != 0) goto L_0x0110;
    L_0x010b:
        r4 = 3;
        r1.a(r4);
        goto L_0x011a;
    L_0x0110:
        r5 = r4.a;
        r1.b(r5);
        r4 = r4.b;
        r1.a(r4);
    L_0x011a:
        r0.a(r1);
    L_0x011d:
        if (r0 == 0) goto L_0x0131;
    L_0x011f:
        r1 = r7.C;
        r1.a(r3);
        r7.z();
        r1 = r7.n;
        r3 = new gsh;
        r3.<init>(r7, r0);
        r1.a(r0, r3, r2);
    L_0x0131:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity.w():void");
    }

    private final void z() {
        fde fde = this.A;
        if (fde != null) {
            this.w.b(fde);
            this.v.a(true);
        }
    }

    public final void x() {
        if (!this.z) {
            xpr.a((Context) this, (int) R.string.edit_video_done, 0);
            Intent intent = new Intent();
            intent.putExtra("refresh_my_videos", true);
            setResult(-1, intent);
            finish();
        }
    }

    private final List A() {
        ArrayList arrayList = new ArrayList();
        if (this.O.getVisibility() == 0) {
            for (String trim : this.O.getText().toString().trim().split(",")) {
                String trim2 = trim2.trim();
                if (!trim2.isEmpty()) {
                    arrayList.add(trim2);
                }
            }
        }
        return arrayList;
    }

    private final boolean B() {
        zzl zzl = this.m;
        if (!(zzl == null || zzl.b() == null)) {
            aujp aujp = this.m.b().c;
            if (aujp == null) {
                aujp = aujp.C;
            }
            if (aujp.l) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object n() {
        return y();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqh.class};
        } else if (i == 0) {
            finish();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
