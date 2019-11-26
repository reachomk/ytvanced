package defpackage;

import android.os.Looper;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ima */
final class ima {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c;
    public final int d;
    private final abgc e;
    private final String f;
    private final img g;
    private final int h;
    private final int i;
    private final int j;

    ima(abgc abgc, String str, int i, int i2, int i3, int i4) {
        this.e = abgc;
        this.f = str;
        this.h = i;
        this.d = i2;
        this.i = i3;
        this.j = i4;
        this.g = new img(this, Looper.getMainLooper());
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.g.removeCallbacksAndMessages(null);
        if (this.b.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ima.a(arrayList, this.a);
            a(arrayList);
            this.b.addAll(arrayList);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(apxu apxu, afsw afsw) {
        Object obj;
        anxp anxp = apxu;
        anxr access$000 = anxl.checkIsLite(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) obj;
        if (playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.size() == 1) {
            int a = awhp.a(((awhn) playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.get(0)).b);
            if (a != 0 && a == 11) {
                imf imh = new imh(this, playlistEditEndpointOuterClass$PlaylistEditEndpoint.c, playlistEditEndpointOuterClass$PlaylistEditEndpoint.e, anxp.b, afsw);
                a(r2);
            }
        }
        imf ime = new ime(this, playlistEditEndpointOuterClass$PlaylistEditEndpoint.c, playlistEditEndpointOuterClass$PlaylistEditEndpoint.e, anxp.b, afsw);
        a(r2);
    }

    public final void a(imf imf) {
        if (!imf.a() || (!amux.b(this.a, ilz.a) && !amux.b(this.b, imc.a))) {
            imf imf2;
            ArrayList arrayList;
            boolean c;
            List list = this.a;
            Object obj = null;
            if (list instanceof Collection) {
                if (!list.isEmpty()) {
                    if (list instanceof List) {
                        obj = amux.a(list);
                    }
                }
                imf2 = (imf) obj;
                if (imf2 != null && imf2.a(imf)) {
                    arrayList = this.a;
                    arrayList.remove(arrayList.size() - 1);
                }
                c = c();
                this.a.add(imf);
                if (imf.a() || this.a.size() > this.h) {
                    a();
                }
                if (!c) {
                    if (this.a.size() == 1) {
                        this.g.a(1, this.i);
                    }
                    this.g.a(2, this.j);
                }
                return;
            }
            Iterator it = list.iterator();
            if (it.hasNext()) {
                obj = amve.a(it);
            }
            imf2 = (imf) obj;
            arrayList = this.a;
            arrayList.remove(arrayList.size() - 1);
            c = c();
            this.a.add(imf);
            if (imf.a()) {
            }
            a();
        }
    }

    private final boolean c() {
        int i = 0;
        if (this.a.isEmpty()) {
            return false;
        }
        if (amux.b(this.a, imb.a)) {
            return true;
        }
        img img = this.g;
        if (img.hasMessages(1) || img.hasMessages(2)) {
            i = 1;
        }
        return i ^ 1;
    }

    public static void a(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                arrayList.add((imf) arrayList2.remove(0));
            }
            if (((imf) amux.b(arrayList)).a()) {
                while (!arrayList2.isEmpty() && ((imf) arrayList2.get(0)).a()) {
                    arrayList.add((imf) arrayList2.remove(0));
                }
            }
        }
    }

    public final void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            abgh a = this.e.a();
            imf imf = (imf) arrayList.get(0);
            a.a = imf.d.f;
            a.c = imf.a;
            if (imf.b.c()) {
                a.g();
            } else {
                a.a(imf.b);
            }
            imf.a(a);
            for (int i = 1; i < arrayList.size(); i++) {
                ((imf) arrayList.get(i)).a(a);
            }
            this.e.a(a, new imi(this, imf.c));
        }
    }

    public final void b() {
        this.b.clear();
        if (c()) {
            a();
        }
    }
}
