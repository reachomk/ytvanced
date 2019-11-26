package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: adhn */
public final class adhn {
    public static final String a = xtl.b("MDX.RouteUtil");
    public final String b;
    public final bcaa c;
    private final String d;
    private final tbp e;
    private final adfq f;
    private final Handler g = new Handler(Looper.getMainLooper());

    public adhn(String str, String str2, tbp tbp, bcaa bcaa, adfq adfq) {
        this.d = str;
        this.b = str2;
        this.e = tbp;
        this.c = bcaa;
        this.f = adfq;
    }

    static boolean a(bbs bbs) {
        return adhn.b(bbs, "MDX_MEDIA_ROUTE_CONTROL_CATEGORY");
    }

    public static boolean b(bbs bbs) {
        Bundle bundle = bbs.r;
        return bundle != null && adhn.a(bbs) && adis.b(bundle) == 4;
    }

    public static boolean c(bbs bbs) {
        Bundle bundle = bbs.r;
        return bundle != null && adhn.a(bbs) && adis.b(bundle) == 3;
    }

    public final boolean d(bbs bbs) {
        return a(bbs, this.d);
    }

    public final boolean a(bbs bbs, String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = bbs.j;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (((IntentFilter) arrayList.get(i)).hasCategory(this.e.a(str))) {
                    return true;
                }
                i = i2;
            }
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        String str3 = ":";
        boolean z = false;
        boolean z2 = (str.contains(str3) && str.lastIndexOf(str3) == str.length() - 1) ? false : true;
        amqw.a(z2);
        if (!(str2.contains(str3) && str2.lastIndexOf(str3) == str2.length() - 1)) {
            z = true;
        }
        amqw.a(z);
        String str4 = "";
        String str5 = "-";
        return str.substring(str.lastIndexOf(str3) + 1).replace(str5, str4).equals(str2.substring(str2.lastIndexOf(str3) + 1).replace(str5, str4));
    }

    public static boolean b(bbs bbs, String str) {
        ArrayList arrayList = bbs.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((IntentFilter) arrayList.get(i)).hasCategory(str)) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public final List a(String str, Context context) {
        ArrayList arrayList = new ArrayList();
        for (bbs bbs : a(context)) {
            if (str.equals(bbs.d)) {
                arrayList.add(bbs);
            }
        }
        return arrayList;
    }

    public final List a(Context context) {
        if (this.f == null) {
            return new ArrayList();
        }
        List a;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a = this.f.a();
        } else {
            List synchronizedList = Collections.synchronizedList(new ArrayList());
            this.g.post(new adhq(synchronizedList, countDownLatch, this.f));
            try {
                countDownLatch.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                xtl.b(a, "Timed out getting available media routes.", e);
            }
            a = synchronizedList;
        }
        return a;
    }

    public final int e(bbs bbs) {
        if (d(bbs)) {
            return 2;
        }
        int b = adis.b(bbs.r);
        if (b == 0) {
            b = 1;
        }
        return b;
    }
}
