package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ray */
public final class ray {
    public static final ray a = new ray(new rba());
    public static final ray b = new ray(new rbe());
    public static final ray c = new ray(new raz());
    public static final ray d = new ray(new rbb());
    public static final ray e = new ray(new rbc());
    private static final Logger f = Logger.getLogger(ray.class.getName());
    private static final List g;
    private final rax h;
    private final List i = g;
    private final boolean j = true;

    private ray(rax rax) {
        this.h = rax;
    }

    public final Object a(String str) {
        for (Provider provider : this.i) {
            try {
                this.h.a(str, provider);
                return this.h.a(str, provider);
            } catch (Exception e) {
                rbp.a.a(e);
            }
        }
        if (this.j) {
            return this.h.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }

    static {
        if (rbn.a()) {
            String[] strArr = new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                Provider provider = Security.getProvider(strArr[i]);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{r6}));
                }
            }
            g = arrayList;
        } else {
            g = new ArrayList();
        }
        ray ray = new ray(new rbg());
        ray = new ray(new rbd());
    }
}
