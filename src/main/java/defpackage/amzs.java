package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import java.util.logging.Level;

/* renamed from: amzs */
public final class amzs extends amzf implements amzc {
    public final String b;
    private final Boolean c;

    public amzs(String str, String str2, boolean z) {
        super(str2);
        if (str.length() + str2.length() <= 23) {
            if (str2.length() == 0) {
                str2 = new String(str);
            } else {
                str2 = str.concat(str2);
            }
            this.b = str2;
        } else {
            str2 = str2.replace('$', '.');
            str2 = str2.substring(str2.lastIndexOf(46) + 1);
            if (z || VERSION.SDK_INT < 26) {
                str2 = String.valueOf(str2);
                if (str2.length() == 0) {
                    str2 = new String(str);
                } else {
                    str2 = str.concat(str2);
                }
                str2 = str2.substring(0, Math.min(str2.length(), 23));
            } else {
                str2 = String.valueOf(str2);
                str2 = str2.length() == 0 ? new String(str) : str.concat(str2);
            }
            this.b = str2;
        }
        this.c = Boolean.valueOf(false);
    }

    public final boolean a(Level level) {
        if (!Log.isLoggable(this.b, amzs.b(level))) {
            if (!Log.isLoggable("all", amzs.b(level))) {
                return false;
            }
        }
        return true;
    }

    public final void a(amys amys) {
        amyz.a(amys, (amzc) this, !this.c.booleanValue() ? 1 : 2);
    }

    public static int b(Level level) {
        int intValue = level.intValue();
        if (intValue >= 1000) {
            return 6;
        }
        if (intValue >= 900) {
            return 5;
        }
        if (intValue < 800) {
            return intValue < 700 ? 2 : 3;
        } else {
            return 4;
        }
    }
}
