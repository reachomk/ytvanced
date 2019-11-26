package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: brd */
public final class brd {
    public final bzr a = new bzr(this.i);
    public final cfn b = new cfn();
    public final cfu c = new cfu();
    public final cfw d = new cfw();
    public final bsz e = new bsz();
    public final cek f = new cek();
    public final cfr g = new cfr();
    public final cfs h = new cfs();
    public final zy i = chx.a();
    private final cfp j = new cfp();

    public brd() {
        List asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        List arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.c.a(arrayList);
    }

    public final brd a(Class cls, bsh bsh) {
        this.b.a(cls, bsh);
        return this;
    }

    public final brd a(Class cls, Class cls2, bsp bsp) {
        a("legacy_append", cls, cls2, bsp);
        return this;
    }

    public final brd a(String str, Class cls, Class cls2, bsp bsp) {
        this.c.a(str, bsp, cls, cls2);
        return this;
    }

    public final brd b(Class cls, Class cls2, bsp bsp) {
        this.c.b("legacy_prepend_all", bsp, cls, cls2);
        return this;
    }

    public final brd a(Class cls, bss bss) {
        this.d.a(cls, bss);
        return this;
    }

    public final brd a(bta bta) {
        this.e.a(bta);
        return this;
    }

    public final brd a(Class cls, Class cls2, ceh ceh) {
        this.f.a(cls, cls2, ceh);
        return this;
    }

    public final brd a(ImageHeaderParser imageHeaderParser) {
        this.j.a(imageHeaderParser);
        return this;
    }

    public final brd a(Class cls, Class cls2, bzs bzs) {
        this.a.a(cls, cls2, bzs);
        return this;
    }

    public final brd b(Class cls, Class cls2, bzs bzs) {
        this.a.c(cls, cls2, bzs);
        return this;
    }

    public final List a(Object obj) {
        List b = this.a.b(obj.getClass());
        int size = b.size();
        List emptyList = Collections.emptyList();
        Object obj2 = 1;
        for (int i = 0; i < size; i++) {
            bzq bzq = (bzq) b.get(i);
            if (bzq.a(obj)) {
                if (obj2 != null) {
                    emptyList = new ArrayList(size - i);
                }
                emptyList.add(bzq);
                obj2 = null;
            }
        }
        if (!emptyList.isEmpty()) {
            return emptyList;
        }
        throw new bri(obj);
    }

    public final List a() {
        List a = this.j.a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new brf();
    }
}
