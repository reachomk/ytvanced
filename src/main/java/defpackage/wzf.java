package defpackage;

import android.os.Build.VERSION;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;

/* renamed from: wzf */
final class wzf implements wzc {
    private static final Runnable a = new wze();
    private final int b = 28;
    private final MessageQueue c;
    private boolean d;
    private Field e;
    private Field f;
    private Field g;

    public wzf(MessageQueue messageQueue) {
        this.c = (MessageQueue) amqw.a((Object) messageQueue);
    }

    public final boolean a() {
        if (VERSION.SDK_INT > this.b) {
            int i = VERSION.SDK_INT;
            StringBuilder stringBuilder = new StringBuilder(63);
            stringBuilder.append("flushBinderConnectionCallbacks is unverified on SDK ");
            stringBuilder.append(i);
            xtl.c(stringBuilder.toString());
            return false;
        }
        try {
            this.e = MessageQueue.class.getDeclaredField("mMessages");
            this.f = Message.class.getDeclaredField("next");
            this.g = Message.class.getDeclaredField("callback");
            this.d = true;
        } catch (NoSuchFieldException e) {
            xtl.a("Cannot initialize BinderConnectionFlusher", e);
        }
        return this.d;
    }

    public final void b() {
        if (this.d) {
            boolean isAccessible = this.e.isAccessible();
            boolean isAccessible2 = this.f.isAccessible();
            boolean isAccessible3 = this.g.isAccessible();
            this.e.setAccessible(true);
            this.f.setAccessible(true);
            this.g.setAccessible(true);
            Message message;
            try {
                message = (Message) this.e.get(this.c);
                while (message != null) {
                    Runnable callback = message.getCallback();
                    if (callback != null && "android.app.LoadedApk$ServiceDispatcher$RunConnection".equals(callback.getClass().getName())) {
                        callback.run();
                        this.g.set(message, a);
                    }
                    message = (Message) this.f.get(message);
                }
                this.e.setAccessible(isAccessible);
                this.f.setAccessible(isAccessible2);
                this.g.setAccessible(isAccessible3);
            } catch (IllegalAccessException e) {
                try {
                    xtl.a("Cannot flush binder connections", e);
                } finally {
                    this.e.setAccessible(isAccessible);
                    this.f.setAccessible(isAccessible2);
                    this.g.setAccessible(isAccessible3);
                }
            } catch (Throwable th) {
                this.g.set(message, a);
            }
        }
    }
}
