package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: ffw */
public final class ffw implements OnSharedPreferenceChangeListener, xcp {
    public volatile int a = 1;
    private final xci b;
    private final xhv c;
    private final SharedPreferences d;
    private final zzl e;
    private int f;
    private volatile boolean g;
    private volatile boolean h;

    public ffw(xci xci, xhv xhv, SharedPreferences sharedPreferences, zzl zzl) {
        this.b = (xci) amqw.a((Object) xci);
        this.c = (xhv) amqw.a((Object) xhv);
        this.d = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.e = (zzl) amqw.a((Object) zzl);
        this.f = -1;
        this.g = xhv.e();
        this.h = xhv.c();
        SharedPreferences sharedPreferences2 = this.d;
        String str = ebn.INLINE_GLOBAL_PLAY_PAUSE_MIGRATION;
        if (sharedPreferences2.getInt(str, 0) != 1) {
            Editor putInt = this.d.edit().putInt(str, 1);
            String str2 = "inline_global_play_pause";
            if (this.d.getInt(str2, -1) == 2) {
                putInt.remove(str2);
            }
            putInt.apply();
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    /* JADX WARNING: Missing block: B:8:0x0019, code skipped:
            if (r2 != 0) goto L_0x001d;
     */
    public static int a(defpackage.zzl r2) {
        /*
        r2 = r2.b();
        r0 = 1;
        if (r2 == 0) goto L_0x001c;
    L_0x0007:
        r1 = r2.a;
        r1 = r1 & 64;
        if (r1 == 0) goto L_0x001c;
    L_0x000d:
        r2 = r2.e;
        if (r2 != 0) goto L_0x0013;
    L_0x0011:
        r2 = defpackage.aume.af;
    L_0x0013:
        r2 = r2.B;
        r2 = defpackage.arny.a(r2);
        if (r2 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001d;
    L_0x001c:
        r2 = 1;
    L_0x001d:
        r1 = r2 + -1;
        if (r2 == 0) goto L_0x002e;
    L_0x0021:
        r2 = 2;
        if (r1 == r0) goto L_0x002d;
    L_0x0024:
        if (r1 == r2) goto L_0x002c;
    L_0x0026:
        r0 = 3;
        if (r1 == r0) goto L_0x002a;
    L_0x0029:
        return r2;
    L_0x002a:
        r2 = 0;
        return r2;
    L_0x002c:
        return r0;
    L_0x002d:
        return r2;
    L_0x002e:
        r2 = 0;
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffw.a(zzl):int");
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = "inline_global_play_pause";
        if (str2.equals(str)) {
            a(this.d.getInt(str2, c()));
            b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A:{RETURN, PHI: r2 } */
    public final boolean a() {
        /*
        r4 = this;
        r0 = r4.c();
        r1 = 0;
        r2 = 1;
        r3 = 2;
        if (r0 != r3) goto L_0x0013;
    L_0x0009:
        r0 = r4.c;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0020;
    L_0x0012:
        return r1;
    L_0x0013:
        if (r0 != r2) goto L_0x001f;
    L_0x0015:
        r0 = r4.c;
        r0 = r0.e();
        if (r0 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0020;
    L_0x001e:
        return r1;
    L_0x001f:
        r2 = 0;
    L_0x0020:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffw.a():boolean");
    }

    public final synchronized void b() {
        int c = c();
        boolean contains = this.d.contains("inline_global_play_pause");
        if (c == 0) {
            this.a = !contains ? 11 : 3;
        } else if (c != 1) {
            if (c != 2) {
                this.a = 1;
            } else {
                this.a = !contains ? 6 : 5;
            }
        } else if (this.g) {
            this.a = !contains ? 8 : 7;
        } else {
            this.a = !contains ? 10 : 9;
        }
    }

    public final synchronized int c() {
        int i = this.f;
        if (i != -1) {
            return i;
        }
        i = this.d.getInt("inline_global_play_pause", ffw.a(this.e));
        this.f = i;
        return i;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:8:0x0027, code skipped:
            return;
     */
    public final synchronized void a(int r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r3.c();	 Catch:{ all -> 0x002a }
        r0 = r3.f;	 Catch:{ all -> 0x002a }
        if (r0 == r4) goto L_0x0028;
    L_0x0008:
        r0 = r3.a();	 Catch:{ all -> 0x002a }
        r3.f = r4;	 Catch:{ all -> 0x002a }
        r1 = r3.d;	 Catch:{ all -> 0x002a }
        r1 = r1.edit();	 Catch:{ all -> 0x002a }
        r2 = "inline_global_play_pause";
        r4 = r1.putInt(r2, r4);	 Catch:{ all -> 0x002a }
        r4.apply();	 Catch:{ all -> 0x002a }
        r4 = r3.a();	 Catch:{ all -> 0x002a }
        if (r0 == r4) goto L_0x0026;
    L_0x0023:
        r3.d();	 Catch:{ all -> 0x002a }
    L_0x0026:
        monitor-exit(r3);
        return;
    L_0x0028:
        monitor-exit(r3);
        return;
    L_0x002a:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffw.a(int):void");
    }

    private final void d() {
        this.b.d(new ffz(a()));
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgd.class};
        } else if (i == 0) {
            boolean z = this.g;
            boolean z2 = this.h;
            this.g = this.c.e();
            this.h = this.c.c();
            if ((this.f == 1 && z != this.g) || (this.f == 2 && z2 != this.h)) {
                d();
                b();
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
