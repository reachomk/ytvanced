package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.media.VolumeProvider;
import android.os.Build.VERSION;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

/* renamed from: bbf */
public final class bbf implements bcu, bdi {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final Map d = new HashMap();
    public final bcy e = new bcy();
    public final bbk f = new bbk(this);
    public final bda g;
    public final boolean h;
    public bcp i;
    public bbs j;
    public bbs k;
    public bay l;
    public final Map m = new HashMap();
    public bbj n;
    public wq o;
    public wq p;
    public final xl q = new bbi(this);
    private final ArrayList r = new ArrayList();
    private final ArrayList s = new ArrayList();
    private final bbn t = new bbn(this);
    private bbs u;
    private bao v;
    private final bat w = new bbh(this);

    bbf(Context context) {
        bda bcz;
        this.a = context;
        synchronized (td.a) {
            if (((td) td.a.get(context)) == null) {
                td.a.put(context, new td());
            }
        }
        this.h = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        if (VERSION.SDK_INT >= 24) {
            bcz = new bcz(context, this);
        } else {
            bcz = new bdf(context, this);
        }
        this.g = bcz;
    }

    /* Access modifiers changed, original: final */
    public final bbs a() {
        bbs bbs = this.u;
        if (bbs != null) {
            return bbs;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    /* Access modifiers changed, original: final */
    public final bbs b() {
        bbs bbs = this.k;
        if (bbs != null) {
            return bbs;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    /* Access modifiers changed, original: final */
    public final void a(bbs bbs) {
        a(bbs, 3);
    }

    /* Access modifiers changed, original: final */
    public final void a(bbs bbs, int i) {
        String str = "MediaRouter";
        StringBuilder stringBuilder;
        if (!this.c.contains(bbs)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring attempt to select removed route: ");
            stringBuilder.append(bbs);
            Log.w(str, stringBuilder.toString());
        } else if (bbs.g) {
            b(bbs, i);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring attempt to select disabled route: ");
            stringBuilder.append(bbs);
            Log.w(str, stringBuilder.toString());
        }
    }

    public final void c() {
        Object obj;
        bbc bbc = new bbc();
        int size = this.b.size();
        Object obj2 = null;
        boolean z = false;
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            bbb bbb = (bbb) ((WeakReference) this.b.get(size)).get();
            if (bbb == null) {
                this.b.remove(size);
            } else {
                int size2 = bbb.b.size();
                boolean z2 = z;
                Object obj3 = obj2;
                for (int i = 0; i < size2; i++) {
                    bbd bbd = (bbd) bbb.b.get(i);
                    bbc.a(bbd.c);
                    int i2 = bbd.d;
                    int i3 = i2 & 1;
                    if (i3 != 0) {
                        z2 = true;
                    }
                    if (i3 != 0) {
                        obj3 = 1;
                    }
                    if (!((i2 & 4) == 0 || this.h)) {
                        obj3 = 1;
                    }
                    if ((i2 & 8) != 0) {
                        obj3 = 1;
                    }
                }
                obj2 = obj3;
                z = z2;
            }
        }
        if (obj2 == null) {
            obj = baz.c;
        } else {
            obj = bbc.a();
        }
        bao bao = this.v;
        if (bao == null || !bao.a().equals(obj) || this.v.b() != z) {
            if (!obj.c() || z) {
                this.v = new bao(obj, z);
            } else if (this.v != null) {
                this.v = null;
            } else {
                return;
            }
            int size3 = this.r.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((bbp) this.r.get(i4)).a.a(this.v);
            }
        }
    }

    public final void a(ban ban) {
        if (c(ban) == null) {
            bbp bbp = new bbp(ban);
            this.r.add(bbp);
            this.f.a(513, bbp);
            a(bbp, ban.g);
            ban.a(this.t);
            ban.a(this.v);
        }
    }

    public final void b(ban ban) {
        bbp c = c(ban);
        if (c != null) {
            ban.a(null);
            ban.a(null);
            a(c, null);
            this.f.a(514, c);
            this.r.remove(c);
        }
    }

    public final bbp c(ban ban) {
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            if (((bbp) this.r.get(i)).a == ban) {
                return (bbp) this.r.get(i);
            }
        }
        return null;
    }

    public final void a(bbp bbp, bax bax) {
        bbp bbp2 = bbp;
        bax bax2 = bax;
        if (bbp2.c != bax2) {
            boolean z;
            int i;
            int size;
            bbp2.c = bax2;
            String str = "MediaRouter";
            int i2 = 0;
            if (bax2 == null || !(bax.a() || bax2 == this.g.g)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ignoring invalid provider descriptor: ");
                stringBuilder.append(bax2);
                Log.w(str, stringBuilder.toString());
                z = false;
                i = 0;
            } else {
                int i3;
                zz zzVar;
                List list = bax2.a;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                boolean z2 = false;
                i = 0;
                while (it.hasNext()) {
                    Iterator it2;
                    bam bam = (bam) it.next();
                    StringBuilder stringBuilder2;
                    if (bam == null || !bam.s()) {
                        it2 = it;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Ignoring invalid system route descriptor: ");
                        stringBuilder2.append(bam);
                        Log.w(str, stringBuilder2.toString());
                    } else {
                        int i4;
                        String a = bam.a();
                        int size2 = bbp2.b.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            if (((bbs) bbp2.b.get(i5)).b.equals(a)) {
                                break;
                            }
                            i5++;
                        }
                        i5 = -1;
                        bbs bbs;
                        if (i5 < 0) {
                            String flattenToShortString = bbp.b().flattenToShortString();
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append(flattenToShortString);
                            stringBuilder3.append(":");
                            stringBuilder3.append(a);
                            String stringBuilder4 = stringBuilder3.toString();
                            if (b(stringBuilder4) < 0) {
                                this.d.put(new zz(flattenToShortString, a), stringBuilder4);
                                it2 = it;
                            } else {
                                String format;
                                StringBuilder stringBuilder5 = new StringBuilder();
                                stringBuilder5.append("Either ");
                                stringBuilder5.append(a);
                                stringBuilder5.append(" isn't unique in ");
                                stringBuilder5.append(flattenToShortString);
                                stringBuilder5.append(" or we're trying to assign a unique ID for an already added route");
                                Log.w(str, stringBuilder5.toString());
                                i5 = 2;
                                while (true) {
                                    it2 = it;
                                    format = String.format(Locale.US, "%s_%d", new Object[]{stringBuilder4, Integer.valueOf(i5)});
                                    if (b(format) < 0) {
                                        break;
                                    }
                                    i5++;
                                    it = it2;
                                    i2 = 0;
                                }
                                this.d.put(new zz(flattenToShortString, a), format);
                                stringBuilder4 = format;
                            }
                            bbs = new bbs(bbp2, a, stringBuilder4);
                            i4 = i + 1;
                            bbp2.b.add(i, bbs);
                            this.c.add(bbs);
                            if (bam.b().size() > 0) {
                                arrayList.add(new zz(bbs, bam));
                            } else {
                                bbs.a(bam);
                                this.f.a(257, bbs);
                            }
                        } else {
                            it2 = it;
                            if (i5 >= i) {
                                bbs = (bbs) bbp2.b.get(i5);
                                i4 = i + 1;
                                Collections.swap(bbp2.b, i5, i);
                                if (bam.b().size() > 0) {
                                    arrayList2.add(new zz(bbs, bam));
                                } else if (a(bbs, bam) != 0 && bbs == this.k) {
                                    i = i4;
                                    z2 = true;
                                }
                            } else {
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Ignoring route descriptor with duplicate id: ");
                                stringBuilder2.append(bam);
                                Log.w(str, stringBuilder2.toString());
                            }
                        }
                        i = i4;
                    }
                    it = it2;
                    i2 = 0;
                }
                size = arrayList.size();
                for (i3 = 0; i3 < size; i3++) {
                    zzVar = (zz) arrayList.get(i3);
                    bbs bbs2 = (bbs) zzVar.a;
                    bbs2.a((bam) zzVar.b);
                    this.f.a(257, bbs2);
                }
                size = arrayList2.size();
                z = z2;
                for (i3 = 0; i3 < size; i3++) {
                    zzVar = (zz) arrayList2.get(i3);
                    bbs bbs3 = (bbs) zzVar.a;
                    if (a(bbs3, (bam) zzVar.b) != 0 && bbs3 == this.k) {
                        z = true;
                    }
                }
            }
            for (size = bbp2.b.size() - 1; size >= i; size--) {
                bbs bbs4 = (bbs) bbp2.b.get(size);
                bbs4.a(null);
                this.c.remove(bbs4);
            }
            a(z);
            for (size = bbp2.b.size() - 1; size >= i; size--) {
                this.f.a(258, (bbs) bbp2.b.remove(size));
            }
            this.f.a(515, bbp2);
        }
    }

