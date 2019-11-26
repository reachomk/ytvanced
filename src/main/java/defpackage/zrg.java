package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSelectionActivity;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView;
import com.google.android.youtube.R;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zrg */
public abstract class zrg extends nf implements OnClickListener, uje, unj, zsb {
    private Uri Z;
    private final Object a = new Object();
    public int aA = 1;
    public boolean aB;
    public zjy aC = null;
    public zjx aD = null;
    public atst aE = null;
    public acvx aa;
    private boolean ab;
    private upd ac;
    private zgk ad;
    private uja ae = uja.a;
    private boolean af;
    private long ag;
    private boolean ah;
    private zff ai;
    private long aj = -1;
    private zet ak = null;
    public final zrp an = new zrf(this);
    public File ao;
    public SharedPreferences ap;
    public zzl aq;
    public akkl ar;
    public Handler as;
    public zrv at;
    public ArrayList au;
    public zrd av;
    public boolean aw;
    public int ax = 0;
    public znq ay = null;
    public boolean az;
    private boolean b;
    private boolean c;

    public final void P_() {
    }

    public abstract VideoWithPreviewView W();

    public abstract ImageButton X();

    public abstract EditableVideoControllerView Y();

    public abstract ChooseFilterView Z();

    /* Access modifiers changed, original: protected */
    public void a(Throwable th) {
    }

    /* Access modifiers changed, original: protected */
    public void a(ujf ujf) {
    }

    /* Access modifiers changed, original: protected */
    public void a(boolean z, boolean z2, int i, int i2, int i3) {
    }

    /* Access modifiers changed, original: protected */
    public void aD() {
    }

    public abstract View aa();

    public abstract View ab();

    public abstract int ac();

    public abstract boolean ad();

