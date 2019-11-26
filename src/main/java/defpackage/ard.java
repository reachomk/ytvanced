package defpackage;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* renamed from: ard */
public final class ard {
    public Method a;
    public Method b;
    private Method c;

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0016 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
    /* JADX WARNING: Missing block: B:9:?, code skipped:
            return;
     */
    public ard() {
        /*
        r6 = this;
        r6.<init>();
        r0 = 0;
        r1 = 1;
        r2 = android.widget.AutoCompleteTextView.class;
        r3 = "doBeforeTextChanged";
        r4 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0016 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0016 }
        r6.a = r2;	 Catch:{ NoSuchMethodException -> 0x0016 }
        r2 = r6.a;	 Catch:{ NoSuchMethodException -> 0x0016 }
        r2.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0016 }
    L_0x0016:
        r2 = android.widget.AutoCompleteTextView.class;
        r3 = "doAfterTextChanged";
        r4 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0027 }
        r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0027 }
        r6.b = r2;	 Catch:{ NoSuchMethodException -> 0x0027 }
        r2 = r6.b;	 Catch:{ NoSuchMethodException -> 0x0027 }
        r2.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0027 }
    L_0x0027:
        r2 = android.widget.AutoCompleteTextView.class;
        r3 = "ensureImeVisible";
        r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x003c }
        r5 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x003c }
        r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x003c }
        r0 = r2.getMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x003c }
        r6.c = r0;	 Catch:{ NoSuchMethodException -> 0x003c }
        r0 = r6.c;	 Catch:{ NoSuchMethodException -> 0x003c }
        r0.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x003c }
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ard.<init>():void");
    }

    public final void a(AutoCompleteTextView autoCompleteTextView) {
        Method method = this.c;
        if (method != null) {
            try {
                method.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(true)});
            } catch (Exception unused) {
            }
        }
    }
}
