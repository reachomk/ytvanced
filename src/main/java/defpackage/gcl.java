package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CommentStickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gcl */
public final class gcl extends nf implements alaq, gcc, gdx, gfc, gfr, ghi, gjv, xfc {
    private static final alad[] al = new alad[]{new alad(0, acwc.REELS_APPROVE_STORAGE_BUTTON, acwc.REELS_DENY_STORAGE_BUTTON), new alad(1, acwc.REELS_APPROVE_CAMERA_BUTTON, acwc.REELS_DENY_CAMERA_BUTTON), new alad(2, acwc.REELS_APPROVE_MICROPHONE_BUTTON, acwc.REELS_DENY_MICROPHONE_BUTTON)};
    private static final alad[] am = new alad[0];
    public gfd Z;
    public Handler a;
    public znv aa;
    public znv ab;
    public zlt ac;
    public SharedPreferences ad;
    public ggj ae;
    public alao af;
    public gbt ag;
    public aqhy ah;
    public final gcw ai = new gco(this);
    public final gcz aj = new gcr(this);
    public gcs ak;
    private apxu an;
    private gfo ao;
    private gcv ap;
    private gdn aq;
    private Dialog ar;
    private azaj as;
    private azaj at;
    private bacz au;
    private boolean av;
    private boolean aw;
    public zyw b;
    public aaas c;

    public static gcl a(apxu apxu, boolean z, boolean z2) {
        gcl gcl = new gcl();
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        bundle.putBoolean("modify_window_fullscreen_mode", z);
        bundle.putBoolean("SWIPE_TO_CAMERA_ENABLED", z2);
        gcl.f(bundle);
        return gcl;
    }

