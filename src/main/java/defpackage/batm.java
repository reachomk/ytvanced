package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* renamed from: batm */
public final class batm {
    public static final batm a = new batm();
    public final ConcurrentNavigableMap b = new ConcurrentSkipListMap();
    public final ConcurrentMap c = new ConcurrentHashMap();
    public final ConcurrentMap d = new ConcurrentHashMap();

    public batm() {
        ConcurrentSkipListMap concurrentSkipListMap = new ConcurrentSkipListMap();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    }

    public static void a(Map map, batq batq) {
        map.put(Long.valueOf(batq.b().a), batq);
    }

    public static void b(Map map, batq batq) {
        map.remove(Long.valueOf(batq.b().a));
    }

    static {
        Logger.getLogger(batm.class.getName());
    }
}
