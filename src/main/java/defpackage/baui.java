package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: baui */
public final class baui {
    private static final Logger a = Logger.getLogger(baui.class.getName());
    private static baui b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    private final synchronized void a(baug baug) {
        amqw.a(baug.a(), (Object) "isAvailable() returned false");
        this.d.add(baug);
    }

    private final synchronized void b() {
        this.e.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            baug baug = (baug) it.next();
            String c = baug.c();
            baug baug2 = (baug) this.e.get(c);
            if (baug2 != null) {
                baug2.b();
                baug.b();
            } else {
                this.e.put(c, baug);
            }
        }
    }

    public static synchronized baui a() {
        baui baui;
        synchronized (baui.class) {
            if (b == null) {
                List<baug> a = bavw.a(baug.class, c, baug.class.getClassLoader(), new bauh());
                b = new baui();
                for (baug baug : a) {
                    Logger logger = a;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(baug);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
                    stringBuilder.append("Service loader found ");
                    stringBuilder.append(valueOf);
                    logger.logp(level, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", stringBuilder.toString());
                    baug.a();
                    b.a(baug);
                }
                b.b();
            }
            baui = b;
        }
        return baui;
    }

    public final synchronized baug a(String str) {
        return (baug) this.e.get(amqw.a((Object) str, (Object) "policy"));
    }

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("bbez"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.util.SecretRoundRobinLoadBalancerProvider$Provider"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", e2);
        }
        c = Collections.unmodifiableList(arrayList);
    }
}
