package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: anlf */
public final class anlf {
    public static final Object a = new Object();
    public static final Map b = new zj();
    private static final List e = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    private static final List f = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    private static final List g = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    private static final List h = Arrays.asList(new String[0]);
    private static final Set i = Collections.emptySet();
    private static final Executor j = new anlh();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final List d;
    private final Context k;
    private final String l;
    private final anll m;
    private final annz n;
    private final SharedPreferences o;
    private final AtomicBoolean p = new AtomicBoolean();

    public final Context a() {
        f();
        return this.k;
    }

    private final String e() {
        f();
        return this.l;
    }

    public final anll b() {
        f();
        return this.m;
    }

    public final boolean equals(Object obj) {
        return obj instanceof anlf ? this.l.equals(((anlf) obj).e()) : false;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("name", this.l);
        a.a("options", this.m);
        return a.toString();
    }

    public static anlf c() {
        anlf anlf;
        synchronized (a) {
            anlf = (anlf) b.get("[DEFAULT]");
            if (anlf != null) {
            } else {
                String a = qbi.a();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 116);
                stringBuilder.append("Default FirebaseApp is not initialized in this process ");
                stringBuilder.append(a);
                stringBuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return anlf;
    }

    public static anlf a(Context context, anll anll) {
        Object context2;
        anlf anlf;
        if (context2.getApplicationContext() instanceof Application) {
            ptq.a((Application) context2.getApplicationContext());
            ptq.a.a(new anqw());
        }
        String trim = "[DEFAULT]".trim();
        if (context2.getApplicationContext() != null) {
            context2 = context2.getApplicationContext();
        }
        synchronized (a) {
            boolean containsKey = b.containsKey(trim) ^ 1;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(trim).length() + 33);
            stringBuilder.append("FirebaseApp name ");
            stringBuilder.append(trim);
            stringBuilder.append(" already exists!");
            pzr.a(containsKey, stringBuilder.toString());
            pzr.a(context2, (Object) "Application context cannot be null.");
            anlf = new anlf(context2, trim, anll);
            b.put(trim, anlf);
        }
        anlf.d();
        return anlf;
    }

    public final Object a(Class cls) {
        f();
        return anno.a(this.n, cls);
    }

    private anlf(Context context, String str, anll anll) {
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.k = (Context) pzr.a((Object) context);
        this.l = pzr.a(str);
        this.m = (anll) pzr.a((Object) anll);
        anqp anqp = new anqp();
        this.o = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
        String str2 = "firebase_automatic_data_collection_enabled";
        if (this.o.contains(str2)) {
            z = this.o.getBoolean(str2, true);
        } else {
            try {
                PackageManager packageManager = this.k.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.k.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str2))) {
                        z = applicationInfo.metaData.getBoolean(str2);
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            z = true;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(z);
        anny anny = new anny(context, new annx());
        this.n = new annz(anny.a(anny.b.a(anny.a)), annn.a(context, Context.class, new Class[0]), annn.a(this, anlf.class, new Class[0]), annn.a(anll, anll.class, new Class[0]));
        anno.a(this.n, anoj.class);
    }

    private final void f() {
        pzr.a(this.p.get() ^ 1, (Object) "FirebaseApp was deleted");
    }

    private final boolean g() {
        return "[DEFAULT]".equals(e());
    }

    public final void d() {
        Class cls = anlf.class;
        boolean f = ra.f(this.k);
        Queue queue = null;
        if (f) {
            Context context = this.k;
            if (anlk.a.get() == null) {
                anlk anlk = new anlk(context);
                if (anlk.a.compareAndSet(null, anlk)) {
                    context.registerReceiver(anlk, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        } else {
            annz annz = this.n;
            boolean g = g();
            for (annn annn : annz.a) {
                int i = annn.c;
                if (i == 1 || (i == 2 && g)) {
                    anno.a(annz, (Class) annn.a.iterator().next());
                }
            }
            anob anob = annz.c;
            synchronized (anob) {
                Queue queue2 = anob.a;
                if (queue2 != null) {
                    anob.a = null;
                    queue = queue2;
                }
            }
            if (queue != null) {
                for (Object obj : queue) {
                    pzr.a(obj);
                    synchronized (anob) {
                        Queue queue3 = anob.a;
                        if (queue3 != null) {
                            queue3.add(obj);
                        } else {
                            for (Entry entry : anob.a(obj)) {
                                ((Executor) entry.getValue()).execute(new anoe(entry));
                            }
                        }
                    }
                }
            }
        }
        anlf.a(cls, this, e, f);
        if (g()) {
            anlf.a(cls, this, f, f);
            anlf.a(Context.class, this.k, g, f);
        }
    }

    private static void a(Class cls, Object obj, Iterable iterable, boolean z) {
        for (String str : iterable) {
            String str2;
            String str3 = "FirebaseApp";
            if (z) {
                try {
                    if (!h.contains(str2)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (i.contains(str2)) {
                        throw new IllegalStateException(String.valueOf(str2).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                    String.valueOf(str2).concat(" is not linked. Skipping initialization.");
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(String.valueOf(str2).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (InvocationTargetException e) {
                    Log.wtf(str3, "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    str2 = String.valueOf(str2);
                    String str4 = "Failed to initialize ";
                    if (str2.length() == 0) {
                        str2 = new String(str4);
                    } else {
                        str2 = str4.concat(str2);
                    }
                    Log.wtf(str3, str2, e2);
                }
            }
            Method method = Class.forName(str2).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, new Object[]{obj});
            }
        }
    }
}
