package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/* renamed from: aalx */
public final class aalx {
    private final Set a;

    public aalx(Set set) {
        this.a = set;
    }

    public final void a(aoca aoca, asic asic) {
        String str = "Exception processing framework update.";
        if (!this.a.isEmpty()) {
            String.format("[TRANSPORT] About to route transport proto for %s type.", new Object[]{aalx.a(aoca)});
            try {
                arnm arnm = (arnm) aoca.getClass().getField("frameworkUpdates").get(aoca);
                if (arnm == null) {
                    String.format("[TRANSPORT] No transport packet to process on %s", new Object[]{aalx.a(aoca)});
                } else {
                    for (aalw a : this.a) {
                        try {
                            String.format("[TRANSPORT] About to process packet with %s", new Object[]{aalx.a(a)});
                            ((aalw) r3.next()).a(arnm, asic == null ? asic.k : asic);
                        } catch (Throwable th) {
                            xtl.a(str, th);
                            afpc.a(2, afpf.innertube, str, th);
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                xtl.a("Field access incorrect for update transport", e);
            } catch (NoSuchFieldException unused) {
                String.format("[TRANSPORT] Request type %s has no transport packet field.", new Object[]{aalx.a(aoca)});
            }
        }
    }

    public final void a(anze anze, asic asic) {
        String str = "Exception processing framework update.";
        if (!this.a.isEmpty()) {
            String.format("[TRANSPORT] About to route transport proto for %s type.", new Object[]{aalx.a(anze)});
            try {
                if (((Boolean) anze.getClass().getMethod("hasFrameworkUpdates", new Class[0]).invoke(anze, new Object[0])).booleanValue()) {
                    arnm arnm = (arnm) anze.getClass().getMethod("getFrameworkUpdates", new Class[0]).invoke(anze, new Object[0]);
                    if (arnm == null) {
                        String.format("[TRANSPORT] No transport packet to process on %s", new Object[]{aalx.a(anze)});
                    } else {
                        for (aalw a : this.a) {
                            try {
                                String.format("[TRANSPORT] About to process packet with %s", new Object[]{aalx.a(a)});
                                a.a(arnm, asic);
                            } catch (Throwable th) {
                                xtl.a(str, th);
                                afpc.a(2, afpf.innertube, str, th);
                            }
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                xtl.a("Method access incorrect for update transport", e);
            } catch (NoSuchMethodException unused) {
                String.format("[TRANSPORT] Request type %s has no transport packet field.", new Object[]{aalx.a(anze)});
            } catch (InvocationTargetException e2) {
                xtl.a("Could not invoke a method on the response.", e2);
            }
        }
    }

    private static String a(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
