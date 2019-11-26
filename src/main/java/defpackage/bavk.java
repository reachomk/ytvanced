package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bavk */
public final class bavk {
    private static final Logger b = Logger.getLogger(bavk.class.getName());
    private static bavk c;
    public final bave a = new bavm(this);
    private final LinkedHashSet d = new LinkedHashSet();
    private List e = Collections.emptyList();

    private final synchronized void a(bavh bavh) {
        amqw.a(bavh.b(), (Object) "isAvailable() returned false");
        this.d.add(bavh);
    }

    private final synchronized void c() {
        ArrayList arrayList = new ArrayList(this.d);
        Collections.sort(arrayList, Collections.reverseOrder(new bavj()));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized bavk a() {
        bavk bavk;
        synchronized (bavk.class) {
            if (c == null) {
                Class cls = bavh.class;
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("bbbl"));
                } catch (ClassNotFoundException e) {
                    b.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", e);
                }
                List<bavh> a = bavw.a(cls, Collections.unmodifiableList(arrayList), bavh.class.getClassLoader(), new bavl());
                if (a.isEmpty()) {
                    b.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                c = new bavk();
                for (bavh bavh : a) {
                    Logger logger = b;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(bavh);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
                    stringBuilder.append("Service loader found ");
                    stringBuilder.append(valueOf);
                    logger.logp(level, "io.grpc.NameResolverRegistry", "getDefaultRegistry", stringBuilder.toString());
                    bavh.b();
                    c.a(bavh);
                }
                c.c();
            }
            bavk = c;
        }
        return bavk;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized List b() {
        return this.e;
    }
}
