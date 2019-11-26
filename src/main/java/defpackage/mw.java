package defpackage;

import android.util.Log;

/* renamed from: mw */
final class mw implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ Object b;

    mw(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final void run() {
        try {
            if (mv.a != null) {
                mv.a.invoke(this.a, new Object[]{this.b, Boolean.valueOf(false), "AppCompat recreation"});
                return;
            }
            mv.b.invoke(this.a, new Object[]{this.b, Boolean.valueOf(false)});
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