    /* Access modifiers changed, original: protected */
    public VideoTrimView ae() {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public ImageButton af() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public View ag() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public ImageButton ah() {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public AudioTrackView ai() {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public AudioCrossFadeView aj() {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public void ak() {
    }

    /* Access modifiers changed, original: protected */
    public boolean al() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void am() {
    }

    /* Access modifiers changed, original: protected */
    public void an() {
    }

    /* Access modifiers changed, original: protected */
    public ImageButton ay() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void e(int i) {
    }

    public final void o() {
    }

    public final void a(Uri uri) {
        zrv zrv = this.at;
        if (zrv == null) {
            this.Z = uri;
        } else if (!this.c && !amqq.a(zrv.e, uri)) {
            a(uri, null, null);
        }
    }

    public final ujf az() {
        return this.at.f;
    }

    public final void a(acvx acvx) {
        this.aa = (acvx) amqw.a((Object) acvx);
    }

    public final void a(zjx zjx) {
        this.aD = (zjx) amqw.a((Object) zjx);
    }

    public final void a(zjy zjy) {
        this.aC = (zjy) amqw.a((Object) zjy);
    }

    public final void a(long j) {
        this.ag = Math.max(0, j);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:47:0x0147=Splitter:B:47:0x0147, B:55:0x0167=Splitter:B:55:0x0167} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0147 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0167 */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0164 A:{SYNTHETIC, Splitter:B:53:0x0164} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:49|(0)|55|56) */
    public void a(android.view.View r13, android.os.Bundle r14) {
        /*
        r12 = this;
        r13 = r12.aa;
        r0 = 1;
        r1 = 0;
        if (r13 != 0) goto L_0x0007;
    L_0x0006:
        goto L_0x003b;
    L_0x0007:
        defpackage.amqw.a(r13);
        r13 = r12.av;
        if (r13 != 0) goto L_0x0010;
    L_0x000e:
        r13 = 1;
        goto L_0x0011;
    L_0x0010:
        r13 = 0;
    L_0x0011:
        defpackage.amqw.b(r13);
        r13 = r12.ae();
        r13 = defpackage.amqw.a(r13);
        r13 = (com.google.android.libraries.video.trim.VideoTrimView) r13;
        r2 = new zrd;
        r3 = r12.aa;
        r2.<init>(r3);
        r12.av = r2;
        r2 = r12.av;
        r13.a = r2;
        r13 = r12.ai();
        if (r13 == 0) goto L_0x003b;
    L_0x0031:
        r2 = r12.aa;
        r2 = defpackage.amqw.a(r2);
        r2 = (defpackage.acvx) r2;
        r13.i = r2;
    L_0x003b:
        r13 = r12.ae();
        if (r13 == 0) goto L_0x004b;
    L_0x0041:
        r2 = r12.ap;
        r3 = "enable_upload_trim_zoom";
        r2 = r2.getBoolean(r3, r0);
        r13.j = r2;
    L_0x004b:
        r13 = r12.aq;
        r2 = 0;
        if (r13 == 0) goto L_0x0055;
    L_0x0050:
        r13 = r13.b();
        goto L_0x0056;
    L_0x0055:
        r13 = r2;
    L_0x0056:
        if (r13 != 0) goto L_0x005a;
    L_0x0058:
        r13 = 0;
        goto L_0x0066;
    L_0x005a:
        r13 = r13.j;
        if (r13 != 0) goto L_0x0060;
    L_0x005e:
        r13 = defpackage.ayva.m;
    L_0x0060:
        r13 = r13.i;
        if (r13 != 0) goto L_0x0065;
    L_0x0064:
        goto L_0x0058;
    L_0x0065:
        r13 = 1;
    L_0x0066:
        r12.ah = r13;
        r13 = new android.os.HandlerThread;
        r3 = defpackage.zrg.class;
        r3 = r3.getSimpleName();
        r4 = 10;
        r13.<init>(r3, r4);
        r13.start();
        r3 = new android.os.Handler;
        r13 = r13.getLooper();
        r3.<init>(r13);
        r12.as = r3;
        if (r14 == 0) goto L_0x00b1;
    L_0x0085:
        r3 = -1;
        r13 = "playback_position";
        r3 = r14.getLong(r13, r3);
        r12.aj = r3;
        r13 = "audio_swap_track";
        r13 = r14.getParcelable(r13);
        r13 = (defpackage.zet) r13;
        r12.ak = r13;
        r13 = "max_hardware_decoders";
        r13 = r14.getInt(r13);
        r12.aA = r13;
        r13 = "extractor_sample_source_enabled";
        r13 = r14.getBoolean(r13, r1);
        r12.az = r13;
        r13 = "video_filter_pipeline";
        r13 = r14.getInt(r13, r1);
        r12.ax = r13;
    L_0x00b1:
        r13 = r12.W();
        r3 = r12.aa();
        r13.d = r3;
        r13.g();
        r13 = r12.Y();
        r13.a(r12);
        r4 = r12.W();
        r5 = r12.Y();
        r6 = r12.ak;
        r7 = r12.aj;
        r9 = r12.aA;
        r10 = r12.az;
        r11 = r12.ax;
        r13 = new zrv;
        r3 = r13;
        r3.<init>(r4, r5, r6, r7, r9, r10, r11);
        r12.at = r13;
        r13 = r12.at;
        r13.l = r12;
        r13 = 2131953846; // 0x7f1308b6 float:1.9544175E38 double:1.053325154E-314;
        r3 = "youtubeBaseEditParse::";
        r4 = "Failed to open video";
        if (r14 == 0) goto L_0x01f0;
    L_0x00ec:
        r5 = "max_video_duration_us";
        r5 = r14.getLong(r5);
        r12.ag = r5;
        r5 = "video_uri";
        r5 = r14.getParcelable(r5);
        r5 = (android.net.Uri) r5;
        if (r5 != 0) goto L_0x00ff;
    L_0x00fe:
        goto L_0x0101;
    L_0x00ff:
        r12.c = r0;
    L_0x0101:
        r6 = "editable_video_edits";
        r6 = r14.getParcelable(r6);
        r6 = (defpackage.ujj) r6;
        r7 = "video_meta_data";
        r7 = r14.getParcelable(r7);
        r7 = (defpackage.ukz) r7;
        r8 = "video_meta_data_saved_to_disk";
        r8 = r14.getBoolean(r8);
        r12.aB = r8;
        if (r7 == 0) goto L_0x011c;
    L_0x011b:
        goto L_0x016f;
    L_0x011c:
        if (r8 != 0) goto L_0x011f;
    L_0x011e:
        goto L_0x016f;
    L_0x011f:
        r7 = new java.io.File;	 Catch:{ IOException -> 0x0173 }
        r8 = r12.ao;	 Catch:{ IOException -> 0x0173 }
        r9 = "video_meta_data.raw";
        r7.<init>(r8, r9);	 Catch:{ IOException -> 0x0173 }
        r8 = new java.io.FileInputStream;	 Catch:{ all -> 0x0160 }
        r8.<init>(r7);	 Catch:{ all -> 0x0160 }
        r7 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x015e }
        r7.<init>();	 Catch:{ all -> 0x015e }
        r9 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r9 = new byte[r9];	 Catch:{ all -> 0x015e }
    L_0x0136:
        r10 = r8.read(r9);	 Catch:{ all -> 0x015e }
        if (r10 <= 0) goto L_0x0140;
    L_0x013c:
        r7.write(r9, r1, r10);	 Catch:{ all -> 0x015e }
        goto L_0x0136;
    L_0x0140:
        r7 = r7.toByteArray();	 Catch:{ all -> 0x015e }
        r8.close();	 Catch:{ IOException -> 0x0147 }
    L_0x0147:
        r8 = android.os.Parcel.obtain();	 Catch:{ IOException -> 0x0168 }
        r9 = r7.length;	 Catch:{ IOException -> 0x0168 }
        r8.unmarshall(r7, r1, r9);	 Catch:{ IOException -> 0x0168 }
        r8.setDataPosition(r1);	 Catch:{ IOException -> 0x0168 }
        r7 = defpackage.ukz.CREATOR;	 Catch:{ IOException -> 0x0168 }
        r7 = r7.createFromParcel(r8);	 Catch:{ IOException -> 0x0168 }
        r7 = (defpackage.ukz) r7;	 Catch:{ IOException -> 0x0168 }
        r8.recycle();	 Catch:{ IOException -> 0x0168 }
        goto L_0x016f;
    L_0x015e:
        r7 = move-exception;
        goto L_0x0162;
    L_0x0160:
        r7 = move-exception;
        r8 = r2;
    L_0x0162:
        if (r8 == 0) goto L_0x0167;
    L_0x0164:
        r8.close();	 Catch:{ IOException -> 0x0167 }
    L_0x0167:
        throw r7;	 Catch:{ IOException -> 0x0168 }
    L_0x0168:
        r7 = move-exception;
        r8 = "Serialization Read Error: ";
        defpackage.xtl.a(r8, r7);	 Catch:{ IOException -> 0x0173 }
        r7 = r2;
    L_0x016f:
        r12.a(r5, r6, r7);	 Catch:{ IOException -> 0x0173 }
        goto L_0x01a6;
    L_0x0173:
        r5 = move-exception;
        defpackage.xtl.a(r4, r5);
        r4 = defpackage.afpf.upload;
        r6 = defpackage.zjf.a(r5);
        r6 = java.lang.String.valueOf(r6);
        r7 = r6.length();
        if (r7 != 0) goto L_0x018d;
    L_0x0187:
        r6 = new java.lang.String;
        r6.<init>(r3);
        goto L_0x0191;
    L_0x018d:
        r6 = r3.concat(r6);
    L_0x0191:
        defpackage.afpc.a(r0, r4, r6, r5);
        r3 = r12.M_();
        r13 = android.widget.Toast.makeText(r3, r13, r0);
        r13.show();
        r13 = r12.p();
        r13.finish();
    L_0x01a6:
        r13 = "audio_mixer_button_click_logged";
        r13 = r14.getBoolean(r13);
        r12.af = r13;
        r13 = "audio_swap_enabled";
        r13 = r14.getBoolean(r13);
        r12.aw = r13;
        r13 = "audio_cross_fade_visible";
        r13 = r14.getBoolean(r13);
        r0 = r12.aw;
        if (r0 == 0) goto L_0x01de;
    L_0x01c0:
        r12.aD();
        r0 = r12.ak;
        if (r0 != 0) goto L_0x01cb;
    L_0x01c7:
        r12.f();
        goto L_0x01de;
    L_0x01cb:
        r0 = r0.d;
        r12.b(r0);
        r12.a(r13);
        r13 = "audio_panel_visible";
        r13 = r14.getBoolean(r13, r1);
        if (r13 == 0) goto L_0x01de;
    L_0x01db:
        r12.ak();
    L_0x01de:
        r13 = r12.at;
        r13 = r13.c();
        if (r13 == 0) goto L_0x022b;
    L_0x01e6:
        r13 = "video_filters_view_visible";
        r13 = r14.getBoolean(r13, r1);
        r12.a(r13, r1);
        goto L_0x022b;
    L_0x01f0:
        r14 = r12.Z;
        if (r14 == 0) goto L_0x022b;
    L_0x01f4:
        r12.a(r14, r2, r2);	 Catch:{ IOException -> 0x01f8 }
        goto L_0x022b;
    L_0x01f8:
        r14 = move-exception;
        defpackage.xtl.a(r4, r14);
        r1 = defpackage.afpf.upload;
        r4 = defpackage.zjf.a(r14);
        r4 = java.lang.String.valueOf(r4);
        r5 = r4.length();
        if (r5 != 0) goto L_0x0212;
    L_0x020c:
        r4 = new java.lang.String;
        r4.<init>(r3);
        goto L_0x0216;
    L_0x0212:
        r4 = r3.concat(r4);
    L_0x0216:
        defpackage.afpc.a(r0, r1, r4, r14);
        r14 = r12.M_();
        r13 = android.widget.Toast.makeText(r14, r13, r0);
        r13.show();
        r13 = r12.p();
        r13.finish();
    L_0x022b:
        r12.Z = r2;
        r12.am();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zrg.a(android.view.View, android.os.Bundle):void");
    }

    public final void B() {
        super.B();
        this.at.e();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) M_()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float fraction = q().getFraction(ac(), displayMetrics.heightPixels, displayMetrics.heightPixels);
        VideoWithPreviewView W = W();
        int i = (int) fraction;
        if (W.f != i) {
            W.f = i;
            W.c();
        }
        if (this.aw) {
            ah().setVisibility(0);
        }
    }

    public void ad_() {
        super.ad_();
        Y().a(null);
        this.at.f();
    }

    public void e(Bundle bundle) {
        bundle.putInt("max_hardware_decoders", this.aA);
        bundle.putBoolean("extractor_sample_source_enabled", this.az);
        bundle.putLong("max_video_duration_us", this.ag);
        bundle.putParcelable("video_uri", this.at.e);
        ujf ujf = this.at.f;
        Parcelable parcelable = null;
        bundle.putParcelable("editable_video_edits", ujf != null ? ujf.a : null);
        if (!this.ah) {
            ujf = this.at.f;
            if (ujf != null) {
                parcelable = ujf.b;
            }
            bundle.putParcelable("video_meta_data", parcelable);
        }
        bundle.putLong("playback_position", this.at.d());
        bundle.putBoolean("audio_mixer_button_click_logged", this.af);
        bundle.putBoolean("audio_swap_enabled", this.aw);
        bundle.putParcelable("audio_swap_track", this.at.m);
        bundle.putBoolean("audio_cross_fade_visible", this.ab);
        boolean z = false;
        if (ag() != null && ag().getVisibility() == 0) {
            z = true;
        }
        bundle.putBoolean("audio_panel_visible", z);
        bundle.putInt("video_filter_pipeline", this.ax);
        bundle.putBoolean("video_filters_view_visible", Z().f);
        bundle.putBoolean("video_meta_data_saved_to_disk", this.aB);
    }

    public void i() {
        super.i();
        uje ae = ae();
        if (ae != null) {
            ae.a(null, null, uja.a);
            uja uja = ae.p;
            if (uja != null) {
                uja.b(ae);
            }
        }
        AudioTrackView ai = ai();
        if (ai != null) {
            ai.a();
        }
        uja uja2 = this.ae;
        if (uja2 != null) {
            uja2.b((uje) this);
        }
        EditableVideoControllerView Y = Y();
        Y.b(this);
        Y.a(null);
        ujk ujk = this.at;
        ujk.l = null;
        ujk.i.b.remove(ujk);
        zle zle = ujk.b;
        if (zle != null) {
            zle.i();
            unj h = ujk.b.h();
            if (h != null) {
                ujk.d.b(h);
            }
            ujk.b.j();
        }
        ujf ujf = ujk.f;
        if (ujf != null) {
            ujf.b(ujk);
        }
        this.as.post(new zri(this));
        this.b = true;
    }

    public void a(int i, int i2, Intent intent) {
        if (i == 15911 && i2 == -1) {
            a((zet) amqw.a(intent.getParcelableExtra("audio_track")));
            ak();
        }
    }

    public final void Q_() {
        if (p() != null) {
            ao();
        }
    }

    public void onClick(View view) {
        if (view == ah()) {
            a(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_BUTTON);
            if (this.at.m == null) {
                aA();
                return;
            }
            zff zff = this.ai;
            if (zff != null) {
                AlertDialog alertDialog = zff.b;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    zff.b = null;
                }
                this.ai = null;
            }
            this.ai = new zff(p(), this.ar, this.at.m, new zrl(this), new zro(this));
            this.ai.b.show();
        } else if (view != X()) {
            if (view == ay()) {
                if (!this.af && a(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_VOLUME)) {
                    this.af = true;
                }
                a(this.ab ^ 1);
            }
        } else {
            a(acwc.UPLOAD_VIDEO_EDITING_VIDEO_EFFECTS_BUTTON);
            if (Z().c() != null) {
                int i;
                zos c = Z().c();
                zjp zjp = c.l;
                if (zjp != null) {
                    int i2 = 0;
                    for (zjt zjt : zjp.a) {
                        if (!zjp.b.contains(zjp.a(zjt.a))) {
                            zjp.b.edit().putInt(zjp.a(zjt.a), 1).apply();
                            i2++;
                            zjt.c = new zjs(1);
                        }
                    }
                    i = i2;
                } else if (c.m != null) {
                    Map hashMap = new HashMap();
                    for (zjt zjt2 : c.i) {
                        if (!zjt2.a()) {
                            hashMap.put(zjt2.a, Integer.valueOf(1));
                        }
                    }
                    c.m.a(hashMap);
                    i = hashMap.size();
                } else {
                    xtl.c("FilterList.setUnvisitedEffectsBrowsed failed");
                    an();
                }
                if (i > 0) {
                    ImageButton X = X();
                    Context context = X.getContext();
                    if (xrn.c(context)) {
                        xrn.a(context, X, context.getString(R.string.a11y_new_effect_available_indicator));
                    }
                }
                an();
            }
            Z().a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void aA() {
        Intent intent = new Intent(p(), AudioSelectionActivity.class);
        acvx acvx = this.aa;
        if (!(acvx == null || acvx.c() == null)) {
            acwp c = this.aa.c();
            intent.putExtra("parent_csn", c.a);
            intent.putExtra("parent_ve_type", c.e.aH);
        }
        intent.putExtra("extractor_sample_source", this.az);
        startActivityForResult(intent, 15911);
    }

    public final void a_(boolean z) {
        if (z) {
            p().getWindow().addFlags(128);
            return;
        }
        p().getWindow().clearFlags(128);
        if (ad()) {
            Y().b();
        }
    }

    public final void aB() {
        a(null);
        Toast.makeText(p(), q().getString(R.string.upload_edit_video_fragment_audio_swap_error), 1).show();
    }

    public final void a(nlq nlq) {
        xtl.a("Unable to play video", (Throwable) nlq);
        b(acwc.UPLOAD_VIDEO_EDITING_VIDEO_PREVIEW_ERROR);
        a((Throwable) nlq);
    }

    private final void a(Uri uri, ujj ujj, ukz ukz) {
        if (this.b) {
            xtl.d("Unable to SetVideo after Fragment.onDestroyView");
            return;
        }
        ujf ujf;
        upd upd;
        uoy uoy;
        uoz uoz;
        boolean z;
        boolean z2;
        if (ujj != null && ukz != null) {
            ujf = new ujf(ujj, ukz);
        } else if (ujj != null) {
            ujf = new ujf(ujj, a(M_(), uri));
        } else if (uri != null) {
            Context M_ = M_();
            long j = this.ag;
            uji uji = new uji();
            uji.a = a(M_, uri);
            uji.b = Math.max(0, j);
            ujf = uji.a();
            b(acwc.UPLOAD_VIDEO_EDITING_VIDEO_PREVIEW);
        } else {
            ujf = null;
        }
        if (ujf != null) {
            a(ujf);
        }
        Object obj = ujf != null ? ujf.b : null;
        if (this.ah && obj != null && ukz == null) {
            this.as.post(new zrh(this, obj));
        }
        if (this.ac == null) {
            nv nvVar = this.v;
            nf a = nvVar.a("thumbnail_producer");
            if (!(a instanceof upd)) {
                a = new upd();
                nvVar.a().a(a, "thumbnail_producer").a();
            }
            this.ac = (upd) a;
            upd = this.ac;
            ukm ukm = this.at.a;
            uoy = upd.a;
            if (uoy.h != ukm) {
                upb upb = uoy.g;
                if (upb != null) {
                    upb.f();
                }
                uoy.h = ukm;
                upb upb2 = uoy.g;
                if (upb2 != null) {
                    upb2.e();
                }
            }
            this.ac.a.i = al();
        }
        upd = this.ac;
        if (obj == null) {
            uoz = null;
        } else {
            uoy = upd.a;
            uhy.a(obj);
            upb upb3 = uoy.g;
            if (upb3 != null && obj.equals(upb3.a)) {
                uoz = uoy.g;
            } else {
                upb3 = uoy.g;
                if (upb3 != null) {
                    upb3.g();
                }
                uoy.g = new upb(uoy, obj);
                uoz = uoy.g;
            }
        }
        VideoTrimView ae = ae();
        boolean z3 = true;
        if (ujf != null) {
            zrv zrv;
            this.ae.b((uje) this);
            this.ae = new uja(obj.g);
            this.ae.a((uje) this);
            if (ae != null) {
                ae.a(ujf, uoz, this.ae);
                if (af() == null) {
                    z = true;
                    zrv = this.at;
                    if (zrv == null && zrv.c()) {
                        b(acwc.UPLOAD_VIDEO_EDITING_VIDEO_EFFECTS_BUTTON);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    b(acwc.UPLOAD_VIDEO_EDITING_TRIM_VIEW);
                }
            }
            z = false;
            zrv = this.at;
            if (zrv == null) {
            }
            z2 = false;
            b(acwc.UPLOAD_VIDEO_EDITING_TRIM_VIEW);
        } else {
            if (ae != null) {
                ae.a(null, null, uja.a);
            }
            z = false;
            z2 = false;
        }
        if (this.at.m == null) {
            z3 = false;
        }
        b(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_BUTTON);
        b(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_VOLUME);
        ujk aj = aj();
        if (aj != null) {
            ujf ujf2 = aj.d;
            if (ujf2 != null) {
                ujf2.b(aj);
            }
            aj.d = ujf;
            if (ujf != null) {
                aj.c.setProgress(Math.round(ujf.v() * 100.0f));
                ujf.a(aj);
            }
        }
        Y().a(ujf);
        synchronized (this.a) {
            a(new zrk(this, ujf, uri, uoz));
        }
        a(new zrj(this, z, z2, z3));
    }

    /* Access modifiers changed, original: protected */
    public ukz a(Context context, Uri uri) {
        return uku.a(context, uri);
    }

    /* Access modifiers changed, original: final */
    public final void a(Runnable runnable) {
        nn p = p();
        if (p != null) {
            p.runOnUiThread(runnable);
        }
    }

    private final void b(Uri uri) {
        if (ai() != null) {
            if (this.ad == null) {
                nv nvVar = this.v;
                String str = "waveform_producer";
                nf a = nvVar.a(str);
                if (!(a instanceof zgk)) {
                    a = new zgk();
                    nvVar.a().a(a, str).a();
                }
                this.ad = (zgk) a;
            }
            zgf zgf = this.ad.a;
            zgf.k = this.az;
            Context p = p();
            nwf.a((Object) uri);
            if (!uri.equals(zgf.a)) {
                nne nly;
                zgf.a = uri;
                nlp nlp = zgf.b;
                if (nlp != null) {
                    nlp.b(zgf.c);
                    zgf.b.f();
                    zgf.b.g();
                }
                zgf.b = nlr.a();
                zgf.h = 0;
                zgf.i = 0;
                zgf.j = 0;
                zgf.g = 0;
                try {
                    zgf.e.close();
                } catch (IOException e) {
                    xtl.a("Error closing DataOutputStream", e);
                }
                zgf.d.reset();
                zgf.e = new DataOutputStream(zgf.e);
                if (zgf.k) {
                    nne nrd = new nrd(uri, new nvr(p, nxf.a(p, "AudioMPEG")), new nvp(65536), 1310720, new nrc[0]);
                } else {
                    nly = new nly(p, uri);
                }
                new ujz(nly).a = zgf;
                zgf.b.a(zgf.c);
                zgf.b.a(r11);
                zgf.b.a(true);
            }
            uje ai = ai();
            ujf ujf = this.at.f;
            uja uja = this.ae;
            ai.f = zgf;
            ai.a();
            ai.c = ujf;
            ujf.a((ujk) ai);
            ai.d = uja;
            ai.d.a(ai);
            ai.e = new zgd(zgf, ujf, uja, ai.getResources());
            ai.e.setCallback(ai);
            ai.a.a = ujf;
            ai.requestLayout();
            this.ab = false;
            ao();
        }
    }

    private final void f() {
        this.ab = false;
        if (ai() != null) {
            ai().a();
            ao();
        }
    }

    private final void a(boolean z) {
        amqw.b(this.aw);
        if (z != this.ab) {
            this.ab = z;
            ao();
        }
    }

    private final void ao() {
        zet zet = this.at.m;
        Object obj = zet == null ? null : 1;
        boolean z = this.ae.c;
        AudioTrackView ai = ai();
        ImageButton ay = ay();
        aj();
        int i = 8;
        int i2 = (obj == null || (this.ab && !z)) ? 8 : 0;
        ai.setVisibility(i2);
        if (ay != null) {
            if (!(zet == null || z)) {
                i = 0;
            }
            ay.setVisibility(i);
            ay.setImageResource(!this.ab ? R.drawable.audio_swap_mix_button : R.drawable.audio_swap_mix_done_button);
        }
        i2 = ra.a(p(), (int) R.drawable.ic_trim_handle).getIntrinsicWidth() / 2;
        int dimensionPixelSize = q().getDimensionPixelSize(R.dimen.upload_edit_video_fragment_mixer_button_width);
        int i3 = !z ? i2 : 0;
        int i4 = (z || obj == null) ? 0 : dimensionPixelSize - i2;
        d(i4);
        e(i4);
        a(this.ab, z, i2, i4, i3);
    }

    /* Access modifiers changed, original: protected */
    public void d(int i) {
        VideoTrimView ae = ae();
        int dimensionPixelSize = q().getDimensionPixelSize(R.dimen.video_trim_view_padding);
        if (ae != null) {
            ae.setPadding(0, dimensionPixelSize, i, 0);
        }
    }

    public final void a(znq znq, ArrayList arrayList) {
        boolean z = true;
        amqw.b(this.ay == null);
        if (this.au != null) {
            z = false;
        }
        amqw.b(z);
        synchronized (this.a) {
            this.ay = (znq) amqw.a((Object) znq);
            this.au = (ArrayList) amqw.a((Object) arrayList);
            if (Z() != null) {
                zrv zrv = this.at;
                if (zrv != null && zrv.c()) {
                    ujf ujf = this.at.f;
                    if (ujf != null) {
                        b(ujf.d());
                    }
                }
            }
        }
    }

    public final void b(String str) {
        amqw.b(aC());
        amqw.b(this.at != null);
        a(new zrm(this, (ChooseFilterView) amqw.a(Z()), str));
    }

    public final boolean aC() {
        ArrayList arrayList = this.au;
        return (arrayList == null || arrayList.isEmpty() || this.ay == null) ? false : true;
    }

    private final boolean a(acwc acwc) {
        acvx acvx = this.aa;
        if (acvx == null || acwc == null) {
            return false;
        }
        acvx.a(3, new acvs(acwc), this.aE);
        return true;
    }

    private final void b(acwc acwc) {
        acvx acvx = this.aa;
        if (acvx != null) {
            acvx.b(acwc, this.aE);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(zet zet) {
        if (!amqq.a(zet, this.at.m)) {
            zrv zrv = this.at;
            if (!amqq.a(zet, zrv.m)) {
                float f;
                Uri uri;
                zet zet2 = zrv.m;
                zrv.m = zet;
                long j = 0;
                zrv.f.c(0);
                zet zet3 = zrv.m;
                if (zet3 == null) {
                    f = 0.0f;
                    uri = null;
                } else {
                    uri = zet3.d;
                    f = zet2 != null ? zrv.f.v() : 0.3f;
                    j = zrv.f.u();
                }
                zrv.f.a(uri);
                zrv.f.a(f);
                zrv.f.c(j);
            }
            this.af = false;
            aD();
            if (zet == null) {
                f();
                return;
            }
            if (this.at.c()) {
                a(false, true);
            }
            b(zet.d);
        }
    }

    private final void a(boolean z, boolean z2) {
        amqw.b(this.at.c());
        ChooseFilterView Z = Z();
        if (z != Z.f) {
            Z.a(z2);
        }
    }
}
