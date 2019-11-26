package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: jgp */
public final class jgp extends ContentObserver implements OnSharedPreferenceChangeListener, jfw {
    public CaptioningManager b;
    public jgt c;
    private int d;
    private final ArrayList e = new ArrayList();
    private AudioManager f;
    private boolean g;
    private final SharedPreferences h;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    public jgp(android.content.Context r7, defpackage.zyw r8, defpackage.exu r9, android.content.SharedPreferences r10) {
        /*
        r6 = this;
        r0 = new android.os.Handler;
        r0.<init>();
        r6.<init>(r0);
        r0 = new java.util.ArrayList;
        r0.<init>();
        r6.e = r0;
        r6.h = r10;
        r0 = r8.a();
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0026;
    L_0x0019:
        r0 = r0.e;
        if (r0 != 0) goto L_0x001f;
    L_0x001d:
        r0 = defpackage.aulu.bw;
    L_0x001f:
        r0 = r0.I;
        if (r0 != 0) goto L_0x0024;
    L_0x0023:
        goto L_0x0026;
    L_0x0024:
        r0 = 1;
        goto L_0x0027;
    L_0x0026:
        r0 = 0;
    L_0x0027:
        r3 = r8.a();
        if (r3 == 0) goto L_0x003a;
    L_0x002d:
        r3 = r3.e;
        if (r3 != 0) goto L_0x0033;
    L_0x0031:
        r3 = defpackage.aulu.bw;
    L_0x0033:
        r3 = r3.H;
        if (r3 != 0) goto L_0x0038;
    L_0x0037:
        goto L_0x003a;
    L_0x0038:
        r3 = 1;
        goto L_0x003b;
    L_0x003a:
        r3 = 0;
    L_0x003b:
        r8 = r8.a();
        if (r8 == 0) goto L_0x004e;
    L_0x0041:
        r8 = r8.e;
        if (r8 != 0) goto L_0x0047;
    L_0x0045:
        r8 = defpackage.aulu.bw;
    L_0x0047:
        r8 = r8.G;
        if (r8 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x004e;
    L_0x004c:
        r8 = 1;
        goto L_0x004f;
    L_0x004e:
        r8 = 0;
    L_0x004f:
        if (r0 != 0) goto L_0x0053;
    L_0x0051:
        r4 = 0;
        goto L_0x0059;
    L_0x0053:
        if (r3 == 0) goto L_0x0051;
    L_0x0055:
        if (r8 != 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0051;
    L_0x0058:
        r4 = 1;
    L_0x0059:
        if (r0 != 0) goto L_0x005c;
    L_0x005b:
        goto L_0x007f;
    L_0x005c:
        r6.d = r2;
        r0 = "audio";
        r0 = r7.getSystemService(r0);
        r0 = (android.media.AudioManager) r0;
        r6.f = r0;
        r0 = r6.b();
        r6.g = r0;
        r0 = r7.getContentResolver();
        r5 = android.provider.Settings.System.CONTENT_URI;
        r0.registerContentObserver(r5, r1, r6);
        r5 = new jgs;
        r5.<init>(r6, r0);
        r9.a(r5);
    L_0x007f:
        if (r3 == 0) goto L_0x00b1;
    L_0x0081:
        r0 = android.os.Build.VERSION.SDK_INT;
        r3 = 19;
        if (r0 < r3) goto L_0x00b0;
    L_0x0087:
        r6.d = r1;
        r0 = new jgt;
        r0.<init>(r6);
        r6.c = r0;
        r0 = "captioning";
        r7 = r7.getSystemService(r0);
        r7 = (android.view.accessibility.CaptioningManager) r7;
        r6.b = r7;
        r7 = r6.b;
        r0 = r6.c;
        r7.addCaptioningChangeListener(r0);
        r7 = r6.d();
        r6.g = r7;
        r7 = new jgr;
        r7.<init>(r6, r4);
        r9.a(r7);
        goto L_0x00b1;
    L_0x00b0:
        return;
    L_0x00b1:
        if (r8 == 0) goto L_0x00c7;
    L_0x00b3:
        r7 = 2;
        r6.d = r7;
        r10.registerOnSharedPreferenceChangeListener(r6);
        r7 = r6.c();
        r6.g = r7;
        r7 = new jgu;
        r7.<init>(r6, r10, r4);
        r9.a(r7);
    L_0x00c7:
        if (r4 == 0) goto L_0x00e2;
    L_0x00c9:
        r7 = 3;
        r6.d = r7;
        r7 = r6.d();
        if (r7 != 0) goto L_0x00e0;
    L_0x00d2:
        r7 = r6.c();
        if (r7 != 0) goto L_0x00e0;
    L_0x00d8:
        r7 = r6.b();
        if (r7 == 0) goto L_0x00df;
    L_0x00de:
        goto L_0x00e0;
    L_0x00df:
        r1 = 0;
    L_0x00e0:
        r6.g = r1;
    L_0x00e2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgp.<init>(android.content.Context, zyw, exu, android.content.SharedPreferences):void");
    }

    public final void a(jfy jfy) {
        this.e.add(new WeakReference(jfy));
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        a();
    }

    public final void a() {
        boolean b;
        int i = this.d;
        if (i == 0) {
            b = b();
        } else if (i == 1) {
            b = d();
        } else if (i == 2) {
            b = c();
        } else if (i == 3 && (d() || c() || b())) {
            b = true;
        } else {
            b = false;
        }
        if (b != this.g) {
            this.g = b;
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                WeakReference weakReference = (WeakReference) arrayList.get(i2);
                if (weakReference.get() != null) {
                    if (b) {
                        jgp.a(((jfy) weakReference.get()).c(), ((jfy) weakReference.get()).d(), true);
                    } else {
                        jgp.a(((jfy) weakReference.get()).c());
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:13:0x001e, code skipped:
            if (b() == false) goto L_0x0031;
     */
    /* JADX WARNING: Missing block: B:17:0x002f, code skipped:
            if (r0 == false) goto L_0x0031;
     */
    public final void a(defpackage.epu r3, defpackage.apdj r4) {
        /*
        r2 = this;
        r0 = r2.d;
        if (r0 == 0) goto L_0x002b;
    L_0x0004:
        r1 = 1;
        if (r0 == r1) goto L_0x0026;
    L_0x0007:
        r1 = 2;
        if (r0 == r1) goto L_0x0021;
    L_0x000a:
        r1 = 3;
        if (r0 == r1) goto L_0x000e;
    L_0x000d:
        goto L_0x0031;
    L_0x000e:
        r0 = r2.d();
        if (r0 != 0) goto L_0x0035;
    L_0x0014:
        r0 = r2.c();
        if (r0 != 0) goto L_0x0035;
    L_0x001a:
        r0 = r2.b();
        if (r0 == 0) goto L_0x0031;
    L_0x0020:
        goto L_0x0035;
    L_0x0021:
        r0 = r2.c();
        goto L_0x002f;
    L_0x0026:
        r0 = r2.d();
        goto L_0x002f;
    L_0x002b:
        r0 = r2.b();
    L_0x002f:
        if (r0 != 0) goto L_0x0035;
    L_0x0031:
        defpackage.jgp.a(r3);
        return;
    L_0x0035:
        r0 = 0;
        defpackage.jgp.a(r3, r4, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgp.a(epu, apdj):void");
    }

    private static void a(epu epu, apdj apdj, boolean z) {
        if (epu != null) {
            epu.a = z;
            View view;
            if (apdj == null) {
                view = epu.f;
                if (view != null) {
                    view.setVisibility(8);
                }
                return;
            }
            epu.f = epu.b();
            epu.f.setVisibility(0);
            if (epu.a) {
                epu.f.animate().alpha(1.0f).setDuration(350).setInterpolator(epu.b).start();
            }
            TextView textView = (TextView) epu.f;
            arml arml = apdj.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            view = epu.f;
            arml arml2 = apdj.b;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            view.setContentDescription(ajqy.b(arml2));
        }
    }

    private static void a(epu epu) {
        if (epu != null) {
            View view = epu.f;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    private final boolean b() {
        AudioManager audioManager = this.f;
        return audioManager != null && audioManager.getStreamVolume(3) == 0;
    }

    private final boolean c() {
        return this.h.getBoolean(xay.SUBTITLES_ENABLED, false);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        a();
    }

    private final boolean d() {
        CaptioningManager captioningManager = this.b;
        return captioningManager != null && captioningManager.isEnabled();
    }
}
