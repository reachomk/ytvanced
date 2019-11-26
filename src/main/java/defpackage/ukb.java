package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import java.io.IOException;
import java.util.Locale;

/* renamed from: ukb */
public final class ukb {
    private final Context a;
    private final ukq b = ukq.a;
    private final int c = VERSION.SDK_INT;

    public ukb(Context context) {
        this.a = context;
    }

    public static boolean a(int i) {
        return (i == -2 || i == -1) ? false : true;
    }

    public static boolean b(int i) {
        return (i == -2 || i == -1 || i == 0) ? false : true;
    }

    public final int a(Uri uri) {
        return a(null, uri, 0);
    }

    public final int a(uks uks, Uri uri, int i) {
        Throwable th;
        String a = uhw.a(this.a.getContentResolver(), uri);
        if (a != null && a.equalsIgnoreCase("audio/flac")) {
            return 0;
        }
        Object obj;
        if (uks == null) {
            try {
                uks = this.b.a();
            } catch (IOException unused) {
                obj = null;
                uks.a();
                return -2;
            } catch (Throwable th2) {
                th = th2;
                obj = null;
                uks.a();
                throw th;
            }
            try {
                uks.a(this.a, uri);
                obj = 1;
            } catch (IOException unused2) {
                obj = 1;
                uks.a();
                return -2;
            } catch (Throwable th22) {
                th = th22;
                obj = 1;
                uks.a();
                throw th;
            }
        }
        obj = null;
        try {
            if (uks.b() > i) {
                String string = uks.a(i).getString("mime");
                if (!string.toLowerCase(Locale.ENGLISH).startsWith("audio/")) {
                    if (obj != null) {
                        uks.a();
                    }
                    return -1;
                } else if (string.equalsIgnoreCase("audio/mp4a-latm")) {
                    if (obj != null) {
                        uks.a();
                    }
                    return 2;
                } else if (string.equalsIgnoreCase("audio/mpeg")) {
                    if (obj != null) {
                        uks.a();
                    }
                    return 1;
                } else if (string.equalsIgnoreCase("audio/3gpp") || string.equalsIgnoreCase("audio/amr-wb")) {
                    if (obj != null) {
                        uks.a();
                    }
                    return 4;
                } else if (this.c >= 21 && string.equalsIgnoreCase("audio/opus")) {
                    if (obj != null) {
                        uks.a();
                    }
                    return 3;
                }
            }
            if (obj != null) {
                uks.a();
            }
            return 0;
        } catch (IOException unused3) {
            if (!(obj == null || uks == null)) {
                uks.a();
            }
            return -2;
        } catch (Throwable th3) {
            th = th3;
            if (!(obj == null || uks == null)) {
                uks.a();
            }
            throw th;
        }
    }

    static {
        ukb.class.getSimpleName();
    }
}
