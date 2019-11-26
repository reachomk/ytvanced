package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.view.accessibility.CaptioningManager;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ajjl */
public final class ajjl implements OnSharedPreferenceChangeListener {
    private static float b = 13.0f;
    public final SharedPreferences a;
    private final Context c;
    private final ahhq d;
    private final Set e = new HashSet();
    private CaptioningManager f;
    private ajjv g;

    public ajjl(Context context, SharedPreferences sharedPreferences, ahhq ahhq) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.c = (Context) amqw.a((Object) context);
        this.d = (ahhq) amqw.a((Object) ahhq);
    }

    public final boolean a() {
        return this.d.j();
    }

    private final CaptioningManager d() {
        if (this.f == null) {
            this.f = (CaptioningManager) this.c.getSystemService("captioning");
        }
        return this.f;
    }

    public final synchronized void a(ajjo ajjo) {
        if (this.e.isEmpty()) {
            if (a()) {
                this.g = new ajjv(this);
                d().addCaptioningChangeListener(this.g);
            } else {
                this.a.registerOnSharedPreferenceChangeListener(this);
            }
        }
        this.e.add(ajjo);
    }

    /* JADX WARNING: Missing block: B:11:0x0026, code skipped:
            return;
     */
    public final synchronized void b(defpackage.ajjo r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.e;	 Catch:{ all -> 0x0027 }
        r0.remove(r2);	 Catch:{ all -> 0x0027 }
        r2 = r1.e;	 Catch:{ all -> 0x0027 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0027 }
        if (r2 == 0) goto L_0x0025;
    L_0x000e:
        r2 = r1.a();	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x001a;
    L_0x0014:
        r2 = r1.a;	 Catch:{ all -> 0x0027 }
        r2.unregisterOnSharedPreferenceChangeListener(r1);	 Catch:{ all -> 0x0027 }
        goto L_0x0025;
    L_0x001a:
        r2 = r1.d();	 Catch:{ all -> 0x0027 }
        r0 = r1.g;	 Catch:{ all -> 0x0027 }
        r2.removeCaptioningChangeListener(r0);	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);
        return;
    L_0x0025:
        monitor-exit(r1);
        return;
    L_0x0027:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjl.b(ajjo):void");
    }

    public final float b() {
        if (a()) {
            return d().getFontScale();
        }
        float a;
        String string = this.a.getString(xay.SUBTITLES_SCALE, null);
        if (string == null) {
            a = ajjx.a();
        } else {
            a = Float.parseFloat(string);
        }
        return a;
    }

    public final ajji c() {
        if (a()) {
            return new ajji(d().getUserStyle());
        }
        return ajjl.a(this.a);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (xay.SUBTITLES_SCALE.equals(str)) {
            a(ajjl.b(sharedPreferences));
        } else if (xay.SUBTITLES_STYLE.equals(str) || xay.SUBTITLES_FONT.equals(str) || xay.SUBTITLES_TEXT_COLOR.equals(str) || xay.SUBTITLES_TEXT_OPACITY.equals(str) || xay.SUBTITLES_EDGE_TYPE.equals(str) || xay.SUBTITLES_EDGE_COLOR.equals(str) || xay.SUBTITLES_BACKGROUND_COLOR.equals(str) || xay.SUBTITLES_BACKGROUND_OPACITY.equals(str) || xay.SUBTITLES_WINDOW_COLOR.equals(str) || xay.SUBTITLES_WINDOW_OPACITY.equals(str)) {
            a(ajjl.a(sharedPreferences));
        }
    }

    public final synchronized void a(ajji ajji) {
        for (ajjo a : this.e) {
            a.a(ajji);
        }
    }

    public final synchronized void a(float f) {
        for (ajjo a : this.e) {
            a.a(f);
        }
    }

    public static ajji a(SharedPreferences sharedPreferences) {
        int parseInt;
        int i;
        int i2;
        int i3;
        int a;
        int a2;
        String string = sharedPreferences.getString(xay.SUBTITLES_STYLE, null);
        boolean z = false;
        if (string != null) {
            parseInt = Integer.parseInt(string);
        } else {
            parseInt = ajjy.values()[0].g;
        }
        if (parseInt == ajjy.CUSTOM.g) {
            parseInt = ajjl.a(sharedPreferences, xay.SUBTITLES_BACKGROUND_COLOR, ajjn.c());
            i = ajjw.b()[3];
            if (i != 0) {
                parseInt = ajjl.a(parseInt, ajjl.a(sharedPreferences, xay.SUBTITLES_BACKGROUND_OPACITY, ajjw.a(i)));
                i = ajjl.a(sharedPreferences, xay.SUBTITLES_WINDOW_COLOR, ajjn.d());
                i2 = ajjw.b()[3];
                if (i2 != 0) {
                    i = ajjl.a(i, ajjl.a(sharedPreferences, xay.SUBTITLES_WINDOW_OPACITY, ajjw.a(i2)));
                    i2 = ajjl.a(sharedPreferences, xay.SUBTITLES_TEXT_COLOR, ajjn.g());
                    i3 = ajjw.b()[3];
                    if (i3 != 0) {
                        a = ajjl.a(i2, ajjl.a(sharedPreferences, xay.SUBTITLES_TEXT_OPACITY, ajjw.a(i3)));
                        i3 = ajjl.a(sharedPreferences, xay.SUBTITLES_EDGE_TYPE, ajjq.a());
                        i2 = ajjl.a(sharedPreferences, xay.SUBTITLES_EDGE_COLOR, ajjn.h());
                        a2 = ajjl.a(sharedPreferences, xay.SUBTITLES_FONT, ajjp.a());
                    } else {
                        throw null;
                    }
                }
                throw null;
            }
            throw null;
        }
        if (parseInt == ajjy.WHITE_ON_BLACK.g) {
            a2 = ajjn.BLACK.f;
            a = ajjn.WHITE.f;
        } else if (parseInt == ajjy.BLACK_ON_WHITE.g) {
            a2 = ajjn.WHITE.f;
            a = ajjn.BLACK.f;
        } else if (parseInt == ajjy.YELLOW_ON_BLACK.g) {
            a2 = ajjn.BLACK.f;
            a = ajjn.YELLOW.f;
        } else {
            if (parseInt == ajjy.YELLOW_ON_BLUE.g) {
                z = true;
            }
            amqw.b(z);
            a2 = ajjn.BLUE.f;
            a = ajjn.YELLOW.f;
        }
        parseInt = a2;
        i = ajjn.d();
        i3 = ajjq.a();
        i2 = ajjn.h();
        a2 = ajjp.a();
        return new ajji(parseInt, i, i2, i3, a, a2);
    }

    private static int a(SharedPreferences sharedPreferences, String str, int i) {
        String string = sharedPreferences.getString(str, null);
        return string != null ? Integer.parseInt(string) : i;
    }

    private static int a(int i, int i2) {
        return i != ajjn.NONE.f ? (i & 16777215) | (i2 << 24) : i;
    }

    public static float b(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString(xay.SUBTITLES_SCALE, null);
        if (string == null) {
            return ajjx.a();
        }
        return Float.parseFloat(string);
    }

    public static float a(Context context, float f, int i, int i2) {
        float min = (((float) Math.min(i, i2)) / context.getResources().getDisplayMetrics().scaledDensity) * 0.0625f;
        float f2 = b;
        if (min >= f2) {
            f2 = min;
        }
        return f2 * f;
    }
}
