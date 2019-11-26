package defpackage;

import android.app.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: tzw */
final class tzw extends ttj {
    public final udb d;
    public final amqp e;
    private final ConcurrentHashMap f;

    tzw(udc udc, Application application, tzu tzu, tzu tzu2, udb udb, int i, amqp amqp, ConcurrentHashMap concurrentHashMap) {
        super(udc, application, tzu, tzu2, 1, i);
        this.d = udb;
        this.f = concurrentHashMap;
        this.e = amqp;
    }

    /* Access modifiers changed, original: 0000 */
    public void d() {
        this.f.clear();
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart"}));
    }
}