    private final int a(bbs bbs, bam bam) {
        int a = bbs.a(bam);
        if (a != 0) {
            if ((a & 1) != 0) {
                this.f.a(259, bbs);
            }
            if ((a & 2) != 0) {
                this.f.a(260, bbs);
            }
            if ((a & 4) != 0) {
                this.f.a(261, bbs);
            }
        }
        return a;
    }

    private final int b(String str) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (((bbs) this.c.get(i)).c.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        StringBuilder stringBuilder;
        ArrayList arrayList;
        int size;
        bbs bbs = this.u;
        if (!(bbs == null || bbs.d())) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Clearing the default route because it is no longer selectable: ");
            stringBuilder.append(this.u);
            stringBuilder.toString();
            this.u = null;
        }
        if (this.u == null && !this.c.isEmpty()) {
            arrayList = this.c;
            size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bbs bbs2 = (bbs) arrayList.get(i);
                if (bbs2.h() == this.g && bbs2.b.equals("DEFAULT_ROUTE") && bbs2.d()) {
                    this.u = bbs2;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Found default route: ");
                    stringBuilder.append(this.u);
                    stringBuilder.toString();
                    break;
                }
            }
        }
        bbs = this.j;
        if (!(bbs == null || bbs.d())) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Clearing the bluetooth route because it is no longer selectable: ");
            stringBuilder.append(this.j);
            stringBuilder.toString();
            this.j = null;
        }
        if (this.j == null && !this.c.isEmpty()) {
            arrayList = this.c;
            int size2 = arrayList.size();
            for (size = 0; size < size2; size++) {
                bbs bbs3 = (bbs) arrayList.get(size);
                if (b(bbs3) && bbs3.d()) {
                    this.j = bbs3;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Found bluetooth route: ");
                    stringBuilder.append(this.j);
                    stringBuilder.toString();
                    break;
                }
            }
        }
        bbs = this.k;
        if (bbs == null || !bbs.g) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unselecting the current route because it is no longer selectable: ");
            stringBuilder2.append(this.k);
            stringBuilder2.toString();
            b(d(), 0);
        } else if (z) {
            if (bbs.f()) {
                List<bbs> g = this.k.g();
                HashSet hashSet = new HashSet();
                for (bbs bbs4 : g) {
                    hashSet.add(bbs4.c);
                }
                Iterator it = this.m.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        bay bay = (bay) entry.getValue();
                        bay.c();
                        bay.a();
                        it.remove();
                    }
                }
                for (bbs bbs5 : g) {
                    if (!this.m.containsKey(bbs5.c)) {
                        bay a = bbs5.h().a(bbs5.b, this.k.b);
                        a.b();
                        this.m.put(bbs5.c, a);
                    }
                }
            }
            e();
        }
    }

    /* Access modifiers changed, original: final */
    public final bbs d() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bbs bbs = (bbs) arrayList.get(i);
            if (bbs != this.u && b(bbs) && bbs.d()) {
                return bbs;
            }
        }
        return this.u;
    }

    private final boolean b(bbs bbs) {
        return bbs.h() == this.g && bbs.a("android.media.intent.category.LIVE_AUDIO") && !bbs.a("android.media.intent.category.LIVE_VIDEO");
    }

    private final void b(bbs bbs, int i) {
        if (bbb.a == null || (this.j != null && bbs.b())) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i2 = 3; i2 < stackTrace.length; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                stringBuilder.append(stackTraceElement.getClassName());
                stringBuilder.append(".");
                stringBuilder.append(stackTraceElement.getMethodName());
                stringBuilder.append(":");
                stringBuilder.append(stackTraceElement.getLineNumber());
                stringBuilder.append("  ");
            }
            StringBuilder stringBuilder2;
            if (bbb.a == null) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("setSelectedRouteInternal is called while sGlobal is null: pkgName=");
                stringBuilder2.append(this.a.getPackageName());
                stringBuilder2.append(", callers=");
                stringBuilder2.append(stringBuilder.toString());
                Log.w("MediaRouter", stringBuilder2.toString());
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Default route is selected while a BT route is available: pkgName=");
                stringBuilder2.append(this.a.getPackageName());
                stringBuilder2.append(", callers=");
                stringBuilder2.append(stringBuilder.toString());
                Log.w("MediaRouter", stringBuilder2.toString());
            }
        }
        bbs bbs2 = this.k;
        if (bbs2 != bbs) {
            bay bay;
            if (bbs2 != null) {
                Message obtainMessage = this.f.obtainMessage(263, bbs2);
                obtainMessage.arg1 = i;
                obtainMessage.sendToTarget();
                bay = this.l;
                if (bay != null) {
                    bay.a(i);
                    this.l.a();
                    this.l = null;
                }
                if (!this.m.isEmpty()) {
                    for (bay bay2 : this.m.values()) {
                        bay2.a(i);
                        bay2.a();
                    }
                    this.m.clear();
                }
            }
            bax bax = bbs.a.c;
            if (bax != null && bax.b) {
                bap b = bbs.h().b(bbs.b);
                Executor g = ra.g(this.a);
                bat bat = this.w;
                synchronized (b.a) {
                    if (g == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    } else if (bat != null) {
                        b.b = g;
                        b.c = bat;
                        Collection collection = b.d;
                        if (!(collection == null || collection.isEmpty())) {
                            collection = b.d;
                            b.d = null;
                            b.b.execute(new bas(b, collection));
                        }
                    } else {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                }
                this.l = b;
                this.k = bbs;
            } else {
                this.l = bbs.h().a(bbs.b);
                this.k = bbs;
            }
            bay bay3 = this.l;
            if (bay3 != null) {
                bay3.b();
            }
            this.f.a(262, this.k);
            if (this.k.f()) {
                List<bbs> g2 = this.k.g();
                this.m.clear();
                for (bbs bbs3 : g2) {
                    bay = bbs3.h().a(bbs3.b, this.k.b);
                    bay.b();
                    this.m.put(bbs3.c, bay);
                }
            }
            e();
        }
    }

    public final void a(String str) {
        this.f.removeMessages(262);
        bbp c = c(this.g);
        if (c != null) {
            bbs a = c.a(str);
            if (a != null) {
                a.e();
            }
        }
    }

    public final void a(Object obj) {
        if (c(obj) < 0) {
            this.s.add(new bbq(this, obj));
        }
    }

    public final void b(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            bbq bbq = (bbq) this.s.remove(c);
            bbq.b = true;
            bbq.a.b = null;
        }
    }

    private final int c(Object obj) {
        int size = this.s.size();
        for (int i = 0; i < size; i++) {
            if (((bbq) this.s.get(i)).a.a == obj) {
                return i;
            }
        }
        return -1;
    }

    public final void e() {
        bbs bbs = this.k;
        if (bbs != null) {
            bcy bcy = this.e;
            bcy.a = bbs.o;
            bcy.b = bbs.p;
            bcy.c = bbs.n;
            bcy.d = bbs.l;
            bcy.e = bbs.k;
            int size = this.s.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ((bbq) this.s.get(i2)).a();
            }
            if (this.n != null) {
                if (this.k == a() || this.k == this.j) {
                    this.n.a();
                } else {
                    bcy bcy2 = this.e;
                    if (bcy2.c == 1) {
                        i = 2;
                    }
                    bbj bbj = this.n;
                    int i3 = bcy2.b;
                    size = bcy2.a;
                    if (bbj.a != null) {
                        vq vqVar = bbj.b;
                        if (vqVar != null && i == 0 && i3 == 0) {
                            vqVar.c = size;
                            if (VERSION.SDK_INT >= 21) {
                                ((VolumeProvider) vqVar.a()).setCurrentVolume(size);
                            }
                            vs vsVar = vqVar.d;
                            if (vsVar != null) {
                                vsVar.a(vqVar);
                                return;
                            }
                        }
                        bbj.b = new bbm(bbj, i, i3, size);
                        wq wqVar = bbj.a;
                        vq vqVar2 = bbj.b;
                        if (vqVar2 != null) {
                            wqVar.a.a(vqVar2);
                            return;
                        }
                        throw new IllegalArgumentException("volumeProvider may not be null!");
                    }
                }
            }
        }
        bbj bbj2 = this.n;
        if (bbj2 != null) {
            bbj2.a();
        }
    }
}
