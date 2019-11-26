package com.google.android.libraries.youtube.edit.gallery;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CameraEndpointOuterClass;
import defpackage.acwc;
import defpackage.acwl;
import defpackage.acxj;
import defpackage.aej;
import defpackage.alad;
import defpackage.alao;
import defpackage.alaq;
import defpackage.alyv;
import defpackage.amac;
import defpackage.amqw;
import defpackage.anxa;
import defpackage.anxl;
import defpackage.anxr;
import defpackage.anyg;
import defpackage.apir;
import defpackage.apxu;
import defpackage.atss;
import defpackage.atst;
import defpackage.attc;
import defpackage.attd;
import defpackage.aytx;
import defpackage.ayya;
import defpackage.nf;
import defpackage.or;
import defpackage.xci;
import defpackage.xev;
import defpackage.xfc;
import defpackage.xse;
import defpackage.xvf;
import defpackage.zhu;
import defpackage.zib;
import defpackage.zjj;
import defpackage.zpc;
import defpackage.zpe;
import defpackage.zpf;
import defpackage.zpg;
import defpackage.zpi;
import defpackage.zpn;
import defpackage.zyw;
import java.util.concurrent.TimeUnit;

public class GalleryActivity extends aej implements alaq, xfc, zpn {
    private static final long p = TimeUnit.DAYS.toSeconds(7);
    private zpe A;
    private boolean B = false;
    private String C;
    private int D;
    public zyw g;
    public acxj h;
    public xci i;
    public alyv j;
    public amac k;
    public zpi l;
    public alao m;
    public boolean n = true;
    public boolean o = false;
    private zhu q;
    private Handler r;
    private boolean s = false;
    private apxu t;
    private alad[] u;
    private alad[] v;
    private int w;
    private int x;
    private zpg y;
    private boolean z;

    public static Intent a(Context context, apxu apxu) {
        Intent intent = new Intent(context, GalleryActivity.class);
        intent.putExtra("navigation_endpoint", apxu.toByteArray());
        return intent;
    }

    private final zpg s() {
        if (this.y == null) {
            this.y = ((zpf) xse.a(getApplication())).a(new xev(this));
        }
        return this.y;
    }

