package defpackage;

import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: aao */
public final class aao {
    private static boolean a = false;
    private static Method b = null;
    private static boolean c = false;
    private static Field d;

    public static boolean a(View view, KeyEvent keyEvent) {
        return abe.a(view, keyEvent);
    }

    /* JADX WARNING: Missing block: B:23:0x005e, code skipped:
            if (((java.lang.Boolean) r1.invoke(r8, new java.lang.Object[]{r10})).booleanValue() != false) goto L_0x007d;
     */
    public static boolean a(defpackage.aar r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
        r0 = 0;
        if (r7 == 0) goto L_0x00c5;
    L_0x0003:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 28;
        if (r1 < r2) goto L_0x000e;
    L_0x0009:
        r7 = r7.a(r10);
        return r7;
    L_0x000e:
        r1 = r9 instanceof android.app.Activity;
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x007e;
    L_0x0014:
        r9 = (android.app.Activity) r9;
        r9.onUserInteraction();
        r7 = r9.getWindow();
        r8 = 8;
        r8 = r7.hasFeature(r8);
        if (r8 == 0) goto L_0x0062;
    L_0x0025:
        r8 = r9.getActionBar();
        r1 = r10.getKeyCode();
        r4 = 82;
        if (r1 == r4) goto L_0x0032;
    L_0x0031:
        goto L_0x0062;
    L_0x0032:
        if (r8 == 0) goto L_0x0062;
    L_0x0034:
        r1 = a;
        if (r1 != 0) goto L_0x004c;
    L_0x0038:
        r1 = r8.getClass();	 Catch:{ NoSuchMethodException -> 0x004a }
        r4 = "onMenuKeyEvent";
        r5 = new java.lang.Class[r3];	 Catch:{ NoSuchMethodException -> 0x004a }
        r6 = android.view.KeyEvent.class;
        r5[r0] = r6;	 Catch:{ NoSuchMethodException -> 0x004a }
        r1 = r1.getMethod(r4, r5);	 Catch:{ NoSuchMethodException -> 0x004a }
        b = r1;	 Catch:{ NoSuchMethodException -> 0x004a }
    L_0x004a:
        a = r3;
    L_0x004c:
        r1 = b;
        if (r1 == 0) goto L_0x0062;
    L_0x0050:
        r4 = new java.lang.Object[r3];	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061, IllegalAccessException | InvocationTargetException -> 0x0061 }
        r4[r0] = r10;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061, IllegalAccessException | InvocationTargetException -> 0x0061 }
        r8 = r1.invoke(r8, r4);	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061, IllegalAccessException | InvocationTargetException -> 0x0061 }
        r8 = (java.lang.Boolean) r8;	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061, IllegalAccessException | InvocationTargetException -> 0x0061 }
        r8 = r8.booleanValue();	 Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061, IllegalAccessException | InvocationTargetException -> 0x0061 }
        if (r8 == 0) goto L_0x0062;
    L_0x0060:
        goto L_0x007d;
    L_0x0062:
        r8 = r7.superDispatchKeyEvent(r10);
        if (r8 != 0) goto L_0x007d;
    L_0x0068:
        r7 = r7.getDecorView();
        r8 = defpackage.abe.b(r7, r10);
        if (r8 == 0) goto L_0x0073;
    L_0x0072:
        goto L_0x007d;
    L_0x0073:
        if (r7 == 0) goto L_0x0079;
    L_0x0075:
        r2 = r7.getKeyDispatcherState();
    L_0x0079:
        r3 = r10.dispatch(r9, r2, r9);
    L_0x007d:
        return r3;
    L_0x007e:
        r1 = r9 instanceof android.app.Dialog;
        if (r1 == 0) goto L_0x00b4;
    L_0x0082:
        r9 = (android.app.Dialog) r9;
        r7 = defpackage.aao.a(r9);
        if (r7 == 0) goto L_0x0094;
    L_0x008a:
        r8 = r10.getKeyCode();
        r7 = r7.onKey(r9, r8, r10);
        if (r7 != 0) goto L_0x00b3;
    L_0x0094:
        r7 = r9.getWindow();
        r8 = r7.superDispatchKeyEvent(r10);
        if (r8 != 0) goto L_0x00b3;
    L_0x009e:
        r7 = r7.getDecorView();
        r8 = defpackage.abe.b(r7, r10);
        if (r8 == 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00b3;
    L_0x00a9:
        if (r7 == 0) goto L_0x00af;
    L_0x00ab:
        r2 = r7.getKeyDispatcherState();
    L_0x00af:
        r3 = r10.dispatch(r9, r2, r9);
    L_0x00b3:
        return r3;
    L_0x00b4:
        if (r8 != 0) goto L_0x00b7;
    L_0x00b6:
        goto L_0x00bd;
    L_0x00b7:
        r8 = defpackage.abe.b(r8, r10);
        if (r8 != 0) goto L_0x00c4;
    L_0x00bd:
        r7 = r7.a(r10);
        if (r7 != 0) goto L_0x00c4;
    L_0x00c3:
        return r0;
    L_0x00c4:
        return r3;
    L_0x00c5:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aao.a(aar, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    private static OnKeyListener a(Dialog dialog) {
        if (!c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = d;
        if (field != null) {
            try {
                return (OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
            }
        }
        return null;
    }
}
