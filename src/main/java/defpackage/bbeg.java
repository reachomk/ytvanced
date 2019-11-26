package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: bbeg */
final class bbeg extends bbbt {
    public static final Logger b = Logger.getLogger(bbeg.class.getName());
    private static final ReferenceQueue c = new ReferenceQueue();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    private final bbef e;

    bbeg(bauk bauk) {
        ReferenceQueue referenceQueue = c;
        ConcurrentMap concurrentMap = d;
        super(bauk);
        this.e = new bbef(this, bauk, referenceQueue, concurrentMap);
    }

    public final bauk d() {
        bbef bbef = this.e;
        bbef.a = true;
        bbef.clear();
        return this.a.d();
    }
}
