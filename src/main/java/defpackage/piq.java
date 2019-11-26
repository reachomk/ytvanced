package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: piq */
public final class piq {
    private static final Lock a = new ReentrantLock();
    private static piq b;
    private final Lock c = new ReentrantLock();
    private final SharedPreferences d;

    public static piq a(Context context) {
        pzr.a((Object) context);
        a.lock();
        try {
            if (b == null) {
                b = new piq(context.getApplicationContext());
            }
            piq piq = b;
            return piq;
        } finally {
            a.unlock();
        }
    }

    private piq(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        this.c.lock();
        try {
            str = this.d.getString(str, null);
            return str;
        } finally {
            this.c.unlock();
        }
    }
}
