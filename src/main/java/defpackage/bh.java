package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.MissingResourceException;
import java.util.Properties;

/* renamed from: bh */
public final class bh {
    private static final Properties a = new Properties();

    public static String a(String str, String str2) {
        String str3;
        if (System.getSecurityManager() != null) {
            try {
                str3 = (String) AccessController.doPrivileged(new bk(str));
            } catch (AccessControlException unused) {
                str3 = null;
            }
        } else {
            str3 = System.getProperty(str);
        }
        return str3 == null ? a.getProperty(str, str2) : str3;
    }

    static {
        try {
            InputStream inputStream;
            String str = "/android/icumessageformat/ICUConfig.properties";
            Class cls = bj.class;
            if (System.getSecurityManager() != null) {
                inputStream = (InputStream) AccessController.doPrivileged(new bm(cls, str));
            } else {
                inputStream = cls.getResourceAsStream(str);
            }
            if (inputStream != null) {
                a.load(inputStream);
            }
        } catch (IOException | MissingResourceException unused) {
        }
    }
}
