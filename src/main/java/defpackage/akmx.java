package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LruCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: akmx */
public final class akmx implements xcp {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private static final Uri b = new Builder().scheme("yt").authority("reactr").build();
    private final Map c = new HashMap();
    private final WeakHashMap d = new WeakHashMap();
    private final LruCache e = new LruCache(1000);
    private final xsc f;
    private long g;

    public akmx(xsc xsc, xci xci) {
        this.f = (xsc) amqw.a((Object) xsc);
        this.g = Long.MAX_VALUE;
        xci.a((Object) this);
    }

    public final akmw a(Uri uri, akmz akmz) {
        amqw.a((Object) uri);
        amqw.a((Object) akmz);
        xak.a();
        Set set = (Set) this.d.get(akmz);
        if (set == null) {
            set = new HashSet();
            this.d.put(akmz, set);
        }
        if (set.add(uri)) {
            a(uri, true).add(new WeakReference(akmz));
        }
        long b = this.f.b();
        long j = this.g;
        if (j == -1 || b - j >= a) {
            HashMap hashMap = new HashMap();
            if (uri != null) {
                hashMap.put(uri, Boolean.valueOf(true));
            }
            for (Uri uri2 : this.c.keySet()) {
                if (!hashMap.containsKey(uri2)) {
                    Uri c = akmx.c(uri2);
                    Boolean bool = (Boolean) hashMap.get(c);
                    if (bool == null) {
                        bool = Boolean.valueOf(d(c));
                        hashMap.put(c, bool);
                    }
                    boolean z = d(uri2) || bool.booleanValue();
                    if (!z) {
                        this.e.remove(uri2);
                    }
                    hashMap.put(uri2, Boolean.valueOf(z));
                }
            }
            this.g = b;
        }
        return (akmw) this.e.get(uri);
    }

    public final void a(akmz akmz) {
        amqw.a((Object) akmz);
        Set<Uri> set = (Set) this.d.remove(akmz);
        if (set != null) {
            for (Uri a : set) {
                List a2 = a(a, false);
                if (a2 != null) {
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        akmz akmz2 = (akmz) ((WeakReference) it.next()).get();
                        if (akmz2 == null) {
                            it.remove();
                        } else if (akmz2 == akmz) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    public final akmw a(Uri uri) {
        xak.a();
        return (akmw) this.e.get(uri);
    }

    public final void a(Uri uri, akmw akmw) {
        xak.a();
        this.e.put(uri, akmw);
        xak.a();
        for (Uri uri2 = uri; uri2 != null; uri2 = akmx.c(uri2)) {
            List a = a(uri2, false);
            if (a != null) {
                a = new ArrayList(a);
            }
            if (a != null) {
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    akmz akmz = (akmz) ((WeakReference) it.next()).get();
                    if (akmz == null) {
                        it.remove();
                    } else {
                        akmz.a(uri2, uri);
                    }
                }
            }
        }
    }

    public final akmw b(Uri uri, akmw akmw) {
        amqw.a((Object) akmw);
        akmw akmw2 = (akmw) this.e.get(uri);
        if (akmw2 != null) {
            akmw = akmw2.a(akmw);
            if (akmw == null) {
                throw new IllegalStateException();
            }
        }
        a(uri, akmw);
        return akmw;
    }

    public final akmw b(Uri uri) {
        return (akmw) this.e.remove(uri);
    }

    private static Uri c(Uri uri) {
        List pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            return null;
        }
        Builder buildUpon = uri.buildUpon();
        buildUpon.path("");
        for (int i = 0; i < pathSegments.size() - 1; i++) {
            buildUpon.appendPath((String) pathSegments.get(i));
        }
        return buildUpon.build();
    }

    private final List a(Uri uri, boolean z) {
        xak.a();
        List list = (List) this.c.get(uri);
        if (list != null || !z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.c.put(uri, arrayList);
        return arrayList;
    }

    private final boolean d(Uri uri) {
        List a = a(uri, false);
        if (a != null) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == null) {
                    it.remove();
                }
            }
        }
        if (a == null || a.isEmpty()) {
            return false;
        }
        return true;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqh.class};
        } else if (i == 0) {
            this.e.evictAll();
            this.c.clear();
            this.d.clear();
            this.g = this.f.b();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static Uri a(int i, String... strArr) {
        amqw.a(true);
        amqw.a(true);
        amqw.a(true);
        int i2 = 0;
        amqw.a(TextUtils.isEmpty(strArr[0]) ^ 1);
        Builder buildUpon = b.buildUpon();
        String str = i != 1 ? i != 2 ? i != 3 ? "SUBSCRIPTIONS" : "SOCIAL" : "NOTIFICATIONS" : "COMMENTS";
        buildUpon.authority(str);
        i = strArr.length;
        while (i2 < i) {
            buildUpon.appendPath(xvd.a(strArr[i2]));
            i2++;
        }
        return buildUpon.build();
    }
}
