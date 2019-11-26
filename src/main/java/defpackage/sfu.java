package defpackage;

import android.content.Context;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: sfu */
public final class sfu {
    private static sfu b;
    private static final Lock c = new ReentrantLock();
    public final sft a;

    public static sfu a(Context context) {
        if (context != null) {
            try {
                c.lock();
                if (b == null) {
                    b = new sfu(context.getApplicationContext());
                }
                c.unlock();
                return b;
            } catch (Throwable th) {
                c.unlock();
            }
        } else {
            throw new NullPointerException("Cannot pass null context to GDICache.getInstance");
        }
    }

    private sfu(Context context) {
        this.a = new sft(context);
    }

    public final boolean a(String str, String str2) {
        return this.a.getWritableDatabase().delete("CacheTable", "accountId=? AND thirdPartyServiceProvider=?", new String[]{str, str2}) > 0;
    }
}
