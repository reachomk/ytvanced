package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.video.preview.VideoWithPreviewView;
import com.google.android.libraries.video.trim.VideoTrimView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import com.google.protos.youtube.api.innertube.ReelPickerItemRendererOuterClass;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;
import java.io.File;
import java.io.IOException;

/* renamed from: gdn */
public final class gdn extends zrg implements acwa, gda, gdc, gdg, gdk, gdy, gea, gec, geh, gej, gey, gfn, gkd, xfc {
    public alwu Z;
    public zin a;
    private gdo aF;
    private EditableVideoControllerView aG;
    private ContextThemeWrapper aH;
    private apxu aI;
    private apxu aJ;
    private awxb aK;
    private boolean aL;
    private boolean aM;
    private boolean aN;
    private boolean aO;
    private Bitmap aP;
    private final geg aQ = new gdm(this);
    private File aR;
    private bacz aS;
    public acvx aa;
    public gdx ab;
    public geb ac;
    public gdz ad;
    public gdf ae;
    public gef af;
    public gfa ag;
    public gdd ah;
    public gdb ai;
    public ged aj;
    public gdl ak;
    public gfg al;
    public gim am;
    public final gdw b = new gdp(this);
    public VideoSelectedActionOuterClass$VideoSelectedAction c;

    public static gdn a(zin zin, apxu apxu, znv znv, apxu apxu2, awxb awxb, bacz bacz) {
        amqw.a((Object) znv);
        gdn gdn = new gdn();
        Bundle bundle = new Bundle();
        bundle.putParcelable("RECORDING_INFO", zin);
        if (apxu != null) {
            bundle.putByteArray("NAVIGATION_ENDPOINT", apxu.toByteArray());
        }
        if (apxu2 != null) {
            bundle.putByteArray("REEL_EDIT_VIDEO_ENDPOINT_KEY", apxu2.toByteArray());
        }
        if (awxb != null) {
            bundle.putByteArray("VIDEO_EDIT_RENDERER", awxb.toByteArray());
        }
        if (bacz != null) {
            bundle.putByteArray("comment_sticker", bacz.toByteArray());
        }
        if (znv.b() == null) {
            znv.a(null);
        }
        gdn.a(znv.a(ayzc.EFFECTS_FEATURE_KAZOO_TEXT_REELS_EDIT), znv.a(ayzc.EFFECTS_FEATURE_ADVANCED_TEXT_REELS_EDIT), znv.a(ayzc.EFFECTS_FEATURE_TEXT_BG_ROUNDED_CORNERS));
        gdn.aO = znv.a(ayzc.EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS);
        gdn.a((zjx) znv);
        gdn.a((zjy) znv);
        gdn.a(znv.b(), znv.b);
        gdn.az = true;
        gdn.aA = 2;
        gdn.ax = 1;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                gdn.a((long) (((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) b).b * 1000000));
            }
        }
        try {
            Uri fromFile;
            String str = zin.c;
            if (str == null || !str.startsWith("content:")) {
                fromFile = Uri.fromFile(new File(zin.c));
            } else {
                fromFile = Uri.parse(zin.c);
            }
            gdn.a(fromFile);
        } catch (IOException e) {
            xtl.a("Failed to open video: ", e);
            xpr.a(gdn.M_(), (int) R.string.reel_video_editor_fail_open_video, 1);
        }
        gdn.f(bundle);
        return gdn;
    }

    /* Access modifiers changed, original: protected|final */
    public final int ac() {
        return R.fraction.reel_edit_fragment_max_video_height;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean al() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(int i) {
    }

    private final gdo aE() {
        if (this.aF == null) {
            this.aF = ((gdr) xtx.a(gdr.class, this.y, p())).a(new gdq(this));
        }
        return this.aF;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        aE().a(this);
        if (bundle != null) {
            ajrb ajrb = (ajrb) bundle.getParcelable("REEL_VOD_VIDEO_SELECTED_ACTION");
            if (ajrb != null) {
                this.c = (VideoSelectedActionOuterClass$VideoSelectedAction) ajrb.a(VideoSelectedActionOuterClass$VideoSelectedAction.d);
            }
            a(bundle.getBoolean("TEXT_ENABLED"), bundle.getBoolean("ADVANCED_TEXT_ENABLED"), bundle.getBoolean("TEXT_ROUNDED_CORNERS_ENABLED"));
            this.aO = bundle.getBoolean("CAN_REQUEST_VIDEO_EFFECTS_STATE");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final VideoWithPreviewView W() {
        return this.ac.d;
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageButton X() {
        return this.ad.k;
    }

    /* Access modifiers changed, original: protected|final */
    public final EditableVideoControllerView Y() {
        return this.aG;
    }

    /* Access modifiers changed, original: protected|final */
    public final ChooseFilterView Z() {
        gdl gdl = this.ak;
        return gdl != null ? gdl.b : null;
    }

    /* Access modifiers changed, original: protected|final */
    public final View aa() {
        return this.ac.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final View ab() {
        return this.ac.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean ad() {
        return ae().u ^ 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final VideoTrimView ae() {
        return this.aj.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageButton af() {
        return this.ad.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final View ag() {
        return this.ah.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final ImageButton ah() {
        return this.ad.g;
    }

    /* Access modifiers changed, original: protected|final */
    public final AudioTrackView ai() {
        return this.ah.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final AudioCrossFadeView aj() {
        return this.ah.d;
    }

    /* Access modifiers changed, original: protected|final */
    public final void ak() {
        CharSequence charSequence;
        gdd gdd = this.ah;
        AudioCrossFadeView audioCrossFadeView = gdd.d;
        audioCrossFadeView.c.setProgressDrawable(audioCrossFadeView.getResources().getDrawable(R.drawable.audio_swap_cross_fade_progress_bar_white));
        gdd.d.setVisibility(0);
        gdd.d.e = -1275068417;
        gdd.c.e.b.setColor(0);
        gdd.c.b.setColor(0);
        AudioTrackView audioTrackView = gdd.c;
        audioTrackView.g = false;
        audioTrackView.h = true;
        CharSequence charSequence2 = null;
        gdd.d.findViewById(R.id.audio_swap_cross_fade_view_container).setBackground(null);
        audioCrossFadeView = gdd.d;
        float dimension = gdd.a.getResources().getDimension(R.dimen.reel_edit_audio_cross_fade_text_size);
        audioCrossFadeView.a.setTextSize(0, dimension);
        audioCrossFadeView.b.setTextSize(0, dimension);
        int dimension2 = (int) gdd.a.getResources().getDimension(R.dimen.reel_edit_audio_cross_fade_text_left_right_margin);
        AudioCrossFadeView audioCrossFadeView2 = gdd.d;
        AudioCrossFadeView.a(audioCrossFadeView2.a, dimension2, dimension2);
        AudioCrossFadeView.a(audioCrossFadeView2.b, dimension2, dimension2);
        gdd = this.ah;
        zet zet = this.at.m;
        if (zet == null) {
            charSequence = null;
        } else {
            charSequence = zet.b.toString();
        }
        zet zet2 = this.at.m;
        if (zet2 != null) {
            charSequence2 = zet2.a.toString();
        }
        if (!gdd.j) {
            gfu.a(gdd);
            gdd.j = true;
        }
        gdd.f.setText(charSequence);
        gdd.e.setText(charSequence2);
        aw();
    }

    /* Access modifiers changed, original: protected|final */
    public final void am() {
        this.ak.b.setBackgroundColor(xwe.a(this.aH, R.attr.reelEditChooseFilterBackground, 0));
    }

    /* Access modifiers changed, original: protected|final */
    public final void an() {
        if (Z().c() != null) {
            ImageButton X = X();
            boolean f = Z().c().f();
            int i = R.drawable.quantum_ic_auto_fix_white_24;
            if (f) {
                zjy zjy = this.aC;
                if (zjy != null && zjy.a(ayzc.EFFECTS_FEATURE_DOT_ON_FILTER_ICON)) {
                    i = R.drawable.ic_filter_new_badge_white_24;
                }
            }
            X.setImageResource(i);
        }
    }

    public final void a(boolean z) {
        if (z) {
            aw();
        } else {
            ax();
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0076=Splitter:B:23:0x0076, B:32:0x008b=Splitter:B:32:0x008b} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0076=Splitter:B:23:0x0076, B:32:0x008b=Splitter:B:32:0x008b} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0683  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0957  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x09b2  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x09cb A:{LOOP_END, LOOP:0: B:215:0x09c5->B:217:0x09cb} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0957  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x09b2  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x09cb A:{LOOP_END, LOOP:0: B:215:0x09c5->B:217:0x09cb} */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0957  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x09b2  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x09cb A:{LOOP_END, LOOP:0: B:215:0x09c5->B:217:0x09cb} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0957  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x09b2  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x09cb A:{LOOP_END, LOOP:0: B:215:0x09c5->B:217:0x09cb} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad A:{Splitter:B:12:0x0056, ExcHandler: SecurityException (e java.lang.SecurityException)} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad A:{Splitter:B:12:0x0056, ExcHandler: SecurityException (e java.lang.SecurityException)} */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1 A:{SYNTHETIC, Splitter:B:44:0x00d1} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ed A:{SYNTHETIC, Splitter:B:50:0x00ed} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0109 A:{SYNTHETIC, Splitter:B:56:0x0109} */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0126 A:{SYNTHETIC, Splitter:B:62:0x0126} */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0957  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x09b2  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x09cb A:{LOOP_END, LOOP:0: B:215:0x09c5->B:217:0x09cb} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad A:{Splitter:B:12:0x0056, ExcHandler: SecurityException (e java.lang.SecurityException)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:26:0x007e, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            r4.a();
     */
    /* JADX WARNING: Missing block: B:29:0x0087, code skipped:
            throw new java.io.IOException(r0);
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            r5.close();
     */
    /* JADX WARNING: Missing block: B:36:0x00ad, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:37:0x00af, code skipped:
            r0 = e;
     */
    public final android.view.View a(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
        r19 = this;
        r1 = r19;
        r0 = r1.aa;
        r1.a(r0);
        r0 = new android.view.ContextThemeWrapper;
        r2 = r19.p();
        r3 = 2132017695; // 0x7f14021f float:1.9673676E38 double:1.0533566994E-314;
        r0.<init>(r2, r3);
        r1.aH = r0;
        r2 = r1.j;
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        goto L_0x0142;
    L_0x001b:
        r0 = "RECORDING_INFO";
        r0 = r2.getParcelable(r0);
        r0 = (defpackage.zin) r0;
        r1.a = r0;
        r0 = r1.a;
        if (r0 == 0) goto L_0x0046;
    L_0x0029:
        r4 = r0.c;
        r5 = "content:";
        r4 = r4.startsWith(r5);
        if (r4 == 0) goto L_0x003a;
    L_0x0033:
        r0 = r0.c;
        r0 = android.net.Uri.parse(r0);
        goto L_0x0047;
    L_0x003a:
        r4 = new java.io.File;
        r0 = r0.c;
        r4.<init>(r0);
        r0 = android.net.Uri.fromFile(r4);
        goto L_0x0047;
    L_0x0046:
        r0 = 0;
    L_0x0047:
        r4 = r1.a;
        r4 = r4.f;
        if (r4 != 0) goto L_0x00b6;
    L_0x004d:
        r4 = new ggd;
        r5 = r19.p();
        r4.<init>(r5);
        r5 = r4.b;	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        r6 = "r";
        r5 = r5.openAssetFileDescriptor(r0, r6);	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        if (r5 == 0) goto L_0x008c;
    L_0x0060:
        r0 = r4.a;	 Catch:{ RuntimeException -> 0x007e }
        r6 = r5.getFileDescriptor();	 Catch:{ RuntimeException -> 0x007e }
        r0.setDataSource(r6);	 Catch:{ RuntimeException -> 0x007e }
        r5.close();	 Catch:{ IOException -> 0x006c, SecurityException -> 0x00ad }
    L_0x006c:
        r0 = r4.a;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5 = 1;
        r0 = r0.getFrameAtTime(r5);	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0076;
    L_0x0075:
        r0 = 0;
    L_0x0076:
        r1.aP = r0;	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        r4.a();	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        goto L_0x00c6;
    L_0x007c:
        r0 = move-exception;
        goto L_0x0088;
    L_0x007e:
        r0 = move-exception;
        r4.a();	 Catch:{ all -> 0x007c }
        r4 = new java.io.IOException;	 Catch:{ all -> 0x007c }
        r4.<init>(r0);	 Catch:{ all -> 0x007c }
        throw r4;	 Catch:{ all -> 0x007c }
    L_0x0088:
        r5.close();	 Catch:{ IOException -> 0x008b, SecurityException -> 0x00ad }
    L_0x008b:
        throw r0;	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
    L_0x008c:
        r4 = new java.io.IOException;	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        r5 = r0.length();	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        r5 = r5 + 42;
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        r6.<init>(r5);	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        r5 = "openAssetFileDescriptor returned null for ";
        r6.append(r5);	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        r6.append(r0);	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        r0 = r6.toString();	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        r4.<init>(r0);	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
        throw r4;	 Catch:{ IOException -> 0x00af, SecurityException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        goto L_0x00b0;
    L_0x00af:
        r0 = move-exception;
    L_0x00b0:
        r4 = "Error getting video thumbnail.";
        defpackage.xtl.a(r4, r0);
        goto L_0x00c6;
    L_0x00b6:
        r4 = r19.M_();	 Catch:{ IOException -> 0x00c5 }
        r4 = r4.getContentResolver();	 Catch:{ IOException -> 0x00c5 }
        r0 = android.provider.MediaStore.Images.Media.getBitmap(r4, r0);	 Catch:{ IOException -> 0x00c5 }
        r1.aP = r0;	 Catch:{ IOException -> 0x00c5 }
        goto L_0x00c6;
    L_0x00c6:
        r0 = "NAVIGATION_ENDPOINT";
        r0 = r2.getByteArray(r0);
        r4 = "Error parsing navigation endpoint.";
        if (r0 != 0) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00e4;
    L_0x00d1:
        r5 = defpackage.anxa.c();	 Catch:{ anyg -> 0x00e0 }
        r6 = defpackage.apxu.d;	 Catch:{ anyg -> 0x00e0 }
        r0 = defpackage.anxl.parseFrom(r6, r0, r5);	 Catch:{ anyg -> 0x00e0 }
        r0 = (defpackage.apxu) r0;	 Catch:{ anyg -> 0x00e0 }
        r1.aI = r0;	 Catch:{ anyg -> 0x00e0 }
        goto L_0x00e4;
    L_0x00e0:
        r0 = move-exception;
        defpackage.xtl.a(r4, r0);
    L_0x00e4:
        r0 = "REEL_EDIT_VIDEO_ENDPOINT_KEY";
        r0 = r2.getByteArray(r0);
        if (r0 != 0) goto L_0x00ed;
    L_0x00ec:
        goto L_0x0100;
    L_0x00ed:
        r5 = defpackage.anxa.c();	 Catch:{ anyg -> 0x00fc }
        r6 = defpackage.apxu.d;	 Catch:{ anyg -> 0x00fc }
        r0 = defpackage.anxl.parseFrom(r6, r0, r5);	 Catch:{ anyg -> 0x00fc }
        r0 = (defpackage.apxu) r0;	 Catch:{ anyg -> 0x00fc }
        r1.aJ = r0;	 Catch:{ anyg -> 0x00fc }
        goto L_0x0100;
    L_0x00fc:
        r0 = move-exception;
        defpackage.xtl.a(r4, r0);
    L_0x0100:
        r0 = "VIDEO_EDIT_RENDERER";
        r0 = r2.getByteArray(r0);
        if (r0 != 0) goto L_0x0109;
    L_0x0108:
        goto L_0x011e;
    L_0x0109:
        r4 = defpackage.anxa.c();	 Catch:{ anyg -> 0x0118 }
        r5 = defpackage.awxb.h;	 Catch:{ anyg -> 0x0118 }
        r0 = defpackage.anxl.parseFrom(r5, r0, r4);	 Catch:{ anyg -> 0x0118 }
        r0 = (defpackage.awxb) r0;	 Catch:{ anyg -> 0x0118 }
        r1.aK = r0;	 Catch:{ anyg -> 0x0118 }
        goto L_0x011e;
    L_0x0118:
        r0 = move-exception;
        r4 = "Error parsing renderer.";
        defpackage.xtl.a(r4, r0);
    L_0x011e:
        r0 = "comment_sticker";
        r4 = r2.getByteArray(r0);
        if (r4 == 0) goto L_0x0142;
    L_0x0126:
        r4 = r2.getByteArray(r0);	 Catch:{ anyg -> 0x013c }
        r5 = defpackage.anxa.c();	 Catch:{ anyg -> 0x013c }
        r6 = defpackage.bacz.g;	 Catch:{ anyg -> 0x013c }
        r4 = defpackage.anxl.parseFrom(r6, r4, r5);	 Catch:{ anyg -> 0x013c }
        r4 = (defpackage.bacz) r4;	 Catch:{ anyg -> 0x013c }
        r1.aS = r4;	 Catch:{ anyg -> 0x013c }
        r2.remove(r0);	 Catch:{ anyg -> 0x013c }
        goto L_0x0142;
    L_0x013c:
        r0 = move-exception;
        r2 = "Error parsing comment sticker.";
        defpackage.xtl.a(r2, r0);
    L_0x0142:
        r0 = r1.a;
        r2 = 1;
        r4 = 0;
        if (r0 == 0) goto L_0x014f;
    L_0x0148:
        r0 = r0.f;
        if (r0 == 0) goto L_0x014f;
    L_0x014c:
        r1.aw = r4;
        goto L_0x0151;
    L_0x014f:
        r1.aw = r2;
    L_0x0151:
        r0 = 2131035211; // 0x7f05044b float:1.7680961E38 double:1.052871288E-314;
        r5 = r20;
        r6 = r21;
        r0 = r5.inflate(r0, r6, r4);
        r5 = r1.ac;
        r5.a = r1;
        r6 = 2131758077; // 0x7f100bfd float:1.9147108E38 double:1.053228431E-314;
        r7 = r0.findViewById(r6);
        r7 = (com.google.android.libraries.video.preview.VideoWithPreviewView) r7;
        r5.d = r7;
        r7 = r5.d;
        r7.setOnClickListener(r5);
        r7 = r5.d;
        r7.a = r5;
        r7 = 2131758078; // 0x7f100bfe float:1.914711E38 double:1.0532284316E-314;
        r7 = r0.findViewById(r7);
        r5.b = r7;
        r7 = 2131758020; // 0x7f100bc4 float:1.9146992E38 double:1.053228403E-314;
        r7 = r0.findViewById(r7);
        r5.c = r7;
        r5 = r1.ad;
        r7 = r19.q();
        r8 = r1.a;
        r9 = r1.aL;
        r10 = r1.aq;
        r10 = r10.b();
        if (r10 != 0) goto L_0x019a;
    L_0x0198:
        r10 = 0;
        goto L_0x01a6;
    L_0x019a:
        r10 = r10.v;
        if (r10 != 0) goto L_0x01a0;
    L_0x019e:
        r10 = defpackage.awxk.f;
    L_0x01a0:
        r10 = r10.c;
        if (r10 != 0) goto L_0x01a5;
    L_0x01a4:
        goto L_0x0198;
    L_0x01a5:
        r10 = 1;
    L_0x01a6:
        r11 = r1.aa;
        r5.l = r1;
        r5.m = r8;
        r5.b = r10;
        r5.c = r11;
        r11 = 2131758068; // 0x7f100bf4 float:1.914709E38 double:1.0532284266E-314;
        r11 = r0.findViewById(r11);
        r11 = (android.widget.RelativeLayout) r11;
        r5.d = r11;
        r11 = 2131758069; // 0x7f100bf5 float:1.9147092E38 double:1.053228427E-314;
        r11 = r0.findViewById(r11);
        r11 = (android.widget.ImageView) r11;
        r5.e = r11;
        r11 = r5.e;
        r11.setOnClickListener(r5);
        r11 = 2131758071; // 0x7f100bf7 float:1.9147096E38 double:1.053228428E-314;
        r11 = r0.findViewById(r11);
        r11 = (android.widget.ImageButton) r11;
        r5.f = r11;
        r11 = r5.f;
        r11.setOnClickListener(r5);
        r11 = 2131758074; // 0x7f100bfa float:1.9147102E38 double:1.0532284296E-314;
        r11 = r0.findViewById(r11);
        r11 = (android.widget.ImageButton) r11;
        r5.i = r11;
        if (r10 == 0) goto L_0x01ed;
    L_0x01e8:
        r11 = r5.i;
        r11.setOnClickListener(r5);
    L_0x01ed:
        r11 = r5.i;
        defpackage.xpr.a(r11, r10);
        r10 = 2131758072; // 0x7f100bf8 float:1.9147098E38 double:1.0532284286E-314;
        r10 = r0.findViewById(r10);
        r10 = (android.widget.ImageButton) r10;
        r5.g = r10;
        r10 = r5.g;
        r10.setOnClickListener(r5);
        r10 = 2131758075; // 0x7f100bfb float:1.9147104E38 double:1.05322843E-314;
        r11 = r0.findViewById(r10);
        r11 = (android.widget.ImageButton) r11;
        r5.j = r11;
        if (r9 == 0) goto L_0x0214;
    L_0x020f:
        r9 = r5.j;
        r9.setVisibility(r4);
    L_0x0214:
        r9 = 2131758076; // 0x7f100bfc float:1.9147106E38 double:1.0532284306E-314;
        r9 = r0.findViewById(r9);
        r9 = (android.widget.ImageButton) r9;
        r5.k = r9;
        r9 = r5.k;
        r9.setOnClickListener(r5);
        r9 = 2131758073; // 0x7f100bf9 float:1.91471E38 double:1.053228429E-314;
        r9 = r0.findViewById(r9);
        r9 = (android.widget.LinearLayout) r9;
        r5.h = r9;
        r9 = 2131626435; // 0x7f0e09c3 float:1.8880106E38 double:1.0531633913E-314;
        r7 = r7.getDimension(r9);
        r5.o = r7;
        r7 = 8;
        if (r8 == 0) goto L_0x024a;
    L_0x023c:
        r8 = r8.f;
        if (r8 == 0) goto L_0x024a;
    L_0x0240:
        r8 = r5.f;
        r8.setVisibility(r7);
        r5 = r5.g;
        r5.setVisibility(r7);
    L_0x024a:
        r5 = r1.ad;
        r8 = r1.aK;
        r5.a(r8);
        r5 = r1.aK;
        r8 = 4;
        if (r5 != 0) goto L_0x0258;
    L_0x0256:
        r5 = 0;
        goto L_0x0285;
    L_0x0258:
        r5 = r5.d;
        if (r5 != 0) goto L_0x025e;
    L_0x025c:
        r5 = defpackage.axak.a;
    L_0x025e:
        r9 = com.google.protos.youtube.api.innertube.ReelPickerButtonRendererOuterClass.reelPickerButtonRenderer;
        r9 = defpackage.anxl.checkIsLite(r9);
        r5.a(r9);
        r5 = r5.h;
        r11 = r9.d;
        r5 = r5.b(r11);
        if (r5 != 0) goto L_0x0274;
    L_0x0271:
        r5 = r9.b;
        goto L_0x0278;
    L_0x0274:
        r5 = r9.a(r5);
    L_0x0278:
        r5 = (defpackage.awxr) r5;
        r9 = r5.a;
        r9 = r9 & r8;
        if (r9 == 0) goto L_0x0256;
    L_0x027f:
        r5 = r5.d;
        if (r5 != 0) goto L_0x0285;
    L_0x0283:
        r5 = defpackage.apxu.d;
    L_0x0285:
        r9 = r1.ae;
        r11 = r19.p();
        r12 = r1.a;
        r13 = r1.aI;
        r14 = r1.aP;
        r15 = r1.ag;
        r3 = r1.an;
        r6 = r1.aa;
        r9.e = r11;
        r9.f = r12;
        r9.m = r13;
        r9.i = r14;
        r9.g = r1;
        r9.k = r15;
        r9.l = r3;
        r9.j = r6;
        r3 = 2131758055; // 0x7f100be7 float:1.9147063E38 double:1.05322842E-314;
        r3 = r0.findViewById(r3);
        r9.n = r3;
        r3 = 2131758056; // 0x7f100be8 float:1.9147065E38 double:1.0532284207E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.Button) r3;
        r9.o = r3;
        r3 = r9.o;
        r3.setOnClickListener(r9);
        r3 = 2131758057; // 0x7f100be9 float:1.9147067E38 double:1.053228421E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.Button) r3;
        r9.p = r3;
        r3 = r9.p;
        r3.setOnClickListener(r9);
        r3 = 2131758058; // 0x7f100bea float:1.914707E38 double:1.0532284217E-314;
        r3 = r0.findViewById(r3);
        r9.q = r3;
        r3 = r9.q;
        r3.setOnClickListener(r9);
        r9.r = r4;
        r3 = r11.getResources();
        r6 = 2131626415; // 0x7f0e09af float:1.8880066E38 double:1.0531633814E-314;
        r3 = r3.getDimension(r6);
        r9.s = r3;
        r3 = r1.ae;
        r3.a = r5;
        r6 = r3.o;
        r6.setVisibility(r4);
        r6 = r3.q;
        r6.setVisibility(r4);
        if (r5 == 0) goto L_0x0302;
    L_0x02fd:
        r6 = r3.p;
        r6.setVisibility(r4);
    L_0x0302:
        r3.r = r2;
        r3 = r1.af;
        r6 = r1.aa;
        r3.f = r1;
        r3.i = r6;
        r6 = 2131758081; // 0x7f100c01 float:1.9147116E38 double:1.053228433E-314;
        r6 = r0.findViewById(r6);
        r3.b = r6;
        r6 = 2131758082; // 0x7f100c02 float:1.9147118E38 double:1.0532284336E-314;
        r6 = r0.findViewById(r6);
        r3.c = r6;
        r6 = r3.c;
        r9 = defpackage.gee.a;
        r6.setOnClickListener(r9);
        r6 = 2131758083; // 0x7f100c03 float:1.914712E38 double:1.053228434E-314;
        r6 = r0.findViewById(r6);
        r6 = (android.widget.ImageButton) r6;
        r3.d = r6;
        r6 = r3.d;
        r6.setOnClickListener(r3);
        r6 = new gpp;
        r9 = r3.c;
        r11 = r3.a;
        r6.<init>(r9, r11);
        r3.e = r6;
        r3 = r1.c;
        if (r3 == 0) goto L_0x0349;
    L_0x0344:
        r6 = r1.af;
        r6.a(r3);
    L_0x0349:
        if (r5 == 0) goto L_0x039d;
    L_0x034b:
        r3 = com.google.protos.youtube.api.innertube.CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint.creationReelPickerEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r5.a(r3);
        r6 = r5.h;
        r3 = r3.d;
        r3 = r6.a(r3);
        if (r3 == 0) goto L_0x039d;
    L_0x035e:
        r3 = com.google.protos.youtube.api.innertube.CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint.creationReelPickerEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r5.a(r3);
        r5 = r5.h;
        r6 = r3.d;
        r5 = r5.b(r6);
        if (r5 != 0) goto L_0x0374;
    L_0x0371:
        r3 = r3.b;
        goto L_0x0378;
    L_0x0374:
        r3 = r3.a(r5);
    L_0x0378:
        r3 = (com.google.protos.youtube.api.innertube.CreationReelPickerEndpointOuterClass$CreationReelPickerEndpoint) r3;
        r3 = r3.b;
        if (r3 != 0) goto L_0x0380;
    L_0x037e:
        r3 = defpackage.axak.a;
    L_0x0380:
        r5 = com.google.protos.youtube.api.innertube.CreationReelPickerRendererOuterClass.creationReelPickerRenderer;
        r5 = defpackage.anxl.checkIsLite(r5);
        r3.a(r5);
        r3 = r3.h;
        r6 = r5.d;
        r3 = r3.b(r6);
        if (r3 != 0) goto L_0x0396;
    L_0x0393:
        r3 = r5.b;
        goto L_0x039a;
    L_0x0396:
        r3 = r5.a(r3);
    L_0x039a:
        r3 = (defpackage.aqri) r3;
        goto L_0x039e;
    L_0x039d:
        r3 = 0;
    L_0x039e:
        if (r3 != 0) goto L_0x03a2;
    L_0x03a0:
        goto L_0x04f7;
    L_0x03a2:
        r5 = r1.ag;
        r6 = r1.aP;
        r5.c = r6;
        r5.d = r1;
        r5.e = r1;
        r6 = 2131758064; // 0x7f100bf0 float:1.9147081E38 double:1.0532284247E-314;
        r6 = r0.findViewById(r6);
        r5.f = r6;
        r6 = 2131758182; // 0x7f100c66 float:1.914732E38 double:1.053228483E-314;
        r6 = r0.findViewById(r6);
        r6 = (android.widget.TextView) r6;
        r5.g = r6;
        r6 = r5.g;
        r9 = r3.a;
        r9 = r9 & r2;
        if (r9 == 0) goto L_0x03ce;
    L_0x03c7:
        r9 = r3.c;
        if (r9 != 0) goto L_0x03cf;
    L_0x03cb:
        r9 = defpackage.arml.f;
        goto L_0x03cf;
    L_0x03ce:
        r9 = 0;
    L_0x03cf:
        r9 = defpackage.ajqy.a(r9);
        r9 = r9.toString();
        r6.setText(r9);
        r6 = 2131758178; // 0x7f100c62 float:1.9147313E38 double:1.053228481E-314;
        r6 = r0.findViewById(r6);
        r6 = (android.support.v7.widget.RecyclerView) r6;
        r5.h = r6;
        r6 = new ans;
        r6.<init>(r4, r4);
        r9 = r5.h;
        r9.a(r6);
        r6 = r5.b;
        r3 = r3.b;
        r9 = new java.io.File;
        r11 = r5.a;
        r11 = r11.getCacheDir();
        r11 = r11.getPath();
        r12 = "REEL_VIDEO_THUMBNAIL";
        r9.<init>(r11, r12);
        r9.createNewFile();	 Catch:{ Exception -> 0x04ad }
        r11 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x04ad }
        r11.<init>(r9);	 Catch:{ Exception -> 0x04ad }
        r12 = r5.c;	 Catch:{ Exception -> 0x04ad }
        r12 = r12.getWidth();	 Catch:{ Exception -> 0x04ad }
        r13 = r5.c;	 Catch:{ Exception -> 0x04ad }
        r13 = r13.getHeight();	 Catch:{ Exception -> 0x04ad }
        r14 = r5.c;	 Catch:{ Exception -> 0x04ad }
        r14 = r14.getWidth();	 Catch:{ Exception -> 0x04ad }
        r14 = (double) r14;	 Catch:{ Exception -> 0x04ad }
        r10 = r5.c;	 Catch:{ Exception -> 0x04ad }
        r10 = r10.getHeight();	 Catch:{ Exception -> 0x04ad }
        r16 = r3;
        r2 = (double) r10;
        java.lang.Double.isNaN(r14);
        java.lang.Double.isNaN(r2);
        r14 = r14 / r2;
        r2 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r17 = 4616189618054758400; // 0x4010000000000000 float:0.0 double:4.0;
        if (r12 <= r13) goto L_0x0466;
    L_0x0435:
        r2 = java.lang.Math.min(r12, r2);	 Catch:{ Exception -> 0x04af }
        r2 = (double) r2;
        java.lang.Double.isNaN(r2);
        r2 = r2 / r17;
        r2 = java.lang.Math.round(r2);	 Catch:{ Exception -> 0x04af }
        r3 = (int) r2;	 Catch:{ Exception -> 0x04af }
        r2 = r3 << 2;
        r2 = java.lang.Math.max(r2, r8);	 Catch:{ Exception -> 0x04af }
        r12 = (double) r2;
        java.lang.Double.isNaN(r12);
        r12 = r12 / r14;
        r12 = java.lang.Math.round(r12);	 Catch:{ Exception -> 0x04af }
        r3 = (int) r12;
        r12 = (double) r3;
        java.lang.Double.isNaN(r12);
        r12 = r12 / r17;
        r12 = java.lang.Math.round(r12);	 Catch:{ Exception -> 0x04af }
        r3 = (int) r12;	 Catch:{ Exception -> 0x04af }
        r3 = r3 << 2;
        r3 = java.lang.Math.max(r3, r8);	 Catch:{ Exception -> 0x04af }
        goto L_0x0497;
    L_0x0466:
        r2 = java.lang.Math.min(r13, r2);	 Catch:{ Exception -> 0x04af }
        r2 = (double) r2;
        java.lang.Double.isNaN(r2);
        r2 = r2 / r17;
        r2 = java.lang.Math.round(r2);	 Catch:{ Exception -> 0x04af }
        r3 = (int) r2;	 Catch:{ Exception -> 0x04af }
        r2 = r3 << 2;
        r3 = java.lang.Math.max(r2, r8);	 Catch:{ Exception -> 0x04af }
        r12 = (double) r3;
        java.lang.Double.isNaN(r12);
        r12 = r12 * r14;
        r12 = java.lang.Math.round(r12);	 Catch:{ Exception -> 0x04af }
        r2 = (int) r12;
        r12 = (double) r2;
        java.lang.Double.isNaN(r12);
        r12 = r12 / r17;
        r12 = java.lang.Math.round(r12);	 Catch:{ Exception -> 0x04af }
        r2 = (int) r12;	 Catch:{ Exception -> 0x04af }
        r2 = r2 << 2;
        r2 = java.lang.Math.max(r2, r8);	 Catch:{ Exception -> 0x04af }
    L_0x0497:
        r8 = r5.c;	 Catch:{ Exception -> 0x04af }
        r10 = 1;
        r2 = android.graphics.Bitmap.createScaledBitmap(r8, r2, r3, r10);	 Catch:{ Exception -> 0x04af }
        r5.c = r2;	 Catch:{ Exception -> 0x04af }
        r2 = r5.c;	 Catch:{ Exception -> 0x04af }
        r3 = android.graphics.Bitmap.CompressFormat.PNG;	 Catch:{ Exception -> 0x04af }
        r8 = 50;
        r2.compress(r3, r8, r11);	 Catch:{ Exception -> 0x04af }
        r11.close();	 Catch:{ Exception -> 0x04af }
        goto L_0x04af;
    L_0x04ad:
        r16 = r3;
    L_0x04af:
        r2 = r9.getAbsolutePath();
        r3 = r5.d;
        r8 = r5.e;
        r9 = new java.util.ArrayList;
        r10 = r16;
        r9.<init>(r10);
        r6.d = r9;
        r2 = defpackage.amqw.a(r2);
        r2 = (java.lang.String) r2;
        r6.e = r2;
        r2 = defpackage.amqw.a(r3);
        r2 = (defpackage.gey) r2;
        r6.g = r2;
        r2 = defpackage.amqw.a(r8);
        r2 = (defpackage.gej) r2;
        r6.f = r2;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r6.h = r2;
        r2 = r5.h;
        r3 = r5.b;
        r2.a(r3);
        r2 = r5.a;
        r2 = r2.getResources();
        r3 = 2131626520; // 0x7f0e0a18 float:1.8880279E38 double:1.0531634333E-314;
        r2 = r2.getDimension(r3);
        r5.j = r2;
        r5.i = r4;
    L_0x04f7:
        r2 = r1.ah;
        r2.l = r1;
        r3 = r0.getContext();
        r2.a = r3;
        r3 = 2131758046; // 0x7f100bde float:1.9147045E38 double:1.053228416E-314;
        r3 = r0.findViewById(r3);
        r2.b = r3;
        r3 = 2131758050; // 0x7f100be2 float:1.9147053E38 double:1.0532284178E-314;
        r3 = r0.findViewById(r3);
        r3 = (com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView) r3;
        r2.c = r3;
        r3 = 2131758051; // 0x7f100be3 float:1.9147055E38 double:1.053228418E-314;
        r3 = r0.findViewById(r3);
        r3 = (com.google.android.libraries.youtube.edit.audioswap.ui.AudioCrossFadeView) r3;
        r2.d = r3;
        r3 = 2131758047; // 0x7f100bdf float:1.9147047E38 double:1.0532284163E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r2.e = r3;
        r3 = 2131758048; // 0x7f100be0 float:1.914705E38 double:1.053228417E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r2.f = r3;
        r3 = 2131758049; // 0x7f100be1 float:1.9147051E38 double:1.0532284173E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.ImageButton) r3;
        r2.g = r3;
        r3 = r2.g;
        r3.setOnClickListener(r2);
        r3 = 2131758052; // 0x7f100be4 float:1.9147057E38 double:1.0532284187E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.Button) r3;
        r2.h = r3;
        r3 = r2.h;
        r3.setOnClickListener(r2);
        r3 = 2131758054; // 0x7f100be6 float:1.9147061E38 double:1.0532284197E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.Button) r3;
        r2.i = r3;
        r3 = r2.i;
        r3.setOnClickListener(r2);
        r3 = r2.a;
        r3 = r3.getResources();
        r5 = 2131626389; // 0x7f0e0995 float:1.8880013E38 double:1.0531633686E-314;
        r3 = r3.getDimension(r5);
        r2.k = r3;
        r2 = r1.ai;
        r3 = r1.aa;
        r2.d = r1;
        r2.h = r3;
        r3 = r0.getContext();
        r2.a = r3;
        r3 = 2131758045; // 0x7f100bdd float:1.9147043E38 double:1.0532284153E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r2.e = r3;
        r3 = r2.e;
        r3.setOnClickListener(r2);
        r3 = 2131758044; // 0x7f100bdc float:1.914704E38 double:1.053228415E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r2.f = r3;
        r3 = r2.f;
        r3.setOnClickListener(r2);
        r3 = 2131758043; // 0x7f100bdb float:1.9147039E38 double:1.0532284143E-314;
        r3 = r0.findViewById(r3);
        r2.g = r3;
        r3 = r2.a;
        r3 = r3.getResources();
        r5 = 2131626387; // 0x7f0e0993 float:1.8880009E38 double:1.0531633676E-314;
        r3 = r3.getDimension(r5);
        r2.b = r3;
        r2 = r1.aj;
        r3 = r1.aa;
        r2.f = r1;
        r2.g = r3;
        r3 = 2131758066; // 0x7f100bf2 float:1.9147086E38 double:1.0532284257E-314;
        r3 = r0.findViewById(r3);
        r2.a = r3;
        r3 = 2131758079; // 0x7f100bff float:1.9147112E38 double:1.053228432E-314;
        r3 = r0.findViewById(r3);
        r3 = (com.google.android.libraries.video.trim.VideoTrimView) r3;
        r2.b = r3;
        r3 = 2131758080; // 0x7f100c00 float:1.9147114E38 double:1.0532284326E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.Button) r3;
        r2.c = r3;
        r3 = r2.c;
        r3.setOnClickListener(r2);
        r3 = r0.getContext();
        r3 = r3.getResources();
        r5 = 2131626443; // 0x7f0e09cb float:1.8880122E38 double:1.0531633953E-314;
        r3 = r3.getDimension(r5);
        r2.e = r3;
        r2 = r1.ak;
        r3 = r1.aa;
        r2.f = r1;
        r2.g = r3;
        r3 = 2131758059; // 0x7f100beb float:1.9147071E38 double:1.053228422E-314;
        r3 = r0.findViewById(r3);
        r2.a = r3;
        r3 = 2131757120; // 0x7f100840 float:1.9145167E38 double:1.0532279583E-314;
        r3 = r0.findViewById(r3);
        r3 = (com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView) r3;
        r2.b = r3;
        r3 = r2.b;
        r3.a(r2);
        r3 = 2131758060; // 0x7f100bec float:1.9147073E38 double:1.0532284227E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.Button) r3;
        r2.c = r3;
        r3 = r2.c;
        r3.setOnClickListener(r2);
        r3 = r0.getContext();
        r3 = r3.getResources();
        r5 = 2131626419; // 0x7f0e09b3 float:1.8880074E38 double:1.0531633834E-314;
        r3 = r3.getDimension(r5);
        r2.e = r3;
        r2 = r1.al;
        r3 = r1.aK;
        r5 = r1.an;
        r6 = r1.aL;
        r8 = r1.aM;
        r9 = r1.aN;
        r10 = r1.aa;
        r2.i = r1;
        r2.k = r1;
        r2.l = r5;
        r2.p = r10;
        r5 = 2131758423; // 0x7f100d57 float:1.914781E38 double:1.053228602E-314;
        r5 = r0.findViewById(r5);
        r2.e = r5;
        r5 = 2131758425; // 0x7f100d59 float:1.9147814E38 double:1.053228603E-314;
        r5 = r0.findViewById(r5);
        r5 = (android.widget.ImageView) r5;
        r2.f = r5;
        r5 = 2131758424; // 0x7f100d58 float:1.9147812E38 double:1.0532286025E-314;
        r5 = r0.findViewById(r5);
        r2.g = r5;
        if (r3 != 0) goto L_0x0670;
    L_0x066f:
        goto L_0x0686;
    L_0x0670:
        r5 = r3.a;
        r5 = r5 & r7;
        if (r5 == 0) goto L_0x0686;
    L_0x0675:
        r3 = r3.e;
        if (r3 != 0) goto L_0x067b;
    L_0x0679:
        r3 = defpackage.arwf.c;
    L_0x067b:
        r3 = r3.b;
        r3 = defpackage.arwh.a(r3);
        if (r3 != 0) goto L_0x0688;
    L_0x0683:
        r3 = defpackage.arwh.UNKNOWN;
        goto L_0x0688;
    L_0x0686:
        r3 = defpackage.arwh.DELETE_LIGHT;
    L_0x0688:
        r5 = r2.f;
        r7 = r2.a;
        r3 = r7.a(r3);
        r5.setImageResource(r3);
        r3 = 2131757995; // 0x7f100bab float:1.9146941E38 double:1.0532283906E-314;
        r3 = r0.findViewById(r3);
        r2.h = r3;
        r3 = 2131758062; // 0x7f100bee float:1.9147077E38 double:1.0532284237E-314;
        r3 = r0.findViewById(r3);
        r5 = 2131758075; // 0x7f100bfb float:1.9147104E38 double:1.05322843E-314;
        r5 = r0.findViewById(r5);
        if (r6 == 0) goto L_0x090e;
    L_0x06ac:
        r5.setVisibility(r4);
        r7 = r2.d;
        r10 = r2.h;
        r7.i = r10;
        r7.u = r8;
        r8 = 2131758008; // 0x7f100bb8 float:1.9146968E38 double:1.053228397E-314;
        r8 = r10.findViewById(r8);
        r8 = (com.google.android.libraries.youtube.edit.ui.RoundedCornersEditText) r8;
        r7.j = r8;
        r8 = r7.j;
        r11 = r8.a;
        if (r11 == r9) goto L_0x06de;
    L_0x06c8:
        r8.a = r9;
        if (r9 == 0) goto L_0x06d4;
    L_0x06cc:
        r9 = r8.getLayoutParams();
        r11 = -1;
        r9.width = r11;
        goto L_0x06db;
    L_0x06d4:
        r9 = r8.getLayoutParams();
        r11 = -2;
        r9.width = r11;
    L_0x06db:
        r8.invalidate();
    L_0x06de:
        r10.setOnClickListener(r7);
        r8 = 2131758007; // 0x7f100bb7 float:1.9146966E38 double:1.0532283965E-314;
        r8 = r10.findViewById(r8);
        r8 = (android.widget.LinearLayout) r8;
        r7.p = r8;
        r8 = r7.h;
        r8 = r8.b();
        if (r8 != 0) goto L_0x06f5;
    L_0x06f4:
        goto L_0x0709;
    L_0x06f5:
        r9 = r8.s;
        if (r9 != 0) goto L_0x06fb;
    L_0x06f9:
        r9 = defpackage.azaa.j;
    L_0x06fb:
        r9 = r9.b;
        r7.v = r9;
        r8 = r8.s;
        if (r8 != 0) goto L_0x0705;
    L_0x0703:
        r8 = defpackage.azaa.j;
    L_0x0705:
        r8 = r8.c;
        r7.w = r8;
    L_0x0709:
        r8 = r7.u;
        if (r8 == 0) goto L_0x0858;
    L_0x070d:
        r8 = 2131757996; // 0x7f100bac float:1.9146944E38 double:1.053228391E-314;
        r8 = r10.findViewById(r8);
        r9 = 2131757999; // 0x7f100baf float:1.914695E38 double:1.0532283926E-314;
        r9 = r10.findViewById(r9);
        r7.l = r9;
        r9 = 2131758000; // 0x7f100bb0 float:1.9146952E38 double:1.053228393E-314;
        r9 = r10.findViewById(r9);
        r9 = (android.widget.ImageView) r9;
        r7.m = r9;
        r9 = 2131757997; // 0x7f100bad float:1.9146946E38 double:1.0532283916E-314;
        r9 = r10.findViewById(r9);
        r7.q = r9;
        r9 = 2131757998; // 0x7f100bae float:1.9146948E38 double:1.053228392E-314;
        r9 = r10.findViewById(r9);
        r9 = (android.widget.ImageView) r9;
        r7.r = r9;
        r9 = 2131758001; // 0x7f100bb1 float:1.9146954E38 double:1.0532283935E-314;
        r9 = r10.findViewById(r9);
        r9 = (android.widget.TextView) r9;
        r7.s = r9;
        r8.setVisibility(r4);
        r8 = 2131758002; // 0x7f100bb2 float:1.9146956E38 double:1.053228394E-314;
        r8 = r10.findViewById(r8);
        r7.o = r8;
        r8 = r7.o;
        r8.setOnClickListener(r7);
        r8 = r7.q;
        r8.setOnClickListener(r7);
        r8 = r7.s;
        r8.setOnClickListener(r7);
        r8 = 2131758006; // 0x7f100bb6 float:1.9146964E38 double:1.053228396E-314;
        r8 = r10.findViewById(r8);
        r8 = (android.widget.SeekBar) r8;
        r7.t = r8;
        r8 = r7.t;
        r8.setVisibility(r4);
        r8 = r7.p;
        r9 = r7.b;
        r9 = r9.getResources();
        r11 = 2131624065; // 0x7f0e0081 float:1.88753E38 double:1.0531622204E-314;
        r9 = r9.getDimension(r11);
        r9 = (int) r9;
        r8.setPaddingRelative(r4, r4, r9, r4);
        r8 = r7.t;
        r9 = new gkb;
        r9.<init>(r7);
        r8.setOnSeekBarChangeListener(r9);
        r8 = r7.f;
        r9 = defpackage.babk.CLASSIC;
        r11 = new gki;
        r12 = 2131953445; // 0x7f130725 float:1.9543361E38 double:1.0533249557E-314;
        r13 = 1042983595; // 0x3e2aaaab float:0.16666667 double:5.153023635E-315;
        r13 = java.lang.Float.valueOf(r13);
        r13 = defpackage.amqp.b(r13);
        r14 = defpackage.ampo.a;
        r11.<init>(r12, r13, r14);
        r8.put(r9, r11);
        r8 = r7.f;
        r9 = defpackage.babk.LIGHT;
        r11 = new gki;
        r12 = 2131953447; // 0x7f130727 float:1.9543365E38 double:1.0533249567E-314;
        r13 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r13 = java.lang.Float.valueOf(r13);
        r13 = defpackage.amqp.b(r13);
        r14 = "name=Quicksand";
        r14 = defpackage.amqp.b(r14);
        r11.<init>(r12, r13, r14);
        r8.put(r9, r11);
        r8 = r7.f;
        r9 = defpackage.babk.HEAVY;
        r11 = new gki;
        r12 = 2131953446; // 0x7f130726 float:1.9543363E38 double:1.053324956E-314;
        r13 = defpackage.ampo.a;
        r14 = "name=Oswald&weight=700";
        r14 = defpackage.amqp.b(r14);
        r11.<init>(r12, r13, r14);
        r8.put(r9, r11);
        r8 = r7.f;
        r9 = defpackage.babk.MARKER;
        r11 = new gki;
        r12 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r12 = java.lang.Float.valueOf(r12);
        r13 = 2131953448; // 0x7f130728 float:1.9543367E38 double:1.053324957E-314;
        r14 = defpackage.amqp.b(r12);
        r15 = "name=Permanent Marker";
        r15 = defpackage.amqp.b(r15);
        r11.<init>(r13, r14, r15);
        r8.put(r9, r11);
        r8 = r7.f;
        r9 = defpackage.babk.BRUSH;
        r11 = new gki;
        r13 = 2131953444; // 0x7f130724 float:1.954336E38 double:1.053324955E-314;
        r12 = defpackage.amqp.b(r12);
        r14 = "name=Pacifico";
        r14 = defpackage.amqp.b(r14);
        r11.<init>(r13, r12, r14);
        r8.put(r9, r11);
        r8 = r7.f;
        r9 = defpackage.babk.TYPEWRITER;
        r11 = new gki;
        r12 = defpackage.ampo.a;
        r13 = 2131953449; // 0x7f130729 float:1.954337E38 double:1.0533249577E-314;
        r14 = "name=Cutive Mono";
        r14 = defpackage.amqp.b(r14);
        r11.<init>(r13, r12, r14);
        r8.put(r9, r11);
        r8 = r7.f;
        r9 = defpackage.babk.CLASSIC;
        r11 = defpackage.gju.a;
        r8.a(r9, r11);
        r8 = r7.f;
        r9 = new gjy;
        r9.<init>(r7);
        r11 = new gke;
        r11.<init>(r8, r9);
        r7.x = r11;
        r8 = r7.x;
        r9 = 1;
        r11 = new android.content.Context[r9];
        r9 = r7.b;
        r11[r4] = r9;
        r8.execute(r11);
        r7.c();
        goto L_0x0871;
    L_0x0858:
        r8 = 2131758009; // 0x7f100bb9 float:1.914697E38 double:1.0532283975E-314;
        r8 = r10.findViewById(r8);
        r7.l = r8;
        r8 = 2131758010; // 0x7f100bba float:1.9146972E38 double:1.053228398E-314;
        r8 = r10.findViewById(r8);
        r8 = (android.widget.ImageView) r8;
        r7.m = r8;
        r8 = r7.l;
        r8.setVisibility(r4);
    L_0x0871:
        r8 = r7.g;
        r9 = r7.b;
        r11 = r10;
        r11 = (android.view.ViewGroup) r11;
        r12 = r7.j;
        r13 = r7.w;
        r14 = new gjx;
        r14.<init>(r7);
        r8.c = r9;
        r8.e = r12;
        r8.h = r13;
        r8.g = r14;
        r9 = r8.b;
        r9.a = r13;
        if (r13 == 0) goto L_0x08be;
    L_0x088f:
        r9 = 2131758005; // 0x7f100bb5 float:1.9146962E38 double:1.0532283955E-314;
        r9 = r11.findViewById(r9);
        r9 = (android.view.ViewGroup) r9;
        r8.d = r9;
        r9 = r8.d;
        r9 = (android.support.v7.widget.RecyclerView) r9;
        r11 = 1;
        r9.r = r11;
        r11 = new ans;
        r11.<init>(r4, r4);
        r9.a(r11);
        r11 = new gkq;
        r11.<init>();
        r11.a(r9);
        r11 = r8.a;
        defpackage.amqw.a(r8);
        r11.e = r8;
        r11 = r8.a;
        r9.a(r11);
        goto L_0x08ce;
    L_0x08be:
        r9 = 2131758004; // 0x7f100bb4 float:1.914696E38 double:1.053228395E-314;
        r9 = r11.findViewById(r9);
        r9 = (android.view.ViewGroup) r9;
        r8.d = r9;
        r9 = r8.d;
        r9.setOnTouchListener(r8);
    L_0x08ce:
        r9 = r8.d;
        r9.setVisibility(r4);
        r4 = r8.d;
        r7.k = r4;
        r4 = r7.l;
        r4.setOnClickListener(r7);
        r7.n = r5;
        r5.setOnClickListener(r7);
        r4 = r7.d;
        r5 = r7.j;
        r8 = r7.p;
        r9 = r7.k;
        r5 = defpackage.amqw.a(r5);
        r5 = (android.widget.EditText) r5;
        r4.c = r5;
        r5 = defpackage.amqw.a(r8);
        r5 = (android.view.View) r5;
        r4.d = r5;
        r5 = defpackage.amqw.a(r10);
        r5 = (android.view.View) r5;
        r4.e = r5;
        r5 = defpackage.amqw.a(r9);
        r5 = (android.view.View) r5;
        r4.f = r5;
        r4 = r7.e;
        r4.a(r3);
    L_0x090e:
        r3 = r2.c;
        r3.i = r1;
        r3.h = r6;
        r3 = 2131758063; // 0x7f100bef float:1.914708E38 double:1.053228424E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131758077; // 0x7f100bfd float:1.9147108E38 double:1.053228431E-314;
        r4 = r0.findViewById(r4);
        r5 = new gfm;
        r5.<init>(r3, r4, r1);
        r2.n = r5;
        r3 = r4.getContext();
        r5 = r2.n;
        r6 = new ziq;
        r6.<init>(r3, r5);
        r2.m = r6;
        r4.setOnTouchListener(r2);
        r2 = 2131758065; // 0x7f100bf1 float:1.9147083E38 double:1.053228425E-314;
        r2 = r0.findViewById(r2);
        r2 = (com.google.android.libraries.youtube.edit.preview.EditableVideoControllerView) r2;
        r1.aG = r2;
        r2 = r19.M_();
        r2 = defpackage.xrn.c(r2);
        r3 = r1.Z;
        r4 = "STORIES";
        r3.a(r2, r4);
        if (r2 == 0) goto L_0x0965;
    L_0x0957:
        r2 = r19.M_();
        r3 = 2131953418; // 0x7f13070a float:1.9543306E38 double:1.0533249424E-314;
        r3 = r1.a(r3);
        defpackage.xrn.a(r2, r0, r3);
    L_0x0965:
        r2 = r1.am;
        r3 = 2131758067; // 0x7f100bf3 float:1.9147088E38 double:1.053228426E-314;
        r3 = r0.findViewById(r3);
        r2.c = r1;
        r2.d = r3;
        r2 = r1.aa;
        r3 = defpackage.acwl.v;
        r4 = r1.aJ;
        r5 = 0;
        r2.a(r3, r4, r5);
        r2 = r1.aa;
        r3 = new acvs;
        r4 = defpackage.acwc.UPLOAD_VIDEO_EDITING_DELETE_STICKER_BUTTON;
        r3.<init>(r4);
        r2.a(r3);
        r2 = r1.ad;
        r3 = r2.c;
        r4 = defpackage.acwc.UPLOAD_VIDEO_EDITING_MUTE_TOGGLE;
        r3.b(r4, r5);
        r3 = r2.c;
        r4 = defpackage.acwc.MOBILE_BACK_BUTTON;
        r3.b(r4, r5);
        r3 = r2.c;
        r4 = defpackage.acwc.UPLOAD_VIDEO_EDITING_TRIM_BUTTON;
        r3.b(r4, r5);
        r3 = r2.j;
        r3 = r3.getVisibility();
        if (r3 != 0) goto L_0x09ae;
    L_0x09a7:
        r3 = r2.c;
        r4 = defpackage.acwc.UPLOAD_VIDEO_EDITING_ADD_TEXT_BUTTON;
        r3.b(r4, r5);
    L_0x09ae:
        r3 = r2.b;
        if (r3 == 0) goto L_0x09b9;
    L_0x09b2:
        r3 = r2.c;
        r4 = defpackage.acwc.REELS_VIDEO_LINK_BUTTON;
        r3.b(r4, r5);
    L_0x09b9:
        r2 = r2.a;
        r3 = r2.c;
        r3 = r3.keySet();
        r3 = r3.iterator();
    L_0x09c5:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x09e2;
    L_0x09cb:
        r4 = r3.next();
        r4 = (defpackage.aphg) r4;
        r5 = r2.b;
        r5 = r5.t();
        r6 = new acvs;
        r4 = r4.r;
        r6.<init>(r4);
        r5.b(r6);
        goto L_0x09c5;
    L_0x09e2:
        r2 = r1.ae;
        r3 = r2.j;
        r4 = defpackage.acwc.UPLOAD_VIDEO_EDITING_SAVE_LOCALLY_BUTTON;
        r5 = 0;
        r3.b(r4, r5);
        r2 = r2.j;
        r3 = defpackage.acwc.UPLOAD_VIDEO_EDITING_DONE_BUTTON;
        r2.b(r3, r5);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdn.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        gfg gfg = this.al;
        if (gfg.l.a() != null) {
            zkz zkz = gfg.l.a().c;
            synchronized (zkz.c) {
                zkz.b.add(gfg);
            }
        }
        zlw a = this.an.a();
        if (!(a == null || bundle == null || !bundle.containsKey("EFFECTS_STATE_FILE_PATH"))) {
            new zlx(a, bundle.getString("EFFECTS_STATE_FILE_PATH")).execute(new Void[0]);
        }
        if (this.aS != null) {
            this.an.a().a(this.aS);
            gim gim = this.am;
            gim.a(Math.round((((float) gim.a) - gim.b) - ((float) this.aS.c)));
        }
    }

    public final void i() {
        gfg gfg = this.al;
        if (gfg.l.a() != null) {
            zkz zkz = gfg.l.a().c;
            synchronized (zkz.c) {
                zkz.b.remove(gfg);
            }
        }
        gke gke = gfg.d.x;
        if (gke != null) {
            gke.a.cancel();
            gke.cancel(true);
        }
        super.i();
    }

    /* JADX WARNING: Missing block: B:8:0x001e, code skipped:
            if (r1.j == false) goto L_0x0047;
     */
    public final void ad_() {
        /*
        r7 = this;
        r0 = r7.an;
        r1 = r7.aq;
        r0 = r0.a();
        r1 = r1.b();
        r2 = 0;
        if (r1 != 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0021;
    L_0x0010:
        r3 = r1.a;
        r3 = r3 & 4096;
        if (r3 == 0) goto L_0x0021;
    L_0x0016:
        r1 = r1.j;
        if (r1 != 0) goto L_0x001c;
    L_0x001a:
        r1 = defpackage.ayva.m;
    L_0x001c:
        r1 = r1.j;
        if (r1 != 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0047;
    L_0x0021:
        if (r0 == 0) goto L_0x0047;
    L_0x0023:
        r1 = 1;
        r2 = new java.io.File[r1];
        r3 = new java.util.concurrent.CountDownLatch;
        r3.<init>(r1);
        r1 = new zly;
        r1.<init>(r2, r3);
        r4 = 0;
        r0.a(r4, r1);
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x003c }
        r5 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r3.await(r5, r0);	 Catch:{ InterruptedException -> 0x003c }
        goto L_0x0045;
    L_0x003c:
        r0 = move-exception;
        r1 = 2;
        r3 = defpackage.afpf.upload;
        r5 = "Failure to block on getting video effects state";
        defpackage.afpc.a(r1, r3, r5, r0);
    L_0x0045:
        r2 = r2[r4];
    L_0x0047:
        r7.aR = r2;
        super.ad_();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdn.ad_():void");
    }

    public final void N_() {
        gfg gfg = this.al;
        if (gfg.h.getVisibility() == 0) {
            gju gju = gfg.d;
            gju.j.setText(null);
            gju.j.setTextSize(2, 36.0f);
            gju.i.setVisibility(8);
        }
        super.N_();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        anze anze = this.c;
        if (anze != null) {
            bundle.putParcelable("REEL_VOD_VIDEO_SELECTED_ACTION", new ajrb(anze));
        }
        File file = this.aR;
        if (file != null) {
            bundle.putString("EFFECTS_STATE_FILE_PATH", file.getAbsolutePath());
        }
        bundle.putBoolean("TEXT_ENABLED", this.aL);
        bundle.putBoolean("ADVANCED_TEXT_ENABLED", this.aM);
        bundle.putBoolean("TEXT_ROUNDED_CORNERS_ENABLED", this.aN);
        bundle.putBoolean("CAN_REQUEST_VIDEO_EFFECTS_STATE", this.aO);
    }

    private final void a(boolean z, boolean z2, boolean z3) {
        this.aL = z;
        this.aM = z2;
        this.aN = z3;
    }

    public final ukz a(Context context, Uri uri) {
        if (!this.a.f) {
            return uku.a(context, uri);
        }
        long[] jArr = new long[]{0};
        ulb ulb = new ulb();
        ulb.b = true;
        ulb.a = uri;
        ulb.c = 0;
        zin zin = this.a;
        ulb.d = zin.a;
        ulb.e = zin.b;
        ulb.f = 0;
        ulb.g = zin.d * 1000;
        ulb.h = jArr;
        ulb.i = null;
        ulb.j = false;
        return ulb.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ujf ujf) {
        apxu apxu = this.aI;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d) && ujf != null) {
                if (!ujf.h()) {
                    long a = ujf.a();
                    apxu apxu2 = this.aI;
                    anxr access$0002 = anxl.checkIsLite(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint);
                    apxu2.a(access$0002);
                    Object b = apxu2.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    if (a > ((long) ((((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) b).b + 1) * 1000000))) {
                        gge.a(p(), R.string.reel_gallery_video_too_long_not_support_trim);
                        this.ab.ag();
                    }
                }
                amqw.a((Object) ujf);
                double a2 = (double) ujf.b.a();
                double b2 = (double) ujf.b.b();
                Double.isNaN(a2);
                Double.isNaN(b2);
                double d = a2 / b2;
                double d2 = 0.0d;
                if (Math.abs(-0.5625d + d) < 0.01d) {
                    a2 = 0.0d;
                    b2 = a2;
                    d = b2;
                } else if (d > 0.5625d) {
                    Double.isNaN(b2);
                    b2 *= 0.5625d;
                    Double.isNaN(a2);
                    b2 = (a2 - b2) / 2.0d;
                    Double.isNaN(a2);
                    b2 /= a2;
                    d = b2;
                    a2 = 0.0d;
                } else {
                    Double.isNaN(a2);
                    a2 /= 0.5625d;
                    Double.isNaN(b2);
                    a2 = (b2 - a2) / 2.0d;
                    Double.isNaN(b2);
                    a2 /= b2;
                    b2 = 0.0d;
                    d = b2;
                    d2 = a2;
                }
                ujf.a(d2);
                ujf.b(a2);
                ujf.c(b2);
                ujf.d(d);
            }
        }
    }

    public final void ao() {
        ax();
        this.aj.f();
        this.ah.f();
        this.ai.f();
        this.ak.g();
        gfa gfa = this.ag;
        if (gfa.i) {
            gfa.f();
        }
    }

    public final void a(String str, String str2) {
        this.ae.a(str, str2);
        this.ag.f();
        ax();
    }

    public final void b(String str, String str2) {
        gdf gdf = this.ae;
        if (str2 != null && gdf.c.contains(str2)) {
            gdf.c.remove(str2);
        } else if (gdf.d.contains(str)) {
            gdf.d.remove(str);
        }
        if (gdf.c.isEmpty() && gdf.d.isEmpty()) {
            gdf.a(R.drawable.ic_add_stories_white_24dp);
        }
        this.ag.f();
        ax();
    }

    public final void a(String str) {
        this.ae.a(str, null);
        geu geu = this.ag.b;
        if (!geu.h.contains(str)) {
            awxu awxu = (awxu) awxs.f.createBuilder();
            arml a = ajqy.a(str);
            awxu.copyOnWrite();
            awxs awxs = (awxs) awxu.instance;
            if (a != null) {
                awxs.c = a;
                awxs.a |= 2;
                awxs awxs2 = (awxs) ((anxl) awxu.build());
                axaj axaj = (axaj) axak.a.createBuilder();
                axaj.a(ReelPickerItemRendererOuterClass.reelPickerItemRenderer, awxs2);
                axak axak = (axak) ((anxl) axaj.build());
                geu.h.add(geu.a(awxs2));
                geu.d.add(1, axak);
                geu.aa_();
            } else {
                throw new NullPointerException();
            }
        }
        this.ag.f();
        ax();
    }

    public final void ap() {
        onClick(this.ad.k);
        gdl gdl = this.ak;
        if (!gdl.d) {
            ChooseFilterView chooseFilterView = gdl.b;
            if (!chooseFilterView.f) {
                chooseFilterView.a();
            }
            gfu.a(gdl);
            gdl.d = true;
            gdl.g.b(acwc.UPLOAD_VIDEO_EDITING_CONFIRM_FILTER_BUTTON, null);
        }
        aw();
    }

    public final void aq() {
        this.ai.a(az().i());
        aw();
    }

    public final void ar() {
        if (az().h()) {
            ged ged = this.aj;
            if (!ged.d) {
                xpr.a(ged.b, true);
                gfu.a(ged);
                ged.d = true;
                ged.g.b(acwc.REEL_CONFIRM_EDIT_BUTTON, null);
            }
            aw();
            return;
        }
        gge.a(p(), R.string.reel_video_not_support_trim);
    }

    public final void as() {
        Intent addCategory = new Intent().setClassName(p(), ebl.a("WatchWhileActivity")).setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
        addCategory.putExtra("video_picker", true);
        startActivityForResult(addCategory, 28381);
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == 28381 && intent != null) {
            ajrb ajrb = (ajrb) intent.getParcelableExtra("videoSelectedAction");
            if (ajrb != null) {
                this.aQ.a((VideoSelectedActionOuterClass$VideoSelectedAction) ajrb.a(VideoSelectedActionOuterClass$VideoSelectedAction.d));
            }
        }
    }

    public final ujf h() {
        return az();
    }

    public final void j() {
        aw();
    }

    public final void O_() {
        this.ab.ah();
    }

    /* JADX WARNING: Missing block: B:10:0x001b, code skipped:
            if (r0.h == false) goto L_0x0020;
     */
    public final boolean l() {
        /*
        r2 = this;
        r0 = r2.aO;
        if (r0 == 0) goto L_0x0020;
    L_0x0004:
        r0 = r2.aq;
        r0 = r0.b();
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        goto L_0x001e;
    L_0x000d:
        r1 = r0.a;
        r1 = r1 & 4096;
        if (r1 == 0) goto L_0x001e;
    L_0x0013:
        r0 = r0.j;
        if (r0 != 0) goto L_0x0019;
    L_0x0017:
        r0 = defpackage.ayva.m;
    L_0x0019:
        r0 = r0.h;
        if (r0 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0020;
    L_0x001e:
        r0 = 1;
        return r0;
    L_0x0020:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdn.l():boolean");
    }

    public final void at() {
        this.ae.h = null;
        this.c = null;
    }

    public final void e() {
        aA();
    }

    public final void c() {
        if (this.at.m != null) {
            ak();
            return;
        }
        onClick(this.ad.g);
        ax();
    }

    public final void d() {
        if (az().i()) {
            az().a(false);
            this.ad.a(false);
        } else {
            az().a(true);
            this.ad.a(true);
        }
        ax();
    }

    public final void f() {
        a(null);
        this.ah.f();
        this.ai.a(az().i());
    }

    public final void g() {
        this.ah.f();
        ax();
    }

    public final void au() {
        this.aj.f();
        ax();
    }

    public final void m() {
        this.ak.g();
        ax();
    }

    public final void f(boolean z) {
        if (z) {
            aw();
        } else {
            ax();
        }
    }

    public final void a(int i, TextView textView, AnimationSet animationSet) {
        ChooseFilterView Z = Z();
        zos c = Z != null ? Z.c() : null;
        if (!(Z == null || c == null)) {
            int i2 = 0;
            boolean d;
            int size;
            int e;
            if (i == 3) {
                d = c.d();
                size = c.i.size();
                e = c.e();
                if (e != -1) {
                    if (d) {
                        i2 = (e + 1) % size;
                    } else {
                        i2 = ((e + size) - 1) % size;
                    }
                }
                c.d(c.a(i2));
            } else if (i == 1) {
                d = c.d();
                size = c.i.size();
                e = c.e();
                if (e != -1) {
                    if (d) {
                        i2 = ((e + size) - 1) % size;
                    } else {
                        i2 = (e + 1) % size;
                    }
                }
                c.d(c.a(i2));
            } else {
                return;
            }
            textView.setText(((zjt) c.i.get(c.e())).a(c.a));
            textView.startAnimation(animationSet);
        }
    }

    public final boolean av() {
        return (this.aj.d || this.ah.j || this.ak.d || this.ai.c || this.ag.i) ? false : true;
    }

    public final acvx t() {
        return this.aa;
    }

    public final void aw() {
        gdz gdz = this.ad;
        if (gdz.n) {
            gfu.a(gdz);
            gdz.n = false;
        }
        gdf gdf = this.ae;
        if (gdf.r) {
            gfu.a(gdf);
            gdf.r = false;
        }
        gef gef = this.af;
        if (gef.h) {
            gfu.a(gef, false, null);
            gef.h = false;
        }
    }

    public final void ax() {
        gdz gdz = this.ad;
        if (!gdz.n) {
            gfu.a(gdz);
            gdz.n = true;
        }
        gdf gdf = this.ae;
        if (!gdf.r) {
            gfu.a(gdf);
            gdf.r = true;
        }
        gef gef = this.af;
        if (!gef.h && gef.g != null) {
            gfu.a(gef, true, null);
            gef.h = true;
        }
    }

    public final /* synthetic */ Object n() {
        return aE();
    }
}
