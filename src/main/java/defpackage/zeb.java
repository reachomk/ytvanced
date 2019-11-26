package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: zeb */
public final class zeb implements xcp, zef {
    public final xsc a;
    public final zea b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final afpu e;
    public afpt f;
    private final bapu g;

    public zeb(xci xci, xsc xsc, zea zea, bapu bapu, afpu afpu) {
        this.a = (xsc) amqw.a((Object) xsc);
        xci.a((Object) this);
        this.b = (zea) amqw.a((Object) zea);
        this.g = (bapu) amqw.a((Object) bapu);
        this.e = (afpu) amqw.a((Object) afpu);
    }

    public final Object a(Uri uri) {
        List<Uri> singletonList = Collections.singletonList(uri);
        amqw.b(this.g != null);
        a();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : singletonList) {
            zed zed = (zed) this.c.get(uri2);
            if (zed != null && zed.a(this.a)) {
                arrayList.add(uri2);
            }
            if (zed != null) {
                hashMap.put(uri2, zed.a());
            }
        }
        if (!arrayList.isEmpty()) {
            ((zei) this.g.get()).a(arrayList);
        }
        return hashMap.get(uri);
    }

    public final void a(Collection collection, zdw zdw) {
        amqw.b(this.g != null);
        a();
        ArrayList arrayList = new ArrayList();
        for (Uri uri : collection) {
            zed zed = (zed) this.c.get(uri);
            if (zed == null || zed.a(this.a)) {
                arrayList.add(uri);
            }
        }
        if (!arrayList.isEmpty()) {
            if (zdw != null) {
                ((zei) this.g.get()).a(arrayList, new zee(zdw));
                return;
            }
            ((zei) this.g.get()).a(arrayList);
        }
    }

    public final Set b(Uri uri) {
        return (Set) this.d.get(uri);
    }

    public final void a() {
        xak.a();
        afpt afpt = this.f;
        this.f = this.e.c();
        if (afpt != null || this.f != null) {
            if (afpt == null || this.f == null || !TextUtils.equals(afpt.f(), this.f.f())) {
                b();
            }
        }
    }

    private final void b() {
        this.c.clear();
        this.d.clear();
    }

    public final void c(Uri uri) {
        List arrayList = new ArrayList();
        a(arrayList, uri);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = (Uri) arrayList.get(i);
            this.c.remove(obj);
            if (b(obj) == null) {
                while (true) {
                    this.d.remove(obj);
                    Uri e = zeb.e(obj);
                    Map map = this.d;
                    if (map.containsKey(e) && ((LinkedHashSet) map.get(e)).contains(obj)) {
                        ((LinkedHashSet) map.get(e)).remove(obj);
                    }
                    Set set = (Set) this.d.get(e);
                    if (set != null && set.size() == 0) {
                        this.d.remove(e);
                    }
                    obj = zeb.e(obj);
                    if (zeb.d(obj) || b(obj) != null || a(obj) != null) {
                        break;
                    }
                }
            }
        }
    }

    private final void a(List list, Uri uri) {
        if (a(uri) != null) {
            list.add(uri);
        }
        Set<Uri> b = b(uri);
        if (b != null) {
            for (Uri a : b) {
                a(list, a);
            }
        }
    }

    public static boolean d(Uri uri) {
        return TextUtils.isEmpty(uri.getPath()) && TextUtils.isEmpty(uri.getScheme());
    }

    public static Uri e(Uri uri) {
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        if (arrayList.size() == 0) {
            return Uri.EMPTY;
        }
        arrayList.remove(arrayList.size() - 1);
        return new Builder().scheme(uri.getScheme()).path(TextUtils.join("/", arrayList)).build();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqh.class};
        } else if (i == 0) {
            xak.a();
            b();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
