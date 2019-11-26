package defpackage;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: att */
final class att implements y {
    private static int a;
    private static Field b;
    private static Field c;
    private static Field d;
    private final Activity e;

    att(Activity activity) {
        this.e = activity;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0042 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Missing block: B:26:0x003e, code skipped:
            r3.isActive();
     */
    /* JADX WARNING: Missing block: B:29:0x0043, code skipped:
            return;
     */
    public final void a(defpackage.af r3, defpackage.aa r4) {
        /*
        r2 = this;
        r3 = defpackage.aa.ON_DESTROY;
        if (r4 != r3) goto L_0x004c;
    L_0x0004:
        r3 = a;
        if (r3 != 0) goto L_0x000b;
    L_0x0008:
        defpackage.att.a();
    L_0x000b:
        r3 = a;
        r4 = 1;
        if (r3 != r4) goto L_0x004c;
    L_0x0010:
        r3 = r2.e;
        r4 = "input_method";
        r3 = r3.getSystemService(r4);
        r3 = (android.view.inputmethod.InputMethodManager) r3;
        r4 = b;	 Catch:{ IllegalAccessException -> 0x004c }
        r4 = r4.get(r3);	 Catch:{ IllegalAccessException -> 0x004c }
        if (r4 == 0) goto L_0x004c;
    L_0x0022:
        monitor-enter(r4);
        r0 = c;	 Catch:{ IllegalAccessException -> 0x0048, ClassCastException -> 0x0046 }
        r0 = r0.get(r3);	 Catch:{ IllegalAccessException -> 0x0048, ClassCastException -> 0x0046 }
        r0 = (android.view.View) r0;	 Catch:{ IllegalAccessException -> 0x0048, ClassCastException -> 0x0046 }
        if (r0 != 0) goto L_0x002f;
    L_0x002d:
        monitor-exit(r4);	 Catch:{ all -> 0x0044 }
        return;
    L_0x002f:
        r0 = r0.isAttachedToWindow();	 Catch:{ all -> 0x0044 }
        if (r0 == 0) goto L_0x0037;
    L_0x0035:
        monitor-exit(r4);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0037:
        r0 = d;	 Catch:{ IllegalAccessException -> 0x0042 }
        r1 = 0;
        r0.set(r3, r1);	 Catch:{ IllegalAccessException -> 0x0042 }
        monitor-exit(r4);	 Catch:{ all -> 0x0044 }
        r3.isActive();
        goto L_0x004c;
    L_0x0042:
        monitor-exit(r4);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0044:
        r3 = move-exception;
        goto L_0x004a;
    L_0x0046:
        monitor-exit(r4);	 Catch:{ all -> 0x0044 }
        return;
    L_0x0048:
        monitor-exit(r4);	 Catch:{ all -> 0x0044 }
        return;
    L_0x004a:
        monitor-exit(r4);	 Catch:{ all -> 0x0044 }
        throw r3;
    L_0x004c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.att.a(af, aa):void");
    }

    private static void a() {
        try {
            a = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            c = declaredField;
            declaredField.setAccessible(true);
            declaredField = InputMethodManager.class.getDeclaredField("mNextServedView");
            d = declaredField;
            declaredField.setAccessible(true);
            declaredField = InputMethodManager.class.getDeclaredField("mH");
            b = declaredField;
            declaredField.setAccessible(true);
            a = 1;
        } catch (NoSuchFieldException unused) {
        }
    }
}