    public final apxu l() {
        if (this.t == null) {
            Intent intent = getIntent();
            if (intent != null) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint");
                if (byteArrayExtra != null) {
                    try {
                        this.t = (apxu) anxl.parseFrom(apxu.d, byteArrayExtra, anxa.c());
                    } catch (anyg unused) {
                    }
                }
            }
        }
        return this.t;
    }

    public static boolean m() {
        return Camera.getNumberOfCameras() > 0;
    }

    public final void onPause() {
        super.onPause();
        this.n = true;
        this.B = false;
    }

    public final void onResume() {
        super.onResume();
        this.n = false;
        if (this.o) {
            if (this.l == null) {
                o();
            }
            this.o = false;
        } else if (this.s) {
            if (this.q == null) {
                t();
            }
            this.s = false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARNING: Missing block: B:42:0x0113, code skipped:
            if (((defpackage.apir) r1).b == false) goto L_0x0115;
     */
    public final void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        super.onCreate(r10);
        r0 = 2131034627; // 0x7f050203 float:1.7679777E38 double:1.0528709993E-314;
        r9.setContentView(r0);
        r0 = r9.s();
        r0.a(r9);
        r0 = r9.g;
        r1 = 0;
        if (r0 == 0) goto L_0x0036;
    L_0x0015:
        r0 = r0.a();
        if (r0 == 0) goto L_0x0036;
    L_0x001b:
        r0 = r9.g;
        r0 = r0.a();
        r0 = r0.a;
        r2 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r0 = r0 & r2;
        if (r0 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x0036;
    L_0x0029:
        r0 = r9.g;
        r0 = r0.a();
        r0 = r0.p;
        if (r0 != 0) goto L_0x0037;
    L_0x0033:
        r0 = defpackage.ayuw.h;
        goto L_0x0037;
    L_0x0036:
        r0 = r1;
    L_0x0037:
        r2 = 0;
        r3 = "youtube";
        r3 = r9.getSharedPreferences(r3, r2);
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 23;
        r6 = 1;
        if (r4 < r5) goto L_0x0053;
    L_0x0045:
        r4 = r9.k;
        r4.l();
        if (r0 == 0) goto L_0x0053;
    L_0x004c:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0053;
    L_0x0051:
        r0 = 1;
        goto L_0x0054;
    L_0x0053:
        r0 = 0;
    L_0x0054:
        r9.z = r0;
        r0 = r9.getResources();
        r4 = 2131953808; // 0x7f130890 float:1.9544097E38 double:1.053325135E-314;
        r7 = r0.getString(r4);
        r8 = "com.google.android.libraries.youtube.upload.pref.upload_quality";
        r3 = r3.getString(r8, r7);
        r4 = r0.getString(r4);
        r4 = r3.equals(r4);
        r7 = 4;
        r8 = 6;
        if (r4 != 0) goto L_0x009b;
    L_0x0073:
        r4 = 2131953812; // 0x7f130894 float:1.9544106E38 double:1.053325137E-314;
        r4 = r0.getString(r4);
        r4 = r3.equals(r4);
        if (r4 != 0) goto L_0x009b;
    L_0x0080:
        r4 = 2131953811; // 0x7f130893 float:1.9544104E38 double:1.0533251365E-314;
        r4 = r0.getString(r4);
        r4 = r3.equals(r4);
        if (r4 != 0) goto L_0x0099;
    L_0x008d:
        r4 = 2131953810; // 0x7f130892 float:1.9544101E38 double:1.053325136E-314;
        r0 = r0.getString(r4);
        r0 = r3.equals(r0);
        goto L_0x009c;
    L_0x0099:
        r7 = 5;
        goto L_0x009c;
    L_0x009b:
        r7 = 6;
    L_0x009c:
        r9.D = r7;
        if (r10 == 0) goto L_0x00ae;
    L_0x00a0:
        r0 = "interaction_bundle";
        r1 = r10.getBundle(r0);
        r0 = "frontend_upload_id";
        r10 = r10.getString(r0);
        r9.C = r10;
    L_0x00ae:
        r10 = r9.h;
        r0 = r9.l();
        r10.a(r1, r0);
        r10 = r9.C;
        r0 = 2;
        if (r10 != 0) goto L_0x00c4;
    L_0x00bc:
        r10 = r9.j;
        r10 = r10.a(r0, r2);
        r9.C = r10;
    L_0x00c4:
        r10 = new defpackage.alad[r6];
        r1 = new alad;
        r3 = defpackage.acwc.UPLOAD_VIDEO_APPROVE_STORAGE_BUTTON;
        r4 = defpackage.acwc.UPLOAD_VIDEO_DENY_STORAGE_BUTTON;
        r1.<init>(r2, r3, r4);
        r10[r2] = r1;
        r9.u = r10;
        r10 = new alad;
        r1 = defpackage.acwc.UPLOAD_VIDEO_APPROVE_CAMERA_BUTTON;
        r3 = defpackage.acwc.UPLOAD_VIDEO_DENY_CAMERA_BUTTON;
        r10.<init>(r6, r1, r3);
        r1 = r9.l();
        if (r1 == 0) goto L_0x0115;
    L_0x00e2:
        r3 = com.google.protos.youtube.api.innertube.CameraEndpointOuterClass.cameraEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r4 = r1.h;
        r3 = r3.d;
        r3 = r4.a(r3);
        if (r3 == 0) goto L_0x0115;
    L_0x00f5:
        r3 = com.google.protos.youtube.api.innertube.CameraEndpointOuterClass.cameraEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r1.a(r3);
        r1 = r1.h;
        r4 = r3.d;
        r1 = r1.b(r4);
        if (r1 != 0) goto L_0x010b;
    L_0x0108:
        r1 = r3.b;
        goto L_0x010f;
    L_0x010b:
        r1 = r3.a(r1);
    L_0x010f:
        r1 = (defpackage.apir) r1;
        r1 = r1.b;
        if (r1 != 0) goto L_0x0119;
    L_0x0115:
        r1 = r9.z;
        if (r1 == 0) goto L_0x0135;
    L_0x0119:
        r1 = new alad;
        r3 = defpackage.acwc.UPLOAD_VIDEO_APPROVE_MICROPHONE_BUTTON;
        r4 = defpackage.acwc.UPLOAD_VIDEO_DENY_MICROPHONE_BUTTON;
        r1.<init>(r0, r3, r4);
        r0 = new defpackage.alad[r0];
        r0[r2] = r10;
        r0[r6] = r1;
        r9.v = r0;
        r10 = 2131952410; // 0x7f13031a float:1.9541262E38 double:1.0533244443E-314;
        r9.w = r10;
        r10 = 2131952415; // 0x7f13031f float:1.9541272E38 double:1.053324447E-314;
        r9.x = r10;
        goto L_0x0145;
    L_0x0135:
        r0 = new defpackage.alad[r6];
        r0[r2] = r10;
        r9.v = r0;
        r10 = 2131952409; // 0x7f130319 float:1.954126E38 double:1.053324444E-314;
        r9.w = r10;
        r10 = 2131952413; // 0x7f13031d float:1.9541268E38 double:1.053324446E-314;
        r9.x = r10;
    L_0x0145:
        r10 = new android.os.Handler;
        r0 = android.os.Looper.getMainLooper();
        r10.<init>(r0);
        r9.r = r10;
        r10 = r9.f();
        r0 = 2131756791; // 0x7f1006f7 float:1.91445E38 double:1.0532277957E-314;
        r10 = r10.a(r0);
        r0 = r10 instanceof defpackage.alao;
        if (r0 == 0) goto L_0x0167;
    L_0x015f:
        r10 = (defpackage.alao) r10;
        r9.m = r10;
        r9.y();
        goto L_0x017e;
    L_0x0167:
        r0 = r10 instanceof defpackage.zpi;
        if (r0 == 0) goto L_0x0173;
    L_0x016b:
        r10 = (defpackage.zpi) r10;
        r9.l = r10;
        r9.w();
        goto L_0x017e;
    L_0x0173:
        r0 = r10 instanceof defpackage.zhu;
        if (r0 == 0) goto L_0x017e;
    L_0x0177:
        r10 = (defpackage.zhu) r10;
        r9.q = r10;
        r9.u();
    L_0x017e:
        r10 = android.os.Build.VERSION.SDK_INT;
        if (r10 < r5) goto L_0x01b1;
    L_0x0182:
        r10 = r9.u;
        r10 = defpackage.alao.a(r9, r10);
        if (r10 != 0) goto L_0x0196;
    L_0x018a:
        r10 = r9.q;
        if (r10 == 0) goto L_0x01b1;
    L_0x018e:
        r10 = r9.v;
        r10 = defpackage.alao.a(r9, r10);
        if (r10 == 0) goto L_0x01b1;
    L_0x0196:
        r10 = r9.m;
        if (r10 == 0) goto L_0x019b;
    L_0x019a:
        goto L_0x01bc;
    L_0x019b:
        defpackage.amqw.b(r6);
        r9.y();
        r10 = -1;
        r9.setRequestedOrientation(r10);
        r10 = r9.m;
        r9.b(r10);
        r9.x();
        r9.v();
        goto L_0x01bc;
    L_0x01b1:
        r10 = r9.l;
        if (r10 != 0) goto L_0x01bc;
    L_0x01b5:
        r10 = r9.q;
        if (r10 != 0) goto L_0x01bc;
    L_0x01b9:
        r9.o();
    L_0x01bc:
        r9.B = r6;
        r10 = new zpd;
        r10.<init>(r2);
        r0 = new com.google.android.libraries.youtube.edit.gallery.GalleryActivity[r6];
        r0[r2] = r9;
        r10.execute(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.gallery.GalleryActivity.onCreate(android.os.Bundle):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("interaction_bundle", this.h.e());
        bundle.putString("frontend_upload_id", this.C);
    }

    public final void o() {
        amqw.b(this.l == null);
        w();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.l.b(extras.getString("extra_gallery_secondary_action_class"));
        }
        setRequestedOrientation(-1);
        b(this.l);
        z();
        v();
    }

    private final void t() {
        amqw.b(this.z);
        u();
        b(this.q);
        z();
        x();
    }

    private final void b(nf nfVar) {
        or a = f().a();
        a.b(R.id.gallery_container, nfVar);
        a.a();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onBackPressed() {
        alao alao = this.m;
        if (alao != null) {
            alao.f();
        } else {
            zpi zpi = this.l;
            if (zpi == null) {
                zhu zhu = this.q;
                if (zhu == null) {
                    super.onBackPressed();
                    return;
                }
                zib zib = zhu.b;
                if (zib != null) {
                    zib.b();
                }
            } else if (!zpi.ab) {
                zpi.f();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1800 && i2 == -1) {
            setResult(-1, intent);
            finish();
        } else if (i == 902 && i2 == 0 && this.n) {
            if (!this.B) {
                if (this.l != null) {
                    x();
                    this.o = true;
                } else if (this.q != null) {
                    v();
                    this.s = true;
                }
            }
            this.C = this.j.a(2, false);
            zhu zhu = this.q;
            if (zhu != null) {
                zhu.ac = A();
            }
            zpi zpi = this.l;
            if (zpi != null) {
                zpi.ad = A();
            }
            alao alao = this.m;
            if (alao != null) {
                alao.c = A();
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void s_() {
        this.r.post(new zpc(this));
    }

    public final void W() {
        finish();
    }

    public final void a(Uri uri, boolean z) {
        if (uri != null) {
            aytx aytx;
            Bundle bundle = new Bundle();
            apxu l = l();
            int i = 902;
            if (l != null) {
                anxr access$000 = anxl.checkIsLite(CameraEndpointOuterClass.cameraEndpoint);
                l.a(access$000);
                if (l.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(CameraEndpointOuterClass.cameraEndpoint);
                    l.a(access$000);
                    Object b = l.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    if ((((apir) b).a & 4) != 0) {
                        bundle.putBoolean("video_show_metadata", false);
                        bundle.putBoolean("navigate_to_my_uploads", false);
                        l = l();
                        i = -1;
                        if (l != null) {
                            access$000 = anxl.checkIsLite(CameraEndpointOuterClass.cameraEndpoint);
                            l.a(access$000);
                            if (l.h.a(access$000.d)) {
                                access$000 = anxl.checkIsLite(CameraEndpointOuterClass.cameraEndpoint);
                                l.a(access$000);
                                b = l.h.b(access$000.d);
                                if (b == null) {
                                    b = access$000.b;
                                } else {
                                    b = access$000.a(b);
                                }
                                apir apir = (apir) b;
                                if ((apir.a & 4) != 0) {
                                    ayya ayya = apir.c;
                                    if (ayya == null) {
                                        ayya = ayya.c;
                                    }
                                    i = ayya.b;
                                }
                            }
                        }
                        bundle.putInt("video_time_limit_seconds", i);
                        i = 1800;
                    }
                }
            }
            if (z) {
                aytx = aytx.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SYSTEM_CAMERA;
            } else {
                aytx = aytx.UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY;
            }
            bundle.putInt("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", aytx.g);
            a(uri, i, bundle);
        }
    }

    public final void p() {
        t();
    }

    public final void q() {
        finish();
    }

    private final void u() {
        if (this.q == null) {
            int i = this.D;
            zhu zhu = new zhu();
            Bundle bundle = new Bundle();
            bundle.putInt("TARGET_VIDEO_QUALITY", i);
            zhu.f(bundle);
            this.q = zhu;
        }
        this.A = new zpe(this);
        zhu zhu2 = this.q;
        zhu2.b = this.A;
        zhu2.ac = A();
        setRequestedOrientation(1);
    }

    private final void v() {
        zhu zhu = this.q;
        if (zhu != null) {
            zhu.b = null;
            this.q = null;
        }
    }

    private final void w() {
        if (this.l == null) {
            this.l = new zpi();
        }
        zpi zpi = this.l;
        zpi.c = this;
        zpi.ad = A();
        this.l.ac = this.z;
    }

    private final void x() {
        zpi zpi = this.l;
        if (zpi != null) {
            zpi.c = null;
            this.l = null;
        }
    }

    private final void y() {
        if (this.m == null) {
            this.m = alao.a(this.u, this.v, acwl.az, acwc.UPLOAD_VIDEO_ALLOW_ACCESS_BUTTON, acwc.UPLOAD_VIDEO_PERMISSION_REQUEST_CANCEL_BUTTON, acwc.UPLOAD_VIDEO_OPEN_APP_SETTINGS_BUTTON, this.w, this.x);
        }
        alao alao = this.m;
        alao.a = this;
        alao.c = A();
    }

    private final void z() {
        alao alao = this.m;
        if (alao != null) {
            alao.a = null;
            this.m = null;
        }
    }

    private final atst A() {
        atss atss = (atss) atst.q.createBuilder();
        attc attc = (attc) attd.e.createBuilder();
        attc.a(this.C);
        atss.a(attc);
        return (atst) ((anxl) atss.build());
    }

    public final void a(Uri uri, int i, Bundle bundle) {
        Intent intent = new Intent("com.google.android.youtube.intent.action.INTERNAL_UPLOAD");
        intent.setDataAndType(uri, "video/*");
        intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id", this.C);
        intent.putExtras(bundle);
        startActivityForResult(intent, i);
    }

    public final zjj r() {
        return new zjj(this, 2, "gallery", p, new xvf());
    }

    public final /* synthetic */ Object n() {
        return s();
    }
}