    public static boolean a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            if (((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) b).b > 0) {
                return true;
            }
        }
        return false;
    }

    public final void b(Bundle bundle) {
        gcs gcs;
        super.b(bundle);
        if (VERSION.SDK_INT < 23) {
            gge.a(p(), R.string.reel_not_supported);
            gcs = this.ak;
            if (gcs != null) {
                gcs.m();
            }
        }
        bundle = this.j;
        if (bundle != null) {
            byte[] byteArray = bundle.getByteArray("navigation_endpoint");
            if (byteArray != null) {
                try {
                    this.an = (apxu) anxl.parseFrom(apxu.d, byteArray, anxa.c());
                } catch (anyg unused) {
                }
            }
            this.av = bundle.getBoolean("modify_window_fullscreen_mode");
            this.aw = bundle.getBoolean("SWIPE_TO_CAMERA_ENABLED");
        }
        if (!gcl.a(this.an)) {
            gge.a(p(), R.string.reel_camera_server_error);
            gcs = this.ak;
            if (gcs != null) {
                gcs.m();
            }
        }
        ak().a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb A:{SYNTHETIC, Splitter:B:42:0x00eb} */
    public final android.view.View a(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) {
        /*
        r17 = this;
        r1 = r17;
        r0 = r20;
        r2 = 0;
        r3 = 2131035205; // 0x7f050445 float:1.768095E38 double:1.052871285E-314;
        r4 = r18;
        r5 = r19;
        r3 = r4.inflate(r3, r5, r2);
        r4 = r1.Z;
        if (r0 == 0) goto L_0x002d;
    L_0x0014:
        r5 = "reel_handler_edit_video_endpoint";
        r5 = r0.getByteArray(r5);
        if (r5 == 0) goto L_0x002d;
    L_0x001c:
        r6 = defpackage.anxa.c();	 Catch:{ anyg -> 0x002c }
        r7 = defpackage.apxu.d;	 Catch:{ anyg -> 0x002c }
        r5 = defpackage.anxl.parseFrom(r7, r5, r6);	 Catch:{ anyg -> 0x002c }
        r5 = (defpackage.apxu) r5;	 Catch:{ anyg -> 0x002c }
        r4.a(r5);	 Catch:{ anyg -> 0x002c }
        goto L_0x002d;
    L_0x002d:
        r4 = 1;
        if (r0 == 0) goto L_0x010b;
    L_0x0030:
        r5 = r17.s();
        r6 = 2131758042; // 0x7f100bda float:1.9147037E38 double:1.053228414E-314;
        r5 = r5.a(r6);
        r6 = 0;
        r1.as = r6;
        r7 = "camera_video_effects_settings_key";
        r7 = r0.getByteArray(r7);
        if (r7 == 0) goto L_0x0060;
    L_0x0046:
        r8 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0055 }
        r9 = defpackage.azaj.h;	 Catch:{ anyg -> 0x0055 }
        r7 = defpackage.anxl.parseFrom(r9, r7, r8);	 Catch:{ anyg -> 0x0055 }
        r7 = (defpackage.azaj) r7;	 Catch:{ anyg -> 0x0055 }
        r1.as = r7;	 Catch:{ anyg -> 0x0055 }
        goto L_0x0057;
    L_0x0055:
        r1.as = r6;
    L_0x0057:
        r7 = r1.aa;
        r8 = r1.as;
        r7.a(r8, r2);
        r7 = 0;
        goto L_0x0061;
    L_0x0060:
        r7 = 1;
    L_0x0061:
        r1.at = r6;
        r8 = "edit_video_effects_settings_key";
        r8 = r0.getByteArray(r8);
        if (r8 == 0) goto L_0x0084;
    L_0x006b:
        r7 = defpackage.anxa.c();	 Catch:{ anyg -> 0x007a }
        r9 = defpackage.azaj.h;	 Catch:{ anyg -> 0x007a }
        r7 = defpackage.anxl.parseFrom(r9, r8, r7);	 Catch:{ anyg -> 0x007a }
        r7 = (defpackage.azaj) r7;	 Catch:{ anyg -> 0x007a }
        r1.at = r7;	 Catch:{ anyg -> 0x007a }
        goto L_0x007c;
    L_0x007a:
        r1.at = r6;
    L_0x007c:
        r6 = r1.ab;
        r7 = r1.at;
        r6.a(r7);
        r7 = 0;
    L_0x0084:
        r6 = r5 instanceof defpackage.alao;
        if (r6 == 0) goto L_0x0092;
    L_0x0088:
        r5 = (defpackage.alao) r5;
        r1.af = r5;
        r5 = r1.af;
        r5.a = r1;
    L_0x0090:
        r5 = 0;
        goto L_0x00e3;
    L_0x0092:
        r6 = r5 instanceof defpackage.gdn;
        if (r6 == 0) goto L_0x00c1;
    L_0x0096:
        r5 = (defpackage.gdn) r5;
        r1.aq = r5;
        r5 = r1.aq;
        r5 = r5.aC();
        if (r5 != 0) goto L_0x00bf;
    L_0x00a2:
        r5 = r1.aq;
        r6 = r1.ab;
        r5.a(r6);
        r5 = r1.aq;
        r6 = r1.ab;
        r5.a(r6);
        r5 = r1.aq;
        r6 = r1.ab;
        r6 = r6.b();
        r8 = r1.ab;
        r8 = r8.b;
        r5.a(r6, r8);
    L_0x00bf:
        r5 = 1;
        goto L_0x00e3;
    L_0x00c1:
        r6 = r5 instanceof defpackage.gbt;
        if (r6 == 0) goto L_0x00d6;
    L_0x00c5:
        r5 = (defpackage.gbt) r5;
        r1.ag = r5;
        r5 = r1.ag;
        r5.a(r1);
        r5 = r1.ag;
        r6 = r1.aa;
        r5.a(r6);
        goto L_0x0090;
    L_0x00d6:
        r6 = r5 instanceof defpackage.gfo;
        if (r6 == 0) goto L_0x0090;
    L_0x00da:
        r5 = (defpackage.gfo) r5;
        r1.ao = r5;
        r5 = r1.ao;
        r5.a = r1;
        goto L_0x0090;
    L_0x00e3:
        r6 = "block reel_creation_key";
        r0 = r0.getByteArray(r6);
        if (r0 == 0) goto L_0x010d;
    L_0x00eb:
        r6 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0104 }
        r8 = defpackage.aqhy.q;	 Catch:{ anyg -> 0x0104 }
        r0 = defpackage.anxl.parseFrom(r8, r0, r6);	 Catch:{ anyg -> 0x0104 }
        r0 = (defpackage.aqhy) r0;	 Catch:{ anyg -> 0x0104 }
        r1.ah = r0;	 Catch:{ anyg -> 0x0104 }
        r0 = r1.a;	 Catch:{ anyg -> 0x0104 }
        r6 = new gck;	 Catch:{ anyg -> 0x0104 }
        r6.<init>(r1);	 Catch:{ anyg -> 0x0104 }
        r0.post(r6);	 Catch:{ anyg -> 0x0104 }
        goto L_0x010d;
    L_0x0104:
        r0 = move-exception;
        r6 = "Error parsing renderer.";
        defpackage.xtl.a(r6, r0);
        goto L_0x010d;
    L_0x010b:
        r5 = 0;
        r7 = 1;
    L_0x010d:
        r0 = r1.aq;
        if (r0 != 0) goto L_0x017b;
    L_0x0111:
        r0 = r1.ag;
        if (r0 != 0) goto L_0x017b;
    L_0x0115:
        r0 = r1.ao;
        if (r0 != 0) goto L_0x017b;
    L_0x0119:
        r0 = r1.af;
        if (r0 != 0) goto L_0x017b;
    L_0x011d:
        r0 = r1.b;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0126;
    L_0x0125:
        goto L_0x016d;
    L_0x0126:
        r0 = r0.p;
        if (r0 != 0) goto L_0x012c;
    L_0x012a:
        r0 = defpackage.ayuw.h;
    L_0x012c:
        r0 = r0.e;
        if (r0 == 0) goto L_0x016d;
    L_0x0130:
        r0 = r1.ad;
        r5 = "REEL_WELCOME_V2_ALREADY_SEEN";
        r0 = r0.getBoolean(r5, r2);
        if (r0 != 0) goto L_0x016d;
    L_0x013a:
        r0 = r17.s();
        r5 = "welcomeFragment";
        r0 = r0.a(r5);
        r0 = (defpackage.gfo) r0;
        r1.ao = r0;
        r0 = r1.ao;
        if (r0 == 0) goto L_0x014d;
    L_0x014c:
        goto L_0x0154;
    L_0x014d:
        r0 = new gfo;
        r0.<init>();
        r1.ao = r0;
    L_0x0154:
        r0 = r1.ao;
        r0.a = r1;
        r5 = "welcomeFragment";
        r1.a(r0, r5);
        r0 = r1.ad;
        r0 = r0.edit();
        r5 = "REEL_WELCOME_V2_ALREADY_SEEN";
        r0 = r0.putBoolean(r5, r4);
        r0.apply();
        goto L_0x017e;
    L_0x016d:
        r0 = r17.an();
        if (r0 == 0) goto L_0x0177;
    L_0x0173:
        r17.ai();
        goto L_0x017e;
    L_0x0177:
        r17.ac();
        goto L_0x017e;
    L_0x017b:
        r1.a(r5);
    L_0x017e:
        if (r7 == 0) goto L_0x01a0;
    L_0x0180:
        r10 = r1.Z;
        r12 = r1.aa;
        r13 = r1.ab;
        r0 = r1.an;
        r10.sendEmptyMessage(r2);
        r5 = new gff;
        r9 = r10.c;
        r11 = r10.a;
        r14 = r10.b;
        r15 = r10.d;
        r8 = r5;
        r16 = r0;
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16);
        r0 = new java.lang.Void[r2];
        r5.execute(r0);
    L_0x01a0:
        r0 = r1.ac;
        r5 = new android.content.Context[r4];
        r6 = r17.p();
        r6 = r6.getApplicationContext();
        r5[r2] = r6;
        r0.execute(r5);
        r0 = r1.ae;
        r2 = new yg;
        r5 = 2131427342; // 0x7f0b000e float:1.8476298E38 double:1.0530650263E-314;
        r6 = "com.google.android.gms.fonts";
        r7 = "com.google.android.gms";
        r8 = "Noto Color Emoji Compat";
        r2.<init>(r6, r7, r8, r5);
        r5 = new axh;
        r6 = r0.a;
        r5.<init>(r6, r2);
        r2 = new axg;
        r2.<init>();
        r6 = r5.a;
        r6 = (defpackage.axi) r6;
        r7 = r6.a;
        monitor-enter(r7);
        r6.b = r2;	 Catch:{ all -> 0x021b }
        monitor-exit(r7);	 Catch:{ all -> 0x021b }
        r5.b = r4;
        r2 = new ggl;
        r2.<init>(r0, r5);
        r6 = "initCallback cannot be null";
        defpackage.aad.a(r2, r6);
        r6 = r5.c;
        if (r6 != 0) goto L_0x01ee;
    L_0x01e7:
        r6 = new zl;
        r6.<init>();
        r5.c = r6;
    L_0x01ee:
        r6 = r5.c;
        r6.add(r2);
        r2 = defpackage.awq.b;
        if (r2 != 0) goto L_0x020a;
    L_0x01f7:
        r2 = defpackage.awq.a;
        monitor-enter(r2);
        r6 = defpackage.awq.b;	 Catch:{ all -> 0x0207 }
        if (r6 != 0) goto L_0x0205;
    L_0x01fe:
        r6 = new awq;	 Catch:{ all -> 0x0207 }
        r6.<init>(r5);	 Catch:{ all -> 0x0207 }
        defpackage.awq.b = r6;	 Catch:{ all -> 0x0207 }
    L_0x0205:
        monitor-exit(r2);	 Catch:{ all -> 0x0207 }
        goto L_0x020a;
    L_0x0207:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0207 }
        throw r0;
    L_0x020a:
        r2 = defpackage.ggj.a();
        if (r2 != r4) goto L_0x021a;
    L_0x0210:
        r2 = r0.b;
        r4 = new ggi;
        r4.<init>(r0);
        r2.execute(r4);
    L_0x021a:
        return r3;
    L_0x021b:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x021b }
        goto L_0x021f;
    L_0x021e:
        throw r0;
    L_0x021f:
        goto L_0x021e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcl.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void X_() {
        super.X_();
        this.Z.removeCallbacksAndMessages(null);
    }

    private final void ai() {
        if (this.af == null) {
            this.af = alao.a(al, am, acwl.ak, acwc.REELS_ALLOW_ACCESS_BUTTON, acwc.REELS_PERMISSION_REQUEST_CANCEL_BUTTON, acwc.REELS_OPEN_APP_SETTINGS_BUTTON, R.string.reel_permission_allow_access_description, R.string.reel_permission_open_settings_description);
        }
        this.af.a = this;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(p(), R.style.f312ReelTheme.NoActionBar.FullScreen.Dark);
        nf nfVar = this.af;
        nfVar.Z = contextThemeWrapper;
        a(nfVar, "permissionRequestFragment");
    }

    public final void s_() {
        this.a.post(new gcq(this));
    }

    public final void W() {
        gcs gcs = this.ak;
        if (gcs != null) {
            gcs.m();
        }
    }

    public final void e(Bundle bundle) {
        azaj azaj = this.as;
        byte[] bArr = null;
        bundle.putByteArray("camera_video_effects_settings_key", azaj != null ? azaj.toByteArray() : null);
        azaj = this.at;
        bundle.putByteArray("edit_video_effects_settings_key", azaj != null ? azaj.toByteArray() : null);
        aqhy aqhy = this.ah;
        if (aqhy != null) {
            bundle.putByteArray("block reel_creation_key", aqhy.toByteArray());
        }
        apxu apxu = this.Z.e;
        if (apxu != null) {
            bArr = apxu.toByteArray();
        }
        bundle.putByteArray("reel_handler_edit_video_endpoint", bArr);
    }

    public final void a(zin zin, boolean z) {
        p().getWindow().clearFlags(128);
        this.Z.a(zin, z);
    }

    public final void L_() {
        p().getWindow().addFlags(128);
    }

    public final void a(zin zin) {
        p().getWindow().clearFlags(128);
        gcl.c(zin);
    }

    public final void b() {
        this.ak.m();
    }

    public final void b(bacz bacz) {
        this.au = bacz;
    }

    public final void b(zin zin) {
        new Builder(p()).setTitle(a((int) R.string.reel_discard_editor_changes_title)).setMessage(a((int) R.string.reel_discard_editor_changes_description)).setPositiveButton(R.string.reel_discard_editor_changes_dialog_discard_button_text, new gcn(this, zin)).setNegativeButton(R.string.reel_discard_editor_changes_dialog_cancel_button_text, null).show();
    }

    public static void c(zin zin) {
        if (zin != null && zin.e) {
            File file = new File(zin.c);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final void X() {
        gcs gcs = this.ak;
        if (gcs != null) {
            gcs.m();
        }
    }

    public final void Y() {
        if (an()) {
            ai();
        } else {
            ac();
        }
    }

    public final boolean Z() {
        nf a = s().a((int) R.id.reel_container);
        if (a instanceof gbt) {
            ((gbt) a).ak();
            return true;
        } else if (a instanceof gdn) {
            gdn gdn = (gdn) a;
            if (gdn.aj.d) {
                gdn.au();
            } else if (gdn.ah.j) {
                gdn.g();
            } else if (gdn.ak.d) {
                gdn.m();
            } else {
                gfa gfa = gdn.ag;
                if (gfa.i) {
                    gfa.f();
                    gdn.ax();
                } else {
                    gdb gdb = gdn.ai;
                    if (gdb.c) {
                        gdb.f();
                        gdn.ax();
                    } else {
                        gdn.ab.b(gdn.a);
                    }
                }
            }
            return true;
        } else if (a instanceof gfo) {
            ((gfo) a).a.X();
            return true;
        } else if (!(a instanceof alao)) {
            return false;
        } else {
            ((alao) a).f();
            return true;
        }
    }

    public final void a(zin zin, apxu apxu, boolean z) {
        int i;
        a(true);
        Map hashMap = new HashMap();
        hashMap.put("fragment_tag", "reelEditFragment2");
        hashMap.put("recording_info", zin);
        hashMap.put("video_effects_loader", this.ab);
        hashMap.put("destination_endpoint", this.an);
        hashMap.put("comment_sticker", this.au);
        alao alao = this.af;
        if (alao != null) {
            alao.a = null;
            this.af = null;
        }
        acvx ad = ad();
        if (z) {
            i = acwc.UPLOAD_VIDEO_SELECTION_BUTTON.dU;
        } else {
            i = acwc.UPLOAD_VIDEO_CAMERA_STOP_BUTTON.dU;
        }
        if (!(ad == null || ad.c() == null)) {
            avjh avjh = (avjh) avjf.h.createBuilder();
            avjh.a(ad.c().a);
            avjh.a(i);
            apxx apxx = (apxx) ((anxo) apxu.toBuilder());
            apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
            apxx.a();
            apxu = (apxu) ((anxl) apxx.build());
        }
        Dialog dialog = this.ar;
        if (dialog != null) {
            dialog.dismiss();
            this.ar = null;
        }
        this.c.a(apxu, hashMap);
    }

    public final void a(azaj azaj, azaj azaj2) {
        this.as = azaj;
        this.at = azaj2;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p().setRequestedOrientation(1);
    }

    public final void aa() {
        this.ar = new Dialog(p(), R.style.ReelEditToolsLoadingDialog);
        this.ar.setCanceledOnTouchOutside(false);
        this.ar.setContentView(R.layout.reel_loading_dialog);
        this.ar.setOnKeyListener(gcm.a);
        if (this.ag != null) {
            s().a().a(this.ag).a();
        }
        this.ar.show();
    }

    private final boolean aj() {
        if (v() && !this.p && !this.D && F_() && u() && p() != null) {
            View view = this.K;
            if (view != null) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                int width = rect.width();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                p().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                double d = (double) width;
                double d2 = (double) displayMetrics.widthPixels;
                Double.isNaN(d2);
                if (d > d2 * 0.1d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(aqhy aqhy) {
        this.ah = aqhy;
        ab();
    }

    public final void ab() {
        if (aj()) {
            nf a = s().a((int) R.id.reel_container);
            if (a != null && !(a instanceof alao)) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(M_(), fmv.a(this.ad) == 2 ? R.style.f593Themed.YouTube.Dark.AppCompat : R.style.f596Themed.YouTube.Light.AppCompat.Light);
                acvx t = a instanceof acwa ? ((acwa) a).t() : null;
                if (t != null) {
                    t.b(new acvs(this.ah.j));
                    aphj aphj = this.ah.f;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    t.b(new acvs(aphg.r));
                    aphj = this.ah.g;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    t.b(new acvs(aphg.r));
                }
                akcq.a(contextThemeWrapper, this.ah, this.c, t, false, new gct(this), null, null);
            }
        }
    }

    private final gcv ak() {
        if (this.ap == null) {
            this.ap = ((gcx) xse.a(p())).f().a(this).a();
        }
        return this.ap;
    }

    public final void ac() {
        String str = "cameraFragment";
        this.ag = (gbt) s().a(str);
        if (this.ag == null) {
            aqcl aqcl;
            int i;
            apxu apxu = this.an;
            int i2 = 0;
            if (apxu != null) {
                anxr access$000 = anxl.checkIsLite(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    aqcl aqcl2;
                    apxu = this.an;
                    access$000 = anxl.checkIsLite(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
                    apxu.a(access$000);
                    Object b = apxu.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    LightweightCameraEndpointOuterClass$LightweightCameraEndpoint lightweightCameraEndpointOuterClass$LightweightCameraEndpoint = (LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) b;
                    int i3 = lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.b;
                    if (lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.d.size() != 0) {
                        axak axak = (axak) lightweightCameraEndpointOuterClass$LightweightCameraEndpoint.d.get(0);
                        anxr access$0002 = anxl.checkIsLite(CommentStickerRendererOuterClass.commentStickerRenderer);
                        axak.a(access$0002);
                        b = axak.h.b(access$0002.d);
                        if (b == null) {
                            b = access$0002.b;
                        } else {
                            b = access$0002.a(b);
                        }
                        aqcl2 = (aqcl) b;
                    } else {
                        aqcl2 = null;
                    }
                    if (aqcl2 == null) {
                        aqcl = aqcl2;
                        i2 = i3;
                        i = 0;
                        this.ag = gbt.a(i, i2 * 1000, aqcl, this.aa, this.aw, this.an);
                    } else {
                        aqcl = aqcl2;
                        i2 = i3;
                        i = 1;
                        this.ag = gbt.a(i, i2 * 1000, aqcl, this.aa, this.aw, this.an);
                    }
                }
            }
            aqcl = null;
            i = 0;
            this.ag = gbt.a(i, i2 * 1000, aqcl, this.aa, this.aw, this.an);
        }
        this.ag.a((gcc) this);
        a(this.ag, str);
        this.Z.sendEmptyMessage(3);
        if (this.ah != null) {
            this.a.post(new gcp(this));
        }
        alao alao = this.af;
        if (alao != null) {
            alao.a = null;
            this.af = null;
        }
    }

    private final void a(nf nfVar, String str) {
        or a = s().a();
        a.b(R.id.reel_container, nfVar, str);
        a.a();
    }

    public final acvx ad() {
        if (aj()) {
            nf a = s().a((int) R.id.reel_container);
            if (a instanceof gbt) {
                return ((gbt) a).Z;
            }
        }
        return null;
    }

    private final ContentResolver al() {
        return p().getContentResolver();
    }

    /* JADX WARNING: Missing block: B:48:0x00e3, code skipped:
            if (r1.f != false) goto L_0x00f1;
     */
    public final void a(defpackage.zix r21) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r20.al();
        r2 = r21.b();
        r1 = r1.getType(r2);
        r2 = 2131953495; // 0x7f130757 float:1.9543463E38 double:1.0533249804E-314;
        r3 = 1;
        r4 = 0;
        if (r1 == 0) goto L_0x0117;
    L_0x0015:
        r5 = "video/";
        r5 = r1.startsWith(r5);
        if (r5 != 0) goto L_0x001f;
    L_0x001d:
        goto L_0x0117;
    L_0x001f:
        r1 = r21.b();
        r5 = new android.media.MediaMetadataRetriever;
        r5.<init>();
        r6 = r20.al();	 Catch:{ Exception -> 0x00b2 }
        r7 = "r";
        r6 = r6.openAssetFileDescriptor(r1, r7);	 Catch:{ Exception -> 0x00b2 }
        r6 = r6.getFileDescriptor();	 Catch:{ Exception -> 0x00b2 }
        r5.setDataSource(r6);	 Catch:{ Exception -> 0x00b2 }
        r6 = r20.p();	 Catch:{ Exception -> 0x00b2 }
        r5.setDataSource(r6, r1);	 Catch:{ Exception -> 0x00b2 }
        r6 = 9;
        r6 = r5.extractMetadata(r6);	 Catch:{ Exception -> 0x00b2 }
        r12 = java.lang.Long.parseLong(r6);	 Catch:{ Exception -> 0x00b2 }
        r6 = 18;
        r6 = r5.extractMetadata(r6);	 Catch:{ NumberFormatException -> 0x0083 }
        if (r6 == 0) goto L_0x0057;
    L_0x0052:
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x0083 }
        goto L_0x0058;
    L_0x0057:
        r6 = 0;
    L_0x0058:
        r7 = 19;
        r7 = r5.extractMetadata(r7);	 Catch:{ NumberFormatException -> 0x0083 }
        if (r7 == 0) goto L_0x0065;
    L_0x0060:
        r7 = java.lang.Integer.parseInt(r7);	 Catch:{ NumberFormatException -> 0x0083 }
        goto L_0x0066;
    L_0x0065:
        r7 = 0;
    L_0x0066:
        r8 = 24;
        r8 = r5.extractMetadata(r8);	 Catch:{ NumberFormatException -> 0x0083 }
        if (r8 != 0) goto L_0x006f;
    L_0x006e:
        goto L_0x0085;
    L_0x006f:
        r8 = java.lang.Integer.parseInt(r8);	 Catch:{ NumberFormatException -> 0x0083 }
        r9 = 90;
        if (r8 != r9) goto L_0x0078;
    L_0x0077:
        goto L_0x007d;
    L_0x0078:
        r9 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r8 == r9) goto L_0x007d;
    L_0x007c:
        goto L_0x0085;
    L_0x007d:
        r19 = r7;
        r7 = r6;
        r6 = r19;
        goto L_0x0085;
    L_0x0083:
        r6 = 0;
        r7 = 0;
    L_0x0085:
        if (r6 != 0) goto L_0x0088;
    L_0x0087:
        goto L_0x008b;
    L_0x0088:
        if (r7 == 0) goto L_0x008b;
    L_0x008a:
        goto L_0x0099;
    L_0x008b:
        r8 = r5.getFrameAtTime();	 Catch:{ Exception -> 0x00b2 }
        if (r8 == 0) goto L_0x0099;
    L_0x0091:
        r6 = r8.getWidth();	 Catch:{ Exception -> 0x00b2 }
        r7 = r8.getHeight();	 Catch:{ Exception -> 0x00b2 }
    L_0x0099:
        r10 = r6;
        r11 = r7;
        r5.release();	 Catch:{ Exception -> 0x00b2 }
        r5 = new zin;	 Catch:{ Exception -> 0x00b2 }
        r8 = r1.toString();	 Catch:{ Exception -> 0x00b2 }
        r9 = 0;
        r14 = 0;
        r15 = 1;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r7 = r5;
        r7.<init>(r8, r9, r10, r11, r12, r14, r15, r16, r17, r18);	 Catch:{ Exception -> 0x00b2 }
        goto L_0x00b8;
    L_0x00b2:
        r1 = "Failed loading video from camera roll.";
        defpackage.xtl.c(r1);
        r5 = 0;
    L_0x00b8:
        if (r5 != 0) goto L_0x00bb;
    L_0x00ba:
        goto L_0x010a;
    L_0x00bb:
        r1 = r5.b;
        if (r1 == 0) goto L_0x010a;
    L_0x00bf:
        r2 = r5.a;
        r2 = (float) r2;
        r1 = (float) r1;
        r2 = r2 / r1;
        r1 = -1089470464; // 0xffffffffbf100000 float:-0.5625 double:NaN;
        r2 = r2 + r1;
        r1 = java.lang.Math.abs(r2);
        r2 = 1008981770; // 0x3c23d70a float:0.01 double:4.9850323E-315;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 < 0) goto L_0x00f1;
    L_0x00d2:
        r1 = r0.b;
        r1 = r1.a();
        if (r1 != 0) goto L_0x00db;
    L_0x00da:
        goto L_0x00e6;
    L_0x00db:
        r1 = r1.p;
        if (r1 != 0) goto L_0x00e1;
    L_0x00df:
        r1 = defpackage.ayuw.h;
    L_0x00e1:
        r1 = r1.f;
        if (r1 == 0) goto L_0x00e6;
    L_0x00e5:
        goto L_0x00f1;
    L_0x00e6:
        r1 = r20.p();
        r2 = 2131953498; // 0x7f13075a float:1.9543469E38 double:1.053324982E-314;
        defpackage.gge.a(r1, r2);
        return;
    L_0x00f1:
        r1 = r5.d;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r4 >= 0) goto L_0x0104;
    L_0x00f9:
        r1 = r20.p();
        r2 = 2131953496; // 0x7f130758 float:1.9543465E38 double:1.053324981E-314;
        defpackage.gge.a(r1, r2);
        return;
    L_0x0104:
        r1 = r0.Z;
        r1.a(r5, r3);
        return;
    L_0x010a:
        r1 = r20.p();
        defpackage.gge.a(r1, r2);
        r1 = r0.ag;
        r1.a(r4);
        return;
    L_0x0117:
        if (r1 == 0) goto L_0x01ae;
    L_0x0119:
        r5 = "image/";
        r1 = r1.startsWith(r5);
        if (r1 != 0) goto L_0x0123;
    L_0x0121:
        goto L_0x01ae;
    L_0x0123:
        r1 = 2131953493; // 0x7f130755 float:1.9543459E38 double:1.0533249794E-314;
        r6 = r21.b();	 Catch:{ Exception -> 0x01a1 }
        r2 = r20.p();	 Catch:{ Exception -> 0x01a1 }
        r5 = r2.getContentResolver();	 Catch:{ Exception -> 0x01a1 }
        r11 = android.provider.MediaStore.Images.Media.getBitmap(r5, r6);	 Catch:{ Exception -> 0x01a1 }
        r5 = r2.getContentResolver();	 Catch:{ Exception -> 0x01a1 }
        r7 = new java.lang.String[r3];	 Catch:{ Exception -> 0x01a1 }
        r2 = "orientation";
        r7[r4] = r2;	 Catch:{ Exception -> 0x01a1 }
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r2 = r5.query(r6, r7, r8, r9, r10);	 Catch:{ Exception -> 0x01a1 }
        r5 = r2.getCount();	 Catch:{ Exception -> 0x01a1 }
        r6 = -1;
        if (r5 != r3) goto L_0x0159;
    L_0x014e:
        r2.moveToFirst();	 Catch:{ Exception -> 0x01a1 }
        r5 = r2.getInt(r4);	 Catch:{ Exception -> 0x01a1 }
        r2.close();	 Catch:{ Exception -> 0x01a1 }
        goto L_0x015a;
    L_0x0159:
        r5 = -1;
    L_0x015a:
        if (r5 != r6) goto L_0x015d;
    L_0x015c:
        goto L_0x017b;
    L_0x015d:
        r2 = r5 % 360;
        if (r2 == 0) goto L_0x017b;
    L_0x0161:
        r12 = new android.graphics.Matrix;	 Catch:{ Exception -> 0x01a1 }
        r12.<init>();	 Catch:{ Exception -> 0x01a1 }
        r2 = (float) r5;	 Catch:{ Exception -> 0x01a1 }
        r12.postRotate(r2);	 Catch:{ Exception -> 0x01a1 }
        r10 = r11.getWidth();	 Catch:{ Exception -> 0x01a1 }
        r2 = r11.getHeight();	 Catch:{ Exception -> 0x01a1 }
        r8 = 0;
        r9 = 0;
        r13 = 1;
        r7 = r11;
        r11 = r2;
        r11 = android.graphics.Bitmap.createBitmap(r7, r8, r9, r10, r11, r12, r13);	 Catch:{ Exception -> 0x01a1 }
    L_0x017b:
        r2 = defpackage.gga.a(r11);
        r5 = r20.s();
        r6 = 2131758042; // 0x7f100bda float:1.9147037E38 double:1.053228414E-314;
        r5 = r5.a(r6);
        r6 = r5 instanceof defpackage.gbt;
        if (r6 == 0) goto L_0x0194;
    L_0x018e:
        r5 = (defpackage.gbt) r5;
        r5.a(r2, r3);
        return;
    L_0x0194:
        r2 = r20.p();
        defpackage.gge.a(r2, r1);
        r1 = r0.ag;
        r1.a(r4);
        return;
    L_0x01a1:
        r2 = "Error retrieve image from uri";
        defpackage.xtl.c(r2);
        r2 = r20.p();
        defpackage.gge.a(r2, r1);
        return;
    L_0x01ae:
        r1 = r20.p();
        defpackage.gge.a(r1, r2);
        r1 = r0.ag;
        r1.a(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcl.a(zix):void");
    }

    public final void ae() {
        this.aq = (gdn) s().a("reelEditFragment2");
        gdn gdn = this.aq;
        if (gdn != null) {
            gdw gdw = gdn.b;
            if (gdw != null) {
                gdw.b();
            }
        }
    }

    public final void af() {
        this.aq = (gdn) s().a("reelEditFragment2");
        gdn gdn = this.aq;
        if (gdn != null) {
            gdw gdw = gdn.b;
            if (gdw != null) {
                gdw.a();
            }
        }
    }

    public final void b(nf nfVar) {
        s().a().a(nfVar).a();
    }

    public final void a(bacy bacy) {
        zlw am = am();
        if (am != null) {
            am.b.a((bacz) ((anxl) bacy.build()));
        }
    }

    public final void a(bacz bacz) {
        zlw am = am();
        if (am != null) {
            am.a(bacz);
        }
    }

    private final zlw am() {
        zrg zrg = (zrg) s().a("reelEditFragment2");
        if (zrg == null) {
            return null;
        }
        return zrg.an.a();
    }

    public final void ag() {
        ac();
    }

    public final void ah() {
        a(false);
        gcs gcs = this.ak;
        if (gcs != null) {
            gcs.m();
        }
    }

    private final boolean an() {
        return VERSION.SDK_INT >= 23 && alao.a(p(), al);
    }

    public final void a(boolean z) {
        if (this.av && this.ak != null) {
            Window window = p().getWindow();
            if (z) {
                window.addFlags(1024);
                window.setSoftInputMode(2);
                return;
            }
            window.clearFlags(1024);
            window.setSoftInputMode(16);
            this.ak.l();
        }
    }

    public final /* synthetic */ Object n() {
        return ak();
    }
}
