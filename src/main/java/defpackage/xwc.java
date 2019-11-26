package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: xwc */
public abstract class xwc extends Handler {
    private final WeakReference a;

    public xwc(Object obj) {
        super(Looper.myLooper());
        this.a = new WeakReference(amqw.a(obj));
        Class cls = getClass();
        if ((cls.isAnonymousClass() || cls.isMemberClass() || cls.isLocalClass()) && (cls.getModifiers() & 8) == 0) {
            String valueOf = String.valueOf(cls.getCanonicalName());
            String str = "The following WeakReferenceHandler class should be static or leaks might occur: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            xtl.d(valueOf);
        }
    }

    public abstract void a(Object obj, Message message);

    public final void handleMessage(Message message) {
        Object obj = this.a.get();
        if (obj != null) {
            a(obj, message);
        } else {
            removeCallbacksAndMessages(null);
        }
    }
}
